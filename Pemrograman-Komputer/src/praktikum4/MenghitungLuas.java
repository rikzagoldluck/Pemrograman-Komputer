package praktikum4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MenghitungLuas extends JFrame {

    private JTextField txtFPanjang, txtFLebar;
    private JLabel hasil;

    public MenghitungLuas() {
        super("Menghitung Luas");
        FlowLayout lay = new FlowLayout();
        lay.setAlignment(FlowLayout.CENTER);
        lay.setVgap(25);//mengatur jarak vertikal antar komponen
        lay.setHgap(25);//mengatur jarak horisontal antar komponen

        Container c = getContentPane();
        c.setLayout(lay);

        JLabel judul = new JLabel("Kalkulator menghitung luas persegi panjang");
        JLabel lblPanjang = new JLabel("Panjang : ");
        txtFPanjang = new JTextField(10);
        JLabel lblcm = new JLabel("cm");
        JLabel lblcm1 = new JLabel("cm");
        JLabel lblLebar = new JLabel("Lebar : ");
        txtFLebar = new JTextField(10);
        hasil = new JLabel();

        JButton btnHitung = new JButton("Hitung");
        c.add(judul);
        c.add(lblPanjang);
        c.add(txtFPanjang);
        c.add(lblcm);
        c.add(lblLebar);
        c.add(txtFLebar);
        c.add(lblcm1);
        c.add(btnHitung);
        c.add(hasil);

        btnHitung.addActionListener(new HitungHandler());
    }

    private class HitungHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                Double panjang = Double.parseDouble(txtFPanjang.getText());
                Double lebar = Double.parseDouble(txtFLebar.getText());
                Double luas = panjang * lebar;
//                hasil.setText("Hasilnya adalah  " + String.valueOf(luas) );
                JOptionPane.showConfirmDialog(null, "Hasilnya adalah = " + luas + " cm2", "Hasil",
                        JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception j) {
                JOptionPane.showConfirmDialog(null, "Masukkan Angka!", "Error",
                        JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE)
                ;
            }
        }
        }
        public static void main(String[] args) {
            MenghitungLuas flt = new MenghitungLuas();
            flt.setSize(285, 300);
            flt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            flt.setVisible(true);
            flt.setLocationRelativeTo(null);
            flt.setResizable(false);
            flt.addWindowListener(new WindowAdapter() {
                public void windowsClosing(WindowEvent e) {
                    System.exit(0);
                }
            });

        }

}
