/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a05ex04;

/**
 *
 * @author ALUNO
 */
public class A05ex04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (args.length < 2)
            System.out.println("São necessários quatro argumentos: Notas do aluno, número de aulas total e número de faltas");
        else{
            float a = Float.parseFloat(args[0]);
            float b = Float.parseFloat(args[1]);
            float aul = Float.parseFloat(args[2]);
            float fal = Float.parseFloat(args[3]);
            float media = (a+b)/2;
            float pre = aul-fal;
            float fre = (pre/aul)*100;
            String res = "Aprovado";
            if (media < 6 || fre<75)
                res = "Reprovado";
            System.out.println("Média: "+media+" / Frequência: "+fre+"% / Resultado: "+res);
        }
    }
    
}
