package com.rest.user;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class UserResource 
{
@Autowired
private UserDaoService service;
@GetMapping("/users")
public List<User> retriveAllUsers()
{
return service.findAll();
}
//retrieves a specific user detail
@GetMapping("/users/{id}")
public User retriveUser(@PathVariable int id)
{
return service.findOne(id);
}

@PostMapping("/user")
public void addUser(@RequestBody User u) {
	service.save(u);
	//return "useradded";
}
@PutMapping("/users/{id}")
public void modifyUser(@RequestBody User u) {
	service.save(u);
	//return "useradded";
}

@DeleteMapping("/users/{id}")
public void removeUser(@RequestBody User u) {
	service.remove(u);
}
}