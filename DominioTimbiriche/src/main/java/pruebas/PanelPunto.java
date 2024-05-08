/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebas;

import dominio.Punto;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.util.Random;

/**
 *
 * @author waw
 */
public class PanelPunto extends JPanel implements ActionListener, Runnable {

    Ellipse2D.Double elipse;
    Ellipse2D.Double elipse2;
    int cont = 0;
    private Ellipse2D.Double elipseEnEspera;
    Ellipse2D.Double elipseSeleccionada;

    public PanelPunto() {
        Punto punto = new Punto();
        punto.creaNuevoPunto(5, 5, 30, 30, "Luis");
        Punto punto2 = new Punto();
        punto2.creaNuevoPunto(50, 5, 30, 30, "Luis");
//        this.elipse = punto.getPuntoGrafico();
//        this.elipse2 = punto2.getPuntoGrafico();

    }

    @Override
    public void run() {

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                handleClick(e.getPoint());
            }

        });

    }

    protected void handleClick(Point point) {
        if (elipse.contains(point)) {
            elipseSeleccionada = elipse;
        } else if (elipse2.contains(point)) {
            elipseSeleccionada = elipse2;
        }
        if (elipseEnEspera == null) {
            this.elipseEnEspera = elipseSeleccionada;
            cont++;
        } else if (elipseEnEspera != null) {
            Graphics2D g2d = (Graphics2D) getGraphics();
            g2d.setStroke(new BasicStroke(2));
            g2d.drawLine((int) elipseEnEspera.getX() + 15, (int) elipseEnEspera.getY() + 15, (int) elipseSeleccionada.getX() + 15, (int) elipseSeleccionada.getY() + 15);
            cont++;
        }

        if (cont == 2) {
            this.cont = 0;
        }
    }

    public void doDrawing(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.red);
        g2d.fill(elipse);
        g2d.fill(this.elipse2);
    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        doDrawing(g);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
