package com.Proyecto_EstructuraDatos;

import javax.swing.JOptionPane;

/**
 *
 * @author jose
 */
public class Main {

    public static void main(String[] args) {
        byte opcion = 0;
        
        do {
            opcion=Byte.parseByte(JOptionPane.showInputDialog("""
                                                              Menu Principal
                                                              1. Administracion
                                                              2. Sacar Citas
                                                              3. Comprar Alimento
                                                              4. Comprar Juguetes
                                                              5. Salir
                                                              """));
            switch (opcion) {
                case 1 -> JOptionPane.showMessageDialog(null, "Admin");
                case 2 -> JOptionPane.showMessageDialog(null, "Sacar Citas");
                case 3 -> JOptionPane.showMessageDialog(null, "Comprar Alimento");
                case 4 -> JOptionPane.showMessageDialog(null, "Comprar Juguetes");
                case 5 -> opcion=5;
                default -> JOptionPane.showMessageDialog(null, "Opcion Invalida");
            }
        }
        while(opcion!=5);
        System.exit(0);
        

    }
}
