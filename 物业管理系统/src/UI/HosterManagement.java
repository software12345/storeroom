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

import Control.HosterControl;
import Model.Hoster;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.List;

public class HosterManagement extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			HosterManagement dialog = new HosterManagement();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public HosterManagement() {
		setBounds(100, 100, 541, 355);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel label = new JLabel("\u4E1A\u4E3B\u7BA1\u7406");
			label.setFont(new Font("微软雅黑 Light", Font.BOLD, 30));
			label.setBounds(194, 10, 153, 29);
			contentPanel.add(label);
		}
		{
			JLabel label = new JLabel("\u59D3\u540D\uFF1A");
			label.setBounds(43, 71, 69, 22);
			label.setFont(new Font("微软雅黑 Light", Font.BOLD, 20));
			contentPanel.add(label);
		}
		{
			textField = new JTextField();
			textField.setBounds(111, 74, 105, 21);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			JLabel lblId = new JLabel("ID\uFF1A");
			lblId.setBounds(310, 71, 84, 22);
			lblId.setFont(new Font("微软雅黑 Light", Font.BOLD, 20));
			contentPanel.add(lblId);
		}
		{
			textField_1 = new JTextField();
			textField_1.setBounds(360, 74, 134, 21);
			contentPanel.add(textField_1);
			textField_1.setColumns(10);
		}
		{
			textField_2 = new JTextField();
			textField_2.setBounds(29, 149, 454, 29);
			contentPanel.add(textField_2);
			textField_2.setColumns(10);
		}
		{
			JButton button = new JButton("\u7F34\u8D39");
			button.setFont(new Font("微软雅黑 Light", Font.BOLD, 20));
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(textField.getText().trim().equals("") || textField_1.getText().trim().equals(""))
					{
						JOptionPane.showMessageDialog(null, "请输入正确信息", "警告",JOptionPane.INFORMATION_MESSAGE);
						
					}
					else
					{
						List list=HosterControl.getControl().findByHosterName(textField.getText());
						if(list.size()==0)
						{
							JOptionPane.showMessageDialog(null, "无此人", "警告",JOptionPane.INFORMATION_MESSAGE);
						}
						else{
						Hoster hoster = HosterControl.getControl().findById(textField_1.getText());
						hoster.setPropertyCosts("已交");
						HosterControl.getControl().update(hoster);
						JOptionPane.showMessageDialog(null, "缴费成功", "成功",JOptionPane.INFORMATION_MESSAGE);
						Hoster hoster1 = HosterControl.getControl().findById(textField_1.getText());
				        textField_2.setText("ID号："+hoster1.getHosterId()+"  "+"姓名："+hoster1.getHosterName()+"  "+"电话："+hoster1.getHoserPhone()
				        		+"  "+"缴费情况："+hoster1.getPropertyCosts()+"  "+"押金："+hoster1.getDeposit()+"元");
						}
					}
					/*else if(textField.getText().trim().equals("wang")&&textField_1.getText().trim().equals("1311101")){
					JOptionPane.showMessageDialog(null, "缴费成功", "成功",JOptionPane.INFORMATION_MESSAGE);
					
					}
					else{
						JOptionPane.showMessageDialog(null, "无此人", "警告",JOptionPane.INFORMATION_MESSAGE);
					}*/
				}
			});
			button.setBounds(90, 188, 126, 41);
			contentPanel.add(button);
		}
		{
			JButton btnNewButton = new JButton("\u6DFB\u52A0\u4E1A\u4E3B");
			btnNewButton.setFont(new Font("微软雅黑 Light", Font.BOLD, 20));
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Addhoster addhoster =new Addhoster();
					addhoster.setVisible(true);
					dispose(); 
				}
			});
			btnNewButton.setBounds(323, 188, 134, 41);
			contentPanel.add(btnNewButton);
		}
		{
			JButton btnNewButton_1 = new JButton("\u8FD4\u56DE\u4E3B\u754C\u9762");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Functionchoose functionchoose=new Functionchoose();
					functionchoose.setVisible(true);
					dispose(); 
				}
			});
			btnNewButton_1.setBounds(90, 261, 126, 36);
			btnNewButton_1.setFont(new Font("微软雅黑 Light", Font.BOLD, 12));
			contentPanel.add(btnNewButton_1);
		}
		{
			JButton btnNewButton_2 = new JButton("\u9000\u51FA\u7CFB\u7EDF");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
			btnNewButton_2.setBounds(323, 261, 134, 36);
			btnNewButton_2.setFont(new Font("微软雅黑 Light", Font.BOLD, 12));
			contentPanel.add(btnNewButton_2);
		}
		
		JButton btnNewButton_3 = new JButton("\u67E5\u8BE2\uFF1A");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().trim().equals("") || textField_1.getText().trim().equals(""))
				{
					JOptionPane.showMessageDialog(null, "请输入正确信息", "警告",JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{
					List list=HosterControl.getControl().findByHosterName(textField.getText());
					if(list.size()==0)
					{
						JOptionPane.showMessageDialog(null, "无此人", "警告",JOptionPane.INFORMATION_MESSAGE);
					}
					else{
					Hoster hoster = HosterControl.getControl().findById(textField_1.getText());
			        textField_2.setText("ID号："+hoster.getHosterId()+"  "+"姓名："+hoster.getHosterName()+"  "+"电话："+hoster.getHoserPhone()
			        		+"  "+"缴费情况："+hoster.getPropertyCosts()+"  "+"押金："+hoster.getDeposit()+"元");
					}
				}
				
			}
		});
		btnNewButton_3.setBounds(29, 103, 105, 36);
		btnNewButton_3.setFont(new Font("微软雅黑 Light", Font.BOLD, 20));
		contentPanel.add(btnNewButton_3);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
		}
	}
}
