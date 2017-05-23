package atividades3cursojava;

import java.util.Scanner;

/**
 * Lista de Atividades 3 do curso disponíveis em:
 * http://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-16-17
 * WHILE/DO-WHILE/FOR
 *
 * @author pedro_victor
 */
public class Atividades3CursoJava {

    public static void NotaValida() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escreva um nota entre 0 e 10:");
        double nota = scan.nextDouble();
        while (nota > 10 || nota < 0) {
            System.out.println("Nota inválida!");
            System.out.println("Escreva um nota entre 0 e 10:");
            nota = scan.nextDouble();
        }
    }

    public static void UsuSenha() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Usuário:");
        String usuario = scan.next();
        System.out.println("Senha:");
        String senha = scan.next();
        while (senha.equals(usuario)) {
            System.out.println("Senha inválida, igual ao usuário!");
            System.out.println("Digite um senha novamente:");
            senha = scan.next();
        }
    }

    public static void ValidaCadastro() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nome:");
        String nome = scan.next();
        while (nome.length() <= 3) {
            System.out.println("Nome inválido, tem que ter mais de 3 caracteres!");
            System.out.println("Nome:");
            nome = scan.next();
        }
        System.out.println("Idade:");
        int idade = scan.nextInt();
        while (idade > 150 || idade < 0) {
            System.out.println("Idade inválida, tem que ser entre 0 e 150!");
            System.out.println("Idade:");
            idade = scan.nextInt();
        }
        System.out.println("Salário:");
        double salario = scan.nextDouble();
        while (salario <= 0) {
            System.out.println("Salário inválido, tem que ser maior que 0!");
            System.out.println("Idade:");
            salario = scan.nextDouble();
        }
        System.out.println("Sexo (f - feminino, m - masculino):");
        String sexo = scan.next();
        while (!("f".equals(sexo) || "m".equals(sexo))) {
            System.out.println("Sexo inválido, tem que ser 'f' ou 'm'!");
            System.out.println("Sexo:");
            sexo = scan.next();
        }
        System.out.println("Estado Civil (s - solteiro, c - casado, v - viuvo, d - divorciado):");
        String estadoCivil = scan.next();
        while (!("s".equals(estadoCivil) || "c".equals(estadoCivil) || "v".equals(estadoCivil) || "d".equals(estadoCivil))) {
            System.out.println("Estado Civil inválido, tem que ser 's' ou 'c' ou 'v' ou 'd'!");
            System.out.println("Nome:");
            estadoCivil = scan.next();
        }
        System.out.println("Cadastro realizdado com Sucesso!");
    }
    
    public static void Populacao() {
        int populacaoA = 80000;
        int populacaoB = 200000;
        double taxaCrescA = 0.03;
        double taxaCrescB = 0.015;
        int cont = 0;
        while (populacaoA <= populacaoB) {
            populacaoA = (int) (populacaoA + (populacaoA*taxaCrescA));
            populacaoB = (int) (populacaoB + (populacaoB*taxaCrescB));
            cont++;
            //System.out.println("Pop A: " + populacaoA + "\nPop B: " + populacaoB + "\nAno: " + cont);
        }
        System.out.println("Anos: " + cont);
    }
    
    public static void EscolhePopulacao() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com a população da cidade A:");
        int populacaoA = scan.nextInt();
        System.out.println("Entre com a população da cidade B:");
        int populacaoB = scan.nextInt();
        double taxaCrescA = 0.03;
        double taxaCrescB = 0.015;
        int cont = 0;
        while (populacaoA <= populacaoB) {
            populacaoA = (int) (populacaoA + (populacaoA*taxaCrescA));
            populacaoB = (int) (populacaoB + (populacaoB*taxaCrescB));
            cont++;
            //System.out.println("Pop A: " + populacaoA + "\nPop B: " + populacaoB + "\nAno: " + cont);
        }
        System.out.println("Anos: " + cont);
    }
    
    public static void Imprime() {
        
        System.out.println("Números:");
        for (int i = 1; i <= 20; i++) {
            //System.out.println(i);
            System.out.print(i + " ");
        }
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Escolha o número da questão que desejas executar entre 1 e 36: ");
        int escolha = ler.nextInt();

        switch (escolha) {
            case 1:
                NotaValida();
                break;
            case 2:
                UsuSenha();
                break;
            case 3:
                ValidaCadastro();
                break;
            case 4:
                Populacao();
                break;
            case 5:
                EscolhePopulacao();
                break;
            case 6:
                Imprime();
                break;
            case 7:

                break;
            case 8:

                break;
            case 9:

                break;
            case 10:

                break;
            case 11:

                break;
            case 12:

                break;
            case 13:

                break;
            case 14:

                break;
            case 15:

                break;
            case 16:

                break;
            case 17:

                break;
            case 18:

                break;
            case 19:

                break;
            case 20:

                break;
            case 21:

                break;
            case 22:

                break;
            case 23:

                break;
            default:
                System.out.println("Não existe essa questão!");
                break;
        }
    }

}
