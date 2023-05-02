package javaApp.program;

import javaApp.view.LoginView;
import javaApp.controller.LoginController;

public class Test
{
	public static void main(String[] args)
	{
		DataAccess.addUser("0987654321", "q2w2e3");
		DataAccess.addUser("0983313567", "ki98u7");
		DataAccess.addUser("0912345678", "ngaythu5");
		DataAccess.addUser("0987452100", "so1dcv");
		LoginView view = new LoginView( );
		LoginController controller = new LoginController(view);
		view.setVisible(true);
	}
}

