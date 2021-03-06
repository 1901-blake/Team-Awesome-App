package com.revature.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.model.Users;

public interface UsersRepo extends JpaRepository<Users, Integer> {

	List<Users> findBySubkey(String key);
	
}
