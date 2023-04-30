
package quizapp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener{
    
    JButton rules,back;
    JTextField tfname;
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setTitle("Java Quiz Game");
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image=new JLabel(i1);
        image.setBounds(0,0,600,500);
        add(image);
        
        
        JLabel heading=new JLabel("Sharp Mind");
        heading.setBounds(750, 60, 300, 45);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
        heading.setForeground(new Color(30,144,255));
        add(heading);
        JLabel name=new JLabel("Enter Your Name");
        name.setBounds(800, 170, 300, 20);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD,18));
        name.setForeground(new Color(30,144,255));
        add(name);
        
        JLabel cname=new JLabel("@All Right Server");
        cname.setBounds(850, 450, 300, 15);
        cname.setFont(new Font("Times New Roman",Font.ITALIC,11));
        
        add(cname);
        
         tfname=new JTextField();
        tfname.setBounds(735,200,300,25);
        tfname.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tfname);
        
         rules=new JButton("RULES");
        rules.setBounds(735,270,120,25);
        rules.setBackground(new Color(30,144,255));
         rules.setForeground(Color.WHITE);
         rules.addActionListener(this);
        add(rules);
         back=new JButton("BACK");
        back.setBounds(918,270,120,25);
        back.setBackground(new Color(30,144,255));
         back.setForeground(Color.WHITE);
          back.addActionListener(this);
        add(back);
        
        
        setSize(1200,500);
        setLocation(200,150);
        setVisible(true);
        
    }
    public static void main(String[] args) {
       new Login();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==rules){
            String name=tfname.getText();
            setVisible(false);
            new Rules(name).setVisible(true);
        }else if (ae.getSource()==back){
         setVisible(false);
    }

    }
}
