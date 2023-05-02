package javaApp.model;

public class LoginModel 
{
	private String username;
	private String password;
	
	public String getUsername()
	{
		return this.username;
	}
	
	public void setUsername(String username)
	{
		if(checkUsername(username))
		{
			this.username = username;
		}
		else
		{
			this.username = "";
		}
	}
	
	public String getPassword()
	{
		return this.password;
	}
	
	public void setPassword(String password)
	{
		if(checkPassword(password))
		{
			this.password = password;
		}
		else
		{
			this.password = "";
		}
	}
	
	private boolean checkUsername(String username)
	{
		if(username.length() != 10) return false;
		if(!username.startsWith("03") && !username.startsWith("09")) return false;
		for(int i = 0; i < 10; i++)
		{
			if(!Character.isDigit(username.charAt(i))) return false;
		}
		return true;
	}
	
	private boolean checkPassword(String password)
	{
		if(password.length() < 6 || password.length() > 10) return false;
		for(int i = 0; i < password.length(); i++)
		{
			if(!Character.isLetterOrDigit(password.charAt(i))) return false;
		}
		return true;
	}
}
