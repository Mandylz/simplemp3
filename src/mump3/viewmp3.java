package mump3;

	import java.awt.EventQueue;
	import java.awt.FileDialog;
	
	import javax.swing.JFrame;
    import java.awt.SystemColor;
	import javax.swing.JLabel;
	
	import jaco.mp3.player.MP3Player;
	
	import javax.swing.JButton;
	import java.awt.event.ActionListener;
	import java.io.File;
	import java.io.FilenameFilter;
	import java.awt.event.ActionEvent;
	import java.awt.Color;
	
       public class viewmp3 {
	
		JFrame Mp3player;
	
				public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						viewmp3 window = new viewmp3();
					window.Mp3player.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
				}
				}
			});
		}

		/**
		 *  application is created.
		 */
		public viewmp3() {
			initialize();
		}
	
		/**
		 * Initialize the contents of the frame.
		 */
		private void initialize() {
			Mp3player = new JFrame();
			Mp3player.setTitle("Mp3 Player");
			Mp3player.getContentPane().setBackground(SystemColor.desktop);
			MP3Player player = new MP3Player();
			Mp3player.getContentPane().setLayout(null);
			//File filename[] = new File[5];
			JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setForeground(Color.WHITE);
			
			
			JLabel lblNewLabel = new JLabel("Music:   ");
			lblNewLabel.setBounds(26, 28, 71, 29);
			lblNewLabel.setForeground(SystemColor.text);
			Mp3player.getContentPane().add(lblNewLabel);
			
			JButton btnPlayList = new JButton("Open");
			btnPlayList.setBounds(12, 123, 98, 25);
			btnPlayList.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					player.removeAll();
					FileDialog fd = new FileDialog(Mp3player, "Select a song", FileDialog.LOAD);
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
				  System.out.println("" + filename[0].getName()+"selectd");
					
				for (int i=0 ; i < filename.length ; i++ ) {
					//System.out.println(filename[i].getPath());
					player.addToPlayList(filename[i]);
				}
				
					lblNewLabel_1.setText(filename[0].getName());
				}
			});
			Mp3player.getContentPane().add(btnPlayList);
			
			JButton btnNewButton = new JButton("Play");
			btnNewButton.setBounds(122, 123, 83, 25);
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
	
										
					player.play();
					
				}
			});
			Mp3player.getContentPane().add(btnNewButton);
			
			JButton btnNewButton_1 = new JButton("Pause");
			btnNewButton_1.setBounds(217, 123, 83, 25);
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					player.pause();
				}
			});
			Mp3player.getContentPane().add(btnNewButton_1);
			
			JButton btnNewButton_2 = new JButton("Stop");
			btnNewButton_2.setBounds(312, 123, 83, 25);
			btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					player.stop();
			}
			});
			Mp3player.getContentPane().add(btnNewButton_2);
			
		
			lblNewLabel_1.setBounds(84, 29, 338, 28);
			Mp3player.getContentPane().add(lblNewLabel_1);
			Mp3player.setBounds(100, 100, 450, 300);
			Mp3player.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}
