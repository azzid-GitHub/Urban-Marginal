package vue;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controleur.Controle;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseWheelEvent;
import java.awt.Color;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JTextField;
import java.awt.Cursor;
import java.awt.SystemColor;
import javax.swing.JLayeredPane;

public class ChoixJoueur extends JFrame {
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChoixJoueur frame = new ChoixJoueur();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private JPanel contentPane;
	/**
	 * Create the frame.
	 */
	public ChoixJoueur() {
		setTitle("Choice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 408, 308);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblFonds = new JLabel("");
		lblFonds.setBounds(0, 0, 400, 276);
		lblFonds.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
			}
		});
		contentPane.setLayout(null);
		lblFonds.setIcon(new ImageIcon(ChoixJoueur.class.getResource("/fonds/fondchoix.jpg")));
		contentPane.add(lblFonds);
		
		JButton btnGo = new JButton("");
		btnGo.setBounds(312, 201, 56, 57);
		btnGo.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		btnGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Controle("str");
			}
		});
		contentPane.add(btnGo);
		
		JButton btnClickGauche = new JButton("");
		btnClickGauche.setBounds(65, 147, 28, 42);
		btnClickGauche.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnClickGauche);
		
		JButton btnClickDroite = new JButton("");
		btnClickDroite.setBounds(302, 147, 28, 43);
		btnClickDroite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(btnClickDroite);
	}
}
