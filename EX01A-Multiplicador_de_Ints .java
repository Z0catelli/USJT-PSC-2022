/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01a;

import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class EX01A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // a)Faça um programa que recebe três números reais e exibe a multiplicação desses números.
        int num1, num2, num3, mult;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro número:"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo número:"));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Insira o terceiro número:"));
        mult = num1 * num2 * num3;
        System.out.println("O resultado da multiplicação é:"+mult);
        JOptionPane.showMessageDialog(null, "O resultado da multiplicação é:"+mult);
    }
    
}
