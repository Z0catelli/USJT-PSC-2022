/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01d;

import javax.swing.JOptionPane;

/**
 *
 * @author Alunos
 */
public class Ex01d {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // d)Faça um programa que lê o salário base de alguém e exibe o novo salário, considerando 5% de gratificação(mais dinheiro) e 7% de impostos(menos dinheiro)sobre o salário base. Também exiba a gratificação e o imposto.
        double salario, novoSalario, gratificacao, impostos;
        salario = Integer.parseInt(JOptionPane.showInputDialog("Insira o seu salario base:"));
        gratificacao = salario * 0.05;
        impostos = (salario + gratificacao) * 0.07;
        novoSalario = salario + gratificacao - impostos;
        System.out.println("Seu novo salario é:" + novoSalario);
        JOptionPane.showMessageDialog(null,"Seu novo salario é " + novoSalario + "sua gratificacao foi" + gratificacao + "Seus impostos foram" + impostos);
    }
    
}
