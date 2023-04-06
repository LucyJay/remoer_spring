package com.remoer.member.vo;

import java.util.Date;

import lombok.Data;

@Data
public class MemberVO {
	
	private String id, pw, nickname, name, address, tel, email, status, grade_name;
	private Date birth, reg_date, login_date;
	private Integer grade;

}
