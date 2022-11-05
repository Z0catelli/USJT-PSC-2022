/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01c;

import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class Ex01c {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //c)Faça um programa que lê o salário atual de alguém e exibe o novo salário que é o atual com 25%de aumento.
        double salario, novoSalario;
        salario = Integer.parseInt(JOptionPane.showInputDialog("Insira seu salario atual:"));
        novoSalario = salario * 1.25;
        System.out.println("Seu novo salario é" + novoSalario);
        JOptionPane.showMessageDialog(null,"Seu novo salario é" + novoSalario);
    }
    
}
