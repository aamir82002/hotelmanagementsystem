
package hotel.management.system;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import java .awt.*;
import java.sql.*;
import java.util.Set;
public class UpdateRoom extends JFrame implements ActionListener{
    Choice c1;
    JButton b1,b2,b3;
    JTextField t1,t2,t3;
    UpdateRoom(){
        JLabel l1 = new JLabel("UPDATE ROOM STATUS");
        l1.setFont(new Font("Tahoma", Font.PLAIN,25));
        l1.setBounds(20,30,300,30);
        add(l1);
        
        JLabel l2 = new JLabel("GUEST ID");
        l2.setBounds(20,80,120,30);
        add(l2);
        c1 = new Choice();
        
        try{
            conn c = new conn();
            ResultSet rs =c.s.executeQuery("select * from customer");
            while(rs.next()){
                c1.add(rs.getString("number"));
            }
        }catch(Exception e){}
        
        c1.setBounds(200,80,150,25);
        add(c1);
        
        JLabel l3 = new JLabel("ROOM NUMBER");
        l3.setBounds(20,130,120,30);
        add(l3);
        
        t1= new JTextField();
        t1.setBounds(200,130,150,25);
        add(t1);
        
        JLabel l4 = new JLabel("AVAILABILITY");
        l4.setBounds(20,180,120,30);
        add(l4);
        
        t2= new JTextField();
        t2.setBounds(200,180,150,25);
        add(t2);
        
        JLabel l5 = new JLabel("CLEAN STATUS");
        l5.setBounds(20,230,120,30);
        add(l5);
        
        t3= new JTextField();
        t3.setBounds(200,230,150,25);
        add(t3);
        
        b1 = new JButton("Check");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(130,300,120,30);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Update");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(40,350,120,30);
        b2.addActionListener(this);
        add(b2);
        
        b3 = new JButton("Back");
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(220,350,120,30);
        b3.addActionListener(this);
        add(b3);
        
        
        
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setBounds(500,200,700,500);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            String room=null;
            String s1 = c1.getSelectedItem();
            conn c =new conn();
            try{
            ResultSet rs=c.s.executeQuery("select * from customer where number = '"+s1+"'");
            
            while(rs.next()){
                t1.setText(rs.getString("room"));
                room=rs.getString("room");
            }
            ResultSet rs2=c.s.executeQuery("select * from room where room = '"+room+"'");
            while(rs2.next()){
                
                t2.setText(rs2.getString("available"));
                t3.setText(rs2.getString("status"));
            }
            
            
            }catch(Exception e){
            System.out.println(e);
            }
            
            
        }else if(ae.getSource()==b2){
            
            
            try{
                conn c = new conn();
                String room=t1.getText();
                String available=t2.getText();
                String status=t3.getText();
                
                String str = "update room set available = '"+available+"', status ='"+status+"' where room = '"+room+"'";
                c.s.executeUpdate(str);
                JOptionPane.showMessageDialog(null, "Room updated sucessfully");
                new Reception().setVisible(true);
                this.setVisible(false);
            }catch(Exception e){
                
            }
            
        }else if(ae.getSource()==b3){
            new Reception().setVisible(true);
            this.setVisible(false);
        }
 
        
    }
    public static void main(String[]args){
        
        new UpdateRoom().setVisible(true);
            
        }
    
    
}
