import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Login extends JFrame implements ActionListener{
 
    JButton rules, back;
    JTextField tfname,tfroll;
    
    Login() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 600, 500);
        add(image);
        
        JLabel heading = new JLabel("Quiz Test For JAVA");
        heading.setBounds(750, 60, 400, 45);
        heading.setFont(new Font("Ariel", Font.BOLD, 40));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);
        
        JLabel name = new JLabel("Enter your name:");
        name.setBounds(650, 150, 300, 20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        name.setForeground(new Color(30, 144, 254));
        add(name);
        
        JLabel roll = new JLabel("Enter your Roll No.");
        roll.setBounds(650, 200, 300, 20);
        roll.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        roll.setForeground(new Color(30, 144, 254));
        add(roll);
        
        tfname = new JTextField();
        tfname.setBounds(835, 150, 300, 25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(tfname);
        
        tfroll = new JTextField();
        tfroll.setBounds(835, 200, 300, 25);
        tfroll.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(tfroll);
        
        rules = new JButton("Rules");
        rules.setBounds(735, 270, 120, 25);
        rules.setBackground(new Color(30, 144, 254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(915, 270, 120, 25);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setSize(1200, 500);
        setLocation(200, 150);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == rules) {
            String name = tfname.getText();
            String roll = tfroll.getText();
            dispose();
            new Rules(name,roll);
        } else if (ae.getSource() == back) {
            setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        new Login();
    }
}