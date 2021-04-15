package com.cc.app.base.utils;

import org.apache.commons.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileUtil {

    private final static Logger logger = LoggerFactory.getLogger(FileUtil.class);

    public static byte[] fileToBytes(File file) throws Exception {
        byte[] bytes = null;
        FileInputStream fis = null;
        ByteArrayOutputStream bos = null;
        try{
            fis = new FileInputStream(file);
            bos = new ByteArrayOutputStream();
            byte[] b = new byte[1024];
            int n;
            while ((n = fis.read(b)) != -1) {
                bos.write(b, 0, n);
            }
            bytes = bos.toByteArray();
        }catch (Exception e){
            logger.error("文件转字节数组异常", e);
            throw e;
        }finally {
            try {
                if(bos!=null){
                    bos.close();
                }
                if(fis!=null){
                    fis.close();
                }
            }catch (Exception e){
            }
        }
        return bytes;
    }
    public static String fileToBase64String(File file) throws Exception {
        if(file == null || !file.exists()){
            throw new Exception("文件不存在");
        }
        byte[] bytes = fileToBytes(file);
        return Base64.encodeBase64String(bytes);
    }

}
