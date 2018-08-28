package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.SwingConstants;

public class TelaGerencial extends JFrame {

	private JPanel contentPane;
	private static TelaGerencial frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 frame = new TelaGerencial();
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
	public TelaGerencial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		// cadastro
		JMenu mnCadastro = new JMenu("Cadastro");
		mnCadastro.setHorizontalAlignment(SwingConstants.TRAILING);
		menuBar.add(mnCadastro);
		
		JMenuItem mntmFuncionario = new JMenuItem("Funcionario");
		mnCadastro.add(mntmFuncionario);
			mntmFuncionario.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					System.out.println("func");
				}
			});
		JMenuItem mntmCliente = new JMenuItem("Cliente");
		mnCadastro.add(mntmCliente);
		
		mntmCliente.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("cliente");
				
			}
		});
		
		JMenuItem mntmVeterinario = new JMenuItem("Veterinario");
		mnCadastro.add(mntmVeterinario);
		mntmVeterinario.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("veterinario");
			}
		});
		
		// visualizar
		JMenuItem mntmVisualizar = new JMenuItem("Visualizar");
		menuBar.add(mntmVisualizar);
		mntmVisualizar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("");
				
			}
		});
		//sair
		JMenuItem mntmSair = new JMenuItem("Sair");
		menuBar.add(mntmSair);
		mntmSair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				TelaLoguin loguin = new TelaLoguin();
				loguin.setLocationRelativeTo(null);
				loguin.setVisible(true);
				frame.setVisible(false);
			}
		});
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
