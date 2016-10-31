package mump3;
import java.awt.FileDialog;
import java.io.File;
import java.io.FilenameFilter;
import javax.swing.JFrame;
import javax.swing.JLabel;

import mump3.mp3interface;
import jaco.mp3.player.MP3Player;

public class mp3methods implements mp3interface {
	private static MP3Player Mp3Player = new MP3Player();
	public static String open;

	public MP3Player getMp3Player() {
		return Mp3Player;
	}

	public static void setMp3Player(MP3Player mp3Player) {
		Mp3Player = mp3Player;
	}

	public void Open() {
		Mp3Player.removeAll();
		JFrame Mp3player = new JFrame();
		JLabel lblNewLabel_1 = new JLabel("");
		FileDialog fd = new FileDialog(Mp3player, "Please Choose a mp3 song", FileDialog.LOAD);
		fd.setDirectory("");
		fd.setFilenameFilter(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith(".mp3");
			 }
		});
		fd.setVisible(true);
  	File filename[] = fd.getFiles();		
		if (filename == null)
		  System.out.println("You must select a song to play!");
		else
		  System.out.println(" " + filename[0].getName()+" selected");
		
		for (int i=0 ; i < filename.length ; i++ ) {
			
			Mp3Player.addToPlayList(filename[i]);
		}
	   
		lblNewLabel_1.setText(filename[0].getName());
		
	}

	@Override
	public void Play() {
		Mp3Player.play();		
	}

	@Override
	public void Pause() {
		Mp3Player.pause();
		
	}

	@Override
	public void Stop() {
		Mp3Player.stop();
		
	}

}
