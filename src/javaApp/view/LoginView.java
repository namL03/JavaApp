package javaApp.view;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javaApp.model.LoginModel;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class LoginView extends JFrame 
{
	private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JButton btnLogin;
    private LoginModel model;
    
    public LoginView() 
    {
        setTitle("LoginMVC");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 100);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        JLabel usernameLabel = new JLabel("Username:");
        add(usernameLabel);

        txtUsername = new JTextField(10);
        add(txtUsername);

        JLabel passwordLabel = new JLabel("Password:");
        add(passwordLabel);

        txtPassword = new JPasswordField(10);
        add(txtPassword);

        btnLogin = new JButton("Login");
        add(btnLogin);
    }

    public void addLoginListener(ActionListener listener) 
    {
        btnLogin.addActionListener(listener);
    }

    public LoginModel getUser() 
    {
    	model = new LoginModel();
        model.setUsername(txtUsername.getText());
        model.setPassword(new String(txtPassword.getPassword()));
        return model;
    }
    
    public void showMessage(String message)
    {
    	JOptionPane.showMessageDialog(this, message, "Message", JOptionPane.INFORMATION_MESSAGE);
    }
}
