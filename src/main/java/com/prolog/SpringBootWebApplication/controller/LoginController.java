package com.prolog.SpringBootWebApplication.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.prolog.SpringBootWebApplication.beans.NewUser;
import com.prolog.SpringBootWebApplication.dao.ServiceDao;

@Controller
public class LoginController {
   @Autowired
   ServiceDao service ;
   NewUser user=null;
	@RequestMapping("/account")
	public String account(HttpServletRequest request,Model model) {
		HttpSession ses= request.getSession();                      //Session 
		 user=(NewUser) ses.getAttribute("sess");   //Session 
		if(user==null)
		 return "loginPage";
		else {
			model.addAttribute("userDetail",user);
			return "Profile";
		}
	}
	@RequestMapping("/register")
	public String register(Model model) {
		NewUser user=new NewUser();
		model.addAttribute("user",user);
		 return "registerPage";
	}
@RequestMapping("/confirmPage2")
	public String confirmUser(@ModelAttribute("user") NewUser user ) {
	service.addUser(user);
	return "confirmPage2";		
	}
@RequestMapping("/profile")
public String profile( HttpServletRequest request,Model model) {
	String email=request.getParameter("email");
	String password=request.getParameter("password");
	String page;
	  user=service.findUser(email,password);  
     if(user.getPassword().equals(password)) {
    	 model.addAttribute("userDetail",user);
    	 request.getSession().setAttribute("sess",user);   //Session setAttribute();
	     page="Profile";
     }
     else {
    	 System.out.println("no");
    	  page="incorrect";               
     }
 return page;
 }
@RequestMapping("/editProfile")
public String update(HttpServletRequest request,Model model) {
	//System.out.println("Update "+user.getName());
	model.addAttribute("userDetail",user);
	return "update";
}
@PostMapping("/update")
public String update(@RequestParam("name") String name,@RequestParam("email") String email,
		@RequestParam("number") String number,@RequestParam("password") String password,
		HttpServletRequest request,Model model){
	 user=new NewUser(name,email,number,password);
	 service.update(user);
	model.addAttribute("userDetail",user);
	request.getSession().setAttribute("sess",user); 
	return "update";
}
@RequestMapping("/logout")
public String logout(HttpServletRequest request){
	request.getSession().removeAttribute("sess");          //Session remove();
    return "index";
  }

}


