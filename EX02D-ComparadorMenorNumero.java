/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex02c;

import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class EX02D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      double num1, num2;
         num1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro numero: "));
         num2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo numero: "));
         String resposta;
         
    if (num1 < num2) {
        resposta = String.format("%.2f",num1);
         System.out.println("O menor número é: "+resposta);
         JOptionPane.showMessageDialog(null, "O menor número é: "+resposta);
        }
    
    else if (num2 < num1) {
        resposta = String.format("%.2f",num2);
        System.out.println("O menor número é: "+resposta);
        JOptionPane.showMessageDialog(null, "O menor número é: "+resposta);
    }
    
    else {
         JOptionPane.showMessageDialog(null, "os dois numero são iguais");
        }
    }
    
}
