import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

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
		mainframe.getContentPane().setBackground(new Color(176, 196, 222));
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
		panel1.setBackground(new Color(255,245,238)); 
		GridBagConstraints gbc_panel1 = new GridBagConstraints();
		// below comments are reference to useful programming statements
		//gbc_lblNewLabel.insets = new Insets(10, 10, 0, 10);
		//gbc_lblNewLabel.anchor=GridBagConstraints.FIRST_LINE_START;
		//gbc_lblNewLabel.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel.gridx = GridBagConstraints.RELATIVE;
		gbc_lblNewLabel.gridy = GridBagConstraints.RELATIVE;
		gbc_lblNewLabel.weightx=0.5;
		gbc_lblNewLabel.weighty=0.5;
		gbc_lblNewLabel.gridheight=4;
		gbc_lblNewLabel.gridwidth=5;
		//gbc_lblNewLabel.fill=GridBagConstraints.HORIZONTAL;
		
		mainframe.getContentPane().add(panel1,gbc_lblNewLabel);
		// Server Controls label
		JLabel server_Controls= new JLabel("Server Controls");
		gbc_panel1.gridx = 0;
		gbc_panel1.gridy = 0;
		gbc_panel1.gridheight=1;
		gbc_panel1.gridwidth=1;
		gbc_panel1.weightx=0.5;
		gbc_panel1.weighty=0.5;
		server_Controls.setFont(new Font("Times New Roman", Font.BOLD, 18));
		gbc_panel1.anchor=GridBagConstraints.WEST;
		gbc_panel1.insets = new Insets(20, 10, 0, 0);
		panel1.add(server_Controls, gbc_panel1);
		//User Interface Control: label
		JLabel user_Interface_Control= new JLabel("User Interface Control: ");
		user_Interface_Control.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		gbc_panel1.gridx = 0;
		gbc_panel1.gridy = 1;
		gbc_panel1.gridheight=1;
		gbc_panel1.gridwidth=1;
		gbc_panel1.weightx=0.5;
		gbc_panel1.weighty=0.5;
		//gbc_panel1.anchor=GridBagConstraints.WEST;
		gbc_panel1.insets = new Insets(20, 30, 20, 0);
		panel1.add(user_Interface_Control, gbc_panel1);
		// Server Command: Label
		JLabel server_Command= new JLabel("Server Command: ");
		server_Command.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		gbc_panel1.gridx=0;
		gbc_panel1.gridy=2;
		gbc_panel1.gridheight=1;
		gbc_panel1.gridwidth=1;
		gbc_panel1.weightx=0.5;
		gbc_panel1.weighty=0.5;
		gbc_panel1.insets = new Insets(0, 58, 20, 0);
		//gbc_panel1.anchor=GridBagConstraints.WEST;
		panel1.add(server_Command, gbc_panel1);
		// Internet Address: label
		JLabel internet_Address= new JLabel("Internet Address: ");
		internet_Address.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		gbc_panel1.gridx=0;
		gbc_panel1.insets = new Insets(0, 63, 20, 0);
		gbc_panel1.gridy=3;
		gbc_panel1.gridheight=1;
		gbc_panel1.gridwidth=1;
		gbc_panel1.weightx=0.5;
		gbc_panel1.weighty=0.5;
		//gbc_panel1.anchor=GridBagConstraints.LINE_START;
		//gbc_panel1.insets= new Insets(0,15,0,0);
		panel1.add(internet_Address, gbc_panel1);
		// yes no button
		JComboBox comboBoxYN;
		String[] serverYN = {"Yes","No"};
		comboBoxYN = new JComboBox(serverYN);
		//comboBoxYN.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		comboBoxYN.setBackground(new Color(255, 213, 227));
		comboBoxYN.setToolTipText("<html>Commands issued through the<br/>client API can control the<br/>graphics view on the client. This<br/>is a good way to troubleshoot<br/>possible issues while writing a<br/>client application. Select Yes to<br/>control the graphics.<html>");
		gbc_panel1.gridx=0;
		gbc_panel1.insets= new Insets(0,180,0,0);
		gbc_panel1.gridy=1;
		gbc_panel1.anchor=GridBagConstraints.LINE_START;
		comboBoxYN.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		comboBoxYN.setBackground(new Color(255,245,238));
		//gbc_panel1.fill=GridBagConstraints.WEST;
		//gbc_panel1.gridwidth=1;
		//comboBoxYN.setBounds(145, 35, 60, 25);
		gbc_panel1.weightx=.5;
		gbc_panel1.weighty=.5;
		//gbc_panel1.anchor=GridBagConstraints.CENTER;
		
		panel1.add(comboBoxYN,gbc_panel1);
		// server command textfield
		JTextField textFieldServerCommand = new JTextField();
		gbc_panel1.gridx=0;
		gbc_panel1.insets= new Insets(0,180,20,0);
		gbc_panel1.gridy=2;
		gbc_panel1.weightx=0.5;
		gbc_panel1.weighty=.5;
		//gbc_panel1.fill=GridBagConstraints.HORIZONTAL;
		textFieldServerCommand.setToolTipText("<html>Input a command that will be<br/>executed from a DOS command<br/>line. Servers can be launched this<br/>way. Make sure sure each<br/>instance has a different port<br/>number to make sure your client<br/>application is connected to the<br/>correct project.<html>");
		textFieldServerCommand.setText("C:/Program Files/NarSysTech/ActiveModel/ActiveModel.exe");
		//textFieldServerCommand.setBounds(145, 73, 445, 20);
	    //gbc_panel1.fill=GridBagConstraints.RELATIVE;
		panel1.add(textFieldServerCommand,gbc_panel1);
		//Launch Button
		JButton launch = new JButton("Launch");
		launch.setToolTipText("<html>Open a command prompt and<br/>execute the supplied command.<html>");
		gbc_panel1.gridx=0;
		gbc_panel1.insets= new Insets(0,510,20,0);
		launch.setBackground(new Color(255,245,238));
		launch.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		gbc_panel1.gridy=2;
		gbc_panel1.weightx=0.5;
		gbc_panel1.weighty=.5;
		panel1.add(launch, gbc_panel1);
		// Internet Address Textfield
		JTextField textFieldInternetAddress = new JTextField();
		textFieldInternetAddress.setToolTipText("<html>Enter the LAN address where the<br/>servers are running.<html>");
		textFieldInternetAddress.setText("127.0.0.1");
		gbc_panel1.gridx=0;
		gbc_panel1.insets= new Insets(0,170,20,0);
		gbc_panel1.gridy=3;
		gbc_panel1.weightx=0.5;
		gbc_panel1.weighty=.5;
		panel1.add(textFieldInternetAddress, gbc_panel1);
		//Port label
		JLabel port= new JLabel("Port: ");
		gbc_panel1.gridx=0;
		gbc_panel1.insets= new Insets(0,240,20,0);
		gbc_panel1.gridy=3;
		gbc_panel1.weightx=0.5;
		gbc_panel1.weighty=.5;
		port.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		panel1.add(port, gbc_panel1);
		// Port textfield
		JTextField textFieldPort = new JTextField();
		textFieldPort.setToolTipText("<html>Enter the port number for the<br/>server instance that you wish to<br/>connect to.<html>");
		textFieldPort.setText("25322");
		gbc_panel1.gridx=0;
		gbc_panel1.insets= new Insets(0,270,20,0);
		gbc_panel1.gridy=3;
		gbc_panel1.weightx=0.5;
		gbc_panel1.weighty=.5;
		panel1.add(textFieldPort, gbc_panel1);
		// connect button
		JButton connect= new JButton("Connect");
		connect.setToolTipText("<html>Establish a connection to the<br/>server running on the supplied IP<br/>address, with the supplied port<br/>number. The server must already<br/>be running and setup to connect<br/>on the same port number.<br/>Multiple servers can be<br/>connected to but they must each<br/>have a unique port number.<html>");
		connect.setBackground(new Color(255,245,238));
		connect.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		gbc_panel1.gridx=0;
		gbc_panel1.insets= new Insets(0,320,20,0);
		gbc_panel1.gridy=3;
		gbc_panel1.weightx=0.5;
		gbc_panel1.weighty=.5;
		panel1.add(connect, gbc_panel1);
		
		
		
		
		
		
		
		//second panel
		
		//third panel
		
		
		
		
	}

}
