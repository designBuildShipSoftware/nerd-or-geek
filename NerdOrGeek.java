package aNerdOrAGeek;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EtchedBorder;
 
public class NerdOrGeek extends JFrame implements ActionListener {
 
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
  
  int i, a, b;
  
  JLabel statusbar;
  JPanel panel = new JPanel();
  
  ImageIcon imageicon = new ImageIcon("NerdGeek.jpg");
  JButton nerdGeek = new JButton("NerdGeek", imageicon);
  
  ImageIcon imageicon1= new ImageIcon("Soda.jpg");
  JButton soda = new JButton("soda", imageicon1);
  
  ImageIcon imageicon2 = new ImageIcon("Coffee.jpg");
  JButton coffee = new JButton("coffee", imageicon2);
  
  ImageIcon imageicon3 = new ImageIcon("Loafers.jpg");
  JButton loafers = new JButton("loafers", imageicon3);
  
  ImageIcon imageicon4 = new ImageIcon("Sneakers.jpg");
  JButton sneakers = new JButton("sneakers", imageicon4);
  
  ImageIcon imageicon5 = new ImageIcon("Guitar.jpg");
  JButton guitar = new JButton("guitar", imageicon5);
  
  ImageIcon imageicon6 = new ImageIcon("Saxaphone.jpg");
  JButton saxaphone = new JButton("saxaphone", imageicon6);
  
  ImageIcon imageicon7 = new ImageIcon("DressShirt.jpg");
  JButton dressShirt = new JButton("dress shirt", imageicon7);
  
  ImageIcon imageicon8 = new ImageIcon("T-Shirt.jpg");
  JButton Tshirt = new JButton("T-shirt", imageicon8);
  
  ImageIcon imageicon9 = new ImageIcon("Cat.jpg");
  JButton cat = new JButton("cat", imageicon9);
  
  ImageIcon imageicon10 = new ImageIcon("Dog.jpg");
  JButton dog = new JButton("dog", imageicon10);
  
  JButton checkResult = new JButton("Check the result");
  
  JButton retake = new JButton("Take the test again");
  
 
  public NerdOrGeek() {
 
    initUI();
  }
 
