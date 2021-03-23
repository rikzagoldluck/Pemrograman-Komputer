package praktikum3.laporan;

import java.awt.geom.*;
import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    int x = 0;
    int y = 500;
    int j = 0;

    public MyPanel() {
        setPreferredSize(new Dimension(900, 480));
        setBackground(Color.white);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D c2 = (Graphics2D) g;
        GeneralPath gp1 = new GeneralPath();
        GeneralPath gp2 = new GeneralPath();
        GradientPaint g3 = new GradientPaint(210, 300, Color.darkGray, 240, 320, Color.black);
        GradientPaint g2 = new GradientPaint(220, 310, Color.darkGray, 270, 340, Color.black);

        //langit
        GradientPaint biruLangit = new GradientPaint(0, 300, Color.white, 0, 0, Color.cyan);
        Rectangle2D.Double langit = new Rectangle2D.Double(0, 0, 900, 500);
        c2.draw(langit);
        c2.setPaint(biruLangit);
        c2.fill(langit);

        //laut
        c2.setColor(Color.BLUE);
        Rectangle2D.Double laut = new Rectangle2D.Double(0, 350, 900, 150);
        c2.fill(laut);

        //matahari
        Shape e1 = new Ellipse2D.Double(550, 50, 100, 100);
        GradientPaint g1 = new GradientPaint(535, 80, Color.ORANGE, 550, 130, Color.YELLOW);
        c2.setPaint(g1);
        c2.fill(e1);

        //sinar matahari
        c2.drawLine(500, 20, 580, 55);
        c2.drawLine(450, 60, 560, 80);
        c2.drawLine(430, 140, 570, 120);
        c2.drawLine(470, 200, 600, 140);
        c2.drawLine(550, 230, 600, 160);
        c2.drawLine(640, 10, 590, 90);
        c2.drawLine(730, 30, 600, 100);

        //awan1 : pojok kiri
        c2.setColor(Color.white);
        Shape e6 = new Ellipse2D.Double(x, 75, 60, 30);
        c2.fill(e6);
        Shape e7 = new Ellipse2D.Double(x + 35, 65, 50, 50); // x,y,lengkungan
        c2.fill(e7);
        Shape e7a = new Ellipse2D.Double(x + 15, 65, 50, 50);
        c2.fill(e7a);
        Shape e7b = new Ellipse2D.Double(x + 55, 65, 50, 50);
        c2.fill(e7b);
        Shape e8 = new Ellipse2D.Double(x + 60, 75, 60, 30);
        c2.fill(e8);

        //awan2 : atas matahari
        c2.setColor(Color.white);
        Shape e9 = new Ellipse2D.Double(y, 20, 60, 30);
        c2.fill(e9);
        Shape e10 = new Ellipse2D.Double(y + 35, 10, 50, 50);
        c2.fill(e10);
        Shape e10a = new Ellipse2D.Double(y + 15, 10, 50, 50);
        c2.fill(e10a);
        Shape e10b = new Ellipse2D.Double(y + 55, 10, 50, 50);
        c2.fill(e10b);
        Shape e11 = new Ellipse2D.Double(y + 60, 20, 60, 30);
        c2.fill(e11);

        //awan3 menutupi matahari : sebelah kiri bawah
        c2.setColor(Color.white);
        Shape e12 = new Ellipse2D.Double(520, 130, 60, 30);// x,y,lengkungan
        c2.fill(e12);
        Shape e13 = new Ellipse2D.Double(555, 120, 50, 50);
        c2.fill(e13);
        Shape e13a = new Ellipse2D.Double(535, 120, 50, 50);
        c2.fill(e13a);
        Shape e13b = new Ellipse2D.Double(575, 120, 50, 50);
        c2.fill(e13b);
        Shape e14 = new Ellipse2D.Double(580, 130, 60, 30);
        c2.fill(e14);

        //awan4 menutupi matahari : sebelah kanan atas
        c2.setColor(Color.white);
        Shape e15 = new Ellipse2D.Double(580, 100, 60, 30);// x,y,lengkungan
        c2.fill(e15);
        Shape e16 = new Ellipse2D.Double(605, 90, 50, 50);
        c2.fill(e16);
        Shape e16a = new Ellipse2D.Double(595, 90, 50, 50);
        c2.fill(e16a);
        Shape e16b = new Ellipse2D.Double(635, 90, 50, 50);
        c2.fill(e16b);
        Shape e17 = new Ellipse2D.Double(640, 100, 60, 30);
        c2.fill(e17);

        //atap kapal
//        gp2.moveTo(y + 230, 270);
//        gp2.lineTo(y + 270, 260);
//        gp2.lineTo(y + 365, 260);
//        gp2.lineTo(y + 370, 270);
//        gp2.closePath();
//        c2.draw(gp2);
//        c2.setPaint(g3);
//        c2.fill(gp2);

        //Badan Kapal
//        gp1.moveTo(y + 170, 310);
//        gp1.lineTo(y + 220, 360);
//        gp1.lineTo(y + 380, 360);
//        gp1.lineTo(y + 390, 330);
//        gp1.lineTo(y + 390, 330);
//        gp1.lineTo(y + 395, 310);
//        gp1.closePath();
//        c2.draw(gp1);
//        c2.setPaint(g2);
//        c2.fill(gp1);
//
//        //bagian tengah kapal
//        GradientPaint g4 = new GradientPaint(130, 120, Color.BLACK, 40, 190, Color.BLACK, true);
//        Shape r3 = new Rectangle2D.Double(y + 210, 290, 170, 25);
//        c2.setPaint(g4);
//        c2.fill(r3);
//        c2.setColor(Color.gray);
//        Shape r4 = new Rectangle2D.Double(y + 230, 270, 140, 20);
//        c2.fill(r4);
//        c2.setColor(Color.YELLOW);
//
//        //jendela atas kabal
//        Shape r5 = new Rectangle2D.Double(y + 325, 275, 30, 10);
//        c2.fill(r5);
//        Shape r6 = new Rectangle2D.Double(y + 270, 275, 10, 6);
//        c2.fill(r6);
//        Shape r7 = new Rectangle2D.Double(y + 250, 275, 10, 6);
//        c2.fill(r7);
//        c2.setColor(Color.red);
//        Shape r8 = new Rectangle2D.Double(y + 210, 309, 170, 4);
//        c2.fill(r8);
//
//        //jendela kapal
//        c2.setColor(Color.white);
//        Shape e2 = new Ellipse2D.Double(y + 220, 320, 15, 15);
//        Shape e3 = new Ellipse2D.Double(y + 260, 320, 15, 15);
//        Shape e4 = new Ellipse2D.Double(y + 300, 320, 15, 15);
//        Shape e5 = new Ellipse2D.Double(y + 340, 320, 15, 15);
//        c2.fill(e2);
//        c2.fill(e3);
//        c2.fill(e4);
//        c2.fill(e5);
//
//        //Tiang bendera
//        c2.setColor(Color.BLACK);
//        c2.drawLine(y + 348, 290, y + 348, 230);
//
//        //Bendera
//        c2.setColor(Color.red);
//        Shape rBendera = new Rectangle2D.Double(y + 350, 230, 45, 10);
//        c2.fill(rBendera);
//        c2.setColor(Color.WHITE);
//        Shape r2 = new Rectangle2D.Double(y + 350, 240, 45, 10);
//        c2.fill(r2);

        //tepian laut
        c2.setColor(new Color(0, 128, 0));
        c2.fillArc(655, 350, 500, 60, 270, -180);
        c2.fillArc(635, 370, 550, 94, 270, -180);
        c2.fillArc(605, 420, 590, 100, 270, -180);

        //gelombang laut
        c2.setColor(Color.white);
        c2.drawArc(0, 355, 20, 20, 180, 180);
        c2.drawArc(0, 375, 20, 20, 180, 180);
        c2.drawArc(0, 395, 20, 20, 180, 180);
        c2.drawArc(0, 415, 20, 20, 180, 180);
        c2.drawArc(0, 435, 20, 20, 180, 180);
        c2.drawArc(0, 455, 20, 20, 180, 180);

        c2.drawArc(20, 355, 20, 20, 180, 180);
        c2.drawArc(20, 375, 20, 20, 180, 180);
        c2.drawArc(20, 395, 20, 20, 180, 180);
        c2.drawArc(20, 415, 20, 20, 180, 180);
        c2.drawArc(20, 435, 20, 20, 180, 180);
        c2.drawArc(20, 455, 20, 20, 180, 180);

        c2.drawArc(40, 355, 20, 20, 180, 180);
        c2.drawArc(40, 375, 20, 20, 180, 180);
        c2.drawArc(40, 395, 20, 20, 180, 180);
        c2.drawArc(40, 415, 20, 20, 180, 180);
        c2.drawArc(40, 435, 20, 20, 180, 180);
        c2.drawArc(40, 455, 20, 20, 180, 180);

        c2.drawArc(60, 355, 20, 20, 180, 180);
        c2.drawArc(60, 375, 20, 20, 180, 180);
        c2.drawArc(60, 395, 20, 20, 180, 180);
        c2.drawArc(60, 415, 20, 20, 180, 180);
        c2.drawArc(60, 435, 20, 20, 180, 180);
        c2.drawArc(60, 455, 20, 20, 180, 180);

        c2.drawArc(80, 355, 20, 20, 180, 180);
        c2.drawArc(80, 375, 20, 20, 180, 180);
        c2.drawArc(80, 395, 20, 20, 180, 180);
        c2.drawArc(80, 415, 20, 20, 180, 180);
        c2.drawArc(80, 435, 20, 20, 180, 180);
        c2.drawArc(80, 455, 20, 20, 180, 180);

        c2.drawArc(100, 355, 20, 20, 180, 180);
        c2.drawArc(100, 375, 20, 20, 180, 180);
        c2.drawArc(100, 395, 20, 20, 180, 180);
        c2.drawArc(100, 415, 20, 20, 180, 180);
        c2.drawArc(100, 435, 20, 20, 180, 180);
        c2.drawArc(100, 455, 20, 20, 180, 180);

        c2.drawArc(120, 355, 20, 20, 180, 180);
        c2.drawArc(120, 375, 20, 20, 180, 180);
        c2.drawArc(120, 395, 20, 20, 180, 180);
        c2.drawArc(120, 415, 20, 20, 180, 180);
        c2.drawArc(120, 435, 20, 20, 180, 180);
        c2.drawArc(120, 455, 20, 20, 180, 180);

        c2.drawArc(140, 355, 20, 20, 180, 180);
        c2.drawArc(140, 375, 20, 20, 180, 180);
        c2.drawArc(140, 395, 20, 20, 180, 180);
        c2.drawArc(140, 415, 20, 20, 180, 180);
        c2.drawArc(140, 435, 20, 20, 180, 180);
        c2.drawArc(140, 455, 20, 20, 180, 180);

        c2.drawArc(160, 355, 20, 20, 180, 180);
        c2.drawArc(160, 375, 20, 20, 180, 180);
        c2.drawArc(160, 395, 20, 20, 180, 180);
        c2.drawArc(160, 415, 20, 20, 180, 180);
        c2.drawArc(160, 435, 20, 20, 180, 180);
        c2.drawArc(160, 455, 20, 20, 180, 180);

        c2.drawArc(180, 355, 20, 20, 180, 180);
        c2.drawArc(180, 375, 20, 20, 180, 180);
        c2.drawArc(180, 395, 20, 20, 180, 180);
        c2.drawArc(180, 415, 20, 20, 180, 180);
        c2.drawArc(180, 435, 20, 20, 180, 180);
        c2.drawArc(180, 455, 20, 20, 180, 180);

        c2.drawArc(200, 355, 20, 20, 180, 180);
        c2.drawArc(200, 375, 20, 20, 180, 180);
        c2.drawArc(200, 395, 20, 20, 180, 180);
        c2.drawArc(200, 415, 20, 20, 180, 180);
        c2.drawArc(200, 435, 20, 20, 180, 180);
        c2.drawArc(200, 455, 20, 20, 180, 180);

        c2.drawArc(220, 355, 20, 20, 180, 180);
        c2.drawArc(220, 375, 20, 20, 180, 180);
        c2.drawArc(220, 395, 20, 20, 180, 180);
        c2.drawArc(220, 415, 20, 20, 180, 180);
        c2.drawArc(220, 435, 20, 20, 180, 180);
        c2.drawArc(220, 455, 20, 20, 180, 180);

        c2.drawArc(240, 355, 20, 20, 180, 180);
        c2.drawArc(240, 375, 20, 20, 180, 180);
        c2.drawArc(240, 395, 20, 20, 180, 180);
        c2.drawArc(240, 415, 20, 20, 180, 180);
        c2.drawArc(240, 435, 20, 20, 180, 180);
        c2.drawArc(240, 455, 20, 20, 180, 180);

        c2.drawArc(260, 355, 20, 20, 180, 180);
        c2.drawArc(260, 375, 20, 20, 180, 180);
        c2.drawArc(260, 395, 20, 20, 180, 180);
        c2.drawArc(260, 415, 20, 20, 180, 180);
        c2.drawArc(260, 435, 20, 20, 180, 180);
        c2.drawArc(260, 455, 20, 20, 180, 180);

        c2.drawArc(280, 355, 20, 20, 180, 180);
        c2.drawArc(280, 375, 20, 20, 180, 180);
        c2.drawArc(280, 395, 20, 20, 180, 180);
        c2.drawArc(280, 415, 20, 20, 180, 180);
        c2.drawArc(280, 435, 20, 20, 180, 180);
        c2.drawArc(280, 455, 20, 20, 180, 180);

        c2.drawArc(300, 355, 20, 20, 180, 180);
        c2.drawArc(300, 375, 20, 20, 180, 180);
        c2.drawArc(300, 395, 20, 20, 180, 180);
        c2.drawArc(300, 415, 20, 20, 180, 180);
        c2.drawArc(300, 435, 20, 20, 180, 180);
        c2.drawArc(300, 455, 20, 20, 180, 180);

        c2.drawArc(320, 355, 20, 20, 180, 180);
        c2.drawArc(320, 375, 20, 20, 180, 180);
        c2.drawArc(320, 395, 20, 20, 180, 180);
        c2.drawArc(320, 415, 20, 20, 180, 180);
        c2.drawArc(320, 435, 20, 20, 180, 180);
        c2.drawArc(320, 455, 20, 20, 180, 180);

        c2.drawArc(340, 355, 20, 20, 180, 180);
        c2.drawArc(340, 375, 20, 20, 180, 180);
        c2.drawArc(340, 395, 20, 20, 180, 180);
        c2.drawArc(340, 415, 20, 20, 180, 180);
        c2.drawArc(340, 435, 20, 20, 180, 180);
        c2.drawArc(340, 455, 20, 20, 180, 180);

        c2.drawArc(360, 355, 20, 20, 180, 180);
        c2.drawArc(360, 375, 20, 20, 180, 180);
        c2.drawArc(360, 395, 20, 20, 180, 180);
        c2.drawArc(360, 415, 20, 20, 180, 180);
        c2.drawArc(360, 435, 20, 20, 180, 180);
        c2.drawArc(360, 455, 20, 20, 180, 180);

        c2.drawArc(380, 355, 20, 20, 180, 180);
        c2.drawArc(380, 375, 20, 20, 180, 180);
        c2.drawArc(380, 395, 20, 20, 180, 180);
        c2.drawArc(380, 415, 20, 20, 180, 180);
        c2.drawArc(380, 435, 20, 20, 180, 180);
        c2.drawArc(380, 455, 20, 20, 180, 180);

        c2.drawArc(400, 355, 20, 20, 180, 180);
        c2.drawArc(400, 375, 20, 20, 180, 180);
        c2.drawArc(400, 395, 20, 20, 180, 180);
        c2.drawArc(400, 415, 20, 20, 180, 180);
        c2.drawArc(400, 435, 20, 20, 180, 180);
        c2.drawArc(400, 455, 20, 20, 180, 180);

        c2.drawArc(420, 355, 20, 20, 180, 180);
        c2.drawArc(420, 375, 20, 20, 180, 180);
        c2.drawArc(420, 395, 20, 20, 180, 180);
        c2.drawArc(420, 415, 20, 20, 180, 180);
        c2.drawArc(420, 435, 20, 20, 180, 180);
        c2.drawArc(420, 455, 20, 20, 180, 180);

        c2.drawArc(440, 355, 20, 20, 180, 180);
        c2.drawArc(440, 375, 20, 20, 180, 180);
        c2.drawArc(440, 395, 20, 20, 180, 180);
        c2.drawArc(440, 415, 20, 20, 180, 180);
        c2.drawArc(440, 435, 20, 20, 180, 180);
        c2.drawArc(440, 455, 20, 20, 180, 180);

        c2.drawArc(460, 355, 20, 20, 180, 180);
        c2.drawArc(460, 375, 20, 20, 180, 180);
        c2.drawArc(460, 395, 20, 20, 180, 180);
        c2.drawArc(460, 415, 20, 20, 180, 180);
        c2.drawArc(460, 435, 20, 20, 180, 180);
        c2.drawArc(460, 455, 20, 20, 180, 180);

        c2.drawArc(480, 355, 20, 20, 180, 180);
        c2.drawArc(480, 375, 20, 20, 180, 180);
        c2.drawArc(480, 395, 20, 20, 180, 180);
        c2.drawArc(480, 415, 20, 20, 180, 180);
        c2.drawArc(480, 435, 20, 20, 180, 180);
        c2.drawArc(480, 455, 20, 20, 180, 180);

        c2.drawArc(500, 355, 20, 20, 180, 180);
        c2.drawArc(500, 375, 20, 20, 180, 180);
        c2.drawArc(500, 395, 20, 20, 180, 180);
        c2.drawArc(500, 415, 20, 20, 180, 180);
        c2.drawArc(500, 435, 20, 20, 180, 180);
        c2.drawArc(500, 455, 20, 20, 180, 180);

        c2.drawArc(520, 355, 20, 20, 180, 180);
        c2.drawArc(520, 375, 20, 20, 180, 180);
        c2.drawArc(520, 395, 20, 20, 180, 180);
        c2.drawArc(520, 415, 20, 20, 180, 180);
        c2.drawArc(520, 435, 20, 20, 180, 180);
        c2.drawArc(520, 455, 20, 20, 180, 180);

        c2.drawArc(540, 355, 20, 20, 180, 180);
        c2.drawArc(540, 375, 20, 20, 180, 180);
        c2.drawArc(540, 395, 20, 20, 180, 180);
        c2.drawArc(540, 415, 20, 20, 180, 180);
        c2.drawArc(540, 435, 20, 20, 180, 180);
        c2.drawArc(540, 455, 20, 20, 180, 180);

        c2.drawArc(560, 355, 20, 20, 180, 180);
        c2.drawArc(560, 375, 20, 20, 180, 180);
        c2.drawArc(560, 395, 20, 20, 180, 180);
        c2.drawArc(560, 415, 20, 20, 180, 180);
        c2.drawArc(560, 435, 20, 20, 180, 180);
        c2.drawArc(560, 455, 20, 20, 180, 180);

        c2.drawArc(580, 355, 20, 20, 180, 180);
        c2.drawArc(580, 375, 20, 20, 180, 180);
        c2.drawArc(580, 395, 20, 20, 180, 180);
        c2.drawArc(580, 415, 20, 20, 180, 180);
        c2.drawArc(580, 435, 20, 20, 180, 180);
        c2.drawArc(580, 455, 20, 20, 180, 180);

        c2.drawArc(600, 355, 20, 20, 180, 180);
        c2.drawArc(600, 375, 20, 20, 180, 180);
        c2.drawArc(600, 395, 20, 20, 180, 180);
        c2.drawArc(600, 415, 20, 20, 180, 180);
        c2.drawArc(600, 435, 20, 20, 180, 180);

        c2.drawArc(620, 355, 20, 20, 180, 180);
        c2.drawArc(620, 375, 20, 20, 180, 180);
        c2.drawArc(620, 395, 20, 20, 180, 180);
        c2.drawArc(620, 415, 20, 20, 180, 180);

        c2.drawArc(640, 355, 20, 20, 180, 180);
        c2.drawArc(640, 375, 20, 20, 180, 180);

        //pohon & batu
        c2.setColor(Color.BLACK);
        c2.fillOval(832, 360, 25, 15);

        c2.setColor(new Color(74, 37, 0));
        c2.fillRect(840, 300, 10, 80);

        c2.setColor(new Color(0, 255, 0));
        c2.setStroke(new BasicStroke(3.0f));
        c2.fillOval(810, 275, 60, 50);
        c2.fillOval(800, 305, 60, 30);
        c2.fillOval(830, 295, 60, 30);

        c2.setColor(Color.black);
        c2.fillOval(820, 370, 25, 15);
        c2.fillOval(842, 370, 25, 15);

        //rumput
        c2.setColor(Color.green);
        c2.drawArc(840, 405, 35, 20, 180, -180);
        c2.drawArc(820, 415, 35, 20, 180, -180);
        c2.drawArc(810, 405, 35, 20, 180, -180);
        c2.drawArc(790, 415, 35, 20, 180, -180);




        // Heli
        g.setColor(Color.RED);
        int o[] = {460, 624, 660, 720, 680, 515, 460};
        int i[] = {316, 300, 264, 264, 320, 389, 316};
        int u = 7;
        g.fillPolygon(o, i, u);

        //kaki Helichoper(the feet of helychoper)
        g.setColor(Color.ORANGE);
        g.fillRoundRect(333, 413, 165, 19, 30, 30);
        g.fillRoundRect(359, 444, 165, 19, 30, 30);
        g.setColor(Color.RED);
        int w[] = {361, 362, 380, 495, 474, 361};
        int l[] = {421, 428, 446, 446, 421, 421};
        int z = 6;
        g.fillPolygon(w, l, z);

        //Badan Helychoper(body of Helychoper)
        g.setColor(Color.RED);
        g.fillOval(337, 289, 186, 145);
        g.setColor(Color.BLACK);
        g.drawOval(337, 289, 186, 145);


        //penompang baling2 utama
        g.setColor(Color.GRAY);
        g.fillRoundRect(418, 256, 20, 43, 20, 20);


        //Baling2 utama
        int x = 268;
        int y = 228;
        int pjg = 321;
        int tgg = 60;

        g.setColor(Color.GREEN);
        g.fillArc(x, y, pjg, tgg, 0 + j, 10);
        g.fillArc(x, y, pjg, tgg, 40 + j, 10);
        g.fillArc(x, y, pjg, tgg, 80 + j, 10);
        g.fillArc(x, y, pjg, tgg, 120 + j, 10);
        g.fillArc(x, y, pjg, tgg, 160 + j, 10);
        g.fillArc(x, y, pjg, tgg, 200 + j, 10);
        g.fillArc(x, y, pjg, tgg, 240 + j, 10);
        g.fillArc(x, y, pjg, tgg, 280 + j, 10);
        g.fillArc(x, y, pjg, tgg, 320 + j, 10);
        g.setColor(new Color(0, 119, 0));
        g.fillArc(x, y, pjg, tgg, 20 + j, 10);
        g.fillArc(x, y, pjg, tgg, 60 + j, 10);
        g.fillArc(x, y, pjg, tgg, 100 + j, 10);
        g.fillArc(x, y, pjg, tgg, 140 + j, 10);
        g.fillArc(x, y, pjg, tgg, 180 + j, 10);
        g.fillArc(x, y, pjg, tgg, 220 + j, 10);
        g.fillArc(x, y, pjg, tgg, 260 + j, 10);
        g.fillArc(x, y, pjg, tgg, 300 + j, 10);
        g.fillArc(x, y, pjg, tgg, 340 + j, 10);
        g.setColor(new Color(0, 255, 255));
        g.fillOval(346, 304, 108, 114);

        //Penutup baling2 utama
        g.setColor(Color.GRAY);
        g.fillOval(418, 250, 20, 15);

        int p = 619;
        int q = 248;
        int p1 = 614;
        int q1 = 243;
        int r = 83;
        int r1 = 93;

        g.setColor(new Color(0, 255, 255));
        g.fillArc(p1, q1, r1, r1, 0 + j, 15);
        g.fillArc(p1, q1, r1, r1, 30 + j, 15);
        g.fillArc(p1, q1, r1, r1, 60 + j, 15);
        g.fillArc(p1, q1, r1, r1, 90 + j, 15);
        g.fillArc(p1, q1, r1, r1, 120 + j, 15);
        g.fillArc(p1, q1, r1, r1, 150 + j, 15);
        g.fillArc(p1, q1, r1, r1, 180 + j, 15);
        g.fillArc(p1, q1, r1, r1, 210 + j, 15);
        g.fillArc(p1, q1, r1, r1, 240 + j, 15);
        g.fillArc(p1, q1, r1, r1, 270 + j, 15);
        g.fillArc(p1, q1, r1, r1, 300 + j, 15);
        g.fillArc(p1, q1, r1, r1, 330 + j, 15);

        //Baling2 ekor
        g.setColor(new Color(119, 119, 119));
        g.fillArc(p, q, r, r, 0 + j, 15);
        g.fillArc(p, q, r, r, 30 + j, 15);
        g.fillArc(p, q, r, r, 60 + j, 15);
        g.fillArc(p, q, r, r, 90 + j, 15);
        g.fillArc(p, q, r, r, 120 + j, 15);
        g.fillArc(p, q, r, r, 150 + j, 15);
        g.fillArc(p, q, r, r, 180 + j, 15);
        g.fillArc(p, q, r, r, 210 + j, 15);
        g.fillArc(p, q, r, r, 240 + j, 15);
        g.fillArc(p, q, r, r, 270 + j, 15);
        g.fillArc(p, q, r, r, 300 + j, 15);
        g.fillArc(p, q, r, r, 330 + j, 15);

        g.setColor(new Color(70, 70, 70));
        g.fillOval(648, 277, 25, 25);

        //baling2
        j += 6;

        // Kelinci
//        c2.setColor(Color.white);
//        c2.fillOval(780, 415, 50, 30);
//        c2.fillOval(780, 415, 5, 5);


//        Name
        //nama kelompok
        g.setColor(new Color (162, 81, 31));
        g.fillOval(720, 400, 20, 110);
        g.fillRect(665, 410, 140, 50);

        //text
        c2.setColor(Color.white);
        Font font = new Font("Montserrat", Font.BOLD, 10);
        c2.setFont(font);
        c2.drawString("Created with love by :", 680, 430);
        Font font1 = new Font("Montserrat", Font.BOLD, 15);
        c2.setFont(font1);
        c2.drawString("@rikzagoldluck", 670, 450);


    }
}
