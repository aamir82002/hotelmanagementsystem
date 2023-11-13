
package hotel.management.system;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;

public class Reception extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
    Reception(){
        b1 = new JButton("New Custumer");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(270,30,200,30);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Room");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(270,70,200,30);
        b2.addActionListener(this);
        add(b2);
        
        
        
        b3 = new JButton("Employee Detail");
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(270,110,200,30);
        b3.addActionListener(this);
        add(b3);
        
        b4 = new JButton("Custumer Details");
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.setBounds(270,150,200,30);
        b4.addActionListener(this);
        add(b4);
        
        b5 = new JButton("Manager Details");
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.WHITE);
        b5.setBounds(270,190,200,30);
        b5.addActionListener(this);
        add(b5);
        
        b6 = new JButton("Check Out");
        b6.setBackground(Color.BLACK);
        b6.setForeground(Color.WHITE);
        b6.setBounds(270,230,200,30);
        b6.addActionListener(this);
        add(b6);
        
        b7 = new JButton("Update Check Status");
        b7.setBackground(Color.BLACK);
        b7.setForeground(Color.WHITE);
        b7.setBounds(270,270,200,30);
        b7.addActionListener(this);
        add(b7);
        
        b8 = new JButton("Update Room Status");
        b8.setBackground(Color.BLACK);
        b8.setForeground(Color.WHITE);
        b8.setBounds(270,310,200,30);
        b8.addActionListener(this);
        add(b8);
        
       
        b9 = new JButton("Search Room");
        b9.setBackground(Color.BLACK);
        b9.setForeground(Color.WHITE);
        b9.setBounds(270,350,200,30);
        b9.addActionListener(this);
        add(b9);
        
        
        b10 = new JButton("Log Off");
        b10.setBackground(Color.BLACK);
        b10.setForeground(Color.WHITE);
        b10.setBounds(270,390,200,30);
        b10.addActionListener(this);    
        add(b10);
        
        
        
        
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setBounds(540,300,780,580);
        setVisible(true); 
    }
    public void actionPerformed(ActionEvent ea){
        if(ea.getSource()==b1){
            new AddCustomer().setVisible(true);
            this.setVisible(false);
        }else if(ea.getSource()== b2){
            new Room().setVisible(true);
            this.setVisible(false);
        
        }else if(ea.getSource()== b3){
            new EmployeeInfo().setVisible(true);
            this.setVisible(false);
            
        }else if(ea.getSource()== b4){
             new CustomerInfo().setVisible(true);
            this.setVisible(false);
            
        }else if(ea.getSource()== b5){
            new ManagerInfo().setVisible(true);
            this.setVisible(false);
            
        }else if(ea.getSource()== b6){
            new CheckOut().setVisible(true);
            this.setVisible(false);
            
        }else if(ea.getSource()== b7){
            new UpdateCheck().setVisible(true);
            this.setVisible(false);
            
        }else if(ea.getSource()== b8){
            new UpdateRoom().setVisible(true);
            this.setVisible(false);
            
        }else if(ea.getSource()== b9){
            new SearchRoom().setVisible(true);
             this.setVisible(false);
            
        }else if(ea.getSource()== b10){
            this.setVisible(false);
        
        }
    }
    public static void main(String[]args){
        new Reception().setVisible(true);
        
    }
    
}
