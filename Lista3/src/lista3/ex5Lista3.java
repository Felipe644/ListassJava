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
public class ex5Lista3 {
    public static void main(String[] args) {
        Scanner escreva=new Scanner(System.in);
        System.out.println("Informe valores para serem somados");
        int num=0;
        int cc=1;
        int par = 0;
        int impar=0;
        while(num <=1000){
            System.out.printf("Digite o %d valor:  ",cc);
            num=escreva.nextInt();
            if(num % 2== 0){
                par += num;
            }else{
                impar+=num;
            }cc++;
            
            
        
    }System.out.printf("Soma Pares: %d \nSoma Impares: %d \n",par, impar);
    }
    
}
