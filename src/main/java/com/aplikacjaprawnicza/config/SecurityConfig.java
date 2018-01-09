package com.aplikacjaprawnicza.config;

import com.aplikacjaprawnicza.security.MySavedRequestAwareAuthenticationSuccessHandler;
import com.aplikacjaprawnicza.security.RestAuthenticationEntryPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;

@Configuration
@EnableWebSecurity
@ComponentScan("com.aplikacjaprawnicza.security")
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private RestAuthenticationEntryPoint restAuthenticationEntryPoint;

    @Autowired
    private MySavedRequestAwareAuthenticationSuccessHandler authenticationSuccessHandler;

    @Override
    protected void configure(AuthenticationManagerBuilder auth)
            throws Exception {

        auth.inMemoryAuthentication()
                .withUser("temporary").password("temporary").roles("ADMIN")
                .and()
                .withUser("user@gala.com").password("password").roles("USER");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .exceptionHandling()
                .authenticationEntryPoint(restAuthenticationEntryPoint)
                .and()
                .authorizeRequests()
                 .antMatchers("/img/*").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .permitAll()			
                .successHandler(authenticationSuccessHandler)
                .failureHandler(new SimpleUrlAuthenticationFailureHandler())
                .and()
                .logout();
    }

    @Bean
    public SimpleUrlAuthenticationFailureHandler myFailureHandler() {
        return new SimpleUrlAuthenticationFailureHandler();
    }
    
     @Bean
    public MySavedRequestAwareAuthenticationSuccessHandler mySuccessHandler(){
        return new MySavedRequestAwareAuthenticationSuccessHandler();
    }

}
