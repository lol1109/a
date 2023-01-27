package kalkulatorBd;

import javax.swing.JFrame;
import bangundatar.persegi;

public class main extends JFrame {
	public static void layar() {
		JFrame frame = new JFrame("KALKULATOR");
		frame.setResizable(false);
		frame.pack();
		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public static void main(String []args) {
		persegi p = new persegi();
		p.setA(5);
		p.setB(5);
		p.setC(5);
		p.setD(5);
		p.tampil();
		layar();
	}
}
