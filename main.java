import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class main extends JFrame{
	public static void main(String[] args) {
		System.out.println("Hello World!");
		JFrame frame = new main();
	}
	
	main(){
		setSize(400,400);
		JLabel label = new JLabel("Hello World");
		JPanel panel = new JPanel();
		Container contentPane = getContentPane();
		panel.add(label);
		contentPane.add(panel);
		setVisible(true);
	}
}

