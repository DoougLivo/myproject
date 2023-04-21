package com.assignment.choi.domain;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserHDtoPK implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

//	@ManyToOne(targetEntity=HobbyDto.class, fetch=FetchType.LAZY)
//	@JoinColumn(name="h_code_id")
	private HobbyDto hobbyDto; // A
	
//	@ManyToOne(targetEntity=UserDto.class, fetch=FetchType.LAZY, cascade = CascadeType.REMOVE)
//	@JoinColumn(name="user_id", insertable = false, updatable = false)
	private UserDto userDto; // test
	
}