package latihan_kuis_49;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HitungSiku extends JFrame {
    private JTextField alas, tinggi;
    private JLabel hasil;

    public HitungSiku() {
        setTitle("Kalkulator");
        setSize(450, 300);
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        JLabel judul = new JLabel("Kalkulator Sisi Miring Segitiga", SwingConstants.CENTER);
        panel.add(judul);

        JPanel inputPanelAlas = new JPanel(new FlowLayout(FlowLayout.LEFT));
        inputPanelAlas.add(new JLabel("Masukkan Alas    :"));
        alas = new JTextField(10);
        inputPanelAlas.add(alas);
        panel.add(inputPanelAlas);

        JPanel inputPanelTinggi = new JPanel(new FlowLayout(FlowLayout.LEFT));
        inputPanelTinggi.add(new JLabel("Masukkan Tinggi :"));
        tinggi = new JTextField(10);
        inputPanelTinggi.add(tinggi);
        panel.add(inputPanelTinggi);

        JButton hitungButton = new JButton("Hitung Sisi Miring");
        panel.add(hitungButton);

        hasil = new JLabel("Sisi miring: ");
        hasil.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(hasil);

        hitungButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(alas.getText());
                    double b = Double.parseDouble(tinggi.getText());
                    double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

                    hasil.setText(String.format("Sisi miring: %.4f", c));

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Masukkan angka yang valid!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        add(panel);
        setVisible(true);
    }
}

