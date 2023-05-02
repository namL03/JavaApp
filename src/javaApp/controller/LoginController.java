package javaApp.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javaApp.model.LoginModel;
import javaApp.view.LoginView;
import javaApp.program.DataAccess;

public class LoginController 
{
	private LoginView view;
	private LoginModel model;
	
	public LoginController(LoginView view)
	{
		this.view = view;
		view.addLoginListener(new LoginListener());
	}
	
	public boolean checkUser(LoginModel model)
	{
		for(LoginModel user: DataAccess.users)
		{
			if(model.getUsername().equals(user.getUsername()) && model.getPassword().equals(user.getPassword()))
			{
				return true;
			}
		}
		return false;
	}
	
	class LoginListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            model = view.getUser();
            if(checkUser(model))
            {
                view.showMessage("Login successfully!");
            }
            else 
            {
            	view.showMessage("Invalid username and/or password!");
            }
        }
    }
}