  public void initUI() {
      	 
    statusbar = new JLabel("Hey intelligent people!"
    		+ " Take this simple test to find out whether you are a NERD or a GEEK.");
 
    statusbar.setBorder(BorderFactory
        .createEtchedBorder(EtchedBorder.RAISED));
    
    statusbar.setForeground(Color.MAGENTA);
    
    statusbar.setFont(new Font("Verdana", 5, 25));
 
    panel.setLayout(null);
 
    nerdGeek.setBounds(500, 100, 290, 520);
    nerdGeek.addActionListener(this);
    nerdGeek.setToolTipText("Click to start the test");
    
    soda.setBounds(200, 150, 350, 350);
    soda.addActionListener(this);
    soda.setToolTipText("Soda");
    soda.setActionCommand("Geek");
 
    coffee.setBounds(750, 150, 350, 350);
    coffee.setToolTipText("Coffee");
    coffee.addActionListener(this);
    coffee.setActionCommand("Nerd");
 
    loafers.setBounds(200, 150, 350, 350);
    loafers.setToolTipText("Loafers");
    loafers.addActionListener(this);
    loafers.setActionCommand("Nerd");
    
    sneakers.setBounds(750, 150, 350, 350);
    sneakers.setToolTipText("Sneakers");
    sneakers.addActionListener(this);
    sneakers.setActionCommand("Geek");
    
    guitar.setBounds(200, 150, 350, 350);
    guitar.setToolTipText("Guitar");
    guitar.addActionListener(this);
    guitar.setActionCommand("Geek");
   
    saxaphone.setBounds(750, 150, 350, 350);
    saxaphone.setToolTipText("Saxaphone");
    saxaphone.addActionListener(this);
    saxaphone.setActionCommand("Nerd");
    
    dressShirt.setBounds(200, 150, 350, 350);
    dressShirt.setToolTipText("Dress shirt");
    dressShirt.addActionListener(this);
    dressShirt.setActionCommand("Nerd");
    
    Tshirt.setBounds(750, 150, 350, 350);
    Tshirt.setToolTipText("T-shirt");
    Tshirt.addActionListener(this);
    Tshirt.setActionCommand("Geek");
    
    cat.setBounds(200, 150, 350, 350);
    cat.setToolTipText("Cat");
    cat.addActionListener(this);
    cat.setActionCommand("Nerd");
    
    dog.setBounds(750, 150, 350, 350);
    dog.setToolTipText("Dog");
    dog.addActionListener(this);
    dog.setActionCommand("Geek");
    
    checkResult.setBounds(500, 200, 200, 50);
    checkResult.setToolTipText("Click");
    checkResult.addActionListener(this);
    
    retake.setBounds(500, 200, 200, 50);
    retake.setToolTipText("Click");
    retake.addActionListener(this);
    
    panel.add(nerdGeek);
    
    add(panel);
    add(statusbar, BorderLayout.NORTH);
 
    setTitle("Nerd or Geek?");
    setSize(1350, 720);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
     
  }
 
 
    public void actionPerformed(ActionEvent e) {
       
      JButton o = (JButton) e.getSource();
      String label = o.getText();
      
      String actionCommand = e.getActionCommand();
      
      if (label == "NerdGeek") {
    	  panel.remove(nerdGeek);
          panel.add(soda);   
          panel.add(coffee);
          panel.revalidate();
          panel.repaint();
          
          statusbar.setText("Click on the one you like better.");
      
      }
            
      if (actionCommand == "Geek") {
    	  statusbar.setText("You like " + label + " better.");
    	  i++;
    	 
      }
      
      if (actionCommand == "Nerd") {
    	  statusbar.setText("You like " + label + " better.");
    	  i--;
    	  
      }
      
      System.out.println(i);
      
      
      if (label == "soda" || label == "coffee") {
    	  panel.remove(soda);
          panel.remove(coffee);
          panel.add(loafers);   
          panel.add(sneakers);
          panel.revalidate();
          panel.repaint();
      
      }
      
      if (label == "loafers" || label == "sneakers") {
          
          panel.remove(loafers);
          panel.remove(sneakers);
          panel.add(guitar);   
          panel.add(saxaphone);
          panel.revalidate();
          panel.repaint();
          
      }
      
      if (label == "guitar" || label == "saxaphone") {
          
          panel.remove(guitar);
          panel.remove(saxaphone);
          panel.add(dressShirt);   
          panel.add(Tshirt);
          panel.revalidate();
          panel.repaint();
       }
      
      if (label == "dress shirt" || label == "T-shirt") {
          
          panel.remove(dressShirt);
          panel.remove(Tshirt);
          panel.add(cat);   
          panel.add(dog);
          panel.revalidate();
          panel.repaint();
       }
      
      if (label == "cat" || label == "dog") {
          
          panel.remove(cat);
          panel.remove(dog);
          panel.add(checkResult);
          panel.revalidate();
          panel.repaint();
       }
      
      if (label == "Check the result") {
          
                   
          if (i == -5) {
        	  a = 100; b = 0;
          }
          
          if (i == -3) {
        	  a = 80; b = 20;
          }
          
          if (i == -1) {
        	  a = 60; b = 40;
          }
          
          if (i == 1) {
        	  a = 40; b = 60;
          }
          
          if (i == 3) {
        	  a = 20; b = 80;
          }
          
          if (i == 5) {
        	  a = 0; b = 100;
          }
          
          panel.remove(checkResult);
          panel.add(retake);
          
          panel.revalidate();
          panel.repaint();
          
          statusbar.setText("You are "+ a + "% Nerd and " + b + "% Geek!");
       }
      
      if (label == "Take the test again") {
    	  
    	  i=0;
    	  
    	  panel.remove(retake);
          panel.add(nerdGeek);   
          panel.revalidate();
          panel.repaint();
          
          statusbar.setText("Hey intelligent people!"
          		+ " Take this simple test to find out whether you are a NERD or a GEEK.");    
    	  
      } 
    } 
  
 
  public static void main(String[] args) {
 
    SwingUtilities.invokeLater(new Runnable() {
 
      public void run() {
         
    	NerdOrGeek ms = new NerdOrGeek();
        ms.setVisible(true);
         
      }
    });
  }
}
    
   