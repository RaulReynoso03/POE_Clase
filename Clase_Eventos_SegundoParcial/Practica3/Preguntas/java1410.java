package Preguntas;

import java.awt.*;
import java.awt.event.*;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class java1410 extends JPanel {
  static Icon imgs[] = {
    new ImageIcon( "star0.gif" ),
    new ImageIcon( "star1.gif" ),
    new ImageIcon( "star2.gif" ),
    new ImageIcon( "star3.gif" ),
    new ImageIcon( "star4.gif" ),
  };
  JButton boton = new JButton( "JButton",imgs[3] );
  JButton boton2 = new JButton( "Deshabilita" );
  boolean mad = false;
  
  public java1410() {
    boton.addActionListener( new ActionListener() {
      public void actionPerformed( ActionEvent evt ){
	if( mad ) {
	  boton.setIcon( imgs[3] );
	  mad = false;
	} 
	else {
	  boton.setIcon( imgs[0] );
	  mad = true;
	}
	boton.setVerticalAlignment( JButton.TOP );
	boton.setHorizontalAlignment( JButton.LEFT );
      }
    } );
    boton.setRolloverEnabled( true );
    boton.setRolloverIcon( imgs[1] );
    boton.setPressedIcon( imgs[2] );
    boton.setDisabledIcon( imgs[4] );
    boton.setToolTipText( "AleHop!" );
    add( boton );
    
    boton2.addActionListener( new ActionListener() {
      public void actionPerformed( ActionEvent evt ){
	if( boton.isEnabled() ) {
	  boton.setEnabled( false );
	  boton2.setText( "Habilita" );
	} 
	else {
	  boton.setEnabled( true );
	  boton2.setText( "Deshabilita" );
	}
      }
    } );
    add( boton2 );
  }
  
  public static void main( String args[] ) {
    java1410 boton = new java1410();
    JFrame ventana = new JFrame();
    
    ventana.getContentPane().add( boton,BorderLayout.CENTER );
    
    ventana.addWindowListener( new WindowAdapter() {
      public void windowClosing( WindowEvent evt ) {
	System.exit( 0 );
      }
    } );
    
    ventana.setSize( 300,200 );
    ventana.setTitle( "Tutorial de Java, Swing" );
    ventana.setVisible( true );
  }
} 

