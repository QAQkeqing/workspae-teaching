package com.easybbs.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    //静态资源配置
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**") //过滤策略
                .addResourceLocations("classpath:/static/")  // 静态资源路径
                .addResourceLocations("classpath:/static/css")  // 静态资源路径
                .addResourceLocations("classpath:/static/js");  // 静态资源路径
    }
}


