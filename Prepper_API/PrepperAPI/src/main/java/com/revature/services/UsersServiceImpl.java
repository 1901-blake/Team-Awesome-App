package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Users;
import com.revature.repos.UsersRepo;

@Service
public class UsersServiceImpl implements UsersService{

	@Autowired
	private UsersRepo usersRepo;
	
	@Override
	public Users save(Users u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users update(Users u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users delete(Users u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Users> findAll() {
		return usersRepo.findAll();
	}

	@Override
	public Users findById(int id) {
		return usersRepo.getOne(id);
	}

	@Override
	public List<Users> findByUsername(String usernamename) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Users> findByFirstname(String firstname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Users> findByLastname(String lastname) {
		// TODO Auto-generated method stub
		return null;
	}

}