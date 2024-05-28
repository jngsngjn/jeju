package hello.jeju.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;

import java.util.Collections;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http.csrf(csrf -> csrf.disable());

        http.formLogin(login -> login.loginPage("/auth/login").permitAll());

        http.httpBasic(basic -> basic.disable());

        http.oauth2Login(Customizer.withDefaults());

        http.logout(logout -> logout.logoutUrl("/auth/logout").permitAll());

        http.authorizeHttpRequests(auth -> auth
                .requestMatchers("/", "/auth/**", "/auth/login").permitAll()
                .requestMatchers("/index.html").permitAll()
                .anyRequest().authenticated()
        );

        return http.build();
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}