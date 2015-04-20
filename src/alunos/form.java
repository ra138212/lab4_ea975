package alunos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

import javax.swing.DropMode;
import java.awt.Font;

public class form extends JFrame {

	public JPanel contentPane;
	public JTextField textfirstName;
	public JTextField textlastName;
	public JTextField textdatanascimento;
	public JTextField textemail;
	private static final Pattern rfc2822 = Pattern.compile(
	        "^[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?$"
	);
	private static final Pattern cpfmask = Pattern.compile(
	        "[0-9]?[0-9]?[0-9]\\.[0-9][0-9][0-9]\\.[0-9][0-9][0-9]\\-[0-9][0-9]"
	);
	private static final Pattern phonemask = Pattern.compile(
	        "(\\+[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]\\-[0-9][0-9][0-9][0-9])?"
	);
	private static final Pattern cepmask = Pattern.compile(
	        "([0-9][0-9][0-9][0-9][0-9]\\-[0-9][0-9][0-9])?"
	);
	public JTextField textcpf;
	public JTextField textphone;
	public JTextField textendereco1;
	public JTextField textendereco2;
	public JTextField textcep;
	public JTextField textcidade;
	public JTextField textestado;
	public JTextField textpais;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form frame = new form();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public boolean validadata(String data)
	{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date testDate = null;
		
		try
		{
			testDate = sdf.parse(data);
		}
	    catch (ParseException e)
	    {
	    	JOptionPane.showMessageDialog(null,
	                "Data de nascimento inválida.",
	                "Erro",
	                JOptionPane.ERROR_MESSAGE);
	      return false;
	    }
		return true;
	}
	
	public boolean validavazio(String campo)
	{
		boolean ret = true;
		if(campo.length() == 0)
		{
			ret = false;
	    	JOptionPane.showMessageDialog(null,
	                "Campos com * deve ser preenchidos.",
	                "Erro",
	                JOptionPane.ERROR_MESSAGE);
		}
		return ret;
	}
	
	public boolean validaemail(String email)
	{
		boolean ret = true;
		if (!rfc2822.matcher(email).matches()) {
			ret = false;
	    	JOptionPane.showMessageDialog(null,
	                "Email inválido.",
	                "Erro",
	                JOptionPane.ERROR_MESSAGE);
		}
		return ret;
	}
	
	public boolean validacpf(String cpf)
	{
		boolean ret = true;
		if (!cpfmask.matcher(cpf).matches()) {
			ret = false;
	    	JOptionPane.showMessageDialog(null,
	                "CPF inválido.",
	                "Erro",
	                JOptionPane.ERROR_MESSAGE);
		}
		return ret;
	}
	
	public boolean validaphone(String phone)
	{
		boolean ret = true;
		if (!phonemask.matcher(phone).matches()) {
			ret = false;
	    	JOptionPane.showMessageDialog(null,
	                "Telefone inválido.",
	                "Erro",
	                JOptionPane.ERROR_MESSAGE);
		}
		return ret;
	}	
	
