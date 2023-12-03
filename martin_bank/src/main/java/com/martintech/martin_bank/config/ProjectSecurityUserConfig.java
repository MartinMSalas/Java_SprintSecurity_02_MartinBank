package com.martintech.martin_bank.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
// Not for production use

@Configuration
public class ProjectSecurityUserConfig {
    // Not for production use
    @Bean
    public InMemoryUserDetailsManager inMemoryUserDetailsManager() {
        PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        UserDetails user = User.builder()
                .username("user").password(encoder.encode("user")).authorities("read").roles("USER").build();

        UserDetails admin = User.builder()
                .username("admin").password(encoder.encode("admin")).authorities("read", "write").roles("ADMIN").build();
        return new InMemoryUserDetailsManager(admin, user);
    }
}

