/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.platzi.gatos_app;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Alejandra Morataya
 */
public class Inicio {

    public static void main(String[] args) throws IOException {
        int opcion_menu = -1;
          String[] botones = {" 1. ver gatos", "2. ver favoritos", "3. salir"};

        do {
            //menu principal
            String opcion = (String) JOptionPane.showInputDialog(null,
                    "Gatitos java", "Menu principal", 
                    JOptionPane.INFORMATION_MESSAGE,
                    null, botones, botones[0]);

            //validamos que opcion selecciona el usuario
            for (int i = 0; i < botones.length; i++) {
                if (opcion.equals(botones[i])) {
                    opcion_menu = i;
                }
            }

            switch (opcion_menu) {
                    case 0:
                    Gatos_servicio.verGatos();
                    break;
                case 1:
                    Gatos gato = new Gatos();
                    Gatos_servicio.verFavorito(gato.getApikey());
                default:
                    break;
            }
        } while (opcion_menu != 2);
    }
}
