package javaApp.program;

import javaApp.model.LoginModel;
import java.util.ArrayList;
import java.util.List;

public class DataAccess 
{
	public static List<LoginModel> users = new ArrayList<>();
	public static void addUser(String username, String password)
	{
		LoginModel newUser = new LoginModel();
		newUser.setUsername(username);
		newUser.setPassword(password);
		users.add(newUser);
	}
}
