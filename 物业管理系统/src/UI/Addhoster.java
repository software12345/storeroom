package UI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Control.Building2Control;
import Control.BuildingControl;
import Control.HosterControl;
import Model.Building;
import Model.Building2;
import Model.Hoster;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Addhoster extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Addhoster dialog = new Addhoster();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Addhoster() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("\u6DFB\u52A0\u4E1A\u4E3B");
			lblNewLabel.setBounds(146, 10, 136, 29);
			lblNewLabel.setFont(new Font("Î¢ÈíÑÅºÚ Light", Font.BOLD, 30));
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel label = new JLabel("\u8BF7\u8F93\u5165\u4EE5\u4E0B\u4FE1\u606F\uFF1A");
			label.setBounds(25, 57, 136, 22);
			label.setFont(new Font("Î¢ÈíÑÅºÚ Light", Font.BOLD, 15));
			contentPanel.add(label);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("\u59D3\u540D\uFF1A");
			lblNewLabel_1.setBounds(25, 89, 54, 15);
			lblNewLabel_1.setFont(new Font("Î¢ÈíÑÅºÚ Light", Font.BOLD, 15));
			contentPanel.add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("\u624B\u673A\u53F7\uFF1A");
			lblNewLabel_2.setBounds(25, 119, 64, 22);
			lblNewLabel_2.setFont(new Font("Î¢ÈíÑÅºÚ Light", Font.BOLD, 15));
			contentPanel.add(lblNewLabel_2);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("\u5355\u5143\u53F7\uFF1A");
			lblNewLabel_3.setBounds(25, 185, 64, 22);
			lblNewLabel_3.setFont(new Font("Î¢ÈíÑÅºÚ Light", Font.BOLD, 15));
			contentPanel.add(lblNewLabel_3);
		}
		{
			JLabel lblNewLabel_4 = new JLabel("ID\uFF1A");
			lblNewLabel_4.setBounds(235, 89, 54, 15);
			lblNewLabel_4.setFont(new Font("Î¢ÈíÑÅºÚ Light", Font.BOLD, 15));
			contentPanel.add(lblNewLabel_4);
		}
		{
			JLabel lblNewLabel_5 = new JLabel("\u697C\u53F7\uFF1A");
			lblNewLabel_5.setBounds(235, 153, 54, 22);
			lblNewLabel_5.setFont(new Font("Î¢ÈíÑÅºÚ Light", Font.BOLD, 15));
			contentPanel.add(lblNewLabel_5);
		}
		{
			JLabel lblNewLabel_6 = new JLabel("\u623F\u95F4\u53F7\uFF1A");
			lblNewLabel_6.setBounds(236, 185, 64, 22);
			lblNewLabel_6.setFont(new Font("Î¢ÈíÑÅºÚ Light", Font.BOLD, 15));
			contentPanel.add(lblNewLabel_6);
		}
		{
			textField = new JTextField();
			textField.setBounds(69, 89, 145, 20);
			contentPanel.add(textField);
			textField.setColumns(10);
			
		}
		{
			textField_1 = new JTextField();
			textField_1.setBounds(261, 86, 163, 21);
			contentPanel.add(textField_1);
			textField_1.setColumns(10);
		}
		{
			textField_2 = new JTextField();
			textField_2.setBounds(79, 120, 135, 21);
			contentPanel.add(textField_2);
			textField_2.setColumns(10);
		}
		{
			textField_3 = new JTextField();
			textField_3.setBounds(281, 154, 143, 21);
			contentPanel.add(textField_3);
			textField_3.setColumns(10);
		}
		{
			textField_4 = new JTextField();
			textField_4.setBounds(88, 186, 126, 21);
			contentPanel.add(textField_4);
			textField_4.setColumns(10);
		}
		{
			textField_5 = new JTextField();
			textField_5.setBounds(299, 186, 125, 21);
			contentPanel.add(textField_5);
			textField_5.setColumns(10);
		}
		
		{
			JButton btnNewButton_1 = new JButton("\u53D6\u6D88");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					HosterManagement hostermanagement=new HosterManagement();
					hostermanagement.setVisible(true);
					dispose(); 
				}
			});
			btnNewButton_1.setBounds(300, 217, 93, 35);
			btnNewButton_1.setFont(new Font("Î¢ÈíÑÅºÚ Light", Font.BOLD, 20));
			contentPanel.add(btnNewButton_1);
		}
		
		JButton btnNewButton = new JButton("\u786E\u5B9A");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().trim().equals("") || textField_1.getText().trim().equals("") || textField_2.getText().trim().equals("") ||
						   textField_3.getText().trim().equals("") || textField_4.getText().trim().equals("") || textField_5.getText().trim().equals("")
						   || textField_6.getText().trim().equals("") || textField_7.getText().trim().equals(""))
				   {
					   JOptionPane.showMessageDialog(null, "ÐÅÏ¢ÊäÈëÓÐÎó", "¾¯¸æ",JOptionPane.INFORMATION_MESSAGE);
				   }
				Hoster hoster=new Hoster(textField.getText(), textField_1.getText(), textField_2.getText(),
						textField_6.getText(),textField_7.getText());
				HosterControl.getControl().update(hoster);
				if(textField_3.getText().equals("1"))
				{
					Building building = BuildingControl.getControl().findById(textField_5.getText());
					building.setHoster(textField.getText());
					building.setHosterId(textField_1.getText());
					building.setHosterPhone(textField_2.getText());
					BuildingControl.getControl().update(building);
					/*BuildingControl.getControl().save(building.getRoomNumber(),building.getFloorNumber(),building.getUnitNumber(),
							building.getHoster(),building.getHosterId(),building.getHosterPhone(),building.getRepairManagement());*/
				}
				else 
				{
					Building2 building2 = Building2Control.getControl().findById(textField_5.getText());
					building2.setHoster(textField.getText());
					building2.setHosterId(textField_1.getText());
					building2.setHosterPhone(textField_2.getText());
					Building2Control.getControl().update(building2);
					/*Building2Control.getControl().save(building2.getFloorNumber(),building2.getUniteNumber(),building2.getRoomNumber(),
							building2.getHoster(),building2.getHosterId(),building2.getHosterPhone(),building2.getRepairManagement());*/
				}
				JOptionPane.showMessageDialog(null, "Ìí¼Ó³É¹¦", "³É¹¦",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnNewButton.setBounds(56, 217, 93, 35);
		btnNewButton.setFont(new Font("Î¢ÈíÑÅºÚ Light", Font.BOLD, 20));
		contentPanel.add(btnNewButton);
		
		JLabel lblNewLabel_7 = new JLabel("\u7F34\u8D39\u60C5\u51B5\uFF1A");
		lblNewLabel_7.setBounds(234, 119, 80, 22);
		lblNewLabel_7.setFont(new Font("Î¢ÈíÑÅºÚ Light", Font.BOLD, 15));
		contentPanel.add(lblNewLabel_7);
		
		textField_6 = new JTextField();
		textField_6.setBounds(315, 120, 109, 21);
		contentPanel.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("\u62BC\u91D1\uFF1A");
		lblNewLabel_8.setBounds(25, 153, 54, 22);
		lblNewLabel_8.setFont(new Font("Î¢ÈíÑÅºÚ Light", Font.BOLD, 15));
		contentPanel.add(lblNewLabel_8);
		{
			textField_7 = new JTextField();
			textField_7.setBounds(69, 154, 145, 21);
			contentPanel.add(textField_7);
			textField_7.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
		}
	}
}
