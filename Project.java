package GUI;

import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Project {

	private static Component textArea;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame("Топ филми и/или сериали");
		// Setting the width and height of frame
		frame.setSize(550, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		// adding panel to frame
		frame.add(panel);
		panel.setLayout(null);
		
		JLabel question = new JLabel("Кой е последният филм който сте гледали?");
		/*
		 * This method specifies the location and size of component. setBounds(x, y,
		 * width, height) here (x,y) are cordinates from the top left corner and
		 * remaining two arguments are the width and height of the component.
		 */
		question.setBounds(10, 90, 300, 25);
		panel.add(question);
		
		
		/*
		 * Creating text field where user is supposed to enter user name.
		 */
		JTextField input = new JTextField(20);
		input.setBounds(10, 120, 300, 25);
		panel.add(input);
		
	
		JButton filmi = new JButton("Филми");
		filmi.setBounds(35, 21, 100, 25);
		panel.add(filmi);
		
		JButton seriali = new JButton("Сериали");
		seriali.setBounds(165, 21, 100, 25);
		panel.add(seriali);

		JButton enter = new JButton("Въведи");
		enter.setBounds(130, 265, 110, 25);
		panel.add(enter);
		
		JTextArea textArea = new JTextArea();
        textArea.setBounds(325, 21, 180, 251);
        panel.add(textArea);
        textArea.setEditable(false);
				// Setting the frame visibility to true
		frame.setVisible(true);

	}

}
