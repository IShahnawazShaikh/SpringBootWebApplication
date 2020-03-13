package com.prolog.SpringBootWebApplication.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.prolog.SpringBootWebApplication.beans.BooksContributed;
import com.prolog.SpringBootWebApplication.beans.NewUser;
import com.prolog.SpringBootWebApplication.dao.ServiceDao;
import com.prolog.SpringBootWebApplication.message.Response;
@RestController
public class MyController {
	Response response;
   NewUser user=null;
	@Autowired 
	ServiceDao service ;
	@RequestMapping(value="/confirmpage", method=RequestMethod.POST)
	public Response confirmContribution(HttpServletRequest request,@RequestBody BooksContributed book) {	
		user=(NewUser)request.getSession().getAttribute("sess");
		if(user==null) {
			response=new Response("succeed");
		}
		else {
			book.setCName(user.getName());
			service.save(book);
			response=new Response("Done",book);
		}
		//AJAX
	   return response;
	}	
@RequestMapping("/checkout")
	public Response checkout(HttpServletRequest request) {
       //AJAX
			user=(NewUser)request.getSession().getAttribute("sess");
			if(user==null) {
				  response=new Response("Done");
			}
			else {
				  response=new Response("succeed");
			}
			return response;
	}
//@RequestMapping(value="/confirmPage2",method=RequestMethod.POST)
//public Response confirmUser(@RequestBody NewUser user ) {
//      service.addUser(user);
//      response=new Response("Done",user);
//	   return response;		
//}


}


