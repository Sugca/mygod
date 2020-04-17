package com.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * AJAX请求跨域
 * @author sgc
 */
@Configuration
public class CorsConfig implements WebMvcConfigurer {
    public final String[] ORIGINS = new String[] { "GET","HEAD","POST","PUT","DELETE","OPTIONS" };
    @Override
    public void addCorsMappings(CorsRegistry registry) {
                //设置允许跨域的路径
        registry.addMapping("/**")
                //允许跨域的请求头
                .allowedHeaders("*")
                //允许跨域的方法
                .allowedMethods("*")
                //允许跨域请求的域名
                .allowedOrigins("*")
                //是否默认开启证书
                .allowCredentials(true)
                //允许跨域的时间
                .maxAge(3600);
    }
}