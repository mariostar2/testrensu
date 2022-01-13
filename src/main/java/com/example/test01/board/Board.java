package com.example.test01.board;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import com.example.test01.user.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Board {
	@Id
	private int id;
	@Column(nullable = false, length = 60)
	private String title;
	@Lob
	private String content;
	
	@JoinColumn(name ="userId")
	@ManyToOne(fetch = FetchType.EAGER)
	private User user;

	
	
}
