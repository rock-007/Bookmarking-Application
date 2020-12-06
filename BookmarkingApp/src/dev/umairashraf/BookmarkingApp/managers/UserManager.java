package dev.umairashraf.BookmarkingApp.managers;

import dev.umairashraf.BookmarkingApp.entities.User;

public class UserManager {
//using here singilton pattern so we make constructor empty 
	private UserManager() {
	}

	// but for creating only one instance we will use the below method
	private static UserManager instance = new UserManager();

	public static UserManager getInstance() {

		return instance;
	}

	public User createUser(long id, String email, String password, String firstName, String lastName, int gender,
			String userType) {
User user =new User();
user.setId(id);
user.setEmail(email);
user.setPassword(password);
user.setFirstName(firstName);
user.setLastName(lastName);
user.setGender(gender);
user.setUserType(userType);                                
//reutrn user manager class instance
return user;

	}

}
