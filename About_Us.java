import javax.swing.*;    
import java.awt.event.*;  
import java.awt.*;
import javax.swing.ImageIcon;
import javax.imageio.*;
import java.io.File; 
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException; 
import java.lang.*;
import java.awt.Color;
import java.util.Scanner;

public class About_Us extends JFrame implements ActionListener
{
	public JFrame MainLoginFrame;
	public JButton Login_Button,Close_Button;
	public JTextField Email_Text;
	public JPasswordField Password_Text;
	public Login login;
	public ForgetPassword forgetpassword;
	public ImageIcon BackgroundImage;
	public String checkPass, checkusername;
	public FileReader reader;
	private Cursor cursor;
	public String email_to_check;
	
	public String get_email()
	{
		return email_to_check;
	}
	
	public About_Us()
	{
		MainLoginFrame =new JFrame("About Us");
		
		//Cursor for JButtons
		 cursor = new Cursor(Cursor.HAND_CURSOR);
		
	
		JLabel BackgroundImage_label;
		ImageIcon img = new ImageIcon("Graphics/1x/About us.png");
		BackgroundImage_label = new JLabel ("",img,JLabel.CENTER);
		BackgroundImage_label.setBounds(0,0,800,500);
			
		
		Login_Button = new JButton("Back to Login");
		Login_Button.setBounds(20,5,100,30);
		Login_Button.setBorder(null);
		Login_Button.addActionListener(this);
		Login_Button.setCursor(cursor);
		
		Close_Button = new JButton("Close");
		Close_Button.setBounds(700,5,50,30);
		Close_Button.setBorder(null);
		Close_Button.addActionListener(this);
		Close_Button.setCursor(cursor);
		
		
			
		
					// Login Frame Properties 
		MainLoginFrame.setSize(800,500);
		MainLoginFrame.setLayout(null);
		MainLoginFrame.setLocationRelativeTo(null);
		MainLoginFrame.setVisible(true);
		MainLoginFrame.setResizable(false);
		MainLoginFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
					//Adding Properties in Frame
		
		
		MainLoginFrame.add(Login_Button);
		MainLoginFrame.add(Close_Button);
		
		
		
		MainLoginFrame.add(BackgroundImage_label);
		
		
		
		
	}
	
	
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==Login_Button)
		{
			MainLoginFrame.setVisible(false);
			login = new Login();
		}
		
		else if(e.getSource()==Close_Button)
		{
			System.exit(0);
		}
	}
	
	public static void main(String [] args)
	{
		new About_Us();
	}
}