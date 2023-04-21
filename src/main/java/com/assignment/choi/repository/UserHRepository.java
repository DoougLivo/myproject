package com.assignment.choi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.assignment.choi.domain.UserHDto;
import com.assignment.choi.domain.UserHDtoPK;

public interface UserHRepository extends JpaRepository<UserHDto, UserHDtoPK>{

	@Query("select d from UserHDto d left join d.hobbyDto h where d.userDto.user_id=:userId")
	List<UserHDto> findByHobby(@Param("userId")String user_id);
	
//	@Query("delete from UserHDto d where d.userDto.user_id=:userId")
//	void deleteHByUserId(@Param("userId")String user_id);
	
//	@Query("update UserHDto d set user_id='1' where d.userDto.user_id=:userId")
//	void updateUserNull(@Param("userId")String user_id);
}
