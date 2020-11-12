package Map;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.awt.event.ActionEvent;



public class ViewCapitais extends JFrame {
	HashMap<String, String> capitaisBrasil;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewCapitais frame = new ViewCapitais();
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
	public ViewCapitais() {
		
capitaisBrasil = new HashMap<String, String>(); //Atributo de Classe
		
		capitaisBrasil.put("S�o Paulo", "S�o Paulo");
		capitaisBrasil.put("Rio de Janeiro", "Rio de Janeiro");
		capitaisBrasil.put("Esp�rito Santo", "Vit�ria");
		capitaisBrasil.put("Minas Gerais", "Belo Horizonte");
		capitaisBrasil.put("Rond�nia", "Porto Velho");
		capitaisBrasil.put("Amazonas", "Manaus");
		capitaisBrasil.put("Acre", "Rio Branco");
		capitaisBrasil.put("Mato Grosso do Sul", "Campo Grande");
		capitaisBrasil.put("Amap�", "Macap�");
		capitaisBrasil.put("Distrito Federal", "Bras�lia");
		capitaisBrasil.put("Roraima", "Boa Vista");
		capitaisBrasil.put("Mato Grosso", "Cuiab�");
		capitaisBrasil.put("Tocantins", "Palmas");
		capitaisBrasil.put("Piau�", "Teresina");
		capitaisBrasil.put("Par�", "Bel�m");
		capitaisBrasil.put("Goi�s", "Goi�nia");
		capitaisBrasil.put("Bahia", "Salvador");
		capitaisBrasil.put("Santa Catarina", "Florian�polis");
		capitaisBrasil.put("Maranh�o", "S�o Lu�s");
		capitaisBrasil.put("Alagoas", "Macei�");
		capitaisBrasil.put("Rio Grande do Sul", "Porto Alegre");
		capitaisBrasil.put("Paran�", "Curitiba");
		capitaisBrasil.put("Cear�", "Fortaleza");
		capitaisBrasil.put("Pernambuco", "Recife");
		capitaisBrasil.put("Sergipe", "Aracaju");
		capitaisBrasil.put("Rio Grande do Norte", "Natal");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ESCOLHA UM ESTADO BRASILEIRO");
		lblNewLabel.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(29, 11, 375, 14);
		panel.add(lblNewLabel);
		
		JComboBox boxEstado = new JComboBox();
		boxEstado.setModel(new DefaultComboBoxModel(new String[] {"<Selecione>", "Acre", "Alagoas", "Amap\u00E1", "Amazonas", "Bahia", "Cear\u00E1", "Distrito Federal", "Esp\u00EDrito Santo", "Goi\u00E1s", "Maranh\u00E3o", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Piau\u00ED", "Para\u00EDba", "Paran\u00E1", "Pernambuco", "Par\u00E1", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rond\u00F4nia", "Roraima", "Santa Catarina", "S\u00E3o Paulo", "Sergipe", "Tocantins"}));
		boxEstado.setBounds(39, 36, 271, 40);
		panel.add(boxEstado);
		
		JLabel lblCapital = new JLabel("");
		lblCapital.setHorizontalAlignment(SwingConstants.CENTER);
		lblCapital.setFont(new Font("Arial Narrow", Font.BOLD, 16));
		lblCapital.setBounds(39, 142, 344, 40);
		panel.add(lblCapital);
		
		JButton btnPesquisar = new JButton("");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String estado = boxEstado.getSelectedItem().toString();
				
				lblCapital.setText("A capital do estado " + estado +
				" � "  + capitaisBrasil.get(estado));
					
			}
		});
		btnPesquisar.setIcon(new ImageIcon("C:\\Users\\guita\\Dropbox\\FATEC\\SEGUNDO_SEMESTRE\\Projeto Integrador\\images\\search_box_2.png"));
		btnPesquisar.setBounds(320, 36, 63, 40);
		panel.add(btnPesquisar);
		
		
	}
}
