/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppPackage;

import javax.swing.JFrame;

/**
 *
 * @author Ignacio
 */
public class MainClass {
    public static void main(String[] args) {
        CreateChart CC = new CreateChart("Edades", "Usuarios por Edades", 1);
        CC.pack();
        CC.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CC.setVisible(true);
    }
}
