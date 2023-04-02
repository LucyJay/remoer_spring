package com.remoer.member.service;

import java.util.List;

import com.remoer.member.vo.MemberVO;

public interface MemberService {

	public MemberVO login(MemberVO vo);

	public String findId(MemberVO vo);

	public String findPw(MemberVO vo);
	
	public List<MemberVO> list();

	public MemberVO view(String id);

	public Integer join(MemberVO vo);

}
