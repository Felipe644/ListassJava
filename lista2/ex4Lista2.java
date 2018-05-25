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
public class ex4Lista2 {
    public static void main(String[] args) {
        Scanner escreva = new Scanner(System.in);
        System.out.println("Digite o Primeiro número:");
        int num1= escreva.nextInt();
        System.out.println("Digite o Segundo número: ");
        int num2=escreva.nextInt();
        System.out.println("Digite o Terceiro número: ");
        int num3= escreva.nextInt();
        int primeiro = 0;
        int segundo = 0;
        int terceiro = 0;
        if(num1>num2 && num1>num3){
             primeiro= num1;
             segundo=num2;
             terceiro=num3;
        }else if(num2>num1 && num2>num3){
             primeiro=num2;
             segundo= num1;
             terceiro=num3;
        }else if(num3>num1 && num3>num2){
             primeiro=num3;
             segundo= num1;
             terceiro=num2;
        }
        System.out.println("Digite 1 para ordem crescente e 2 para ordem decresente");
        int escolha=escreva.nextInt();
        
        switch(escolha){
            case 1:
                System.out.printf("%d, %d, %d",primeiro,segundo,terceiro);
                break;
            case 2:
                System.out.printf("%d, %d, %d",terceiro, segundo, primeiro);
                break;
        }
        
     
    }
}
