package praktikum3.laporan;
import javax.swing.*;
import java.awt.*;

public class PanoramaView {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Praktikum 3 - Panorama view with java 2DGraphics");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new MyPanel();
        Image icon = Toolkit.getDefaultToolkit().getImage("Pemrograman-Komputer/src/praktikum3/laporan/logo-poltek.png");
        frame.setIconImage(icon);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}

