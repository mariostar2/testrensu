package com.example.test01.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Entity
@Data
@AllArgsConstructor
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false, length = 30, unique = true)
	private String Username;//아이디 파트
	@Column(nullable = false, length = 70 )
	private String password;//비밀번호 파트
	@Column(nullable = false, length = 50)
	private String email;//이메일파트
	
	
	

}
