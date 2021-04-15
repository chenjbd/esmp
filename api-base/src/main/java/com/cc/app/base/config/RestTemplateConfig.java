package com.cc.app.base.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.util.ObjectUtils;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

@Configuration
public class RestTemplateConfig {

    @Value("${rest-template.connect-timeout:-1}")
    private int connectTimeout;

    @Value("${rest-template.read-timeout:-1}")
    private int readTimeout;

    @Value("${rest-template.charset:UTF-8}")
    private String charset;

    @Bean
    public ClientHttpRequestFactory clientHttpRequestFactory() {
        SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
        factory.setConnectTimeout(connectTimeout);
        factory.setReadTimeout(readTimeout);
        return factory;
    }

    @Bean
    public RestTemplate restTemplate() {
        RestTemplate restTemplate = new RestTemplate(clientHttpRequestFactory());
        converterCharset(restTemplate, Charset.forName(charset));
        return restTemplate;
    }

    private static void converterCharset(RestTemplate restTemplate, Charset charset) {
        if (null == restTemplate || ObjectUtils.isEmpty(restTemplate.getMessageConverters())) {
            return;
        }
        List<HttpMessageConverter<?>> messageConverters = restTemplate.getMessageConverters();
        for (int i = 0; i < messageConverters.size(); i++) {
            HttpMessageConverter<?> httpMessageConverter = messageConverters.get(i);
            if (httpMessageConverter.getClass().equals(StringHttpMessageConverter.class)) {
                messageConverters.set(i, new StringHttpMessageConverter(charset));
            }
        }
    }
}
