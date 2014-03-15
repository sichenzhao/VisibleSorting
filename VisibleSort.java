import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class VisibleSort {
	
	public static void main(String[] args){
		openStartWindow();
	}
	
	public static void openStartWindow(){
		
		JFrame startFrame = new JFrame("StartFrame");
		startFrame.setVisible(true);
		startFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//startFrame.getContentPane().add(, BorderLayout.CENTER);
		startFrame.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		startFrame.add(panel);
		
		Button startButton = new Button("Let's get start!");
		startButton.addActionListener(new startAction());
		
		panel.add(startButton);

		startFrame.pack();
	}
	
	static class startAction implements ActionListener{
		public void actionPerformed(ActionEvent e){
			JFrame secondFrame = new JFrame("Set your sort.");
			secondFrame.setVisible(true);
			//secondFrame.setSize(200, 200);
			
			JLabel secondJLabel = new JLabel("here is the place you set your sorting");
			JPanel secondJPanel = new JPanel();
			secondFrame.add(secondJPanel);
			secondJPanel.add(secondJLabel);
			
			secondFrame.pack();
		}
	}
}
