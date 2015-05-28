package UI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

import Control.LoginControl;
import Dao.LoginDAO;


public class Login extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Login dialog = new Login();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Login() {
		
		Control.LoginControl.getControl().findById("123");
		setBounds(100, 100, 438, 316);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u6B22\u8FCE\u767B\u5F55");
		lblNewLabel.setBounds(133, 10, 175, 46);
		lblNewLabel.setFont(new Font("Î¢ÈíÑÅºÚ Light", Font.BOLD, 40));
		contentPanel.add(lblNewLabel);
		
		JLabel label = new JLabel("\u7528\u6237\u540D\uFF1A");
		label.setBounds(55, 81, 74, 27);
		label.setFont(new Font("Î¢ÈíÑÅºÚ Light", Font.BOLD, 15));
		contentPanel.add(label);
		
		JLabel label_1 = new JLabel("\u5BC6\u7801\uFF1A");
		label_1.setBounds(55, 134, 74, 27);
		label_1.setFont(new Font("Î¢ÈíÑÅºÚ Light", Font.BOLD, 15));
		contentPanel.add(label_1);
		
		textField = new JTextField();
		textField.setBounds(122, 84, 231, 21);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(122, 137, 231, 21);
		contentPanel.add(passwordField);
		
		final JButton btnNewButton = new JButton("\u767B\u5F55");
		btnNewButton.setFont(new Font("Î¢ÈíÑÅºÚ Light", Font.BOLD, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

						
				if(LoginControl.isUser(textField.getText(),String.valueOf(passwordField.getPassword())))
					//if(usrName.equals(usrNameField.getText())&&password.equals(String.valueOf(passwordField.getPassword())))
					{
					
					        Functionchoose functionchoose=new Functionchoose();
					        functionchoose.setVisible(true);
							dispose(); 
					}
					else
					{
							JOptionPane.showMessageDialog(null, "ÓÃ»§Ãû/ÃÜÂë´íÎó£¡", "¾¯¸æ",JOptionPane.INFORMATION_MESSAGE);
							passwordField.setText(null);
					}
			}
		});
		btnNewButton.setBounds(158, 205, 129, 36);
		contentPanel.add(btnNewButton);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
		}
	}
}
