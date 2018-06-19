/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista3;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ex6Lista3 {
    public static void main(String[] args) {
        Scanner escreva=new Scanner(System.in);
        
        int cont= 1;
        int num1=1;
        int num2=2;
        int num3=3;
        int soma=1;
        int prod=1;
        float med=1;
                
        while(num1<num2 && num1<num3 && num2<num3){
            System.out.print("Digite o 1° valor: ");
             num1=escreva.nextInt();
            System.out.print("Digite o 2° valor: ");
             num2= escreva.nextInt();
            System.out.print("Digite o 3° valor: ");
             num3=escreva.nextInt();
            if(num1<num2 && num1<num3 && num2<num3){
                 soma=num1+num2+num3;
                 prod= num1*num2*num3;
                 med= (num1+num2+num3)/3;
            }System.out.printf("Soma: %d\nProduto: %d\nMédia: %.2f\n",soma, prod, med);
        }
    }
    
}
