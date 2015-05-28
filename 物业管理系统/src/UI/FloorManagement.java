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

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.List;

import Control.BuildingControl;
import Dao.BuildingDAO;
import Model.Building;
import Control.Building2Control;
import Dao.Building2DAO;
import Model.Building2;
public class FloorManagement extends JDialog {

	protected static BuildingDAO Building2Dao = null;
	protected static  BuildingDAO BuildingDao = null;
	protected static  Building2Control Building2Control=null;
	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			FloorManagement dialog = new FloorManagement();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public FloorManagement() {
		setBounds(100, 100, 672, 332);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("\u697C\u53F7\uFF1A\r\n");
			lblNewLabel.setBounds(30, 72, 63, 26);
			lblNewLabel.setFont(new Font("微软雅黑 Light", Font.BOLD, 20));
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("\u697C\u623F\u7BA1\u7406");
			lblNewLabel_1.setBounds(250, 10, 135, 37);
			lblNewLabel_1.setFont(new Font("微软雅黑 Light", Font.BOLD, 30));
			contentPanel.add(lblNewLabel_1);
		}
		{
			textField = new JTextField();
			textField.setBounds(103, 77, 66, 21);
			contentPanel.add(textField);
			textField.setColumns(10);
		}
		{
			JLabel label = new JLabel("\u5355\u5143\u53F7\uFF1A");
			label.setBounds(225, 72, 84, 26);
			label .setFont(new Font("微软雅黑 Light", Font.BOLD, 20));
			contentPanel.add(label);
		}
		{
			textField_1 = new JTextField();
			textField_1.setBounds(319, 77, 66, 21);
			contentPanel.add(textField_1);
			textField_1.setColumns(10);
		}
		{
			JLabel label = new JLabel("\u623F\u95F4\u53F7\uFF1A");
			label.setBounds(431, 75, 84, 21);
			label .setFont(new Font("微软雅黑 Light", Font.BOLD, 20));
			contentPanel.add(label);
		}
		{
			textField_2 = new JTextField();
			textField_2.setBounds(525, 77, 66, 21);
			contentPanel.add(textField_2);
			textField_2.setColumns(10);
		}
		{
			textField_3 = new JTextField();
			textField_3.setBounds(24, 149, 625, 37);
			contentPanel.add(textField_3);
			textField_3.setColumns(10);
		}
		
