package g54ubi.chat.server;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;

import java.awt.Font;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Random;

import javax.swing.JScrollPane;
import javax.swing.JButton;

public class Client {

	private JFrame frame;
	private JTextField chatArea;
	private JTextField textField;
	private JTextArea chatMessage = new JTextArea();
	private JTextArea onlineUser = new JTextArea();

	/**
	 * Launch the application.
	 */
    public static void main(String[] args) throws Exception {
    	//Launch the application.
        Client client = new Client();
        client.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Close frame when close button is pressed
        client.frame.setVisible(true);//Show frame
        client.frame.setResizable(false);//Does not allow maximization of the Frame
        client.run();
    }

	/**
	 * Create the application.
	 */
	public Client() {
		frame = new JFrame();
		frame.setBounds(100, 100, 672, 488);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Messages");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(24, 21, 127, 23);
		frame.getContentPane().add(lblNewLabel);
		
		chatMessage.setEditable(false);
		JScrollPane scrollPaneMessage = new JScrollPane();
		scrollPaneMessage.setBounds(24, 53, 422, 224);
		frame.getContentPane().add(scrollPaneMessage);
		scrollPaneMessage.setViewportView(chatMessage);
		
		JScrollPane scrollPaneChat = new JScrollPane();
		scrollPaneChat.setBounds(24, 295, 328, 97);
		frame.getContentPane().add(scrollPaneChat);
		chatArea = new JTextField();
		scrollPaneChat.setViewportView(chatArea);
		chatArea.setColumns(20);
		chatMessage.setColumns(20);
		
		JLabel lblOnlineUsers = new JLabel("Online Users");
		lblOnlineUsers.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblOnlineUsers.setBounds(479, 23, 127, 21);
		
		onlineUser.setEditable(false);
		frame.getContentPane().add(lblOnlineUsers);
		JScrollPane scrollPaneUsers = new JScrollPane();
		scrollPaneUsers.setBounds(479, 54, 159, 327);
		frame.getContentPane().add(scrollPaneUsers);
		scrollPaneUsers.setViewportView(onlineUser);
		
		JButton btnConn = new JButton("Connect");
		btnConn.setBounds(373, 402, 108, 23);
		frame.getContentPane().add(btnConn);
		
		JButton btnSnd = new JButton("Send");
		btnSnd.setBounds(362, 329, 84, 23);
		frame.getContentPane().add(btnSnd);
		
		JButton btnDis = new JButton("Disconnect");
		btnDis.setBounds(530, 402, 108, 23);
		frame.getContentPane().add(btnDis);
		
		textField = new JTextField();
		textField.setBounds(108, 402, 244, 23);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblUserName = new JLabel("User Name:");
		lblUserName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUserName.setBounds(24, 406, 74, 23);
		frame.getContentPane().add(lblUserName);
	}
}
