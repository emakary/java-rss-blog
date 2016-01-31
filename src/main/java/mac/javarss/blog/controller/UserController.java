package mac.javarss.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mac.javarss.blog.jpa.entity.User;
import mac.javarss.blog.jpa.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute("user")
	public User construct(){
		return new User();
	}

	@RequestMapping("/users")
	private String users(Model model)
	{
		model.addAttribute("users",userService.findAll());
		return "users";
	}
	
	@RequestMapping("/users/{id}")
	public String detail(Model model,@PathVariable int id)
	{
		model.addAttribute(userService.findOneWithBlogs(id));
		return "user-detail";
	}
	
	@RequestMapping("/register")
	private String showRegister()
	{
		return "user-register";
	}

	@RequestMapping(value="/register", method=RequestMethod.POST)
	private String doRegister(@ModelAttribute("user") User user){
        userService.save(user);
		return "user-register";		
	}




}
