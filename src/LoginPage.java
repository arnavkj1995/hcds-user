import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginPage extends JFrame{
	JLabel user , title, pass;
	JPasswordField password;
	JTextField userName;
	JButton Login, clear;
	LoginPage(){
	 	super("Hijli Co-operative Society");
	 	title= new JLabel("User Account Login", JLabel.CENTER);
	 	user=new JLabel("UserName");
	 	password=new JPasswordField(15);
	 	pass=new JLabel("Password");
	 	userName=new JTextField(15);
	 	Login=new JButton("Ok");
	 	clear=new JButton("Clear");
	 	
        this.setSize(250,200);
        this.setLayout( new FlowLayout());
	 	this.add(title);
	 	this.add(user);
	 	this.add(userName);
	 	this.add(pass);
	 	this.add(password);
	 	this.add(Login);
	 	this.add(clear);
	 	this.setVisible(true);
	}
}