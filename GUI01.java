package Employee;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUI01 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		JButton b = new JButton("Press");
		f.setLayout(new BorderLayout());
		f.add(b, BorderLayout.CENTER);
		
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.out.println("Button says: " + event.getActionCommand());
			}
		});
		
		f.pack();
		f.setVisible(true);
	}

}
