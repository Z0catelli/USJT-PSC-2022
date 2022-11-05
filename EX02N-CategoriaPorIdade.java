/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex02n;

import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class EX02N {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int idade;
        idade = Integer.parseInt(JOptionPane.showInputDialog("Insira a sua idade"));
         if ((idade >= 0) && (idade <=14)){
             JOptionPane.showMessageDialog(null,"A sua categoria é: Infantil");
            }
         else if ((idade >= 11) && (idade <=14)){
             JOptionPane.showMessageDialog(null,"A sua categoria é: Junior");
            }
         else if ((idade >= 15) && (idade <=20)){
             JOptionPane.showMessageDialog(null,"A sua categoria é: Adolescente");
            }
         else if ((idade >= 21) && (idade <=35)){
             JOptionPane.showMessageDialog(null,"A sua categoria é: Jovem");
            }
         else if (idade > 35){
             JOptionPane.showMessageDialog(null,"A sua categoria é: Master");
            }
         else {
             JOptionPane.showMessageDialog(null,"Insira uma idade valida.");
         }
   }  
}
