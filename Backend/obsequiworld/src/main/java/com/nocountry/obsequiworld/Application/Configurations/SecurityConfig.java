package com.nocountry.obsequiworld.Application.Configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity (securedEnabled = true)
public class SecurityConfig{

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(
                        request ->
                                request.requestMatchers("/**").permitAll()
                )
                .formLogin(
                        login ->
                                login.loginPage("/login").permitAll()
                )
                .headers(
                        header ->
                                header.xssProtection(Customizer.withDefaults())
                )
                .cors(Customizer.withDefaults());
        return http.build();
    }

}
