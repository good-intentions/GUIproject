package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
//import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Project  {
	
	final static String newline = "\n";
	static String row = new String();
	static String text = new String();
	static int ocenka;
	//static FileReader reader = new FileReader("filmi.txt");

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader reader = new FileReader("C:\\Users\\simeo\\eclipse-workspace\\SiHello\\src\\GUI\\filmi.txt");
		FileReader reader2 = new FileReader("C:\\Users\\simeo\\eclipse-workspace\\SiHello\\src\\GUI\\seriali.txt");
		
		JFrame frame = new JFrame("Топ филми и/или сериали");
		// Setting the width and height of frame
		frame.setSize(550, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
		JPanel panel = new JPanel();
		// adding panel to frame
		frame.add(panel);
		panel.setLayout(null);
		
		JLabel question = new JLabel("1. Кой е последният филм който сте гледали?");
		/*
		 * This method specifies the location and size of component. setBounds(x, y,
		 * width, height) here (x,y) are cordinates from the top left corner and
		 * remaining two arguments are the width and height of the component.
		 */
		question.setBounds(20, 75, 300, 25);
		panel.add(question);
		
		
		/*
		 * Creating text field where user is supposed to enter user name.
		 */
		JTextField input = new JTextField(20);
		input.setBounds(10, 105, 300, 25);
		panel.add(input);
	
		JTextArea textArea = new JTextArea();
        textArea.setBounds(325, 21, 180, 251);
        panel.add(textArea);
        textArea.setEditable(false);  
        textArea.read(reader, "filmi.txt");
        textArea.setVisible(true);
        
        JTextArea textArea2 = new JTextArea();
        textArea2.setBounds(325, 21, 180, 251);
        panel.add(textArea2);
        textArea2.setEditable(false);  
        textArea2.read(reader2, "seriali.txt");
        textArea2.setVisible(false);
        
        JButton filmi = new JButton("Филми");
		filmi.setBounds(35, 21, 100, 25);
		panel.add(filmi);
		filmi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	textArea.setVisible(true);
            	textArea2.setVisible(false);
            }
		});
		
		JButton seriali = new JButton("Сериали");
		seriali.setBounds(165, 21, 100, 25);
		panel.add(seriali);
		seriali.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	textArea2.setVisible(true);
            	textArea.setVisible(false);
            }
		});
		
        
        JButton zvezda1 = new JButton();
		zvezda1.setBounds(35, 180, 25, 25);
		panel.add(zvezda1);
		zvezda1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	ocenka = 1;
            }
		});
		
		JButton zvezda2 = new JButton();
		zvezda2.setBounds(65, 180, 25, 25);
		panel.add(zvezda2);
		zvezda2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	ocenka = 2;
            }
		});
		
		JButton zvezda3 = new JButton();
		zvezda3.setBounds(95, 180, 25, 25);
		panel.add(zvezda3);
		zvezda3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	ocenka = 3;
            }
		});
		
		JButton zvezda4 = new JButton();
		zvezda4.setBounds(125, 180, 25, 25);
		panel.add(zvezda4);
		zvezda4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	ocenka = 4;
            }
		});
		
		JButton zvezda5 = new JButton();
		zvezda5.setBounds(155, 180, 25, 25);
		panel.add(zvezda5);
		zvezda5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	ocenka = 5;
            }
		});
		
		
		
		JButton enter = new JButton("Въведи");
		enter.setBounds(130, 265, 110, 25);
		enter.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {

	             row = input.getText();
	             input.setText("");
	             
	            if(textArea.isVisible()) {
	            	
	            	textArea.append(newline + row + " (" + ocenka + "/5)");
	             try {
	            	FileWriter writter = new FileWriter("C:\\Users\\simeo\\eclipse-workspace\\SiHello\\src\\GUI\\filmi.txt", true);
	         		BufferedWriter bw = new BufferedWriter(writter);
					bw.write(newline + row + " (" + ocenka + "/5)");
					
					bw.close();
					writter.close();
				  } catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				  }  

	              }else{
	            	  
	            	  textArea2.append(newline + row + " (" + ocenka + "/5)");
	 	             try {
	 	            	FileWriter writter = new FileWriter("C:\\Users\\simeo\\eclipse-workspace\\SiHello\\src\\GUI\\seriali.txt", true);
	 	         		BufferedWriter bw = new BufferedWriter(writter);
	 					bw.write(newline + row + " (" + ocenka + "/5)");
	 					
	 					bw.close();
	 					writter.close();
	 				  } catch (IOException e1) {
	 					// TODO Auto-generated catch block
	 					e1.printStackTrace();
	 				  }  

	              } 
	            	
	            }
	            });
		       
		
		
		
		panel.add(enter);
		
		JLabel question2 = new JLabel("2. За колко добър го намирате?");
		question2.setBounds(20, 150, 300, 25);
		panel.add(question2);


        
				// Setting the frame visibility to true
		frame.setVisible(true);
		
		
 }

}
