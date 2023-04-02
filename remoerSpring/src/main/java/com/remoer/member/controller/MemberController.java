package com.remoer.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.remoer.member.service.MemberService;

@RequestMapping("/member")
@Controller
public class MemberController {

	@Autowired
	@Qualifier("memberServiceImpl")
	private MemberService service;

	@GetMapping("/login.do")
	public String loginForm() {
		return "member/login";
	}

	@PostMapping("/login.do")
	public String login() {
		return "main/main";
	}
}
