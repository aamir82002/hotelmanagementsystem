
package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class AddRoom extends JFrame implements ActionListener{
    JTextField t1,t2;
    JComboBox j1,j2,j3;
    JButton b1,b2;
    AddRoom(){
        JLabel l1= new JLabel("Add Room");
        l1.setFont(new Font("Tahoma",Font.BOLD,18));
        l1.setBounds(160,20,100,20);
        add(l1);
        
         JLabel room= new JLabel("Room Number");
        room.setFont(new Font("Tahoma",Font.PLAIN,14));
        room.setBounds(60,80,100,30);
        add(room);
        
        t1 = new JTextField();
        t1.setBounds(200,80,150,30);
        add(t1);
        
         JLabel available= new JLabel("Availablility");
        available.setFont(new Font("Tahoma",Font.PLAIN,14));
        available.setBounds(60,130,80,30);
        add(available);
        
        j1 = new JComboBox(new String[]{"Available","Not Available"});
        j1.setBounds(200,130,150,30);
        add(j1);
        
        JLabel price= new JLabel("Price");
        price.setFont(new Font("Tahoma",Font.PLAIN,14));
        price.setBounds(60,180,80,30);
        add(price);
        
        t2 = new JTextField();
        t2.setBounds(200,180,150,30);
        add(t2);
        
        JLabel type= new JLabel("Bed Type");
        type.setFont(new Font("Tahoma",Font.PLAIN,14));
        type.setBounds(60,230,80,30);
        add(type);
        
        j2 = new JComboBox(new String[]{"Single","Double","Triple"});
        j2.setBounds(200,230,150,30);
        add(j2);
        
        
        JLabel status= new JLabel("Maintainance");
        status.setFont(new Font("Tahoma",Font.PLAIN,14));
        status.setBounds(60,280,80,30);
        add(status);
        
        j3 = new JComboBox(new String[]{"Cleaned","Dirty"});
        j3.setBounds(200,280,150,30);
        add(j3);
        
         b1 = new JButton("Add Room");
         b1.addActionListener(this);
         b1.setBackground(Color.GREEN);
         b1.setForeground(Color.BLACK);
         b1.setBounds(60,330,130,30);
         add(b1);
         
         b2 = new JButton("Cancel");
         b2.addActionListener(this);
         b2.setBackground(Color.RED);
         b2.setForeground(Color.WHITE);
         b2.setBounds(230,330,130,30);
         add(b2);
         
         getContentPane().setBackground(Color.YELLOW);
        
        
        
        setBounds(700,340,430,500);
        setLayout(null);
        setVisible(true);
    }
   
     public void actionPerformed(ActionEvent ae){
         if(ae.getSource()==b1){
             
             String room=t1.getText();
             String available=(String)j1.getSelectedItem();
             String price=t2.getText();
             String type=(String)j2.getSelectedItem();
             String status=(String)j3.getSelectedItem();
             
             conn c = new conn();
             try{
                 String str ="insert into room values('"+room+"','"+available+"','"+status+"','"+price+"','"+type+"')";
                 c.s.executeUpdate(str);
                 JOptionPane.showMessageDialog(null,"New Room Added Successfully");
                 this.setVisible(false);
             }catch(Exception e){
                 System.out.println(e);
                 
             }
             
         }else if(ae.getSource()==b2){
             this.setVisible(true);
         }
     }
    public static void main(String[]args){
        
        new AddRoom().setVisible(true);
    }
    
}

