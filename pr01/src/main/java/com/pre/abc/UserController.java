package com.pre.abc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	UserService userService;
	/*
	 * CRUD C -> POST R -> GET U -> PUT D -> DELETE
	 */

	@PostMapping("")
	public UserDTO insertUser(UserDTO user) {
		return userService.insertUser(user);
	}

	@GetMapping("")
	public List<UserDTO> getAllUsers() {
		return userService.getAllUsers();
	}

	@GetMapping("/{userId}")
	public UserDTO getUserByUserId(String userId) {
		return userService.getUserByUserId(userId);
	}

	@PutMapping("/{userId}")
	public void updateUserPw(String userId, UserDTO user) {
		userService.updateUserPw(userId, user);
	}

	@DeleteMapping("/{userId}")
	public void deleteUser(String userId) {
		userService.deleteUser(userId);
	}
}
