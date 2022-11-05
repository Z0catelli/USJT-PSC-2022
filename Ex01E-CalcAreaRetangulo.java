/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01e;

import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class Ex01e {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // e)Faça um programa que exibe a área de um retângulo a partir da base e da altura fornecidas pelo usuário.
        double altura, largura, area;
        altura = Integer.parseInt(JOptionPane.showInputDialog("Insira a altura:"));
        largura = Integer.parseInt(JOptionPane.showInputDialog("Insira a largura:"));
        area = altura * largura;
        System.out.println("A area do retangulo é"+area);
        JOptionPane.showMessageDialog(null, "A area do retangulo é "+area);
    }
    
}
