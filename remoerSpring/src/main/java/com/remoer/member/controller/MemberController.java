package com.remoer.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.remoer.member.service.MemberService;
import com.remoer.member.vo.MemberVO;

@RequestMapping("/member")
@Controller
public class MemberController {

	@Autowired
	@Qualifier("memberServiceImpl")
	private MemberService service;

	@RequestMapping("/logout.do")
	public String logout(HttpSession session) {
		session.removeAttribute("login");
		return "redirect:/";
	}

	@GetMapping("/login.do")
	public String loginForm() {
		return "member/login";
	}

	@PostMapping("/login.do")
	public String login(MemberVO vo, HttpSession session) {
		MemberVO loginVO = service.login(vo);
		if (loginVO != null) {
			session.setAttribute("login", loginVO);
		}
		return "redirect:/";
	}

	@GetMapping("/findId.do")
	public String findIdForm() {
		return "member/findId";
	}
	@PostMapping("/findId.do")
	public String findId(MemberVO vo, Model model) {
		model.addAttribute("findId", service.findId(vo));
		return "member/findIdResult";
	}

	// 시간 되면 이메일 발송으로 변경할 것~
	@GetMapping("/findPw.do")
	public String findPwForm() {
		return "member/findPw";
	}
	@PostMapping("/findPw.do")
	public String findPw(MemberVO vo, Model model) {
		model.addAttribute("newPw", service.findPw(vo));
		return "member/findPwResult";
	}

	@RequestMapping("/list.do")
	public String list(Model model) {
		model.addAttribute("list", service.list());
		return "member/list";
	}

	@RequestMapping("/view.do")
	public String view(String id, Model model) {
		model.addAttribute("vo", service.view(id));
		return "member/view";
	}

	@GetMapping("/join.do")
	public String joinForm() {
		return "member/join";
	}

	@PostMapping("/join.do")
	public String join(MemberVO vo) {
		service.join(vo);
		return "member/joined";
	}
}
