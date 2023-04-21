package com.assignment.choi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.assignment.choi.domain.DepDto;
import com.assignment.choi.domain.UserDto;

public interface UserRepository extends JpaRepository<UserDto, String>{
	
	@Query("select u from UserDto u where u.user_id=:user_id")
	UserDto findByDto(@Param("user_id")String user_id);
	
	@Query("select d from DepDto d order by dep_id asc")
	List<DepDto> findByDto();
	
	List<UserDto> findByUserNmContaining(String searchKeyword);
	
	@Query("select count(u.user_id) from UserDto u where u.user_id=:user_id")
	int findByUserId(@Param("user_id")String user_id);

//	Page<UserDto> findByUserNmContaining(String searchKeyword, PageRequest of);
}
