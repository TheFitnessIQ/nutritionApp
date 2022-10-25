package com.app.rest.webservices.nutritionApp.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfiguration {

    //overriding default filter chain defined by spring security
    @Bean
    SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        // 1. All requests are authenticated
        http.authorizeHttpRequests(
                auth -> auth.anyRequest().authenticated()
        );
        //If a request is not authenticated , a web page is shown
        http.httpBasic(Customizer.withDefaults());

        //Disable CRPF to enable POST/PUT
        http.csrf().disable();

        return http.build();
    }
}
