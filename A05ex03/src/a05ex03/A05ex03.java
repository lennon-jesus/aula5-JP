/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a05ex03;

import java.util.Scanner;

/**
 *
 * @author ALUNO
 */
public class A05ex03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        float a = s.nextFloat();
        System.out.println("Digite a segunda nota: ");
        float b = s.nextFloat();
        System.out.println("Digite a frequência: ");
        float fre = s.nextFloat();
        float media = (a+b)/2;
        String res = "Aprovado";
        if (media<6 || fre<75)
            res = "Reprovado";
        System.out.println("Média: "+media+" / Frequência: "+fre+"% / Resultado: "+res);
    }
    
}
