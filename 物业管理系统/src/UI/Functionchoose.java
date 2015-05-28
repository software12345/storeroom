package UI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Functionchoose extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Functionchoose dialog = new Functionchoose();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Functionchoose() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("\u8BF7\u9009\u62E9\u4EE5\u4E0B\u529F\u80FD");
			lblNewLabel.setBounds(126, 10, 188, 41);
			lblNewLabel.setFont(new Font("Î¢ÈíÑÅºÚ Light", Font.BOLD, 25));
			contentPanel.add(lblNewLabel);
		}
		{
			JButton btnNewButton = new JButton("\u697C\u623F\u7BA1\u7406");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					FloorManagement floormanagement = new FloorManagement();
					floormanagement.setVisible(true);
					dispose(); 
				}
			});
			btnNewButton.setBounds(149, 72, 125, 32);
			btnNewButton.setFont(new Font("Î¢ÈíÑÅºÚ Light", Font.BOLD, 18));
			contentPanel.add(btnNewButton);
		}
		{
			JButton btnNewButton_1 = new JButton("\u4E1A\u4E3B\u7BA1\u7406");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					HosterManagement hostermanagement = new HosterManagement();
					hostermanagement.setVisible(true);
					dispose(); 
				}
			});
			btnNewButton_1.setBounds(149, 135, 125, 32);
			contentPanel.add(btnNewButton_1);
			btnNewButton_1.setFont(new Font("Î¢ÈíÑÅºÚ Light", Font.BOLD, 18));
		}
		{
			JButton btnNewButton_2 = new JButton("\u9000\u51FA\u7CFB\u7EDF\r\n");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
			btnNewButton_2.setBounds(150, 202, 124, 32);
			btnNewButton_2.setFont(new Font("Î¢ÈíÑÅºÚ Light", Font.BOLD, 18));
			contentPanel.add(btnNewButton_2);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
		}
	}

}
