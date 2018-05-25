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
public class ex5Lista2 {
    public static void main(String[] args) {
        Scanner escreva= new Scanner(System.in);
        System.out.println("Primeiro Número:");
        int n1 = escreva.nextInt();
        System.out.println("Segundo Número:");
        int n2= escreva.nextInt();
        System.out.println("Terceiro Número:");
        int n3= escreva.nextInt();
        int soma = n1+n2+n3;
        int mult = n1*n2*n3;
        float med = (n1+n2+n3)/3;
        System.out.println("Digite 1para Soma, 2 para Multiplicar ou 3 para Média");
        int escolha= escreva.nextInt();
        switch(escolha){
            case 1:
                System.out.println("Soma="+soma);
                break;
            case 2:
                System.out.println("Multiplicação="+mult);
                break;
            case 3:
                System.out.println("Média="+med);
                break;
               
        }
    }
}
