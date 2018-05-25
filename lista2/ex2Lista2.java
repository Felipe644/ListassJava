/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ex2Lista2 {
    public static void main(String[] args) {
        Scanner escreva= new Scanner(System.in);
        System.out.println("Calculo de Triangulos");
        System.out.println("Informe o valor do primeiro lado: ");
        float lado1=escreva.nextInt();
        System.out.println("Informe o valor do segundo lado: ");
        float lado2= escreva.nextInt();
        System.out.println("Informe o valor do terceiro lado: ");
        float lado3= escreva.nextInt();
        if(lado1 + lado2 >lado3 && lado2 + lado3 >lado1 && lado3 + lado1>lado2){
             if(lado1 == lado2 && lado1 ==lado3){
                 System.out.println("Equilátero"); 
            }else if(lado1==lado2 || lado1==lado3){
                 System.out.println("Isósceles");
            }else if(lado1!=lado2 && lado1!=lado3 && lado2!=lado3){
                 System.out.println("Escaleno");
                
            }
        
    }else{
            System.out.println("Não é um Triângulo");
        }
    }
    
}
