import java.awt.Dimension;
import java.awt.Font;

import javax.swing.*;

public class SwingBanco {

	public SwingBanco(){
		JFrame jfrm = new JFrame("Bem Vindo ao Sistema de Banco!");
		
		//JButton jb = new JButton("Caixa");
		
		
		
		jfrm.setSize(500, 250);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel jlab = new JLabel("       Swing defines the modern Java GUI.");
		jfrm.add(jlab);
		
		jfrm.setVisible(true);
		
	
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				new SwingBanco();
			}
		});
	}
	
}
