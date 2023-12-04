package com.martintech.martin_bank.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

import static jakarta.servlet.DispatcherType.*;

import static org.springframework.security.authorization.AuthorizationManagers.allOf;
import static org.springframework.security.authorization.AuthorityAuthorizationManager.hasAuthority;
import static org.springframework.security.authorization.AuthorityAuthorizationManager.hasRole;

@Configuration
public class ProjectSecurityConfig {

/*
    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(authorize -> authorize

                    .dispatcherTypeMatchers(FORWARD, ERROR).permitAll()
                    .requestMatchers("/contact/**", "/notice", "/about").permitAll()
                    .requestMatchers("/api/**").authenticated()
                    .requestMatchers("/card/**").hasRole("USER")
                    .requestMatchers("/loan/**","/card/**","/account ").hasRole("ADMIN")
                    .requestMatchers("/db/**").access(allOf(hasAuthority("db"), hasRole("ADMIN")))
                    .anyRequest().denyAll()


        );
        return http.build();
    }
*/
}