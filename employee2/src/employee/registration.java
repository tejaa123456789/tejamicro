package employee;


import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class registration {


	private JFrame frmBankaiApplication;
	private JTextField tb1;
	private JTextField tb2;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registration window = new registration();
					window.frmBankaiApplication.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	/**
	 * Create the application.
	 */
	public registration() {
		initialize();
	}


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBankaiApplication = new JFrame();
		frmBankaiApplication.setTitle("BANKAI APPLICATION");
		frmBankaiApplication.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\on line\\Downloads\\wallpaperflare.com_wallpaper (1).jpg"));
		frmBankaiApplication.getContentPane().setBackground(new Color(128, 255, 128));
		frmBankaiApplication.setBounds(100, 100, 450, 300);
		frmBankaiApplication.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBankaiApplication.getContentPane().setLayout(null);
		JLabel lblNewLabel = new JLabel("NAME");
		lblNewLabel.setBounds(43, 33, 46, 14);
		frmBankaiApplication.getContentPane().add(lblNewLabel);
		JLabel lblNewLabel_1 = new JLabel("ROLL.NO");
		lblNewLabel_1.setBounds(43, 58, 46, 14);
		frmBankaiApplication.getContentPane().add(lblNewLabel_1);
		JLabel lblNewLabel_2 = new JLabel("BRANCH");
		lblNewLabel_2.setBounds(43, 83, 46, 14);
		frmBankaiApplication.getContentPane().add(lblNewLabel_2);
		JLabel lblNewLabel_3 = new JLabel("GENDER");
		lblNewLabel_3.setBounds(43, 108, 46, 14);
		frmBankaiApplication.getContentPane().add(lblNewLabel_3);
		JLabel lblNewLabel_4 = new JLabel("PROGRAMS");
		lblNewLabel_4.setBounds(43, 136, 66, 14);
		frmBankaiApplication.getContentPane().add(lblNewLabel_4);
		tb1 = new JTextField();
		tb1.setBounds(123, 30, 86, 20);
		frmBankaiApplication.getContentPane().add(tb1);
		tb1.setColumns(10);
		tb2 = new JTextField();
		tb2.setBounds(123, 55, 86, 20);
		frmBankaiApplication.getContentPane().add(tb2);
		tb2.setColumns(10);
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "AIML", "DS", "CS"}));
		cb1.setBounds(123, 79, 73, 22);
		frmBankaiApplication.getContentPane().add(cb1);
		JRadioButton r1 = new JRadioButton("MALE");
		r1.setBackground(new Color(128, 255, 128));
		r1.setBounds(123, 104, 59, 23);
		frmBankaiApplication.getContentPane().add(r1);
		JRadioButton r2 = new JRadioButton("FEMALE");
		r2.setBackground(new Color(128, 255, 128));
		r2.setBounds(182, 104, 109, 23);
		frmBankaiApplication.getContentPane().add(r2);
		JCheckBox c1 = new JCheckBox("C");
		c1.setBackground(new Color(128, 255, 128));
		c1.setBounds(123, 132, 46, 23);
		frmBankaiApplication.getContentPane().add(c1);
		JCheckBox c2 = new JCheckBox("PYTHON");
		c2.setBackground(new Color(128, 255, 128));
		c2.setBounds(173, 132, 79, 23);
		frmBankaiApplication.getContentPane().add(c2);
		JCheckBox c3 = new JCheckBox("JAVA");
		c3.setBackground(new Color(128, 255, 128));
		c3.setBounds(254, 132, 97, 23);
		frmBankaiApplication.getContentPane().add(c3);
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		JButton btnNewButton = new JButton("SUMBIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb1.getText();
				String roll=tb2.getText();
				String branch=(String) cb1.getSelectedItem();
				String gender=" ";
				if(r1.isSelected())
				{
					gender="male";
				}
				else
				{
					gender="female";
				}
				JOptionPane.showMessageDialog(btnNewButton, "NAME "+name+"\n ROLL "+roll+"\n BRANCH "+branch+"\n GENDER "+gender );
			}
		});
		btnNewButton.setBackground(new Color(255, 0, 128));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBounds(160, 170, 92, 23);
		frmBankaiApplication.getContentPane().add(btnNewButton);
	}
}

