package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.xml.ws.handler.MessageContext;

import Principal.HelperCampos;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.security.MessageDigest;
import java.text.MessageFormat;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JPasswordField;

public class TelaLoguin extends JFrame {

	private JPanel contentPane;
	private JTextField textUsu;
	private JLabel lblUsuario;
	private JLabel lblSenha;
	private static TelaLoguin frame;
	private JPasswordField txtSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 frame = new TelaLoguin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaLoguin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 382, 311);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textUsu = new JTextField();
		textUsu.setBounds(107, 65, 163, 20);
		contentPane.add(textUsu);
		textUsu.setColumns(10);
		
		lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(107, 40, 46, 14);
		contentPane.add(lblUsuario);
		
		lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(107, 101, 46, 14);
		contentPane.add(lblSenha);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//HelperCampos helper = new HelperCampos();
				//boolean verifica =helper.loguin(textUsu.getText(),textSenha.getText());
				boolean verifica = true; 
				if (verifica == true) {
					// mudar de janela
					TelaGerencial janela_gerencial = new TelaGerencial();
					janela_gerencial.setLocationRelativeTo(null);
					janela_gerencial.setVisible(true);
					frame.setVisible(false);
				}else {
					JOptionPane.showMessageDialog(null, "Erro ao Entar, Tente Novamente", "Alerta", 1);
				}
			}
		});
		btnEntrar.setBounds(143, 181, 89, 23);
		contentPane.add(btnEntrar);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(107, 126, 163, 20);
		contentPane.add(txtSenha);
		
	}
}
