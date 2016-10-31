package mump3;

import javax.swing.JFrame;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.EventQueue;

public class mumain {

	private JFrame Mp3player;

		public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mumain window = new mumain();
					window.Mp3player.setVisible(true);
				} catch (Exception e) {
 			e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Constructor of the viewmp3
	 */
	public mumain() {
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Mp3player = new JFrame();
		Mp3player.setTitle("Mp3 Player");
		Mp3player.getContentPane().setBackground(Color.PINK);
		Mp3player.getContentPane().setLayout(null);
		mp3methods mp3method = new mp3methods();
		Mp3player.setBounds(100, 100, 213, 299);
		Mp3player.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnPlayList = new JButton("Open");
		btnPlayList.setBounds(50, 41, 71, 29);
		Mp3player.getContentPane().add(btnPlayList);
		btnPlayList.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				
				mp3method.Open();
				
			}
		});
				
		JButton btnNewButton = new JButton("Play");
		btnNewButton.setBounds(50, 97, 71, 29);
		Mp3player.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				mp3method.Play();
				
			}
		});
		
		JButton btnNewButton_1 = new JButton("Pause");
		btnNewButton_1.setBounds(50, 147, 71, 29);
		Mp3player.getContentPane().add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mp3method.Pause();
			}
		});
		
		JButton btnNewButton_2 = new JButton("Stop");
		btnNewButton_2.setBounds(50, 199, 71, 29);
		Mp3player.getContentPane().add(btnNewButton_2);
		
					
				mp3method.Stop();
			}
		};		
	

