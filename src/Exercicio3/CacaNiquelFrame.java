
package Exercicio3;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class CacaNiquelFrame extends JFrame {
	
	public CacaNiquelFrame(){
		super("Caça Niquel");
		CacaNiquel panel = new CacaNiquel();
	
		JButton girarJButton = new JButton("Girar");
		girarJButton.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			panel.girar();
		}
		
	});
		setLayout(new FlowLayout());
		this.add(panel);
		this.add(girarJButton);
	}
}
