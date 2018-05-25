/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ex3Lista2 {
    public static void main(String[] args) {
        Scanner escreva = new Scanner(System.in);
        System.out.println("Digite a Primeira nota:");
        double nota1= escreva.nextInt();
        System.out.println("Digite a Segunda nota:");
        double nota2= escreva.nextInt();
        System.out.println("Digite a Terceira nota:");
        double nota3= escreva.nextInt();
        double med = (nota1 + nota2 + nota3)/3;
        double maior= nota1;
        if(nota2>maior){
            maior=nota2;
        }else if(nota3>maior){
            maior=nota3;
        }System.out.printf("A maior nota é %.2f e a média entre elas é %.2f \n",maior,med);
        
    }
}
