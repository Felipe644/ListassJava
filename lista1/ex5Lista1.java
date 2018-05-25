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
public class ex5Lista1 {
    public static void main(String[] args) {
        Scanner escreva = new Scanner(System.in);
        System.out.println("Digite um número");
        int num = escreva.nextInt();
        int qua= num*num;
        System.out.printf("O quadrade de %d é %d\n",num,qua);
        
    }
    
}
