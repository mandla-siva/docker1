package com.caspex;

import java.security.Principal;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@EnableOAuth2Sso
@RestController
@SpringBootApplication
public class SampleOuAthAppApplication   {
//	extends WebSecurityConfigurerAdapter
//	@RequestMapping("/user")
//	public Principal user(Principal principal) {
//		return principal;
//  }
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http
//			.antMatcher("/**")
//			.authorizeRequests()
//				.antMatchers("/", "/login**", "/webjars/**", "/error**")
//				.permitAll()
//			.anyRequest()
//        .authenticated()
//      .and().logout().logoutSuccessUrl("/").permitAll()
//      .and().csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse());
//	}
//
//	public static void main(String[] args) {
//		SpringApplication.run(SampleOuAthAppApplication.class, args);
//	}

}
