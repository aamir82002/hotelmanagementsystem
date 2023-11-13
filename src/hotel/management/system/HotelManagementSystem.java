package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class HotelManagementSystem extends JFrame implements ActionListener{
    
    HotelManagementSystem(){
     setBounds(300,120,1280,853); 
    
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/first.jpg"));
        JLabel l1 = new JLabel(i1);
        l1.setBounds(0,0,1280,853);
        add(l1);
        JLabel l2 = new JLabel("HOTEL MANAGEMENT SYSTEM");
        l2.setBounds(240,20,1000,70);
        l2.setForeground(Color.BLACK);
        l2.setFont(new Font("serif",Font.PLAIN,50));
        l1.add(l2);
        JButton b1 = new JButton("NEXT");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(530,660,150,50);
        b1.addActionListener(this);
        l1.add(b1);
        
        
        setLayout(null);
        setVisible(true);
        while(true){
            l2.setVisible(false);
            try{
                Thread.sleep(500);
            }catch(Exception e){
                
            }
            l2.setVisible(true);
            try{
            Thread.sleep(500);
               
                }catch(Exception e){}
        
                
            }
        }
     public void actionPerformed(ActionEvent ae){
         new Login().setVisible(true);
         this.setVisible(false);
     }

    public static void main(String[] args) {
        new HotelManagementSystem();
        
    }
    
}
