/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exe3;

import javax.swing.JOptionPane;

/**
 *
 * @author 1369
 */
public class Exe3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 0;
        do {
            if (i == 2) {
                i++;
                continue;
                
            }
            System.out.println("numero: " + i);
            i++;
        } while (i < 5);

    }

}
