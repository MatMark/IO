import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Aplikacja extends JFrame implements ActionListener, KeyListener, MouseListener {

private static final long serialVersionUID = 1L;
	
	private boolean Logged_in = false;
	protected Baza baza = new Baza();
	
	private JPanel logPanel = new JPanel();
	private JPanel userPanel = new JPanel();
	private JPanel newAccountPanel = new JPanel();
	
	private BufferedImage png = ImageIO.read(new File("D:\\In¿\\Semestr V\\IO\\logo.png"));
	private JLabel logo = new JLabel(new ImageIcon(png));
	private JLabel logo2 = new JLabel(new ImageIcon(png));
	private JLabel logo3 = new JLabel(new ImageIcon(png));
	
	private JMenuBar menuBar = new JMenuBar();
	private JMenu menuFile = new JMenu("User");
	private JMenu menuHelp = new JMenu("Help");
	private JMenuItem menuExit = new JMenuItem("Exit", KeyEvent.VK_E);
	private JMenuItem menuLogOut = new JMenuItem("Logout", KeyEvent.VK_L);
	private JMenuItem menuNewAccount  = new JMenuItem("New account", KeyEvent.VK_N);
	private JMenuItem menuAuthor = new JMenuItem("Author", KeyEvent.VK_A);
	
	// logpanel
	private JLabel loginLabel =    new JLabel("              Login:              ");
	private JLabel passLabel =    new JLabel("              Has³o:              ");
	private JLabel errorLabel = new JLabel("            B³¹d logowania            ");
	
	private JTextField loginField = new JTextField("login", 16);
	private JPasswordField passField    = new JPasswordField("******", 16);
	
	private JButton loginButton    = new JButton("Zaloguj");
	// end logpanel
	
	// userpanel
	
	private JMenu menuAccount = new JMenu("Account");
	private JMenuItem menuAccInfo = new JMenuItem("About", KeyEvent.VK_A);
	private JMenuItem menuRemoveAccount  = new JMenuItem("Delete account", KeyEvent.VK_D);
	
	private JLabel userName = new JLabel("     userName     ");
	private JLabel userSurname = new JLabel("     userSurname     ");
	private JLabel userAccBalance = new JLabel("Stan konta: ");
	
	private JButton transferButton    = new JButton("Przelew");
	
	private KontoKlienta activeUser = null;
	// end userpanel
	
	
	// newaccountpanel
	
	private JLabel newName = new JLabel("                Imiê:                ");
	private JLabel newSurname = new JLabel("Nazwisko: ");
	private JLabel newLogin = new JLabel("Login: ");
	private JLabel newPass1 = new JLabel("Has³o: ");
	private JLabel newPass2 = new JLabel("Powtórz has³o: ");
	
	private JTextField newNametext = new JTextField("------", 16);
	private JTextField newSurnametext = new JTextField("------", 16);
	private JTextField newLogintext = new JTextField("------", 16);
	private JPasswordField newPass1text    = new JPasswordField("******", 16);
	private JPasswordField newPass2text   = new JPasswordField("******", 16);
	
	private JButton newAccButton    = new JButton("Utwórz konto");
	private JButton backButton    = new JButton("Wróæ");
	
	private JLabel newError = new JLabel("            B³¹d            ");
	
	
	// end newaccountpanel
	
	
	
	public static void main(String[] args) throws IOException {
		new Aplikacja();
	}
	
	public Aplikacja () throws IOException{
		super("ParaBank");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(225,250);
		setResizable(false);
		setLocationRelativeTo(null);
		createMenuBar();
		
		createLogPanel();
		createUserPanel();
		createNewAccountPanel();
		setContentPane(logPanel);
		setVisible(true);
		
	}

	public void Log_in(String login, String password)
	{
		activeUser = baza.CheckLogin(login, password);
		if(activeUser!=null)
		{
			Logged_in = true;
			errorLabel.setForeground(Color.GREEN);
			errorLabel.setText("               Zalogowano               ");
			errorLabel.setVisible(true);
			loginButton.setText("Wyloguj");
			userName.setText(activeUser.getOwner().getName());
			userSurname.setText(activeUser.getOwner().getSurname());
			userAccBalance.setText("Stan konta: " + Float.toString(activeUser.getAccountBalance()) + " z³");
			menuBar.add(menuAccount);
			menuAccount.add(menuLogOut);
			menuAccount.add(menuRemoveAccount);
			setContentPane(userPanel);
			repaint();
		}
		else
		{
			errorLabel.setForeground(Color.RED);
			errorLabel.setText("            B³¹d logowania            ");
			errorLabel.setVisible(true);
		}
	}
	
	public void Log_out()
	{
		Logged_in = false;
		activeUser = null;
		errorLabel.setForeground(Color.ORANGE);
		errorLabel.setText("               Wylogowano               ");
		errorLabel.setVisible(true);
		loginButton.setText("Zaloguj");
		loginField.setText("login");
		passField.setText("******");
		menuAccount.remove(menuLogOut);
		menuAccount.remove(menuRemoveAccount);
		menuBar.remove(menuAccount);
		setContentPane(logPanel);
		repaint();
	}
	
	public void NewAccount() 
	{
		if(newPass1text.getText().equals(newPass2text.getText()))
		{
			Uzytkownik user = new Uzytkownik(newNametext.getText(), newSurnametext.getText(), newLogintext.getText(), newPass1text.getText(), false);
			if(!baza.HaveAccount(user))
			{
				baza.konta.add(new KontoKlienta(user));
				newError.setForeground(Color.GREEN);
				newError.setText("Konto zosta³o utworzone");
				newError.setVisible(true);
			}
			else
			{
				newError.setForeground(Color.RED);
				newError.setText("Konto o takich danych ju¿ istnieje");
				newError.setVisible(true);
			}
		}
		else
		{
			newError.setForeground(Color.RED);
			newError.setText("Podane has³a nie s¹ zgodne");
			newError.setVisible(true);
			 //System.out.println("B³¹d");
		}
		repaint();
	}
	
	private void RemoveAccount() {
		if(Logged_in) baza.konta.remove(activeUser);
		Log_out();
	}

	@Override
	public void actionPerformed(ActionEvent e){
		Object source = e.getSource();
		if (source == menuAuthor) {
			JOptionPane.showMessageDialog(this, "Pozdrowienia dla Rogala", "ParaBank", JOptionPane.INFORMATION_MESSAGE);
		}
		if (source == menuExit) {
			System.exit(0);
		}
		if (source == menuLogOut) {
			Log_out();
		}
		if (source == menuNewAccount) {
			setSize(225,390);
			setContentPane(newAccountPanel);
			repaint();
		}
		if (source == loginButton) {
			if(!Logged_in) Log_in(loginField.getText(), passField.getText());
			else Log_out();
		}
		if (source == backButton) {
			setSize(225,250);
			setContentPane(logPanel);
			repaint();
		}
		if (source == newAccButton) {
			NewAccount();
		}
		if (source == menuRemoveAccount) {
			RemoveAccount();
		}
		if (source == transferButton) {
			KontoKlienta dstAcc = baza.CheckUserByNumber(JOptionPane.showInputDialog(this, "Numer konta docelowego: ", "22 1111 1111 0000 0000 0000 000X"));
			float amount = Float.valueOf(JOptionPane.showInputDialog(this, "Kwota przelewu: "));
			if(amount > activeUser.getAccountBalance()) JOptionPane.showMessageDialog(this, "Wybrana kwota jest zbyt wysoka", "Zbyt wysoka kwota", JOptionPane.ERROR_MESSAGE);
			else {
				String title = JOptionPane.showInputDialog(this, "Tytu³ przelewu: ");
				activeUser.Transfer(activeUser, dstAcc, amount, "Przelew", title);
				activeUser.setAccountBalance(activeUser.getAccountBalance()-amount);
				dstAcc.setAccountBalance(dstAcc.getAccountBalance()+amount);
				userAccBalance.setText("Stan konta: " + Float.toString(activeUser.getAccountBalance()) + " z³");
			}
		}
		
		if (source == menuAccInfo) {
			String msg = null;
			msg = "W³aœciciel konta: " + activeUser.getOwner().getName() + " " + activeUser.getOwner().getSurname() +
					"\nStan konta: " + String.valueOf(activeUser.getAccountBalance()) + " z³" +
					"\nNumer konta: " + activeUser.getNumber() +
					"\nData utworzenia konta: " + activeUser.getDate() +
					"\nID klienta: " + activeUser.getOwner().getUser_ID();
			JOptionPane.showMessageDialog(this, msg, "Dane konta", JOptionPane.INFORMATION_MESSAGE);
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
	    if (e.getKeyCode()==KeyEvent.VK_ENTER){
	    	if(!Logged_in) Log_in(loginField.getText(), passField.getText());
			else Log_out();
	    }
	}
	
	private void createMenuBar() {
		menuExit.addActionListener(this);
		menuLogOut.addActionListener(this);
		menuAuthor.addActionListener(this);
		menuAccount.addActionListener(this);
		menuAccInfo.addActionListener(this);
		menuNewAccount.addActionListener(this);
		menuRemoveAccount.addActionListener(this);
		
		menuFile.setMnemonic(KeyEvent.VK_U);
		menuFile.addSeparator();
		menuFile.add(menuExit);
		menuFile.add(menuNewAccount);
		
		
		menuHelp.setMnemonic(KeyEvent.VK_H);
		menuHelp.add(menuAuthor);
		
		menuAccount.setMnemonic(KeyEvent.VK_A);
		menuAccount.add(menuAccInfo);
		menuAccount.add(menuRemoveAccount);
		
		menuBar.add(menuFile);
		menuBar.add(menuHelp);
		setJMenuBar(menuBar);
	}	
	
	private void createLogPanel() {
		logPanel.setBackground(Color.DARK_GRAY);
		
		loginButton.addActionListener(this);
		loginField.addKeyListener(this);
		passField.addKeyListener(this);
		loginField.addMouseListener(this);
		passField.addMouseListener(this);
		
		loginLabel.setForeground(Color.ORANGE);
		loginField.setForeground(Color.ORANGE);
		passLabel.setForeground(Color.ORANGE);
		passField.setForeground(Color.ORANGE);
		
		menuExit.setForeground(Color.ORANGE);
		menuLogOut.setForeground(Color.ORANGE);
		menuNewAccount.setForeground(Color.ORANGE);
		menuAuthor.setForeground(Color.ORANGE);
		
		menuFile.setForeground(Color.ORANGE);
		menuHelp.setForeground(Color.ORANGE);
		
		loginButton.setForeground(Color.ORANGE);
		
		errorLabel.setForeground(Color.RED);
		
		loginField.setBackground(Color.GRAY);
		passField.setBackground(Color.GRAY);
		
		menuExit.setBackground(Color.BLACK);
		menuLogOut.setBackground(Color.BLACK);
		menuNewAccount.setBackground(Color.BLACK);
		menuAuthor.setBackground(Color.BLACK);
		
		menuBar.setBackground(Color.BLACK);
		
		loginButton.setBackground(Color.BLACK);
		
		errorLabel.setVisible(false);
		
		logPanel.add(logo);
		logPanel.add(loginLabel);
		logPanel.add(loginField);
		logPanel.add(passLabel);
		logPanel.add(passField);
		logPanel.add(loginButton);
		
		logPanel.add(errorLabel);
	}
	
	private void createUserPanel() {
		userPanel.setBackground(Color.DARK_GRAY);
		
		transferButton.addActionListener(this);
		
		userName.setForeground(Color.ORANGE);
		userSurname.setForeground(Color.ORANGE);
		userAccBalance.setForeground(Color.ORANGE);
		
		menuAccount.setForeground(Color.ORANGE);
		menuAccInfo.setForeground(Color.ORANGE);
		menuRemoveAccount.setForeground(Color.ORANGE);
		
		menuAccount.setBackground(Color.BLACK);
		menuAccInfo.setBackground(Color.BLACK);
		menuRemoveAccount.setBackground(Color.BLACK);
		
		transferButton.setForeground(Color.ORANGE);
		transferButton.setBackground(Color.BLACK);
		
		userPanel.add(logo2);
		userPanel.add(userName);
		userPanel.add(userSurname);
		userPanel.add(userAccBalance);
		userPanel.add(transferButton);
	}

	private void createNewAccountPanel() {
		newAccountPanel.setBackground(Color.DARK_GRAY);
		
		newName.setForeground(Color.ORANGE);
		newSurname.setForeground(Color.ORANGE);
		newLogin.setForeground(Color.ORANGE);
		newPass1.setForeground(Color.ORANGE);
		newPass2.setForeground(Color.ORANGE);
		
		backButton.setForeground(Color.ORANGE);
		newAccButton.setForeground(Color.ORANGE);
		
		newError.setForeground(Color.RED);
		
		newNametext.setForeground(Color.ORANGE);
		newSurnametext.setForeground(Color.ORANGE);
		newLogintext.setForeground(Color.ORANGE);
		newPass1text.setForeground(Color.ORANGE);
		newPass2text.setForeground(Color.ORANGE);
		
		backButton.setBackground(Color.BLACK);
		newAccButton.setBackground(Color.BLACK);
		
		newNametext.setBackground(Color.GRAY);
		newSurnametext.setBackground(Color.GRAY);
		newLogintext.setBackground(Color.GRAY);
		newPass1text.setBackground(Color.GRAY);
		newPass2text.setBackground(Color.GRAY);
		
		newAccButton.addActionListener(this);
		backButton.addActionListener(this);
		
		newAccountPanel.add(logo3);
		
		newAccountPanel.add(newName);
		newAccountPanel.add(newNametext);
		newAccountPanel.add(newSurname);
		newAccountPanel.add(newSurnametext);
		newAccountPanel.add(newLogin);
		newAccountPanel.add(newLogintext);
		newAccountPanel.add(newPass1);
		newAccountPanel.add(newPass1text);
		newAccountPanel.add(newPass2);
		newAccountPanel.add(newPass2text);
		
		newAccountPanel.add(newAccButton);
		newAccountPanel.add(backButton);
		
		newAccountPanel.add(newError);
		
		newError.setVisible(false);
		
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		Object source = e.getSource();
		if (source == loginField) loginField.setText("");
		if (source == passField) passField.setText("");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
