/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ex4Lista1 {
     public static void main(String[] args) {
         Scanner escreva = new Scanner(System.in);
         System.out.println("Digite o primeiro Valor:");
         int num1 = escreva.nextInt();
         System.out.println("Digite o segundo valor:");
         int num2 = escreva.nextInt();
         System.out.printf("O primeiro número foi %d e o segundo foi %d.\n",num2,num1);
         
     }
}
