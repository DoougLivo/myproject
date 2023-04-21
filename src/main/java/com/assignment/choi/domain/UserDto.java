package com.assignment.choi.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor(access=AccessLevel.PUBLIC)
@AllArgsConstructor
@Entity
@Table(name="USER_TB")
@Getter
@Setter
public class UserDto {
	@Id
	@Column(name="user_id", length=20)
	private String user_id="";
	
	@Column(name="user_nm", length=20, nullable=false)
	private String userNm="";

	@Column(name="user_email", length=40, nullable=false, unique = true)
	private String user_email="";
	
	@ManyToOne(targetEntity = DepDto.class, fetch = FetchType.LAZY)
	@JoinColumn(name="dep_id")
	private DepDto depDto;
	
	@Column(name="user_phone", length=13, unique = true)
	private String user_phone="";
	
	@Column(name="user_addr", length=50)
	private String user_addr="";
	
	@Column(name="sign_yn", length=1)
	private String signYn="";

}
