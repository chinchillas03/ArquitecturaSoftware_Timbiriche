/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebas;

import javax.swing.JFrame;

/**
 *
 * @author waw
 */
public class PruebaFrm extends JFrame {

    public PruebaFrm() {
        setTitle("Prueba");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(700, 300, 500, 300);

        PanelPunto panel = new PanelPunto();
        add(panel);
        
        panel.run();

    }

}
