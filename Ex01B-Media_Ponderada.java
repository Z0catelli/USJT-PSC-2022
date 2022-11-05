/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01b;

import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class Ex01b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // b)Faça um programa que recebe as notas P1, P2 e P3 e exibe a média considerando que a nota P1 tem peso 3, a nota
        int nota1, nota2, nota3, media;
        nota1 = Integer.parseInt(JOptionPane.showInputDialog("Insira a primeira nota:"));
        nota2 = Integer.parseInt(JOptionPane.showInputDialog("Insira a segunda nota:"));
        nota3 = Integer.parseInt(JOptionPane.showInputDialog("Insira a terceira nota:"));
        media = ((nota1*3) + (nota2*3) + (nota3*4))/10;
        System.out.println("A media das suas notas é:"+media);
        JOptionPane.showMessageDialog(null, "A media das suas notas é:"+media);
    }
    
}
