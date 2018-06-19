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
public class ex2Lista3 {
    public static void main(String[] args){
        Scanner escreva=new Scanner(System.in);
        System.out.println("Digite um número para ver sua Tabuada:");
        int num = escreva.nextInt();
        for(int c=1; c<=10; c++){
            int m= num*c;
            System.out.printf("%d X %d = %d \n",num,c,m);
            
        }
    } 
            
    
}
