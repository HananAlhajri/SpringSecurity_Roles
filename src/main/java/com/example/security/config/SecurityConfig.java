package com.example.security.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

//The two annotations need to be together when we work with spring 3
@Configuration
@EnableWebSecurity

@RequiredArgsConstructor
public class SecurityConfig {
    private final JwtAuthenticationFilter jwtAuthFilter;
    private final AuthenticationProvider authenticationProvider;

    //as the app start spring security will try to look for bean of type:
     // SpringSecurityFilterChain: the bean that is responsible for configuring all the http security of our app

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        http
                //first disable this one (SEARCH AND READ WHAT IS THIS?)
                .csrf()
                .disable()

                //we can choose and decide the methods or urls we want to secure
        // BUT, in every app there are a white list: it means that we have some endpoints that does not need any auth or token
        // EXAMPLE: Create account -> does not need a token cause there is no token yet
                .authorizeHttpRequests()
                .requestMatchers("/api/v1/auth/**")//white list, two stars means all the methods in that controller
                .permitAll()
                .anyRequest()//any other request than the white list, AUTHENTICATE it
                .authenticated()
                .and()
                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)//how we want to create our session: stateless or steteful
                .and()
                .authenticationProvider(authenticationProvider)
                .addFilterBefore(jwtAuthFilter, UsernamePasswordAuthenticationFilter.class);// execute this filter before usernamepssowrd filter!


        return http.build();
    }

}
