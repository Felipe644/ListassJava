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
public class Lista3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner escreva = new Scanner (System.in);  
        int valor[] = new int[15];  
        System.out.print("Digite o 1º valor: ");  
        valor[0] = escreva.nextInt();  
        int menor = valor[0]; int maior = valor[0];
        for(int i = 1; i < valor.length; i++){  
            System.out.print("Digite o " +(i+1)+"º valor: ");  
            valor[i] = escreva.nextInt();  
            if(valor[i] > maior){   
                maior = valor[i];  
            }  
        }  
        for (int j = 1; j < valor.length; j++) {  
            if(valor[j] < menor){  
                menor = valor[j];  
            }  
        }System.out.printf("O maior número foi %d e o menor foi %d \n",maior, menor);
    }
    
}
