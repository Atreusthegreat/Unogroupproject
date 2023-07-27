package Uno;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.CardLayout;

public class playerView extends JFrame {

	private JPanel contentPane;
	private JPanel board;
	private JPanel Playershand;
	private JPanel table;
	private JPanel playertoleft;
	private JPanel playeroccrosed;
	private JPanel playertoright;
	private JPanel dicard;
	private JPanel draw;
	private JPanel bottons;
	private JPanel cards;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					playerView frame = new playerView();
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
	public playerView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		board = new JPanel();
		contentPane.add(board, BorderLayout.CENTER);
		board.setLayout(new BorderLayout(0, 0));
		
		playertoleft = new JPanel();
		board.add(playertoleft, BorderLayout.NORTH);
		
		playeroccrosed = new JPanel();
		board.add(playeroccrosed, BorderLayout.EAST);
		
		playertoright = new JPanel();
		board.add(playertoright, BorderLayout.WEST);
		
		table = new JPanel();
		board.add(table, BorderLayout.CENTER);
		
		dicard = new JPanel();
		table.add(dicard);
		
		draw = new JPanel();
		table.add(draw);
		
		Playershand = new JPanel();
		contentPane.add(Playershand, BorderLayout.SOUTH);
		Playershand.setPreferredSize(new Dimension(50, 100));
		Playershand.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		bottons = new JPanel();
		bottons.setBackground(new Color(0, 255, 0));
		Playershand.add(bottons);
		bottons.setPreferredSize(new Dimension(425, 30));
		
		cards = new JPanel();
		cards.setBackground(new Color(0, 0, 255));
		Playershand.add(cards);
		cards.setSize(450, 50);
		cards.setLayout(new CardLayout(0, 0));
	}

}
