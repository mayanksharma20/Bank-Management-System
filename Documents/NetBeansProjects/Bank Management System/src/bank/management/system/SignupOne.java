
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;

public class SignupOne extends JFrame {
    JTextField nameTextField,fnameTextField,emailTextField,addressTextField,cityTextField ,stateTextField,pinTextField;
    JDateChooser dateChooser;
    JRadioButton male,female,married,unmarried,other;
    ButtonGroup gendergroup,maritalgroup;
    JButton next;
    
    SignupOne(){
        Random ran=new Random();
        long random=Math.abs(ran.nextLong()%9000L + 1000L);
        
        
        JLabel formno=new JLabel("APPLICATION FORM NO: "+random);
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);
        
        
        JLabel personDetails=new JLabel("Page 1: Personal Details ");
        personDetails.setFont(new Font("Raleway",Font.BOLD,22));
        personDetails.setBounds(290,80,400,30);
        add(personDetails);
        
        //name
        JLabel name=new JLabel("Name: ");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);
        
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.BOLD,16));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);
        
        //father name
        JLabel fname=new JLabel("Father's Name: ");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,150,30);
        add(fname);
        
        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway",Font.BOLD,16));
        fnameTextField.setBounds(300,190,400,30);
        add(fnameTextField);
        
        
        //DOB
        JLabel dob=new JLabel("Date of Birth: ");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,150,30);
        add(dob);
        
      
        dateChooser=new JDateChooser();
        dateChooser.setBounds(300,240,400,30);
        dateChooser.setForeground(Color.BLACK);
        add(dateChooser);
        
        
        //gender
        JLabel gender=new JLabel("Gender: ");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290,150,30);
        add(gender);
        
        male=new JRadioButton("Male");
        male.setBounds(300,290,60,30);
        male.setBackground(Color.WHITE);
        add(male);
        
        female=new JRadioButton("Female");
        female.setBounds(380,290,120,30);
        female.setBackground(Color.WHITE);
        add(female);
        
        gendergroup=new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        
        //email
        JLabel email=new JLabel("Email Address: ");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,340,150,30);
        add(email);
        
        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway",Font.BOLD,16));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);
        
        //Marital Status
        JLabel marital=new JLabel("Marital Status: ");
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100,390,150,30);
        add(marital);
        
        married=new JRadioButton("Married");
        married.setBounds(300,390,80,30);
        married.setBackground(Color.WHITE);
        add(married);
        
        unmarried=new JRadioButton("Unmarried");
        unmarried.setBounds(400,390,100,30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
        other=new JRadioButton("Other");
        other.setBounds(520,390,80,30);
        other.setBackground(Color.WHITE);
        add(other);
        
        maritalgroup=new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        maritalgroup.add(other);
        
        
        //address
        JLabel address=new JLabel("Address: ");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,440,150,30);
        add(address);
        
        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway",Font.BOLD,16));
        addressTextField.setBounds(300,440,400,30);
        add(addressTextField);
        
        //city
        JLabel city=new JLabel("City: ");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,490,150,30);
        add(city);
        
        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway",Font.BOLD,16));
        cityTextField.setBounds(300,490,400,30);
        add(cityTextField);
        
        //state
        JLabel state=new JLabel("State: ");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,150,30);
        add(state);
        
        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway",Font.BOLD,16));
        stateTextField.setBounds(300,540,400,30);
        add(stateTextField);
        
        
        //pincode
        JLabel pincode=new JLabel("Pin Code: ");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100,590,150,30);
        add(pincode);
        
        pinTextField = new JTextField();
        pinTextField.setFont(new Font("Raleway",Font.BOLD,16));
        pinTextField.setBounds(300,590,400,30);
        add(pinTextField);
        
        
        next=new JButton("NEXT");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,640,80,30);
        add(next);
        
        
        
        setLayout(null);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new SignupOne();
    }
}