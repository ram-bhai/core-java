

//import java.awt.event.*;        
import javax.swing.*;
import java.awt.*;

    class DrawCircle extends JFrame {

    public DrawCircle(){
        setTitle("Drawing a Circle");
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBackground(Color.GREEN);
    }

   // @Override
    public void paint(Graphics g) {
        // g.setBackground(Color.BLUE);
        //draw grid 
        g.drawLine(500,185,500,650);
        g.drawLine(1000,185,1000,650);
        g.drawLine(500,185,1000,185);
        g.drawLine(750,185,600,70);
        g.drawLine(750,185,900,70);
        g.drawLine(600,70,900,70);
        g.drawLine(750,185,750,70);
        g.drawLine(660,115,840,115);
        //second grid
        g.drawLine(500,650,1000,650);
        g.drawLine(750,650,600,765);
        g.drawLine(750,650,900,765);
        g.drawLine(600,765,900,765);
        g.drawLine(750,765,750,650);
        g.drawLine(660,720,840,720);
        g.drawLine(625,185,625,650);
        g.drawLine(750,185,750,650);
        g.drawLine(875,185,875,650);
        //g.drawLine(450,185,450,650);
        g.drawLine(500,420,1000,420);
        g.drawLine(500,300,1000,300);
        g.drawLine(500,535,1000,535);
        g.drawLine(500,185,1000,650);
        g.drawLine(1000,185,500,650);
        g.drawLine(750,185,500,420);
        g.drawLine(500,420,750,650);
        g.drawLine(750,650,1000,420);
        g.drawLine(1000,420,750,185);
       // g.setColor(Color.BLACK);
       //draw circle
        g.setColor(Color.RED);
        g.fillOval(495,180,15,15);
        g.drawOval(495,180,15,15);
        
        g.setColor(Color.RED);
        g.fillOval(620,180,15,15);
        g.drawOval(620,180,15,15);
        
        g.setColor(Color.RED);
        g.fillOval(745,180,15,15);
        g.drawOval(745,180,15,15);
        
        g.setColor(Color.RED);
        g.fillOval(870,180,15,15);
        g.drawOval(870,180,15,15);
        
        g.setColor(Color.RED);
        g.fillOval(995,180,15,15);
        g.drawOval(995,180,15,15);
        
        g.setColor(Color.RED);
        g.fillOval(495,295,15,15);
        g.drawOval(495,295,15,15);
       
        g.setColor(Color.RED);
        g.fillOval(620,295,15,15);
        g.drawOval(620,295,15,15);
        
        g.setColor(Color.RED);
        g.fillOval(745,295,15,15);
        g.drawOval(745,295,15,15);
        
        g.setColor(Color.RED);
        g.fillOval(870,295,15,15);
        g.drawOval(870,295,15,15);
        
        g.setColor(Color.RED);
        g.fillOval(995,295,15,15);
        g.drawOval(995,295,15,15);
        
        //trian gle 
        g.setColor(Color.RED);
        g.fillOval(745,65,15,15);
        g.drawOval(745,65,15,15);
        
        g.setColor(Color.RED);
        g.fillOval(595,65,15,15);
        g.drawOval(595,65,15,15);
        
        g.setColor(Color.RED);
        g.fillOval(895,65,15,15);
        g.drawOval(895,65,15,15);
        
        g.setColor(Color.RED);
        g.fillOval(655,110,15,15);
        g.drawOval(655,110,15,15);

        g.setColor(Color.RED);
        g.fillOval(745,110,15,15);
        g.drawOval(745,110,15,15);
        
        g.setColor(Color.RED);
        g.fillOval(835,110,15,15);
        g.drawOval(835,110,15,15);
        
        //drwa down circle
        g.setColor(Color.BLUE);
        g.fillOval(495,645,15,15);
        g.drawOval(495,645,15,15);
        
        g.setColor(Color.BLUE);
        g.fillOval(620,645,15,15);
        g.drawOval(620,645,15,15);
        
        g.setColor(Color.BLUE);
        g.fillOval(745,645,15,15);
        g.drawOval(745,645,15,15);
        
        g.setColor(Color.BLUE);
        g.fillOval(870,645,15,15);
        g.drawOval(870,645,15,15);
        
        g.setColor(Color.BLUE);
        g.fillOval(995,645,15,15);
        g.drawOval(995,645,15,15);
        
        g.setColor(Color.BLUE);
        g.fillOval(495,530,15,15);
        g.drawOval(495,530,15,15);
        
        g.setColor(Color.BLUE);
        g.fillOval(620,530,15,15);
        g.drawOval(620,530,15,15);
        
        g.setColor(Color.BLUE);
        g.fillOval(745,530,15,15);
        g.drawOval(745,530,15,15);
        
        g.setColor(Color.BLUE);
        g.fillOval(870,530,15,15);
        g.drawOval(870,530,15,15);
        
        g.setColor(Color.BLUE);
        g.fillOval(995,530,15,15);
        g.drawOval(995,530,15,15);
        
        //draw down rectangle
        g.setColor(Color.BLUE);
        g.fillOval(745,760,15,15);
        g.drawOval(745,760,15,15);
        
        g.setColor(Color.BLUE);
        g.fillOval(745,715,15,15);
        g.drawOval(745,715,15,15);
        
        g.setColor(Color.BLUE);
        g.fillOval(840,715,15,15);
        g.drawOval(840,715,15,15);
        
        g.setColor(Color.BLUE);
        g.fillOval(645,715,15,15);
        g.drawOval(645,715,15,15);
        
        g.setColor(Color.BLUE);
        g.fillOval(745,715,15,15);
        g.drawOval(745,715,15,15);
        
        g.setColor(Color.BLUE);
        g.fillOval(595,760,15,15);
        g.drawOval(595,760,15,15);
        
        g.setColor(Color.BLUE);
        g.fillOval(895,760,15,15);
        g.drawOval(895,760,15,15);
    }

    public static void main(String[] args) {

       DrawCircle d1 = new DrawCircle();
       d1.paint(null);

    }
 }

    

    
