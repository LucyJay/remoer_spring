package com.remoer.member.service;

import java.security.SecureRandom;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.remoer.member.mapper.MemberMapper;
import com.remoer.member.vo.MemberVO;

@Service
@Qualifier("memberServiceImpl")
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberMapper mapper;

	@Override
	public MemberVO login(MemberVO vo) {
		return mapper.login(vo);
	}

	@Override
	public String findId(MemberVO vo) {
		return mapper.findId(vo);
	}

	@Override
	public String findPw(MemberVO vo) {
		String id = mapper.findPw(vo);
		if (id == null)
			return id;
		else {
			String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
			SecureRandom random = new SecureRandom();
			String randomPw = IntStream.range(0, 10).map(i -> random.nextInt(chars.length()))
					.mapToObj(randomIdx -> String.valueOf(chars.charAt(randomIdx))).collect(Collectors.joining());
			return mapper.updatePw(id, randomPw);
		}
	}

	@Override
	public List<MemberVO> list() {
		return mapper.list();
	}

	@Override
	public MemberVO view(String id) {
		return mapper.view(id);
	}

	@Override
	public Integer join(MemberVO vo) {
		return mapper.join(vo);
	}

}
