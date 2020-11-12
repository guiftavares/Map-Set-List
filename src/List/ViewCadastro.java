package List;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewCadastro extends JFrame {
	
	CadastroProdutor produtores = new CadastroProdutor();

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtCpf;
	private JTextField txtContato;
	private JTextField txtAnimal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewCadastro frame = new ViewCadastro();
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
	public ViewCadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("CADASTRO DE PRODUTOR");
		lblNewLabel.setBounds(127, 11, 181, 33);
		lblNewLabel.setFont(new Font("Arial Narrow", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setBounds(10, 52, 27, 15);
		lblNewLabel_1.setFont(new Font("Arial Narrow", Font.BOLD, 12));
		
		txtNome = new JTextField();
		txtNome.setBounds(47, 50, 368, 20);
		txtNome.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("CPF");
		lblNewLabel_2.setBounds(10, 90, 20, 15);
		lblNewLabel_2.setFont(new Font("Arial Narrow", Font.BOLD, 12));
		
		txtCpf = new JTextField();
		txtCpf.setBounds(48, 88, 152, 20);
		txtCpf.setColumns(10);
		
		JLabel lblContato = new JLabel("Contato");
		lblContato.setBounds(210, 90, 36, 15);
		lblContato.setFont(new Font("Arial Narrow", Font.BOLD, 12));
		
		txtContato = new JTextField();
		txtContato.setBounds(256, 88, 159, 20);
		txtContato.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Tipo de Rebanho");
		lblNewLabel_4.setBounds(10, 128, 80, 15);
		lblNewLabel_4.setFont(new Font("Arial Narrow", Font.BOLD, 12));
		
		JComboBox boxRebanho = new JComboBox();
		boxRebanho.setBounds(136, 126, 279, 20);
		boxRebanho.setModel(new DefaultComboBoxModel(new String[] {"<Selecione>", "Bovinos", "Bubalinos", "Caprinos", "Su\u00EDnos", "Aves"}));
		
		JLabel lblNewLabel_5 = new JLabel("Quantidade de Animais");
		lblNewLabel_5.setBounds(10, 166, 108, 15);
		lblNewLabel_5.setFont(new Font("Arial Narrow", Font.BOLD, 12));
		
		JLabel lblCadastro = new JLabel("0");
		lblCadastro.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCadastro.setBounds(10, 236, 27, 14);
		
		txtAnimal = new JTextField();
		txtAnimal.setBounds(136, 164, 279, 20);
		txtAnimal.setColumns(10);
		
		JButton btnSalvar = new JButton("Add na Lista");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
											
				String nome = txtNome.getText();
				String cpf = txtCpf.getText();
				String contato = txtContato.getText();
				String tipoRebanho = boxRebanho.getSelectedItem().toString();
				Integer animal = Integer.parseInt(txtAnimal.getText());
			
				Produtor p = new Produtor(nome, cpf, contato, tipoRebanho, animal);
				
				produtores.cadastrarProdutor(p);
				
				lblCadastro.setText(produtores.numeroCadastros());
				
				System.out.println(p);
				
							
				txtNome.setText("");
				txtCpf.setText("");
				txtContato.setText("");
				boxRebanho.setToolTipText("");
				txtAnimal.setText("");
									
				
				
			}		
				});
		
		btnSalvar.setBounds(283, 190, 132, 23);
		btnSalvar.setFont(new Font("Arial Narrow", Font.BOLD, 12));
		
		panel.setLayout(null);
		panel.add(lblNewLabel);
		panel.add(lblCadastro);
		panel.add(lblNewLabel_4);
		panel.add(lblNewLabel_5);
		panel.add(btnSalvar);
		panel.add(txtAnimal);
		panel.add(boxRebanho);
		panel.add(lblNewLabel_2);
		panel.add(txtCpf);
		panel.add(lblContato);
		panel.add(txtContato);
		panel.add(lblNewLabel_1);
		panel.add(txtNome);
		
		JLabel lblNewLabel_3 = new JLabel("Produtores Cadastrados");
		lblNewLabel_3.setFont(new Font("Arial Narrow", Font.BOLD, 12));
		lblNewLabel_3.setBounds(44, 235, 202, 14);
		panel.add(lblNewLabel_3);
	}
}
