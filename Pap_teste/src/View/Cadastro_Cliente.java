package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JFormattedTextField;

public class Cadastro_Cliente extends JFrame {

	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textNome_animal;
	private JTextField textIdade_animal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro_Cliente frame = new Cadastro_Cliente();
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
	public Cadastro_Cliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 702, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNomeDoCliente = new JLabel("Nome do cliente:");
		lblNomeDoCliente.setBounds(28, 11, 86, 14);
		contentPane.add(lblNomeDoCliente);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(27, 56, 46, 14);
		contentPane.add(lblSexo);
		
		JLabel lblNomeAnimal = new JLabel("Nome Animal:");
		lblNomeAnimal.setBounds(28, 104, 65, 14);
		contentPane.add(lblNomeAnimal);
		
		JLabel lblIdadeAnimal = new JLabel("Idade animal");
		lblIdadeAnimal.setBounds(28, 149, 65, 14);
		contentPane.add(lblIdadeAnimal);
		
		textNome = new JTextField();
		textNome.setBounds(124, 8, 135, 20);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		JRadioButton radioMasculino = new JRadioButton("Masculino");
		radioMasculino.setBounds(64, 52, 76, 23);
		contentPane.add(radioMasculino);
		
		JRadioButton radioFeminino = new JRadioButton("Feminino");
		radioFeminino.setBounds(156, 52, 76, 23);
		contentPane.add(radioFeminino);
		
		textNome_animal = new JTextField();
		textNome_animal.setBounds(99, 101, 133, 20);
		contentPane.add(textNome_animal);
		textNome_animal.setColumns(10);
		
		textIdade_animal = new JTextField();
		textIdade_animal.setBounds(99, 146, 133, 20);
		contentPane.add(textIdade_animal);
		textIdade_animal.setColumns(10);
	}
}
