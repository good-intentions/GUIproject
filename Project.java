package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
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
	//static String path = new String("C:\\Users\\simeo\\eclipse-workspace\\SiHello\\src\\GUI\\");
	static ImageIcon icon = new ImageIcon("src\\GUI\\empty.png");
	static ImageIcon icon2 = new ImageIcon("src\\GUI\\full.png");

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader reader = new FileReader("src\\GUI\\filmi.txt");
		FileReader reader2 = new FileReader("src\\GUI\\seriali.txt");
		
		JFrame frame = new JFrame("Топ филми и сериали");
		// Setting the width and height of frame
		frame.setSize(550, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		Image full = icon2.getImage();
		Image modifiedF = full.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
		icon2 = new ImageIcon(modifiedF);
		
		Image empty = icon.getImage();
		Image modifiedE = empty.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
		icon = new ImageIcon(modifiedE);
		
		JPanel panel = new JPanel();
		// adding panel to frame
		frame.add(panel);
		panel.setLayout(null);
		panel.setBackground(Color.pink);
		
		
		JLabel question = new JLabel("1. Кой е последният филм който сте гледали?");
		/*
		 * This method specifies the location and size of component. setBounds(x, y,
		 * width, height) here (x,y) are cordinates from the top left corner and
		 * remaining two arguments are the width and height of the component.
		 */
		question.setBounds(20, 75, 300, 25);
		panel.add(question);
		question.setFont(new Font("Serif", Font.ITALIC, 16));
		
		
		/*
		 * Creating text field where user is supposed to enter user name.
		 */
		JTextField input = new JTextField(20);
		input.setBounds(10, 105, 300, 25);
		panel.add(input);
		input.setText("");
	
		JTextArea textArea = new JTextArea();
        textArea.setBounds(325, 21, 190, 251);
        panel.add(textArea);
        textArea.setEditable(false);  
        textArea.read(reader, "filmi.txt");
        textArea.setVisible(true);
        textArea.setFont(new Font("Serif", Font.ITALIC, 16));
        //textArea.setBackground(Color.PINK);
        textArea.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        JTextArea textArea2 = new JTextArea();
        textArea2.setBounds(325, 21, 190, 251);
        panel.add(textArea2);
        textArea2.setEditable(false);  
        textArea2.read(reader2, "seriali.txt");
        textArea2.setVisible(false);
        textArea2.setFont(new Font("Serif", Font.ITALIC, 16));
        //textArea2.setBackground(Color.dark_gray);
        textArea2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
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
		zvezda1.setBounds(35, 190, 50, 50);
		panel.add(zvezda1);
		zvezda1.setIcon(icon);
		zvezda1.setBorder(BorderFactory.createEmptyBorder());
		zvezda1.setContentAreaFilled(false);
		zvezda1.setBorderPainted(false);
		zvezda1.setBackground(Color.PINK);
		
		JButton zvezda2 = new JButton(icon);
		zvezda2.setBounds(85, 190, 50, 50);
		panel.add(zvezda2);
		zvezda2.setBorder(BorderFactory.createEmptyBorder());
		zvezda2.setContentAreaFilled(false);
		zvezda2.setBorderPainted(false);
		zvezda2.setBackground(Color.PINK);
		
		JButton zvezda3 = new JButton(icon);
		zvezda3.setBounds(135, 190, 50, 50);
		panel.add(zvezda3);
		zvezda3.setBorder(BorderFactory.createEmptyBorder());
		zvezda3.setContentAreaFilled(false);
		zvezda3.setBorderPainted(false);
		zvezda3.setBackground(Color.PINK);
		
		JButton zvezda4 = new JButton(icon);
		zvezda4.setBounds(185, 190, 50, 50);
		panel.add(zvezda4);
		zvezda4.setBorder(BorderFactory.createEmptyBorder());
		zvezda4.setContentAreaFilled(false);
		zvezda4.setBorderPainted(false);
		zvezda4.setBackground(Color.PINK);
		
		JButton zvezda5 = new JButton(icon);
		zvezda5.setBounds(235, 190, 50, 50);
		panel.add(zvezda5);
		zvezda5.setBorder(BorderFactory.createEmptyBorder());
		zvezda5.setContentAreaFilled(false);
		zvezda5.setBorderPainted(false);
		zvezda5.setBackground(Color.PINK);
		
		zvezda1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	ocenka = 1;
            	zvezda1.setIcon(icon2);
            	zvezda2.setIcon(icon);
            	zvezda3.setIcon(icon);
            	zvezda4.setIcon(icon);
            	zvezda5.setIcon(icon);
            }
		});
		zvezda2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	ocenka = 2;
            	zvezda1.setIcon(icon2);
            	zvezda2.setIcon(icon2);
            	zvezda3.setIcon(icon);
            	zvezda4.setIcon(icon);
            	zvezda5.setIcon(icon);
            }
		});
		zvezda3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	ocenka = 3;
            	zvezda1.setIcon(icon2);
            	zvezda2.setIcon(icon2);
            	zvezda3.setIcon(icon2);
            	zvezda4.setIcon(icon);
            	zvezda5.setIcon(icon);
            }
		});
		zvezda4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	ocenka = 4;
            	zvezda1.setIcon(icon2);
            	zvezda2.setIcon(icon2);
            	zvezda3.setIcon(icon2);
            	zvezda4.setIcon(icon2);
            	zvezda5.setIcon(icon);
            }
		});
		zvezda5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	ocenka = 5;
            	zvezda1.setIcon(icon2);
            	zvezda2.setIcon(icon2);
            	zvezda3.setIcon(icon2);
            	zvezda4.setIcon(icon2);
            	zvezda5.setIcon(icon2);
            }
		});
		
		JButton enter = new JButton("Въведи");
		enter.setBounds(130, 265, 110, 25);
		enter.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	            	
	            if(input.getText().equals("")){
	            	
	            }else {

	               row = input.getText();
	               input.setText("");
	             
	               if(textArea.isVisible()) {
	            	
	            	   textArea.append(newline + " - " + row + " (" + ocenka + "/5)");
	                  try {
	            	    FileWriter writter = new FileWriter("C:\\Users\\simeo\\eclipse-workspace\\SiHello\\src\\GUI\\filmi.txt", true);
	         		    BufferedWriter bw = new BufferedWriter(writter);
					    bw.write(newline + " - " + row + " (" + ocenka + "/5)");
					
					    bw.close();
					    writter.close();
				      } catch (IOException e1) {
					    // TODO Auto-generated catch block
					    e1.printStackTrace();
				      }  

	              }else{
	            	  
	            	    textArea2.append(newline + " - " + row + " (" + ocenka + "/5)");
	 	              try {
	 	            	FileWriter writter = new FileWriter("C:\\Users\\simeo\\eclipse-workspace\\SiHello\\src\\GUI\\seriali.txt", true);
	 	         		BufferedWriter bw = new BufferedWriter(writter);
	 					bw.write(newline + " - " + row + " (" + ocenka + "/5)");
	 					
	 					bw.close();
	 					writter.close();
	 				  } catch (IOException e1) {
	 					// TODO Auto-generated catch block
	 					e1.printStackTrace();
	 				  }  

	              } 
	            	
	             }
	            }
	           });
		       
		
		
		
		panel.add(enter);
		
		JLabel question2 = new JLabel("2. За колко добър го намирате?");
		question2.setBounds(20, 150, 300, 25);
		panel.add(question2);
		question2.setFont(new Font("Serif", Font.ITALIC, 16));


        
				// Setting the frame visibility to true
		frame.setVisible(true);
		
		
 }

}
