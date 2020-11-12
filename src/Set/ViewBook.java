package Set;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import javax.swing.JOptionPane;


public class ViewBook extends JFrame {

	private JPanel contentPane;
	private Set<Book> livro = new HashSet <Book>();
	private JTextField txtNomeLivro;
	private JTextField txtNomeAutor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewBook frame = new ViewBook();
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
	public ViewBook() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CADASTRAR LIVRO");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Narrow", Font.BOLD, 14));
		lblNewLabel.setBounds(94, 11, 246, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("T\u00EDtulo");
		lblNewLabel_1.setFont(new Font("Arial Narrow", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 54, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		txtNomeLivro = new JTextField();
		txtNomeLivro.setBounds(10, 74, 414, 20);
		contentPane.add(txtNomeLivro);
		txtNomeLivro.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Autor");
		lblNewLabel_1_1.setFont(new Font("Arial Narrow", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(10, 125, 46, 14);
		contentPane.add(lblNewLabel_1_1);
		
		txtNomeAutor = new JTextField();
		txtNomeAutor.setColumns(10);
		txtNomeAutor.setBounds(10, 145, 414, 20);
		contentPane.add(txtNomeAutor);
		
		JButton btnSalvar = new JButton("SALVAR");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Book nomeLivro = new Book(txtNomeAutor.getText(), txtNomeLivro.getText());
				if (livro.contains(nomeLivro)) {
					JOptionPane.showMessageDialog(contentPane, "Livro Cadastrado com Sucesso");
				}
				else {
					livro.add(nomeLivro);
				}
				System.out.println(livro);
			}
		});
		btnSalvar.setFont(new Font("Arial Narrow", Font.BOLD, 12));
		btnSalvar.setBounds(203, 212, 89, 23);
		contentPane.add(btnSalvar);
		
		JButton btnPesquisar = new JButton("PESQUISAR");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String nomeLivro = txtNomeLivro.getText();
				Integer result = 0;
				for(Iterator<Book> it = livro.iterator(); it.hasNext();) {
					Book compare = it.next();
					if(compare.getNomeLivro().contains(nomeLivro)) {
						JOptionPane.showInternalMessageDialog(contentPane, " Título: " + nomeLivro + " | Autor: " + compare.getNomeAutor().toString());
						result += 1;
						break;
					}
				}
				if (result == 0) {
					JOptionPane.showInternalMessageDialog(contentPane, "Livro Não Cadastrado");
				}
			}
		});
		btnPesquisar.setFont(new Font("Arial Narrow", Font.BOLD, 12));
		btnPesquisar.setBounds(318, 212, 106, 23);
		contentPane.add(btnPesquisar);
	}
}
