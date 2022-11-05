/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex02e;

import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class EX02E {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Insira o número que deseja saber se é par ou impar."));
        
        if (num % 2 == 0) {
          System.out.println ("O numero " + num + " e par");
          JOptionPane.showMessageDialog(null,"O numero " + num + " e par");
        } 
        else {
          System.out.println("O numero " + num + " e impar");      
          JOptionPane.showMessageDialog(null,"O numero " + num + " e impar");
      }
   }
}

    
    
