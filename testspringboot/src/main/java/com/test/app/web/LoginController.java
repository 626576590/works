package com.test.app.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.app.config.PlatformUser;

@Controller
public class LoginController extends BaseController{
	
	@RequestMapping("/")
    public String root() {
		System.out.println("LoginController.root()");
        return "login";
    }

	@RequestMapping("/home")
	public String home() {
		System.out.println("LoginController.home()");
		return "redirect:index";
	}
	
	@RequestMapping("/index")
	public String index() {
		System.out.println("LoginController.index()");
		request.setAttribute("user", (PlatformUser)SecurityContextHolder.getContext().getAuthentication().getPrincipal());
		
		return "index";
	}
	
	@RequestMapping("/login")
	public String login(@RequestParam(required = false)String error , HttpServletRequest request ) {
		System.out.println("LoginController.login()=="+error);
		if (error != null){
            request.setAttribute("error","用户名或密码错误");
        }
		return "login";
	}
	
	@RequestMapping("/logout")
	public String logout() {
		
		
		return "login";
	}
	
}
