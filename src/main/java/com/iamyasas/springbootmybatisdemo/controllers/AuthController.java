package com.iamyasas.springbootmybatisdemo.controllers;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iamyasas.springbootmybatisdemo.constants.AuthConstants;

@RestController
public class AuthController {
	@GetMapping("/authenticate")
	public String authenticate(HttpServletResponse response) {
		Cookie token = new Cookie(AuthConstants.TOKEN, "ykarunarathna");
		token.setHttpOnly(true);
		//token.setSecure(true);
		response.addCookie(token);
		return "Authenticated succesfully";
	}
}
