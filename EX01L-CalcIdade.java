/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex01l;

import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class EX01L {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // l)Faça um programa que recebe o ano de nascimento de uma pessoa e o ano atual, e exibe a idade dessa pessoa em anos.
       double anoNasc, anoAtual, idade;
        anoNasc = Integer.parseInt(JOptionPane.showInputDialog("Insira o seu ano de nascimento:"));
        anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano atual:"));
        idade = anoAtual - anoNasc;
        System.out.println("A sua idade é: "+idade);
        JOptionPane.showMessageDialog(null, "A sua idade é "+idade); 
    }
    
}
