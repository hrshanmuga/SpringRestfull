package springrestful_example.service;

import java.util.List;

import springrestful_example.model.User;


public interface UserService {

	public List listAllUser();
 
	public void addUser(User user);
 
	public void updateUser(User user);
 
	public void delete(User user);
 
	public User findUserById(User user);
}
