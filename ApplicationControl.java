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
import javax.swing.border.LineBorder;

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
	private JPanel panelControls;
	private JLabel lblControls;
	private JPanel panelInfrastructure;
	private JPanel panelConstructProject;
	private JPanel panelDefineProduction;
	private JPanel panelDefineReservoir;
	private JPanel panelForecasts;
	private JLabel lblDefineProduction;
	private JButton btnProduction;
	private JLabel lblInfrastructure;
	private JLabel lblConstructProject;
	private JLabel lblDefineReservoir;
	private JLabel lblForecasts;
	private JButton btnLogMessages;
	private JButton btnProjects;
	private JButton btnData;
	private JButton btnReservoir;
	private JButton btnPermeability;
	private JButton btnPPM;
	private JButton btnForecasts;
	private JPanel panelStatus;
	private JLabel lblStatus;
	private JLabel lblProject;
	private JLabel lblVolume;
	private JLabel lblProjectValue;
	private JLabel lblVolumeValue;
	
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
		frame.setBounds(100, 100, 717, 730);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		/*
		 * ruler/reference for help
		 */
		/*
		btnX = new JButton("100 x 100");
		btnX.setBounds(553, 589, 100, 100);
		frame.getContentPane().add(btnX);
		*/
		
		
		/*
		 * creates the top of window text introduction
		 */
		lblIntro = new JLabel("<html>This graphical user interface is used to demonstrate the NarSysTech Python API. The controls read and write to a running version of the NarSysTech Software interogating and interacting with the currently open project. A project must be constructed, open and the python server started before the controls can be built and tested.<html>");
		lblIntro.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblIntro.setBounds(57, 5, 600, 115);
		frame.getContentPane().add(lblIntro);
		
		
		/*-------------------------------------------------------------------------------------------------------------------------------
		 * ServerControl region containing UI Control, ServerCommand, and Internet Address
		 -------------------------------------------------------------------------------------------------------------------------------*/
		panelServerControl = new JPanel();
		panelServerControl.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelServerControl.setBackground(new Color(255, 235, 245));
		panelServerControl.setBounds(5, 135, 690, 145);
		frame.getContentPane().add(panelServerControl);
		panelServerControl.setLayout(null);
		
		lblServerControls = new JLabel("Server Controls");
		lblServerControls.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblServerControls.setBounds(10, 8, 204, 20);
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
		comboBoxYN.setBackground(new Color(255, 213, 227));
		//comboBox_YN.setSelectedIndex(0);
		comboBoxYN.setToolTipText("<html>Commands issued through the<br/>client API can control the<br/>graphics view on the client. This<br/>is a good way to troubleshoot<br/>possible issues while writing a<br/>client application. Select Yes to<br/>control the graphics.<html>");
		comboBoxYN.setBounds(145, 35, 60, 25);
		panelServerControl.add(comboBoxYN);
		
		/*
		 * Server Command in Server Control
		 */
		lblServerCommand = new JLabel("Server Command:");
		lblServerCommand.setBounds(36, 75, 110, 15);
		panelServerControl.add(lblServerCommand);
		
		textFieldServerCommand = new JTextField();
		textFieldServerCommand.setToolTipText("<html>Input a command that will be<br/>executed from a DOS command<br/>line. Servers can be launched this<br/>way. Make sure sure each<br/>instance has a different port<br/>number to make sure your client<br/>application is connected to the<br/>correct project.<html>");
		textFieldServerCommand.setText("C:/Program Files/NarSysTech/ActiveModel/ActiveModel.exe");
		textFieldServerCommand.setBounds(145, 73, 445, 20);
		panelServerControl.add(textFieldServerCommand);
		textFieldServerCommand.setColumns(10);
		
		btnNewButton = new JButton("Launch");
		btnNewButton.setToolTipText("<html>Open a command prompt and<br/>execute the supplied command.<html>");
		btnNewButton.setBackground(new Color(255, 213, 227));
		btnNewButton.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnNewButton.setBounds(600, 71, 76, 24);
		panelServerControl.add(btnNewButton);
		
		/*
		 * Internet Address & Port in Server Control
		 */
		lblInternetAddress = new JLabel("Internet Address:");
		lblInternetAddress.setBounds(40, 110, 110, 15);
		panelServerControl.add(lblInternetAddress);
		
		textFieldInternetAddress = new JTextField();
		textFieldInternetAddress.setToolTipText("<html>Enter the LAN address where the<br/>servers are running.<html>");
		textFieldInternetAddress.setText("127.0.0.1");
		textFieldInternetAddress.setColumns(10);
		textFieldInternetAddress.setBounds(145, 107, 220, 20);
		panelServerControl.add(textFieldInternetAddress);
		
		lblPort = new JLabel("Port:");
		lblPort.setBounds(373, 110, 46, 14);
		panelServerControl.add(lblPort);
		
		textFieldPort = new JTextField();
		textFieldPort.setToolTipText("<html>Enter the port number for the<br/>server instance that you wish to<br/>connect to.<html>");
		textFieldPort.setText("25322");
		textFieldPort.setBounds(407, 107, 183, 20);
		panelServerControl.add(textFieldPort);
		textFieldPort.setColumns(10);
		
		btnConnect = new JButton("Connect");
		btnConnect.setToolTipText("<html>Establish a connection to the<br/>server running on the supplied IP<br/>address, with the supplied port<br/>number. The server must already<br/>be running and setup to connect<br/>on the same port number.<br/>Multiple servers can be<br/>connected to but they must each<br/>have a unique port number.<html>");
		btnConnect.setBackground(new Color(255, 213, 227));
		btnConnect.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnConnect.setBounds(600, 106, 76, 24);
		panelServerControl.add(btnConnect);
		
		
		/*-------------------------------------------------------------------------------------------------------------------------------
		 * Controls region for Infra, Contruct Project, Production, Reservoir, Forecasts
		 -------------------------------------------------------------------------------------------------------------------------------*/
		panelControls = new JPanel();
		panelControls.setBackground(new Color(230, 255, 230));
		panelControls.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelControls.setBounds(5, 291, 690, 220);
		frame.getContentPane().add(panelControls);
		panelControls.setLayout(null);
		
		lblControls = new JLabel("Controls");
		lblControls.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblControls.setBounds(10, 8, 82, 20);
		panelControls.add(lblControls);
		
		/*
		 * Infrastructure in Controls
		 */
		panelInfrastructure = new JPanel();
		panelInfrastructure.setBackground(new Color(240, 255, 240));
		panelInfrastructure.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelInfrastructure.setBounds(7, 39, 678, 31);
		panelControls.add(panelInfrastructure);
		panelInfrastructure.setLayout(null);
		
		lblInfrastructure = new JLabel("Infrastructure:");
		lblInfrastructure.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblInfrastructure.setBounds(31, 8, 90, 14);
		panelInfrastructure.add(lblInfrastructure);
		
		btnLogMessages = new JButton("Log Messages");
		btnLogMessages.setToolTipText("<html>Access all server logs and test. It<br/>is important to note that the<br/>server and client-side should use<br/>the same logging system to allow<br/>efficient troubleshooting.<html>");
		btnLogMessages.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnLogMessages.setBackground(new Color(180, 255, 255));
		btnLogMessages.setBounds(130, 4, 110, 23);
		panelInfrastructure.add(btnLogMessages);
		
		/*
		 * Construct Project in Controls
		 */
		panelConstructProject = new JPanel();
		panelConstructProject.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelConstructProject.setBackground(new Color(240, 255, 240));
		panelConstructProject.setBounds(7, 74, 678, 31);
		panelControls.add(panelConstructProject);
		panelConstructProject.setLayout(null);
		
		lblConstructProject = new JLabel("Construct Project:");
		lblConstructProject.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblConstructProject.setBounds(9, 8, 112, 14);
		panelConstructProject.add(lblConstructProject);
		
		btnProjects = new JButton("Projects");
		btnProjects.setToolTipText("<html>Define new projects, edit existing<br/>projects and control which<br/>projects are opena and therefore<br/>accessible. When a connection to<br/>a server is initially made, the<br/>project is automatically set to<br/>whatever project is currently<br/>open on the server side.<html>");
		btnProjects.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnProjects.setBackground(new Color(255, 235, 245));
		btnProjects.setBounds(130, 4, 110, 23);
		panelConstructProject.add(btnProjects);
		
		btnData = new JButton("Data");
		btnData.setToolTipText("<html>Load, review and edit all the<br/>various data types needed to<br/>build and update a Production<br/>Potential Model.<html>");
		btnData.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnData.setBackground(new Color(255, 213, 227));
		btnData.setBounds(250, 4, 110, 23);
		panelConstructProject.add(btnData);
		
		/*
		 * Define Production in Controls
		 */
		panelDefineProduction = new JPanel();
		panelDefineProduction.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelDefineProduction.setBackground(new Color(240, 255, 240));
		panelDefineProduction.setBounds(7, 109, 678, 31);
		panelControls.add(panelDefineProduction);
		panelDefineProduction.setLayout(null);
		
		lblDefineProduction = new JLabel("Define Production:");
		lblDefineProduction.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblDefineProduction.setBounds(5, 8, 117, 14);
		panelDefineProduction.add(lblDefineProduction);
		
		btnProduction = new JButton("Production");
		btnProduction.setToolTipText("<html>Load, review, edit and delete<br/>production related information<br/>that is used to compute drainage<br/>and assign production to each<br/>well.<html>");
		btnProduction.setBackground(new Color(152, 251, 152));
		btnProduction.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnProduction.setBounds(130, 4, 110, 23);
		panelDefineProduction.add(btnProduction);
		
		/*
		 * Define Reservoir in Controls
		 */
		panelDefineReservoir = new JPanel();
		panelDefineReservoir.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelDefineReservoir.setBackground(new Color(240, 255, 240));
		panelDefineReservoir.setBounds(7, 144, 678, 31);
		panelControls.add(panelDefineReservoir);
		panelDefineReservoir.setLayout(null);
		
		lblDefineReservoir = new JLabel("Define Reservoir:");
		lblDefineReservoir.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblDefineReservoir.setBounds(11, 8, 112, 14);
		panelDefineReservoir.add(lblDefineReservoir);
		
		btnReservoir = new JButton("Reservoir");
		btnReservoir.setToolTipText("<html>Define the bounds of the<br/>reservoir.<html>");
		btnReservoir.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnReservoir.setBackground(new Color(255, 218, 185));
		btnReservoir.setBounds(130, 4, 110, 23);
		panelDefineReservoir.add(btnReservoir);
		
		btnPermeability = new JButton("Permeability");
		btnPermeability.setToolTipText("<html>Define how permeabilities are<br/>distributed within the reservoir<br/>and how the native<br/>permeabilities are impacted by<br/>wells and stimulations and<br/>associated data sets like DFN's<html>");
		btnPermeability.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnPermeability.setBackground(new Color(255, 246, 143));
		btnPermeability.setBounds(250, 4, 110, 23);
		panelDefineReservoir.add(btnPermeability);
		
		/*
		 * Forecasts in Controls
		 */
		panelForecasts = new JPanel();
		panelForecasts.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelForecasts.setBackground(new Color(240, 255, 240));
		panelForecasts.setBounds(7, 179, 678, 31);
		panelControls.add(panelForecasts);
		panelForecasts.setLayout(null);
		
		lblForecasts = new JLabel("Forecasts:");
		lblForecasts.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblForecasts.setBounds(55, 8, 67, 14);
		panelForecasts.add(lblForecasts);
		
		btnPPM = new JButton("PPM");
		btnPPM.setToolTipText("<html>Define how properties and<br/>compute the production<br/>potential model.<html>");
		btnPPM.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnPPM.setBackground(new Color(216, 191, 216));
		btnPPM.setBounds(130, 4, 110, 23);
		panelForecasts.add(btnPPM);
		
		btnForecasts = new JButton("Forecasts");
		btnForecasts.setToolTipText("<html>Read slices of data from data<br/>volumes contained in a project<br/>and review in 2D window. This<br/>will include the PPM volumes<br/>which can also be accessed vai<br/>the PPM Controls.<html>");
		btnForecasts.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		btnForecasts.setBackground(new Color(230,230,250));
		btnForecasts.setBounds(250, 4, 110, 23);
		panelForecasts.add(btnForecasts);
		
		
		/*-------------------------------------------------------------------------------------------------------------------------------
		 * Status region for Project and Volume
		 -------------------------------------------------------------------------------------------------------------------------------*/
		panelStatus = new JPanel();
		panelStatus.setBounds(5, 522, 690, 115);
		frame.getContentPane().add(panelStatus);
		panelStatus.setLayout(null);
		
		lblStatus = new JLabel("Status");
		lblStatus.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblStatus.setBounds(10, 8, 59, 20);
		panelStatus.add(lblStatus);
		
		/*
		 * Project in Status
		 */
		lblProject = new JLabel("Project:");
		lblProject.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblProject.setBounds(24, 38, 65, 20);
		panelStatus.add(lblProject);
		
		lblProjectValue = new JLabel("<None>");
		lblProjectValue.setBounds(99, 42, 46, 14);
		panelStatus.add(lblProjectValue);
		
		/*
		 * Volume in Status
		 */
		lblVolume = new JLabel("Volume:");
		lblVolume.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblVolume.setBounds(21, 69, 69, 20);
		panelStatus.add(lblVolume);
		
		lblVolumeValue = new JLabel("<None>");
		lblVolumeValue.setBounds(99, 73, 46, 14);
		panelStatus.add(lblVolumeValue);
		
		
		
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

