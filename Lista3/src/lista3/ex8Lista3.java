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
public class ex8Lista3 {
    public static void main(String[] args) {
        Scanner escreva=new Scanner(System.in);
        System.out.print("Informe quantos números quer ver: ");
        int num=escreva.nextInt();
   
        for (int cc=1;cc<=num;cc++){
            if(cc%2==0){
                System.out.println("Par: "+cc);
            }else{
                System.out.println("Impar: "+cc);
            }
            
        }
    }
    
}