		JButton button = new JButton("\u62A5\u4FEE");
		 button .setFont(new Font("微软雅黑 Light", Font.BOLD, 30));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().trim().equals("") || textField_1.getText().trim().equals("") || textField_2.getText().trim().equals(""))
				{
					JOptionPane.showMessageDialog(null, "请输入正确信息", "警告",JOptionPane.INFORMATION_MESSAGE);
				}
				else if(textField.getText().equals("1"))
				{
					List list=BuildingControl.getControl().findByFloorNumber(textField.getText());
					if(list.size()==0)
					{
						JOptionPane.showMessageDialog(null, "无此房间", "警告",JOptionPane.INFORMATION_MESSAGE);
					}
					else{
					try{Building building= BuildingControl.getControl().findById(textField_2.getText());
					building.setRepairManagement("需要修理");
					BuildingControl.getControl().update(building);
						JOptionPane.showMessageDialog(null, "报修成功", "成功",JOptionPane.INFORMATION_MESSAGE);
						 textField_3.setText("楼号:"+building.getFloorNumber()+" "+"单元号:"+building.getUnitNumber()+" "+"房间号："+building.getRoomNumber()+" "
					        		+"业主："+building.getHoster()+" "+"业主ID:"+building.getHosterId()+" "+"业主电话："+building.getHosterPhone()+" "+"是否需要修理："+building.getRepairManagement());
					}catch(Exception e1){
						JOptionPane.showMessageDialog(null, "无此房间", "警告",JOptionPane.INFORMATION_MESSAGE);
					}
					}
					
				}
				else if(textField.getText().equals("2"))
				{
					List list=Building2Control.getControl().findByFloorNumber(textField.getText());
					if(list.size()==0)
					{
						JOptionPane.showMessageDialog(null, "无此房间", "警告",JOptionPane.INFORMATION_MESSAGE);
					}
					else{
					try{Building2 building2= Building2Control.getControl().findById(textField_2.getText());
					building2.setRepairManagement("需要修理");
					Building2Control.getControl().update(building2);
						JOptionPane.showMessageDialog(null, "报修成功", "成功",JOptionPane.INFORMATION_MESSAGE);
						 textField_3.setText("楼号:"+building2.getFloorNumber()+" "+"单元号:"+building2.getUniteNumber()+" "+"房间号："+building2.getRoomNumber()+" "
					        		+"业主："+building2.getHoster()+" "+"业主ID:"+building2.getHosterId()+" "+"业主电话："+building2.getHosterPhone()+" "+"是否需要修理："+building2.getRepairManagement());
					}catch(Exception e1){
						JOptionPane.showMessageDialog(null, "无此房间", "警告",JOptionPane.INFORMATION_MESSAGE);
					}
					}
				}
				else{
					JOptionPane.showMessageDialog(null, "无此房间", "警告",JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		button.setBounds(268, 198, 102, 37);
		contentPanel.add(button);
		{
			JButton btnNewButton = new JButton("\u8FD4\u56DE\u4E3B\u754C\u9762");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Functionchoose functionchoose=new Functionchoose();
					functionchoose.setVisible(true);
					dispose(); 
				}
			});
			btnNewButton.setBounds(67, 258, 102, 26);
			btnNewButton.setFont(new Font("微软雅黑 Light", Font.BOLD, 12));
			contentPanel.add(btnNewButton);
		}
		{
			JButton btnNewButton_1 = new JButton("\u9000\u51FA\u7CFB\u7EDF");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
			btnNewButton_1.setBounds(489, 258, 102, 26);
			btnNewButton_1.setFont(new Font("微软雅黑 Light", Font.BOLD, 12));
			contentPanel.add(btnNewButton_1);
		}
		{
			JButton btnNewButton_2 = new JButton("\u67E5\u8BE2\uFF1A");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(textField.getText().trim().equals("") || textField_1.getText().trim().equals("") || textField_2.getText().trim().equals(""))
					{
						JOptionPane.showMessageDialog(null, "请输入正确信息", "警告",JOptionPane.INFORMATION_MESSAGE);
					}
					else if(textField.getText().equals("1"))
					{
						List list=BuildingControl.getControl().findByFloorNumber(textField.getText());
						if(list.size()==0)
						{
							JOptionPane.showMessageDialog(null, "无此房间", "警告",JOptionPane.INFORMATION_MESSAGE);
						}
						else{
							try{
						Building  building= BuildingControl.getControl().findById(textField_2.getText());
				        textField_3.setText("楼号:"+building.getFloorNumber()+" "+"单元号:"+building.getUnitNumber()+" "+"房间号："+building.getRoomNumber()+" "
				        		+"业主："+building.getHoster()+" "+"业主ID:"+building.getHosterId()+" "+"业主电话："+building.getHosterPhone()+" "+"是否需要修理："+building.getRepairManagement());
							}catch(Exception e1){
								JOptionPane.showMessageDialog(null, "无此房间", "警告",JOptionPane.INFORMATION_MESSAGE);
							}
						}
					}
					
					else if(textField.getText().equals("2"))
					{
						List list=Building2Control.getControl().findByFloorNumber(textField.getText());
						if(list.size()==0)
						{
							JOptionPane.showMessageDialog(null, "无此房间", "警告",JOptionPane.INFORMATION_MESSAGE);
						}
						else{
							try{
						Building2  building2= Building2Control.getControl().findById(textField_2.getText());
				        textField_3.setText("楼号:"+building2.getFloorNumber()+" "+"单元号:"+building2.getUniteNumber()+" "+"房间号："+building2.getRoomNumber()+" "
				        		+"业主："+building2.getHoster()+" "+"业主ID:"+building2.getHosterId()+" "+"业主电话："+building2.getHosterPhone()+" "+"是否需要修理："+building2.getRepairManagement());
							}catch(Exception e1){
								JOptionPane.showMessageDialog(null, "无此房间", "警告",JOptionPane.INFORMATION_MESSAGE);
							}
						}
					}
					else{
						JOptionPane.showMessageDialog(null, "无此房间", "警告",JOptionPane.INFORMATION_MESSAGE);
					}
				}
			});
			btnNewButton_2.setBounds(24, 108, 93, 31);
			btnNewButton_2.setFont(new Font("微软雅黑 Light", Font.BOLD, 18));
			contentPanel.add(btnNewButton_2);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
		}
	}
}
