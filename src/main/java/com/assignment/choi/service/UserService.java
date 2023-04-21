package com.assignment.choi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.choi.domain.DepDto;
import com.assignment.choi.domain.HobbyDto;
import com.assignment.choi.domain.UserDto;
import com.assignment.choi.domain.UserHDto;
import com.assignment.choi.domain.UserHDtoPK;
import com.assignment.choi.repository.HobbyRepository;
import com.assignment.choi.repository.UserHRepository;
import com.assignment.choi.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userDao;
	
	@Autowired
	UserHRepository userHDao;
	
	@Autowired
	HobbyRepository hobbyDao;
	
	public void insert(UserDto dto) {
		userDao.save(dto);
	}
	
	public void insertHobby(UserHDto hDto) {
		userHDao.save(hDto);
	}
	
	public List<UserDto> getList() {
//		return userDao.findAll(PageRequest.of(page, 10, Sort.by(Sort.Direction.ASC, "signYn")));
		return userDao.findAll();
	}
	
	public List<UserHDto> getHobby(String user_id) {
		System.out.println("취미 갯수 : "+ userHDao.findByHobby(user_id));
		System.out.println("투스트링: "+userHDao.findByHobby(user_id).toString());
		return userHDao.findByHobby(user_id);
	}
	
	public List<HobbyDto> getHobbyList() {
		return hobbyDao.findAllOrderByAsc();
	}
	
	public UserDto getView(String user_id) {
		return userDao.findByDto(user_id);
	}
	
	public void updateUser(UserDto dto) {
		userDao.save(dto);
	}
	
//	public void updateUserHobby(String user_id, UserHDto hDto) {
//		userHDao.deleteById(user_id);
//		userHDao.save(hDto);
//	}
	
	public void deleteHobby(UserHDtoPK dto) {
		userHDao.deleteById(dto);
//		userHDao.updateUserNull(dto.getUser_id());
	}
	
	public void deleteUser(UserDto dto) {
		userDao.deleteById(dto.getUser_id());
	}
	
	public List<DepDto> getDepList() {
		return userDao.findByDto();
	}
	
	public List<UserDto> searchUser(String searchKeyword) {
//		return userDao.findByUserNmContaining(searchKeyword, PageRequest.of(page, 10, Sort.by(Sort.Direction.ASC, "signYn")));
		return userDao.findByUserNmContaining(searchKeyword);
	}
	
	public int idCheck(String user_id) {
		int result = userDao.findByUserId(user_id);
		if(result == 0) {
			return 0; //사용가능
		} else {
			return result; //사용불가능
		}
	}
}
