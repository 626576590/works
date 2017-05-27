package com.test.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private UserDetailsService userDetailsService;
	
	@Override
    protected void configure(HttpSecurity http) throws Exception {
		System.out.println("WebSecurityConfig.configure()");
        http
     	 // .csrf().disable()   // 暂时禁用跨域攻击防护，后面有需要再配置
            .authorizeRequests()
                .antMatchers("/", "/home").permitAll()
                .anyRequest().authenticated()
                .and()
            .formLogin()
                .loginPage("/login")
               // .successForwardUrl("/home")
               // .defaultSuccessUrl("/index")
              //  .failureUrl("/login?error=true")
                .permitAll()
                .and()
            .logout()
                .permitAll();
		        /*.invalidateHttpSession(true)  
		        .and()  
		        .rememberMe()//登录后记住用户，下次自动登录,数据库中必须存在名为persistent_logins的表  
		        .tokenValiditySeconds(1209600); */
    }
	
	public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/js/**", "/css/**", "/images/**", "/**/favicon.ico");
    }
	
	@Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		System.out.println("WebSecurityConfig.configureGlobal()");
       // auth.inMemoryAuthentication().withUser("user").password("password").roles("USER");
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
    }
	
	public Md5PasswordEncoder passwordEncoder() {
        return new Md5PasswordEncoder();
    }
	
	 public UserDetailService customUserDetailsService(){
	        return new UserDetailService();
	    }
}
