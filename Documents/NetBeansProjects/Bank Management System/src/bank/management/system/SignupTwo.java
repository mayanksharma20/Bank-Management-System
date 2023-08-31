


package bank.management.system;

import javax.swing.*;
import java.awt.*;


import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener{

    JTextField panTextField,aadharTextField;
    JComboBox religion,category,income,education,occupation;
    JRadioButton syes,sno,eyes,eno;
    ButtonGroup seniorgroup,existinggroup;
    String formno;
    JButton next;
    
    SignupTwo(String formno){
        
        setLayout(null);
        this.formno=formno;
        
        setTitle("NEW ACCOUNT APPLICATION FORM- PAGE 2");
        
        
        JLabel additionalDetails=new JLabel("Page 2: Additional Details ");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);
        
        //religion
        JLabel religionn=new JLabel("Religion: ");
        religionn.setFont(new Font("Raleway",Font.BOLD,20));
        religionn.setBounds(100,140,100,30);
        add(religionn);
    
        
        String valReligion[]={"","Hindu","Muslim","Sikh","Christian","Other"};
        
        religion= new JComboBox(valReligion);
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
        //Category
        JLabel fname=new JLabel("Category: ");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,150,30);
        add(fname);
        
        String valcategory[]={"","General","OBC","SC","ST","Other"};
        
        category= new JComboBox(valcategory);
        category.setBounds(300,190,400,30);
        category.setBackground(Color.WHITE);
        add(category);
        
               
        //income
        JLabel dob=new JLabel("Income: ");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,150,30);
        add(dob);
        
        String valincome[]={"","NULL","< 1,50,000","< 2,50,000","< 5,00,000","Upto 10,00,000"};
        
        income= new JComboBox(valincome);
        income.setBounds(300,240,400,30);
        income.setBackground(Color.WHITE);
        add(income);
        
      
        
        //Educational
        JLabel gender=new JLabel("Educational ");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);
        
        
        JLabel email=new JLabel("Qualification: ");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,315,200,30);
        add(email);
        
        String valeducation[]={"","Non-Graduate","Graduate","Post Graduate"};
        
        education= new JComboBox(valeducation);
        education.setBounds(300,310,400,30);
        education.setBackground(Color.WHITE);
        add(education);
        
        

        
        //Occupation
        JLabel marital=new JLabel("Occupation: ");
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100,390,150,30);
        add(marital);
        
        String valoccupation[]={"","Un-employeed","Salaried","Self-Employeed","Business","Student","Retired","Others"};
        
        occupation= new JComboBox(valoccupation);
        occupation.setBounds(300,390,400,30);
        occupation.setBackground(Color.WHITE);
        add(occupation);
        
        
        //pan
        JLabel address=new JLabel("Pan No: ");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,440,150,30);
        add(address);
        
        panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway",Font.BOLD,16));
        panTextField.setBounds(300,440,400,30);
        add(panTextField);
        
        
        
        //Aadhar
        JLabel city=new JLabel("Aadhar No: ");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,490,150,30);
        add(city);
        
        aadharTextField = new JTextField();
        aadharTextField.setFont(new Font("Raleway",Font.BOLD,16));
        aadharTextField.setBounds(300,490,400,30);
        add(aadharTextField);
        
        
        
        //senior citizen
        JLabel state=new JLabel("Senior Citizen: ");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,150,30);
        add(state);
        
        sno=new JRadioButton("No");
        sno.setBounds(300,540,60,30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        syes=new JRadioButton("Yes");
        syes.setBounds(380,540,120,30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        seniorgroup=new ButtonGroup();
        seniorgroup.add(sno);
        seniorgroup.add(syes);
        

        
        
        //existing account
        JLabel pincode=new JLabel("Existing Account: ");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100,590,150,30);
        add(pincode);
        
        eno=new JRadioButton("No");
        eno.setBounds(300,590,60,30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        eyes=new JRadioButton("Yes");
        eyes.setBounds(380,590,120,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        existinggroup=new ButtonGroup();
        existinggroup.add(eno);
        existinggroup.add(eyes);
        
        
        
        //button
        next=new JButton("NEXT");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,640,80,30);
        next.addActionListener(this);
        add(next);
        
        
        
        
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        
        
        String sreligion=(String) religion.getSelectedItem();
        
        String scategory=(String) category.getSelectedItem();
        
        String sincome=(String) income.getSelectedItem();
        
        String seducation=(String) education.getSelectedItem();
        
        String soccupation=(String) occupation.getSelectedItem(); 
        
        String span=panTextField.getText();
        
        String saadhar=aadharTextField.getText();
        
        String seniorcitizen=null;
        if(syes.isSelected()){
            seniorcitizen="Yes";
        }else if(sno.isSelected()){
            seniorcitizen="No";
        }
        
        
        String existingaccount=null;
        if(eyes.isSelected()){
            existingaccount="Yes";
        }else if(eno.isSelected()){
            existingaccount="No";
        }
      
        
        try{
            //validation
            if(span.equals("")){
                JOptionPane.showMessageDialog(null,"Pan number is Required");
            } else{
                Conn c=new Conn();
                String query="insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+seniorcitizen+"','"+existingaccount+"')";
                c.s.executeUpdate(query);
                
                //signup3
                setVisible(false);
                new SignupThree(formno).setVisible(true);
                
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        new SignupTwo("");
    }
}
