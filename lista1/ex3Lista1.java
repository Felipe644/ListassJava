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
public class ex3Lista1 {
    
    public static void main(String[] args) {
        Scanner escreva = new Scanner(System.in);
        System.out.println("Iforme o Raio da Lata de Óleo:");
        float raio = escreva.nextInt();
        System.out.println("Informe o Altura da Lata de Óleo:");
        float alt = escreva.nextInt();
        double vol= 3.14*(raio*raio)*alt;
        System.out.println("Volume= "+vol);
        
    }
    
}
