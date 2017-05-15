/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendodados;

import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class LendoDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        /*System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scan.nextLine();
        System.out.println("Seu Nome Completo é: " + nomeCompleto);
        
        System.out.println("Digite seu primeiro Nome: ");
        String primeiroNome = scan.next();
        System.out.println("Seu primeiro nome é: " + primeiroNome);
        
        System.out.println("Digite a sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Sua idade é: " + idade);
        
        System.out.println("Digite sua altura: ");
        double altura = scan.nextDouble();
        System.out.println("Sua altura é: " + altura);*/
        
        System.out.println("Digite seu primeiro nome, idade, quantidade de filhos, altura e se tem animais de estimação: ");
        String primeiroNome = scan.next();
        int idade = scan.nextInt();
        byte qtdFilhos = scan.nextByte();
        float altura = scan.nextFloat();
        boolean temPet = scan.nextBoolean();
        
        System.out.println("Você digitou o seguinte:");
        System.out.println("Primeiro Nome: " + primeiroNome);
        System.out.println("Idade: " + idade);
        System.out.println("Quantidade de filhos: " + qtdFilhos);
        System.out.println("Altura: " + altura);
        System.out.println("Tem animais de estimação: " + temPet);
        
    }
    
}
