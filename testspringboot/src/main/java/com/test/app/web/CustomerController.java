package com.test.app.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.app.service.CustomerService;
import com.test.app.vo.User;

@Controller
public class CustomerController {
	
	@Autowired
	public CustomerService customerService;
	
	@RequestMapping("/helloHtml")
	public String  home(Model model){
		/*System.out.println("CustomerController.home()"+name);
		if(null==name){
            name="boy";
        }
		ModelAndView mv = new ModelAndView("index"); 
		mv.addObject("user_name", name);
		System.out.println("CustomerController.home()"+mv);*/
		System.out.println("CustomerController.home()"+model);
		model.addAttribute("hello", "from TemplateController.helloHtml");
		System.out.println("CustomerController.home()"+model);
		System.out.println("CustomerController.home()1111"+model);
		return "helloHtml";
	}
	
	@RequestMapping("/findUser")
	@ResponseBody
	public List<User>  findUser(Model model){
		System.out.println("CustomerController.findUser()");
		List<User> list = customerService.findUser();
		System.out.println("CustomerController.findUser()"+list);
		return list ;
	}
	

}
