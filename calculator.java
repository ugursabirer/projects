package hesapMakinesi;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class hesapMakinesi {

    private JFrame frame;
    private JTextField txtsayi1;
    private JTextField txtsayi2;
    private JTextField txtSonuc;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    hesapMakinesi window = new hesapMakinesi();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public hesapMakinesi() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        JLabel lblSayiyiGiriniz = new JLabel("1. Sayıyı Giriniz:");
        lblSayiyiGiriniz.setBounds(10, 15, 135, 23);
        frame.getContentPane().add(lblSayiyiGiriniz);
        JLabel lblNewLabel = new JLabel("2. Sayıyı Giriniz:");
        lblNewLabel.setBounds(10, 50, 135, 23);
        frame.getContentPane().add(lblNewLabel);
        txtsayi1 = new JTextField();
        txtsayi1.setBounds(180, 15, 215, 23);
        frame.getContentPane().add(txtsayi1);
        txtsayi1.setColumns(10);
        txtsayi2 = new JTextField();
        txtsayi2.setBounds(180, 50, 215, 23);
        frame.getContentPane().add(txtsayi2);
        txtsayi2.setColumns(10);
// For plus
        JButton btnToplama = new JButton("Toplama");
        btnToplama.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                double sayi1 = Double.parseDouble(txtsayi1.getText());
                double sayi2 = Double.parseDouble(txtsayi2.getText());
                double sonuc = sayi1 + sayi2;
                txtSonuc.setText(String.valueOf(sonuc));
            }
        });
        btnToplama.setBounds(15, 115, 90, 23);
        frame.getContentPane().add(btnToplama);
// For minus  
        JButton btnCkarma = new JButton("Çıkarma");
        btnCkarma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double sayi1 = Double.parseDouble(txtsayi1.getText());
                double sayi2 = Double.parseDouble(txtsayi2.getText());
                double sonuc = sayi1 - sayi2;
                txtSonuc.setText(String.valueOf(sonuc));
            }
        });
        btnCkarma.setBounds(120, 115, 90, 23);
        frame.getContentPane().add(btnCkarma);
// For multiply
        JButton btnCarpma = new JButton("Çarpma");
        btnCarpma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double sayi1 = Double.parseDouble(txtsayi1.getText());
                double sayi2 = Double.parseDouble(txtsayi2.getText());
                double sonuc = sayi1 * sayi2;
                txtSonuc.setText(String.valueOf(sonuc));
            }
        });
        btnCarpma.setBounds(225, 115, 90, 23);
        frame.getContentPane().add(btnCarpma);
// For divided by
        JButton btnBolme = new JButton("Bölme");
        btnBolme.addActionListener((ActionEvent e) -> {
            double sayi1 = Double.parseDouble(txtsayi1.getText());
            double sayi2 = Double.parseDouble(txtsayi2.getText());
            double sonuc = sayi1 / sayi2;
            txtSonuc.setText(String.valueOf(sonuc));
        });
        btnBolme.setBounds(330, 115, 90, 23);
        frame.getContentPane().add(btnBolme);
        JLabel lblSonuc = new JLabel("Sonuç: ");
        lblSonuc.setBounds(95, 175, 200, 23);
        frame.getContentPane().add(lblSonuc);
        txtSonuc = new JTextField();
        txtSonuc.setBounds(145, 175, 200, 23);
        frame.getContentPane().add(txtSonuc);
        txtSonuc.setColumns(10);
    }
}
