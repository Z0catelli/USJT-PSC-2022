/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01f;

import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class Ex01f {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // f)Faça um programa que exibe a área de um triângulo a partir da base e da altura fornecidas pelo usuário.
        double altura, base, area;
        altura = Integer.parseInt(JOptionPane.showInputDialog("Insira o tamanho da altura:"));
        base = Integer.parseInt(JOptionPane.showInputDialog("Insira o tamanho da base:"));
        area = (altura * base)/2;
        System.out.println("A area do triangulo é"+area);
        JOptionPane.showMessageDialog(null, "A area do triangulo é"+area);
    }
    
}
