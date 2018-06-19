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
public class ex9Lista3 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Entre com um número para saber se ele é primo: ");
        int n = input.nextInt();
        int x = 2;
        int y = 1;
        int cont = 0;
        
        while (y<=n){
            if (n%y==0)
                cont++;
            
          y++;  
          
          
        }
        if (cont==2) {
            System.out.printf("O numero %d é primo\n",n);
        }else{
            System.out.printf("O numero %d não é primo\n",n);
        }
        
           
        
}
    
}
