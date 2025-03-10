package latihan_kuis_49;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Login extends JFrame {
    
    JPanel panel = new JPanel();
    JPanel userPanel = new JPanel();
    JPanel pwPanel = new JPanel();
    JPanel loginPanel = new JPanel();
    
    JLabel labelUser = new JLabel("Username : ");
    JTextField formUser = new JTextField(20);
    
    JLabel labelPass = new JLabel("Password : ");
    JPasswordField formPass = new JPasswordField(20);
    
    JButton buttonlogin = new JButton("Login");
    
    public Login(){
        setTitle("Login");
        setSize(400, 200);
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);
        
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        
        userPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        userPanel.add(labelUser);
        userPanel.add(formUser);
        
        pwPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        pwPanel.add(labelPass);
        pwPanel.add(formPass);
        
        loginPanel.add(buttonlogin);
        
        panel.add(userPanel);
        panel.add(pwPanel);
        panel.add(loginPanel);
        
        
        buttonlogin.addActionListener(new AksiLogin(formUser, formPass, this));
        
        add(panel);
        setVisible(true);
    }
}
