package Menus;

import javax.swing.JComboBox;
import javax.swing.JFrame;
 
public class Practica {
 
	Practica() {
        JFrame frame = new JFrame("JComboBox Example W3Adda");
         String language[]={"Java","Python","Android","PHP","Swift"};        
    JComboBox cb=new JComboBox(language);    
    cb.setBounds(50, 50,90,20);    
    frame.add(cb);        
    frame.setLayout(null);    
    frame.setSize(300,300);    
    frame.setVisible(true);       
    }
 
    public static void main(String[] args) {
        // TODO code application logic here
        new Practica();
    }
}