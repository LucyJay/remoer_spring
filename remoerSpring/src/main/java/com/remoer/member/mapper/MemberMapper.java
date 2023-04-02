package com.remoer.member.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.remoer.member.vo.MemberVO;

@Component
public interface MemberMapper {

	public MemberVO login(MemberVO vo);

	public String findId(MemberVO vo);

	public String findPw(MemberVO vo);
	
	public String updatePw(@Param("id") String id, @Param("pw") String pw);

	public List<MemberVO> list();

	public MemberVO view(String id);

	public Integer join(MemberVO vo);

}
