
package quizapp;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Score extends JFrame implements ActionListener {
    JLabel heading,lblscore;
    JButton submit;
    Score(String name,int score){
         getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setTitle("Score");
        setBounds(400,150 ,750,550);
        
         ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2=i1.getImage().getScaledInstance(300,200,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
         JLabel image=new JLabel(i3);
        image.setBounds(0,200,300,250);
        add(image);
        
         heading=new JLabel("Thankyou "+name+ " for Playing");
        heading.setBounds(200, 30, 700, 30);
          heading.setForeground(new Color(30,144,255));
        heading.setFont(new Font("Tahoma",Font.BOLD,25));
        add(heading);
         lblscore=new JLabel("Your score is "+score);
          lblscore.setForeground(new Color(30,144,255));
        lblscore.setBounds(350, 200, 300, 30);
        lblscore.setFont(new Font("Times New Roman",Font.BOLD,25));
        add(lblscore);
 
        
        
        
         submit=new JButton("Exit");
        submit.setBounds(380, 270, 120, 30);
        submit.setBackground(new Color(30,144,255));
        submit.setFont(new Font("Times New Roman",Font.PLAIN,17));
         submit.setForeground(Color.WHITE);
         submit.addActionListener(this);
         
        add(submit);
       setVisible(true);
    }
    
    public static void main(String[] args) {
        new Score("User",0);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
      setVisible(false);
      
    }
}
