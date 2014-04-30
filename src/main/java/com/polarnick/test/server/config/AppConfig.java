package com.polarnick.test.server.config;

import com.polarnick.test.server.service.UserDetailsServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * @author Polyarnyi Nikolay
 */
@Configuration
@ComponentScan(basePackages = "com.polarnick.test")
public class AppConfig {

    @Bean
    public UserDetailsService getUserDetailsService(){
        return new UserDetailsServiceImpl();
    }

}