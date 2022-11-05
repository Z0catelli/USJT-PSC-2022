/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex02g;

import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class EX02G {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int genero, tempo;
    double salario, res;
      
    genero = Integer.parseInt (JOptionPane.showInputDialog("Digite 1 se você for Mulher \nDigite 2 se você Homem"));
    tempo = Integer.parseInt (JOptionPane.showInputDialog("Qual seu tempo de casa em anos completos?"));
    salario = Integer.parseInt (JOptionPane.showInputDialog("Qual é o seu salario atual?"));
    
    if (genero==2 && tempo>=15){
        res = 1.2*salario;
        JOptionPane.showMessageDialog(null,"O valor final e " + res);
        }
    else if (genero==1 && tempo>=10){
        res = 1.25*salario;
        JOptionPane.showMessageDialog(null,"O resultado e " + res);
        }
    else {
       res=200+salario;
       JOptionPane.showMessageDialog(null,"O resultado final e " + res); 
    }
  }  
}
