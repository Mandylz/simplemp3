package commp3methods;

import cominterf.interf;

	import java.io.File;
	import javax.swing.JFileChooser;
	import jaco.mp3.player.MP3Player;

	public class mp3methods implements interf {
		private MP3Player Mp3Player;

		public MP3Player getMp3Player() {
			return Mp3Player;
		}

		public void setMp3Player() {
			this.Mp3Player = new MP3Player();
		}

		@Override
		public String Open() {
			String filename = "";
			final JFileChooser fileChooser = new JFileChooser();
			int returnVal = fileChooser.showOpenDialog(null);
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fileChooser.getSelectedFile();
				System.out.println(file.getAbsolutePath());
				this.Mp3Player.addToPlayList(file);
				filename = file.getName();
				
			}
			return filename;

		}
			
		@Override
		public void Play() {
			this.Mp3Player.play();
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

