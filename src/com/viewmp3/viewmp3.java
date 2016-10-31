package com.viewmp3;

import java.awt.EventQueue;
//import java.awt.FileDialog;
import javax.swing.JFrame;
import java.awt.SystemColor;
import javax.swing.JLabel;
//import javax.swing.plaf.basic.BasicTreeUI.SelectionModelPropertyChangeHandler;
import jaco.mp3.player.MP3Player;
import mump3.mp3methods;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
//import java.io.File;
//import java.io.FilenameFilter;
import java.awt.event.ActionEvent;
import java.awt.Color;


public class viewmp3 implements ActionListener {

	private JFrame Mp3player;
	
	private JLabel lblNewLabel_1 = new JLabel("");
	private JLabel lblMusic = new JLabel("Music:   ");
	private JButton btnOpen = new JButton("Open");
	private JButton btnPlay = new JButton("Play");
	private JButton btnPause = new JButton("Pause");
	private JButton btnStop = new JButton("Stop");
	private mp3methods mp3method = new mp3methods();
	//private MP3Player Mp3Player = new MP3Player();
	
	
	/**
	 * Constructor of the viewmp3, Create the application.
	 */
	public viewmp3() {
		createAndShowGUI();
		addComponentsToFrame();
		addActionListener();
	}
	private void addActionListener() {
		
		btnOpen.addActionListener(this);
		btnPlay.addActionListener(this);
		btnPause.addActionListener(this);
		btnStop.addActionListener(this);

		
	}
	/**
	 * Adding components to frame.
	 */

	public void addComponentsToFrame() {
		
		Mp3player.getContentPane().add(lblMusic);
		Mp3player.getContentPane().add(lblNewLabel_1);
		Mp3player.getContentPane().add(btnOpen);
		 Mp3player.getContentPane().add(btnPlay);
		 Mp3player.getContentPane().add(btnPause);
		 Mp3player.getContentPane().add(btnStop);

	}

	/**
	 * createAndShowGUI the contents of the frame.
	 */
	private void createAndShowGUI()  {
		Mp3player= new JFrame();
		Mp3player.setTitle("My Music Player");
		Mp3player.getContentPane().setBackground(SystemColor.desktop);
		Mp3player.getContentPane().setLayout(null);
		Mp3player.setVisible(true);
		
		lblNewLabel_1.setForeground(Color.WHITE);
		lblMusic.setBounds(26, 28, 71, 29);
		lblMusic.setForeground(SystemColor.text);
		lblNewLabel_1.setBounds(84, 29, 338, 28);
		
		Mp3player.setBounds(100, 100, 450, 300);
		Mp3player.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
				
		btnOpen.setBounds(26, 123, 100, 25);
		btnPlay.setBounds(122, 123, 100, 25);
		btnPause.setBounds(217, 123, 100, 25);
		btnStop.setBounds(312, 123, 100, 25); 
		mp3methods.setMp3Player(null);
		
}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == btnOpen){
			String filename = mp3methods.open;
			lblNewLabel_1.setText(filename);
		}
		if (e.getSource() == btnPlay){
			mp3method.Play();
		}
		if (e.getSource() == btnPause ){
			mp3method.Pause();
		}
		if (e.getSource() == btnStop ){
			mp3method.Stop();
		}
	}}