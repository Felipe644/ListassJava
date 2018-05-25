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
public class Lista1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner escreve= new Scanner(System.in);
        System.out.println("Digite o 1° valor:");
        int num1 = escreve.nextInt();
        System.out.println("Digite o 2° valor:");
        int num2= escreve.nextInt();
        int soma = num1 + num2;
        int sub = num1 - num2;
        int mult= num1*num2;
        float media = (num1+num2)/2;
        System.out.println("Soma= "+soma);
        System.out.println("Subtreação= "+sub);
        System.out.println("Produto= "+mult);
        System.out.println("Média= "+media);
        
    }
    
}
