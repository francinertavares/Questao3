package Questao3;

import java.util.Scanner;

// Faça um Programa que peça dois números e imprima a soma.
public class Exerc3 {
    public static void main(String[] args) throws Exception {
        int numero1;
        int numero2;
        int soma;
        
        Scanner sc1 = new Scanner(System.in);
        
        System.out.println("Digite dois números:");
        
        numero1 = sc1.nextInt();
        numero2 = sc1.nextInt();
        
        soma = numero1 + numero2;
        
        System.out.println("O valor da soma é: " + soma);
        
        sc1.close();
    }

}