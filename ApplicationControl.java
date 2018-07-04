import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.BevelBorder;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;

public class ApplicationControl {

	private JFrame frame;
	
	private JLabel lblIntro;
	private JPanel panelServerControl;
	private JLabel lblServerControls;
	private JLabel lblUserIntefaceControl;
	private JLabel lblServerCommand;
	private JLabel lblInternetAddress;
	private JComboBox comboBoxYN;
	private JButton btnX;
	private JTextField textFieldServerCommand;
	private JTextField textFieldInternetAddress;
	private JButton btnNewButton;
	private JButton btnConnect;
	private JLabel lblPort;
	private JTextField textFieldPort;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ApplicationControl window = new ApplicationControl();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ApplicationControl() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("NarSysTech Java Server");
		frame.getContentPane().setBackground(new Color(176, 196, 222));
		frame.setBounds(100, 100, 715, 760);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		/*
		 * ruler/reference for help
		 */
		btnX = new JButton("100 x 100");
		btnX.setBounds(553, 589, 100, 100);
		frame.getContentPane().add(btnX);
		
		
		/*
		 * creates the top of window text introduction
		 */
		lblIntro = new JLabel("<html>This graphical user interface is used to demonstrate the NarSysTech Python API. The controls read and write to a running version of the NarSysTech Software interogating and interacting with the currently open project. A project must be constructed, open and the python server started before the controls can be built and tested.<html>");
		lblIntro.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblIntro.setBounds(57, 5, 600, 115);
		frame.getContentPane().add(lblIntro);
		
		/*
		 * ServerControl region containing UI Control, ServerCommand, and Internet Address
		 */
		panelServerControl = new JPanel();
		panelServerControl.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelServerControl.setBackground(new Color(255, 235, 245));
		panelServerControl.setBounds(5, 135, 690, 145);
		frame.getContentPane().add(panelServerControl);
		panelServerControl.setLayout(null);
		
		lblServerControls = new JLabel("Server Controls");
		lblServerControls.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblServerControls.setBounds(10, 11, 204, 21);
		panelServerControl.add(lblServerControls);
		
		/*
		 * UI Control in Server Control
		 */
		lblUserIntefaceControl = new JLabel("User Inteface Control:");
		lblUserIntefaceControl.setBounds(15, 40, 135, 15);
		panelServerControl.add(lblUserIntefaceControl);
		
		String[] serverYN = {"Yes","No"};
		comboBoxYN = new JComboBox(serverYN);
		comboBoxYN.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		comboBoxYN.setBackground(new Color(255, 235, 245));
		//comboBox_YN.setSelectedIndex(0);
		comboBoxYN.setToolTipText("<html>Commands issued through the<br/>client API can control the<br/>graphics view on the client. This<br/>is a good way to troubleshoot<br/>possible issues while writing a<br/>client application. Select Yes to<br/>control the graphics.<html>");
		comboBoxYN.setBounds(140, 35, 60, 25);
		panelServerControl.add(comboBoxYN);
		
		/*
		 * Server Command in Server Control
		 */
		lblServerCommand = new JLabel("Server Command:");
		lblServerCommand.setBounds(36, 75, 110, 15);
		panelServerControl.add(lblServerCommand);
		
		textFieldServerCommand = new JTextField();
		textFieldServerCommand.setText("C:/Program Files/NarSysTech/ActiveModel/ActiveModel.exe");
		textFieldServerCommand.setBounds(140, 73, 450, 20);
		panelServerControl.add(textFieldServerCommand);
		textFieldServerCommand.setColumns(10);
		
		btnNewButton = new JButton("Launch");
		btnNewButton.setBackground(new Color(255, 235, 245));
		btnNewButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton.setBounds(600, 71, 76, 24);
		panelServerControl.add(btnNewButton);
		
		/*
		 * Internet Address in Server Control
		 */
		lblInternetAddress = new JLabel("Internet Address:");
		lblInternetAddress.setBounds(40, 110, 110, 15);
		panelServerControl.add(lblInternetAddress);
		
		textFieldInternetAddress = new JTextField();
		textFieldInternetAddress.setText("127.0.0.1");
		textFieldInternetAddress.setColumns(10);
		textFieldInternetAddress.setBounds(140, 107, 225, 20);
		panelServerControl.add(textFieldInternetAddress);
		
		btnConnect = new JButton("Connect");
		btnConnect.setBackground(new Color(255, 235, 245));
		btnConnect.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnConnect.setBounds(600, 106, 76, 24);
		panelServerControl.add(btnConnect);
		
		/*
		 * Port in Server Control
		 */
		lblPort = new JLabel("Port:");
		lblPort.setBounds(375, 110, 46, 14);
		panelServerControl.add(lblPort);
		
		textFieldPort = new JTextField();
		textFieldPort.setText("25322");
		textFieldPort.setBounds(405, 107, 185, 20);
		panelServerControl.add(textFieldPort);
		textFieldPort.setColumns(10);
		
	}
}

/*
 * make window scroll-able
 */
//	private JPanel content = new JPanel();//this is the panel that will be scrolled
//private JScrollPane pane;

//JPanel content = new JPanel();//this is the panel that will be scrolled
//JScrollPane pane = new JScrollPane(content);
//frame.getContentPane().add(pane);



//This graphical user interface is used to demonstrate the NarSysTech Python API. The controls read and write to a running version of the NarSysTech Software interrogating and interacting with the currently open project. A project must be constructed, open and the python server started before the controls can be built and tested.

