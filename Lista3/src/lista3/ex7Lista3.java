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
public class ex7Lista3 {
    public static void main(String[] args) {
        Scanner escreva=new Scanner(System.in);
        System.out.print("Digite a quantodade de alunos: ");
        int quant=escreva.nextInt();
        int cc=1;
        int c=1;
        int soma=0;
        double maior=0;
        double menor=1000;
        double media=0;
        while(cc<=quant){
            System.out.printf("Digite a média do %d° Aluno: ",c);
            media=escreva.nextInt();
            if(media<menor){
                menor=media;
            }if(media>maior){
                maior=media;
            }
            c++;
            cc++;
            soma+=media;
      
        }
         double mediaf=soma / quant;
         System.out.printf("Maior Média: %.2f\nMenor Média: %.2f\nMédia da Turma: %.2f\n",maior,menor,mediaf);
    }
    
}
