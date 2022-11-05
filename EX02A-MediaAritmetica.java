/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex02.a;

import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class EX02A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Double nota1, nota2, media;
         nota1 = Double.parseDouble(JOptionPane.showInputDialog("Insira a primeira nota: "));
         nota2 = Double.parseDouble(JOptionPane.showInputDialog("Insira a segunda nota: "));
         media = (nota1 + nota2)/2;
    if (media >= 6) {
         System.out.println("Voce foi aprovado com a media: "+media);
         JOptionPane.showMessageDialog(null, "Voce foi aprovado com a media: "+media);
        }
    else {
         System.out.println("Voce foi reprovado com a media: "+media);
         JOptionPane.showMessageDialog(null, "Voce foi reproavdo com a media: "+media);
        }
    }
    
}
