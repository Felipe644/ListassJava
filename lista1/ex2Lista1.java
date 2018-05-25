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
public class ex2Lista1 {
    
    public static void main(String[] args) {
        Scanner escreve= new Scanner(System.in);
        System.out.println("Informe a temperstura em Graus Centigrados:");
        int grau= escreve.nextInt();
        int f= (9*grau+160)/5;
        System.out.printf("%d°C é equivalente à %d °F",grau,f);
        
        
        
    }
    
}
