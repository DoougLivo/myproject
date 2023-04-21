package com.assignment.choi.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor(access=AccessLevel.PROTECTED)
@AllArgsConstructor
@Entity
@Table(name="DEPARTMENT_TB")
@Getter
@Setter
public class DepDto {
	@Id
	@Column(name="dep_id", length=1) // 2
	private String dep_id="";
	
	@Column(name="dep_nm", length=30)
	private String dep_nm="";   // 개발팀
	
}
