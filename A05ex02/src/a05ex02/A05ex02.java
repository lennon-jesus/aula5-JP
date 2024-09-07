/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a05ex02;

/**
 *
 * @author ALUNO
 */
public class A05ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (args.length < 2)
            System.out.println("São necessários dois argumentos: Notas do aluno.");
        else{
            float a = Float.parseFloat(args[0]);
            float b = Float.parseFloat(args[1]);
            float media = (a+b)/2;
            String res = "Aprovado";
            if (media < 6)
                res = "Reprovado";
            System.out.println("Média: "+media+" / Resultado: "+res);
        }
    }
    
}
