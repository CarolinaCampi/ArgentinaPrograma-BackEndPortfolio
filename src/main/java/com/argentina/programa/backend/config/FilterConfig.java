package com.argentina.programa.backend.config;

import com.argentina.programa.backend.filter.JwtFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
    @Bean
    public FilterRegistrationBean<?> jwtFilter() {
        FilterRegistrationBean<JwtFilter> filter= new FilterRegistrationBean<>();
        filter.setFilter(new JwtFilter());
        // provide endpoints which needs to be restricted.
        // All Endpoints would be restricted if unspecified
        filter.addUrlPatterns("/persona");
        return filter;
    }
}
