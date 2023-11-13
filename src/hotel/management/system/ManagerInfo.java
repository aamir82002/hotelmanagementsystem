package hotel.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import net.proteanit.sql.DbUtils;
import java.sql.*; 
public class ManagerInfo extends JFrame implements ActionListener{
    
    JTable t1;
    JButton b1,b2;
    
    ManagerInfo(){
        t1 = new JTable();
        t1.setBounds(0,40,1000,400);
        add(t1);
        
        JLabel l1=new JLabel("NAME");
        l1.setBounds(40,10,70,20);
        add(l1);
        
        JLabel l2=new JLabel("AGE");
        l2.setBounds(170,10,70,20);
        add(l2);
        
        JLabel l3=new JLabel("GENDER");
        l3.setBounds(280,10,70,20);
        add(l3);
        
        JLabel l4=new JLabel("JOB");
        l4.setBounds(410,10,70,20);
        add(l4);
        
        JLabel l5=new JLabel("SALARY");
        l5.setBounds(530,10,70,20);
        add(l5);
        
        JLabel l6=new JLabel("PHONE");
        l6.setBounds(650,10,70,20);
        add(l6);
        
        JLabel l7=new JLabel("EMAIL");
        l7.setBounds(780,10,70,20);
        add(l7);
        
        JLabel l8=new JLabel("ADHAAR");
        l8.setBounds(900,10,70,20);
        add(l8);
        
        b1 = new JButton("Load Info");
        b1.setBounds(350,530,120,30);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Back");
        b2.setBounds(530,530,120,30);
        b2.addActionListener(this);
        add(b2);
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setBounds(450,200,1020,700);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            try{
                conn c=new conn();
                String str="select * from employee where job = 'Manager'";
                ResultSet rs = c.s.executeQuery(str);
                
                t1.setModel(DbUtils.resultSetToTableModel(rs));
            }catch(Exception e){}
            
        }else if(ae.getSource()==b2){
            new Reception().setVisible(true);
            this.setVisible(false);
        }
        
    }
    public static void main(String[]args){
        new ManagerInfo().setVisible(true);
    }
    
}