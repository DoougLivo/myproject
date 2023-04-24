package com.assignment.choi.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="USER_H_TB")
@Getter
@Setter
@IdClass(UserHDtoPK.class)
public class UserHDto {
	@Id
	@ManyToOne(targetEntity=HobbyDto.class, fetch=FetchType.LAZY)
	@JoinColumn(name="h_code_id")
	private HobbyDto hobbyDto; // A
	
	@Transient
	private String h_code_id;
	
	@Id
	@ManyToOne(targetEntity=UserDto.class)
	@JoinColumn(name="user_id")
	private UserDto userDto; // test
	
	@Transient
	private String userId;
	
	@Override
	public String toString() {
		return "UserHDto [hobbyDto=" + hobbyDto.getH_code_id() + ", userDto=" + userDto.getUserId() + "]";
	}

	
}
