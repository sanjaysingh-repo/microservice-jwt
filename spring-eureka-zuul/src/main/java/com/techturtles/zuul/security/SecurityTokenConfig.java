package com.techturtles.zuul.security;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.techturtles.common.social.security.TokenAuthenticationFilter;


@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(
        securedEnabled = true,
        jsr250Enabled = true,
        prePostEnabled = true
)
@ComponentScan("com.techturtles.common")
public class SecurityTokenConfig extends WebSecurityConfigurerAdapter {
	
	@Bean
	@Lazy
    public TokenAuthenticationFilter tokenAuthenticationFilter() {
        return new TokenAuthenticationFilter();
    }
	
	@Override
  	protected void configure(HttpSecurity http) throws Exception {
    	   http
		.csrf().disable()
		    // make sure we use stateless session; session won't be used to store user's state.
	 	    .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS) 	
		.and()
		    // handle an authorized attempts 
		    .exceptionHandling().authenticationEntryPoint((req, rsp, e) -> rsp.sendError(HttpServletResponse.SC_UNAUTHORIZED)) 	
		.and()
		   // Add a filter to validate the tokens with every request
		  // .addFilterAfter(new JwtTokenAuthenticationFilter(jwtConfig), UsernamePasswordAuthenticationFilter.class)
		// authorization requests config
		.authorizeRequests()
		   // allow all who are accessing "auth" service
		   .antMatchers("/client" + "/static/**").permitAll() 
		   .antMatchers("/client/","/client/login","/client/oauth2/redirect**").permitAll() 
		   .antMatchers("/client" + "/user/**").hasRole("USER")
		   //.antMatchers("/**","oauth2/redirect**","/login**", "/error**")
           //.permitAll()
		   // must be an admin if trying to access admin area (authentication is also required here)
		   .antMatchers("/gallery" + "/admin/**").hasRole("ADMIN")
		  // Any other request must be authenticated
		   .anyRequest().authenticated(); 
    	   
    	// Add our custom Token based authentication filter
           http.addFilterBefore(tokenAuthenticationFilter(), UsernamePasswordAuthenticationFilter.class);
	}
	
}