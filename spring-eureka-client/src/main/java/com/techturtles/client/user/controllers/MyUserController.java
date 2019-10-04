package com.techturtles.client.user.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.annotation.Resource;
import javax.servlet.http.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.WebUtils;

@Controller
public class MyUserController {

	private static final Logger logger = LoggerFactory.getLogger(MyUserController.class);
	
	
	@RequestMapping(value="/user/myprofile", method=RequestMethod.GET)
	//@PreAuthorize("hasRole('ROLE_USER')")
    public String firstPage(Model m,HttpServletRequest request,HttpServletResponse response) {
		//String tokens = (String) WebUtils.getSessionAttribute(request, "tokens");
		//logger.info("tokens "+tokens);
		return "myuserprofile";
	}
	
	
	
	@RequestMapping(value="/oauth2/redirect",method=RequestMethod.GET)
	public String autheticateusingssotoken(@RequestParam(required = false, value = "token") String tokens,HttpServletRequest request,HttpServletResponse response){
			System.out.println("sso web service");
		
		 HttpSession session = request.getSession(true);
         session.setAttribute("tokens", tokens);
         return "redirect:/user/myprofile?"+tokens;
	}
	
//	@RequestMapping(value="/logout", method = RequestMethod.GET)
//	public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
//		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//		SSOCookieUtil.clear(response, jwtTokenCookieName);
//		if (auth != null){    
//			new SecurityContextLogoutHandler().logout(request, response, auth);
//		}
//		return "redirect:/login?logout";
//	}
//	
//	@RequestMapping(value="/logout", method = RequestMethod.POST)
//	public String logoutpostPage (HttpServletRequest request, HttpServletResponse response) {
//		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//		SSOCookieUtil.clear(response, jwtTokenCookieName);
//		if (auth != null){    
//			new SecurityContextLogoutHandler().logout(request, response, auth);
//		}
//		return "redirect:/login?logout";
//	}
	
	

}
