package latihan_kuis_49;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AksiLogin implements ActionListener{
    private JTextField formUser;
    private JPasswordField formPass;
    private JFrame frame;
    
    public AksiLogin(JTextField formUser, JPasswordField formPass, JFrame frame) {
        this.formUser = formUser;
        this.formPass = formPass;
        this.frame = frame;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String username = formUser.getText();
        String password = new String(formPass.getPassword());
        
         if (username.equals("tukang_049") && password.equals("tukang_049")) {
            JOptionPane.showMessageDialog(null, "Login Berhasil!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            frame.dispose();
            new HitungSiku();
        } else {
            JOptionPane.showMessageDialog(null, "Login Gagal! Periksa username dan password.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}