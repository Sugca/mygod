package com.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * AJAX请求跨域
 * @author sgc
 */
public class CrosConfig {

    @Configuration
    public class CorsConfig implements WebMvcConfigurer {
        public final String ORIGINS[] = new String[] { "GET", "POST", "PUT", "DELETE" };
        @Override
        public void addCorsMappings(CorsRegistry registry) {
            registry.addMapping("/**")
                    .allowedHeaders("*")
                    .allowedMethods("GET","HEAD","POST","PUT","DELETE","OPTIONS")
                    .allowedOrigins("*")
                    .allowCredentials(true)
                    .maxAge(3600);
        }
    }
}