package Ejemplo87;

import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.WindowConstants;

public class pepi {

    private JLabel etiquetaSu;
    private JPanel panelIzquierdo, panelInferior;
    private JButton    botonIn1, botonIn2;


    public void contruyePanelIzquierdo(){
        panelIzquierdo = new JPanel();
        JLabel boton=new JLabel("Selecciona el rango de tu edad");
        JRadioButton boton1=new JRadioButton("5-10");
        JRadioButton boton2=new JRadioButton("10-20");
        JRadioButton boton3=new JRadioButton("Enero");
        JRadioButton boton4=new JRadioButton("Febrero");
        JRadioButton boton5=new JRadioButton("Marzo");
        JRadioButton boton6=new JRadioButton("2000-2005");
        JRadioButton boton7=new JRadioButton("205-2010");
        JRadioButton boton8=new JRadioButton("2010-2015");     
        JLabel mes=new JLabel("Selecciona tu mes de nacimiento");
        JLabel año=new JLabel("Seleciona tu año de nacimiento");
        panelIzquierdo.setLayout(new BoxLayout(panelIzquierdo,BoxLayout.Y_AXIS));
        panelIzquierdo.setBackground(Color.white);
        panelIzquierdo.add(boton);
        panelIzquierdo.add(boton1);
        panelIzquierdo.add(boton2);
        panelIzquierdo.add(mes);
        panelIzquierdo.add(boton3);
        panelIzquierdo.add(boton4);
        panelIzquierdo.add(boton5);
        panelIzquierdo.add(año);
        panelIzquierdo.add(boton6);
        panelIzquierdo.add(boton7);
        panelIzquierdo.add(boton8);
    }



    public void contruyePanelInferior(){
        panelInferior = new JPanel();
        botonIn1=new JButton("Aceptar");
        botonIn2=new JButton("Cancelar");
        JLabel nombre = new JLabel("Hecho por:Raul Reynoso Santana");
        panelInferior.setLayout(new FlowLayout());
        panelInferior.setBackground(Color.green);
        panelInferior.add(nombre);
        panelInferior.add(botonIn1);
        panelInferior.add(botonIn2);
    }

    public void contruyeVentana(){
        JFrame frame = new JFrame();     
        etiquetaSu = new JLabel("Que personaje de caricatura eres?");
        Font aux=etiquetaSu.getFont();
        etiquetaSu.setFont(new Font(aux.getFontName(), aux.getStyle(), 20));
        frame.setLayout(new BorderLayout());


        frame.add(etiquetaSu,BorderLayout.NORTH);
       
        frame.add(panelIzquierdo,BorderLayout.CENTER);

        frame.add(panelInferior,BorderLayout.SOUTH);
      
        frame.pack();
        frame.setVisible(true);
        
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public pepi(){
        contruyePanelInferior();
        contruyePanelIzquierdo();
    
        contruyeVentana();
    }

    public static void main (String [] inforux){
        new pepi();
    }
}