
package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class AddEmployee extends JFrame implements ActionListener{
    JTextField t1,t2,t3,t4,t5,t6,t7;
    JRadioButton r1,r2,r3;
    JButton b;
    JComboBox c1;
    AddEmployee(){
        JLabel name= new JLabel("NAME");
        name.setFont(new Font("Tahoma",Font.PLAIN,17));
        name.setBounds(60,30,120,30);
        add(name);
        
        t1 = new JTextField();
        t1.setBounds(200,30,120,30);
        add(t1);
        
        JLabel age= new JLabel("AGE");
        age.setFont(new Font("Tahoma",Font.PLAIN,17));
        age.setBounds(60,70,120,30);
        add(age);
        
        t2 = new JTextField();
        t2.setBounds(200,70,120,30);
        add(t2); 
        
         JLabel gender= new JLabel("GENDER");
        gender.setFont(new Font("Tahoma",Font.PLAIN,17));
        gender.setBounds(60,110,120,30);
        add(gender);
        r1 = new JRadioButton("M");
        r1.setFont(new Font("Tahoma",Font.PLAIN,14));
        r1.setBounds(187,110,60,30);
        add(r1);
       
         r2 = new JRadioButton("F");
        r2.setFont(new Font("Tahoma",Font.PLAIN,14));
        r2.setBounds(243,110,60,30);
        add(r2);
        
          r3 = new JRadioButton("T");
        r3.setFont(new Font("Tahoma",Font.PLAIN,14));
        r3.setBounds(299,110,60,30);
        add(r3);
        
        
         JLabel job= new JLabel("JOB");
        job.setFont(new Font("Tahoma",Font.PLAIN,17));
        job.setBounds(60,150,120,30);
        add(job);
        String str[]={"Manager","Accountant","Chef","Kitchen helper","Waiter/Waitress","Clerk","Security","House keeping","Room service",};
        c1=new JComboBox(str);
        c1.setBounds(200,150,120,30);
        add(c1);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/employee.jpg"));
        Image i2 = i1.getImage().getScaledInstance(420, 410,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); 
	JLabel l1 = new JLabel(i3);
	l1.setBounds(380, 10, 450, 600); 
        add(l1);
        
        JLabel pay= new JLabel("SALARY");
        pay.setFont(new Font("Tahoma",Font.PLAIN,17));
        pay.setBounds(60,190,120,30);
        add(pay);
        t3 = new JTextField();
        t3.setBounds(200,190,120,30);
        add(t3);
        
        JLabel phone= new JLabel("PHONE");
        phone.setFont(new Font("Tahoma",Font.PLAIN,17));
        phone.setBounds(60,230,120,30);
        add(phone);
        t4 = new JTextField();
        t4.setBounds(200,230,120,30);
        add(t4);
       
        
        JLabel email= new JLabel("EMAIL");
        email.setFont(new Font("Tahoma",Font.PLAIN,17));
        email.setBounds(60,270,120,30);
        add(email);
        t5 = new JTextField();
        t5.setBounds(200,270,120,30);
        add(t5);
       
       JLabel adhaar= new JLabel("ADHAAR");
        adhaar.setFont(new Font("Tahoma",Font.PLAIN,17));
        adhaar.setBounds(60,310,120,30);
        add(adhaar);
        t6 = new JTextField();
        t6.setBounds(200,310,120,30);
        add(t6);
        JLabel l2 = new JLabel("EMPLOYEE DETAILS ADDITION PANEL");
        l2.setForeground(Color.MAGENTA);
        l2.setBounds(420,30,400,20);
        l2.setFont(new Font("Tahoma",Font.PLAIN,20));
        add(l2);
         
        b = new JButton("SUBMIT");
        b.setBackground(Color.GREEN);
        b.setForeground(Color.BLACK);
        b.setBounds(130,420,120,30);
        b.addActionListener(this);
        add(b);
       
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setBounds(500,400,900,700);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
         String name = t1.getText();
         String age = t2.getText();
         String salary = t3.getText();
         String phone= t4.getText();
         String email = t4.getText();
         String adhaar = t6.getText();
         
         String gender=null;
         if(r1.isSelected()){
             gender = "M";
         }else if(r2.isSelected()){
             gender ="F";
         }else if(r3.isSelected()){
             gender ="T";
         }
               
         String job = (String)c1.getSelectedItem();
          
         conn c =new conn();
         String str="insert into employee values('"+name+"','"+age+"','"+gender+"','"+job+"','"+salary+"','"+phone+"','"+email+"','"+adhaar+"')";
         
         try{
           c.s.executeUpdate(str);
           JOptionPane.showMessageDialog(null,"Employee has been added");
           this.setVisible(false);
          
         }catch(Exception e){
             
         }
    }
    public static void main(String[]args){
        new AddEmployee().setVisible(true);
        
    }
    
}
