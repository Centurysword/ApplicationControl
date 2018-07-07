import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JavaApplicationControl {

	private JFrame mainframe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaApplicationControl window = new JavaApplicationControl();
					window.mainframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JavaApplicationControl() {
		initialize();
	}

	// Creates Window
	private void initialize() {
		mainframe = new JFrame();
		mainframe.getContentPane().setBackground(new Color(175, 238, 238));
		mainframe.setTitle("NarSysTech Java Server");
		mainframe.setBounds(100, 100, 715, 760);
		mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 591};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 1.0, Double.MIN_VALUE};
		mainframe.getContentPane().setLayout(gridBagLayout);
		
		// top description
		JLabel lblNewLabel = new JLabel("<html>This graphical user interface is used to demonstrate the NarSysTech Python API. The controls read and write to a running version of the NarSysTech Software interogating and interacting with the currently open project. A project must be constructed, open and the python server started before the controls can be built and tested.<html>");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor=GridBagConstraints.PAGE_START;
		gbc_lblNewLabel.anchor=GridBagConstraints.FIRST_LINE_START;
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 0;
		gbc_lblNewLabel.gridwidth=GridBagConstraints.REMAINDER;
		gbc_lblNewLabel.fill=GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel.gridheight=1;
		gbc_lblNewLabel.insets = new Insets(10, 10, 0, 10);
		gbc_lblNewLabel.weightx=0.5;
		gbc_lblNewLabel.weighty=0.5;
		mainframe.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		//first panel
		JPanel panel1 = new JPanel(new GridBagLayout());
		GridBagConstraints gbc_panel1 = new GridBagConstraints();
		// below comments are reference to useful programming statements
		gbc_panel1.insets = new Insets(10, 10, 0, 10);
		gbc_panel1.anchor=GridBagConstraints.FIRST_LINE_START;
		gbc_panel1.fill = GridBagConstraints.BOTH;
		gbc_panel1.gridx = GridBagConstraints.RELATIVE;
		gbc_panel1.gridy = GridBagConstraints.RELATIVE;
		gbc_panel1.gridheight=4;
		gbc_panel1.gridwidth=5;
		gbc_panel1.fill=GridBagConstraints.HORIZONTAL;
		
		mainframe.getContentPane().add(panel1,gbc_panel1);
		// Server Controls label
		JLabel server_Controls= new JLabel("Server Controls");
		gbc_panel1.gridx = 0;
		gbc_panel1.gridy = 0;
		gbc_panel1.gridheight=1;
		gbc_panel1.gridwidth=1;
		server_Controls.setFont(new Font("Times New Roman", Font.BOLD, 13));
		//gbc_panel1.anchor=GridBagConstraints.WEST;
		gbc_panel1.insets = new Insets(20, 10, 0, 10);
		panel1.add(server_Controls, gbc_panel1);
		//User Interface Control: label
		JLabel user_Interface_Control= new JLabel("User Interface Control :");
		user_Interface_Control.setFont(new Font("Times New Roman", Font.BOLD, 13));
		gbc_panel1.gridx = 0;
		gbc_panel1.gridy = 1;
		gbc_panel1.gridheight=1;
		gbc_panel1.gridwidth=1;
		//gbc_panel1.anchor=GridBagConstraints.WEST;
		gbc_panel1.insets = new Insets(20, 60, 0, 10);
		panel1.add(user_Interface_Control, gbc_panel1);
		// Server Command: Label
		JLabel server_Command= new JLabel("Server Command: ");
		server_Command.setFont(new Font("Times New Roman", Font.BOLD, 13));
		gbc_panel1.gridx=0;
		gbc_panel1.gridy=2;
		gbc_panel1.gridheight=1;
		gbc_panel1.gridwidth=1;
		//gbc_panel1.anchor=GridBagConstraints.WEST;
		panel1.add(server_Command, gbc_panel1);
		// Internet Address: label
		JLabel internet_Address= new JLabel("Internet Address: ");
		internet_Address.setFont(new Font("Times New Roman", Font.BOLD, 13));
		gbc_panel1.gridx=0;
		gbc_panel1.gridy=3;
		gbc_panel1.gridheight=1;
		gbc_panel1.gridwidth=1;
		//gbc_panel1.anchor=GridBagConstraints.WEST;
		//gbc_panel1.insets= new Insets(0,15,0,0);
		panel1.add(internet_Address, gbc_panel1);
		//fourth label
		JLabel space= new JLabel("");
		space.setFont(new Font("Times New Roman", Font.BOLD, 13));
		//gbc_panel1.anchor=GridBagConstraints.WEST;
		gbc_panel1.gridx=1;
		gbc_panel1.gridy=5;
		gbc_panel1.gridheight=1;
		gbc_panel1.gridwidth=1;
		panel1.add(space, gbc_panel1);
		
		
		
		//second panel
		
		//third panel
		
		
		
		
	}

}
