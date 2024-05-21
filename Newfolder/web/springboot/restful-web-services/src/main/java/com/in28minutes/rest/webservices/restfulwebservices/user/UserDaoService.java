package com.in28minutes.rest.webservices.restfulwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	
	//JPA/hibernate >> database -- -> normally
	//UserDaoService >> Static List ---> but for now, we use static
	
	private static List<User> users = new ArrayList<>();
	
	static {
		users.add(new User(1, "Adam", LocalDate.now().minusYears(30)));
		users.add(new User(2, "Eve", LocalDate.now().minusYears(20)));
		users.add(new User(3, "Jane", LocalDate.now().minusYears(10)));
		users.add(new User(4, "Robot", LocalDate.now().minusYears(6)));
	}
	
	public List<User> findAll(){
		return users;
	}
	
	
	//public User save(User user) {
	
	
	//public User findOne (int id)  {

}
