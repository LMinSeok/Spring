package com.pre.abc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

	static public ArrayList<UserDTO> users;

	static {
		users = new ArrayList<>();
		users.add(new UserDTO("Lee", "test1", "1234"));
		users.add(new UserDTO("kim", "test2", "1234"));
		users.add(new UserDTO("park", "test3", "1234"));

	}

	public List<UserDTO> getAllUsers() {
		return users;
	}

	public UserDTO getUserByUserId(String userId) {
		return users.stream().filter(userDTO -> userDTO.getUserId().equals(userId)).findAny()
				.orElse(new UserDTO("", "", ""));
	}

	public void updateUserPw(String userId, UserDTO user) {
		users.stream().filter(userDTO -> userDTO.getUserId().equals(userId)).findAny().orElse(new UserDTO("", "", ""));
	}

	public void deleteUser(String userId) {
		users.removeIf(userDTO -> userDTO.getUserId().equals(userId));
	}
}
