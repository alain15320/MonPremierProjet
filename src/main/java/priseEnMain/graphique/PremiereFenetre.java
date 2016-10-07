package priseEnMain.graphique;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class PremiereFenetre extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JMenuBar menuBar;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PremiereFenetre frame = new PremiereFenetre();
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
	public PremiereFenetre() {
		setTitle("1ere fenètre");
		setIconImage(Toolkit.getDefaultToolkit().getImage(PremiereFenetre.class.getResource("/priseEnMain/graphique/Moon-32.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Fichier");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmQuitter = new JMenuItem("Quitter");
		mntmQuitter.setAction(action);
		mnNewMenu.add(mntmQuitter);
		
		JMenu mnNewMenu_1 = new JMenu("Client");
		menuBar.add(mnNewMenu_1);
		
		JMenu mnGestion = new JMenu("Gestion");
		mnNewMenu_1.add(mnGestion);
		
		JMenuItem mntmAjouter = new JMenuItem("Ajouter");
		mnGestion.add(mntmAjouter);
		
		JMenuItem mntmModifier = new JMenuItem("Modifier");
		mnGestion.add(mntmModifier);
		
		JMenuItem mntmRechercher = new JMenuItem("Rechercher");
		mnGestion.add(mntmRechercher);
		
		JSeparator separator = new JSeparator();
		mnGestion.add(separator);
		
		JMenuItem mntmSupprimer = new JMenuItem("Supprimer");
		mnGestion.add(mntmSupprimer);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnValider = new JButton("Valider");
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(btnValider, "Vous avez saisi \"" + textField.getText() + "\"");
			}
		});
		btnValider.setBounds(177, 190, 89, 23);
		contentPane.add(btnValider);
		
		textField = new JTextField();
		textField.setBounds(54, 132, 317, 23);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Saisissez un message");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(54, 34, 317, 29);
		contentPane.add(lblNewLabel);
	}
	private class SwingAction extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public SwingAction() {
			putValue(NAME, "Quitter");
			putValue(SHORT_DESCRIPTION, "Ferme l'application");
			putValue(MNEMONIC_KEY, KeyEvent.VK_Q);
			putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_Q, InputEvent.CTRL_DOWN_MASK));
		}
		public void actionPerformed(ActionEvent e) {
			dispose();
		}
	}
}
