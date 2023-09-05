
package bank.management.system;

/**
 *
 * @author MAYANK SHARMA
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PinChange extends JFrame implements ActionListener {
    String pinnumber;
    JButton back,change;
    JPasswordField pin,repin;
    PinChange(String pinnumber){
        this.pinnumber=pinnumber;
        
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900,900 ,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text=new JLabel("Change your pin");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD,16));
        text.setBounds(250,300,320,20);
        image.add(text);
        
        JLabel pintext=new JLabel("New PIN");
        pintext.setForeground(Color.WHITE);
        pintext.setFont(new Font("System", Font.BOLD,16));
        pintext.setBounds(170,350,100,20);
        image.add(pintext);
        
        pin=new JPasswordField();
        pin.setFont(new Font("System", Font.BOLD,16));
        pin.setBounds(300,350,50,20);
        image.add(pin);
        
        
        JLabel repinn=new JLabel("Enetr pin again");
        repinn.setForeground(Color.WHITE);
        repinn.setFont(new Font("System", Font.BOLD,16));
        repinn.setBounds(170,400,320,20);
        image.add(repinn);
        
        repin=new JPasswordField();
        repin.setFont(new Font("System", Font.BOLD,16));
        repin.setBounds(300,400,50,20);
        image.add(repin);
        
        
        
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
         
        
        change =new JButton("CHANGE");
        change.setBounds(355,480,150,30);
        change.addActionListener(this);
        image.add(change);
        
        
        
        back =new JButton("BACK");
        back.setBounds(355,520,150,30);
        back.addActionListener(this);
        image.add(back);
        

        
        
        
    
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== back){
            setVisible(false);
            new Transaction(pinnumber).setVisible(true);
        }else{
        
            try{
                String npin=pin.getText();
                String rpin=repin.getText();
                if(npin.equals("")){
                    JOptionPane.showMessageDialog(null,"PIN cannot be null");
                    return;
                }
                
                if(rpin.equals("")){
                    JOptionPane.showMessageDialog(null,"RE-PIN cannot be null");
                    return;
                }
                if(!npin.equals(rpin)){
                    JOptionPane.showMessageDialog(null,"Entered PIN dosent Match");
                    return;
                }
                
                Conn c=new Conn();
                String query1="update bank set pin='"+rpin+"' where pin='"+pinnumber+"'";
                String query2="update login set pin='"+rpin+"' where pin='"+pinnumber+"'";
                String query3="update signupthree set pin='"+rpin+"' where pin='"+pinnumber+"'";
                
                c.s.executeUpdate(query1);
                c.s.executeUpdate(query2);
                c.s.executeUpdate(query3);
                
                JOptionPane.showMessageDialog(null,"PIN changes successfully");
                
                setVisible(false);
                new Transaction(rpin).setVisible(true);
            }catch(Exception e){
                System.out.println(e);
            }
        }
        
        
    }
    public static void main(String[] args) {
        new PinChange("").setVisible(true);
    }
}
