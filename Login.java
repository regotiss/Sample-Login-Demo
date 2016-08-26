import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;

public class Login extends JPanel
{
	JButton btnLogin;
	JTextField tfUsername;
	JPasswordField tfPassword;
	
	public Login()
	{
		
		setLayout(null);
		JLabel l=new JLabel("username:");
		l.setBounds(50,50,100,20);
		l.setFont(new Font("Monotype Corsiva", Font.BOLD, 20));
		add(l);

		l=new JLabel("password:");	
		l.setBounds(50,100,100,20);
		l.setFont(new Font("Monotype Corsiva", Font.BOLD, 20));
		add(l);

		tfUsername=new JTextField();	
		tfUsername.setBounds(150,50,150,30);
		
		add(tfUsername);

		tfPassword=new JPasswordField();	
		tfPassword.setBounds(150,100,150,30);
		add(tfPassword);

		btnLogin=new JButton("Login");
		btnLogin.setBounds(115,150,100,30);
		btnLogin.setFont(new Font("Monotype Corsiva", Font.BOLD, 20));
		btnLogin.addActionListener(new BtnEventHandler());
		add(btnLogin);
		
		setBorder(BorderFactory.createTitledBorder("Login"));
		setBackground(new java.awt.Color(255, 245, 245));
	}
	public static void main(String[] args) 
	{
		//Set Nimbus Look and feel
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}

		create();
	}
	public static void create(){
		

		JFrame f=new JFrame("Login");
		f.add(new Login());
		f.setSize(350,250);
		f.setVisible(true);
	}
	class BtnEventHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e){
			String username=tfUsername.getText();
			String password=new String(tfPassword.getPassword());
			if(username.equals("Admin") && password.equals("Password"))
				JOptionPane.showMessageDialog(Login.this, "Successful Login");
			else
				JOptionPane.showMessageDialog(Login.this, "Username/Password is incorrect");

		}
	}
}


