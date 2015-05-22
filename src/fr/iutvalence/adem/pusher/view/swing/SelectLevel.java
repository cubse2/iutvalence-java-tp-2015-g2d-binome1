package fr.iutvalence.adem.pusher.view.swing;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SelectLevel extends JDialog
{
	private int lvlMax;
	
	public SelectLevel(JFrame parent, String title, boolean modal, int lvlMax){
	    super(parent, title, modal);
	    this.lvlMax = lvlMax;
	    
	    this.setSize(420, 100);
	    this.setLocationRelativeTo(null);
	    this.setResizable(false);
	    this.levelComponent();
	    this.setVisible(true);
	    
	}
	
	private void levelComponent(){
		JLabel textOfLevel = new JLabel("Choose your level :", JLabel.CENTER);
		JPanel levelPanel = new JPanel();
		
		JButton levelButton;
		
		for(int levelNumber=1; levelNumber<=5; levelNumber++ ){
			levelButton = new JButton("Level "+levelNumber);
			if(levelNumber > lvlMax){
				levelButton.setEnabled(false);
			}
			levelButton.addActionListener(new ButtonListener(levelNumber));
			levelPanel.add(levelButton);
		}
		
	    this.add(textOfLevel, BorderLayout.PAGE_START);
	    this.add(levelPanel, BorderLayout.PAGE_END);
	}
}
