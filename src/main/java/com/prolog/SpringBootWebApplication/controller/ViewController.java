package com.prolog.SpringBootWebApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.prolog.SpringBootWebApplication.beans.BooksContributed;
import com.prolog.SpringBootWebApplication.beans.NewUser;
import com.prolog.SpringBootWebApplication.dao.ServiceDao;

@Controller
public class ViewController {
	@Autowired 
	ServiceDao service ;
	@RequestMapping("/")
	public String indexPage() {
		  return "index";
	}
//	@RequestMapping("/register")
//	public String register(Model model) {
//		NewUser user=new NewUser();
//		//model.addAttribute("user",user);
//		 return "registerPage";
//	}
	
	@RequestMapping("/contributionForm")
	public String contributionForm(Model model) {
		BooksContributed student=new BooksContributed(); 
		  return "contribution";
	}
	@RequestMapping("/cbooks")
	public String cBooks(Model model){
			List<BooksContributed> list=service.bookC();
			System.out.println(list.size());
			model.addAttribute("list",list);
			return "cbooks";
		}
	@RequestMapping("/cppbooks")
	public String cppBooks(Model model){
			List<BooksContributed> list=service.bookCpp();
			System.out.println(list.size());
			model.addAttribute("list",list);
			return "cppbooks";
	}
}