	public boolean validacep(String cep)
	{
		boolean ret = true;
		if (!cepmask.matcher(cep).matches()) {
			ret = false;
	    	JOptionPane.showMessageDialog(null,
	                "CEP inválido.",
	                "Erro",
	                JOptionPane.ERROR_MESSAGE);
		}
		return ret;
	}	
	/**
	 * Create the frame.
	 */
	public form() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 314, 701);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textfirstName = new JTextField();
		textfirstName.setBounds(12, 77, 114, 19);
		contentPane.add(textfirstName);
		textfirstName.setColumns(10);
		
		textlastName = new JTextField();
		textlastName.setBounds(12, 122, 114, 19);
		contentPane.add(textlastName);
		textlastName.setColumns(10);
		
		final JComboBox comboTitle = new JComboBox();
		comboTitle.setModel(new DefaultComboBoxModel(new String[] {"Mr.", "Mrs.", "Miss.", "Ms.", "Dr.", "Other"}));
		comboTitle.setToolTipText("");
		comboTitle.setBounds(58, 12, 81, 24);
		contentPane.add(comboTitle);
		
		JLabel lblFirstName = new JLabel("First Name*:");
		lblFirstName.setBounds(12, 60, 90, 15);
		contentPane.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name*:");
		lblLastName.setBounds(12, 108, 90, 15);
		contentPane.add(lblLastName);
		
		JLabel lblTitle = new JLabel("Title:");
		lblTitle.setBounds(12, 17, 90, 15);
		contentPane.add(lblTitle);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {	
				if(validavazio(textfirstName.getText()) && validavazio(textlastName.getText()) && validadata(textdatanascimento.getText()) && validaemail(textemail.getText()) && validacpf(textcpf.getText()) && validaphone(textphone.getText()) && validacep(textcep.getText()))
				{
					//contentPane.setVisible(false);
					print printForm = new print();
					printForm.titleLabel.setText((String) comboTitle.getSelectedItem());
					printForm.firstNameLabel.setText(textfirstName.getText());
					printForm.lastNameLabel.setText(textlastName.getText());
					printForm.lblDataDeNascimento.setText(textdatanascimento.getText());
					printForm.lblEmail.setText(textemail.getText());
					printForm.lblcpf.setText(textcpf.getText());
					printForm.lblphone.setText(textphone.getText());
					printForm.lblendereco1.setText(textendereco1.getText());
					printForm.lblendereco2.setText(textendereco2.getText());
					printForm.lblcep.setText(textcep.getText());
					printForm.lblcidade.setText(textcidade.getText());
					printForm.lblestado.setText(textestado.getText());
					printForm.lblpais.setText(textpais.getText());
					//printForm.contentPane.setVisible(true);				
					printForm.show();
				}
				
			}
		});
		btnPrint.setBounds(124, 637, 74, 25);
		contentPane.add(btnPrint);
		
		textdatanascimento = new JTextField();
		textdatanascimento.setBounds(12, 171, 114, 19);
		contentPane.add(textdatanascimento);
		textdatanascimento.setColumns(10);
		
		JLabel lblData = new JLabel("Data de nascimento*:");
		lblData.setBounds(12, 153, 157, 19);
		contentPane.add(lblData);
		
		JLabel lblDdmmyyyy = new JLabel("dd/MM/yyyy");
		lblDdmmyyyy.setBounds(172, 155, 90, 15);
		contentPane.add(lblDdmmyyyy);
		
		JLabel lblNewLabel = new JLabel("Email*:");
		lblNewLabel.setBounds(12, 202, 70, 15);
		contentPane.add(lblNewLabel);
		
		textemail = new JTextField();
		textemail.setBounds(12, 219, 114, 19);
		contentPane.add(textemail);
		textemail.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF*:");
		lblCpf.setBounds(12, 250, 70, 15);
		contentPane.add(lblCpf);
		
		textcpf = new JTextField();
		textcpf.setBounds(12, 265, 114, 19);
		contentPane.add(textcpf);
		textcpf.setColumns(10);
		
		JLabel lblXxxxxxxxxxx = new JLabel("XXX.XXX.XXX-XX");
		lblXxxxxxxxxxx.setFont(new Font("Dialog", Font.BOLD, 9));
		lblXxxxxxxxxxx.setBounds(58, 250, 127, 19);
		contentPane.add(lblXxxxxxxxxxx);
		
		JLabel lblPhone = new JLabel("Phone:");
		lblPhone.setBounds(12, 296, 70, 15);
		contentPane.add(lblPhone);
		
		textphone = new JTextField();
		textphone.setBounds(12, 312, 114, 19);
		contentPane.add(textphone);
		textphone.setColumns(10);
		
		JLabel lblxxxxxxxxxxxx = new JLabel("+XXXXXXXX-XXXX");
		lblxxxxxxxxxxxx.setFont(new Font("Dialog", Font.BOLD, 9));
		lblxxxxxxxxxxxx.setBounds(71, 296, 127, 19);
		contentPane.add(lblxxxxxxxxxxxx);
		
		JLabel lblEndereo = new JLabel("Endereço 1:");
		lblEndereo.setBounds(12, 343, 90, 15);
		contentPane.add(lblEndereo);
		
		textendereco1 = new JTextField();
		textendereco1.setBounds(12, 359, 114, 19);
		contentPane.add(textendereco1);
		textendereco1.setColumns(10);
		
		JLabel lblEndereco = new JLabel("Endereco 2:");
		lblEndereco.setBounds(12, 390, 90, 19);
		contentPane.add(lblEndereco);
		
		textendereco2 = new JTextField();
		textendereco2.setBounds(12, 406, 114, 19);
		contentPane.add(textendereco2);
		textendereco2.setColumns(10);
		
		JLabel lblcep = new JLabel("CEP:");
		lblcep.setBounds(12, 437, 41, 19);
		contentPane.add(lblcep);
		
		textcep = new JTextField();
		textcep.setBounds(12, 454, 114, 19);
		contentPane.add(textcep);
		textcep.setColumns(10);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(12, 485, 70, 15);
		contentPane.add(lblCidade);
		
		textcidade = new JTextField();
		textcidade.setBounds(12, 498, 114, 19);
		contentPane.add(textcidade);
		textcidade.setColumns(10);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(12, 529, 70, 15);
		contentPane.add(lblEstado);
		
		textestado = new JTextField();
		textestado.setBounds(12, 542, 114, 19);
		contentPane.add(textestado);
		textestado.setColumns(10);
		
		JLabel lblPas = new JLabel("País:");
		lblPas.setBounds(12, 573, 70, 15);
		contentPane.add(lblPas);
		
		textpais = new JTextField();
		textpais.setBounds(12, 588, 114, 19);
		contentPane.add(textpais);
		textpais.setColumns(10);
	}
}
