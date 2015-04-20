package alunos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class print extends JFrame {

	public JPanel contentPane;
	JLabel titleLabel = new JLabel("Title");
	JLabel firstNameLabel = new JLabel("First Name");
	JLabel lastNameLabel = new JLabel("Last Name");
	JLabel lblDataDeNascimento = new JLabel("Data de nascimento");
	JLabel lblEmail = new JLabel("Email");
	JLabel lblcpf = new JLabel("CPF");
	JLabel lblphone = new JLabel("Phone");
	JLabel lblendereco1 = new JLabel("Endereço 1");
	JLabel lblendereco2 = new JLabel("Endereço 2");
	JLabel lblcep = new JLabel("CEP");
	JLabel lblcidade = new JLabel("Cidade");
	JLabel lblestado = new JLabel("Estado");
	JLabel lblpais = new JLabel("País");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					print frame = new print();					
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
	public print() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 329, 479);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		firstNameLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		firstNameLabel.setBounds(102, 82, 216, 15);
		contentPane.add(firstNameLabel);		
		
		lastNameLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		lastNameLabel.setBounds(102, 109, 216, 15);
		contentPane.add(lastNameLabel);
		
		JLabel lblNewLabel = new JLabel("First Name:");
		lblNewLabel.setBounds(12, 82, 106, 15);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Last Name:");
		lblNewLabel_1.setBounds(12, 109, 98, 15);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Title:");
		lblNewLabel_2.setBounds(12, 55, 70, 15);
		contentPane.add(lblNewLabel_2);
		
		
		titleLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
		titleLabel.setBounds(62, 55, 216, 15);
		contentPane.add(titleLabel);
		
		JLabel lblNewLabel_3 = new JLabel("Form Printed");
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_3.setBounds(102, 12, 159, 31);
		contentPane.add(lblNewLabel_3);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(12, 415, 117, 25);
		contentPane.add(btnExit);
		
		JLabel lblNewLabel_4 = new JLabel("Data de nascimento:");
		lblNewLabel_4.setBounds(12, 136, 159, 15);
		contentPane.add(lblNewLabel_4);
		
		
		lblDataDeNascimento.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblDataDeNascimento.setBounds(168, 136, 216, 15);
		contentPane.add(lblDataDeNascimento);
		
		JLabel lblEmail_11 = new JLabel("Email:");
		lblEmail_11.setBounds(12, 163, 48, 15);
		contentPane.add(lblEmail_11);
		
		
		lblEmail.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblEmail.setBounds(62, 163, 216, 15);
		contentPane.add(lblEmail);
		
		JLabel lblcpf_11 = new JLabel("CPF:");
		lblcpf_11.setBounds(12, 190, 48, 15);
		contentPane.add(lblcpf_11);
		
		
		lblcpf.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblcpf.setBounds(62, 190, 216, 15);
		contentPane.add(lblcpf);
		
		JLabel lblPhone_11 = new JLabel("Phone:");
		lblPhone_11.setBounds(12, 217, 62, 15);
		contentPane.add(lblPhone_11);
		
		
		lblphone.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblphone.setBounds(82, 217, 216, 15);
		contentPane.add(lblphone);
		
		JLabel lblEndereo = new JLabel("Endereço 1:");
		lblEndereo.setBounds(12, 244, 88, 15);
		contentPane.add(lblEndereo);
		
		
		lblendereco1.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblendereco1.setBounds(102, 244, 216, 15);
		contentPane.add(lblendereco1);
		
		JLabel lblEndereo_1 = new JLabel("Endereço 2:");
		lblEndereo_1.setBounds(12, 271, 88, 15);
		contentPane.add(lblEndereo_1);
		
		
		lblendereco2.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblendereco2.setBounds(102, 271, 216, 15);
		contentPane.add(lblendereco2);
		
		JLabel lblCep_11 = new JLabel("CEP:");
		lblCep_11.setBounds(12, 298, 48, 15);
		contentPane.add(lblCep_11);
		
		
		lblcep.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblcep.setBounds(62, 298, 216, 15);
		contentPane.add(lblcep);
		
		JLabel lblCidade_11 = new JLabel("Cidade:");
		lblCidade_11.setBounds(12, 325, 70, 15);
		contentPane.add(lblCidade_11);
		
		
		lblcidade.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblcidade.setBounds(82, 325, 216, 15);
		contentPane.add(lblcidade);
		
		JLabel lblEstado_11 = new JLabel("Estado:");
		lblEstado_11.setBounds(12, 352, 70, 15);
		contentPane.add(lblEstado_11);
		
		
		lblestado.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblestado.setBounds(82, 352, 216, 15);
		contentPane.add(lblestado);
		
		JLabel lblPais_11 = new JLabel("País:");
		lblPais_11.setBounds(12, 379, 70, 15);
		contentPane.add(lblPais_11);
		
		
		lblpais.setFont(new Font("Dialog", Font.PLAIN, 12));
		lblpais.setBounds(62, 379, 216, 15);
		contentPane.add(lblpais);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

	}

}
