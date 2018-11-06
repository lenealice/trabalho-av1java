

package Exercicio3;

import java.security.SecureRandom;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CacaNiquel extends JPanel{
	SecureRandom random = new SecureRandom();
	JTextField num1 = new JTextField(6);
	JTextField num2 = new JTextField(6);
	JTextField num3 = new JTextField(6);
	int giros = 0;
	int int1 = 0;
	int int2 = 0;
	int int3 = 0;
	JPanel panel = new JPanel();	
	
	public CacaNiquel(){
		panel.add(num1);
		panel.add(num2);
		panel.add(num3);
		this.add(panel);
	}
	
	public void girar(){
		giros = random.nextInt(150)+1;
		System.out.printf("%d vezes%n", giros);
		int i = 0;
		for ( i=0; i<=giros; i++){
			int1 = random.nextInt(7)+1;
			int2 = random.nextInt(7)+1;
			int3 = random.nextInt(7)+1;
			String string1 = String.format("%d", int1);
			String string2 = String.format("%d", int2);
			String string3 = String.format("%d", int3);
			
			num1.setText(string1);
			num2.setText(string2);
			num3.setText(string3);

			try {
				Thread.sleep(100);				
						
				System.out.printf("%s %s %s %n", string1, string2, string3);
				
								
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				
			}
		}
		if (int1 == 7 && int2 == 7 && int3 == 7){
			JOptionPane.showMessageDialog(null, "Você venceu!!!");
		} else {
			
			if(JOptionPane.showConfirmDialog(null, "Não foi dessa vez. Deseja jogar novamente?") == 0){
				this.girar();
			}
		}
	}
}
