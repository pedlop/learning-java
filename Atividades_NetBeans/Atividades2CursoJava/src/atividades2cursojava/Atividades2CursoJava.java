package atividades2cursojava;

import java.util.Scanner;

/**
 * Lista de Atividades 2 do curso disponíveis em:
 * https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15
 * @author pedro_victor
 */
public class Atividades2CursoJava {
    
    /**
     * Questão número 1
     */
    public static void NumMaior() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite dois números quaisquer: ");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        if (num1 > num2) {
            System.out.println("O maior número é: " + num1);
        } else {
            System.out.println("O maior número é: " + num2);
        }
    }
    
    /**
     * Questão número 2
     */
    public static void PosNeg() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite qualquer valor: ");
        int numero = scan.nextInt();
        if (numero < 0) {
            System.out.println("O número " + numero + " é negativo.");
        } else {
            System.out.println("O número " + numero + " é positivo.");
        }
    }
    
    /**
     * Questão número 3
     */
    public static void Sexo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu sexo 'F' ou 'M': ");
        String letra = scan.next();
        switch (letra) {
            case "F":
                System.out.println("Sexo Feminino.");
                break;
            case "M":
                System.out.println("Sexo Masculino.");
                break;
            default:
                System.out.println("Sexo Inválido.");
                break;
        }
    }
    
    /**
     * Questão número 4
     */
    public static void Letra() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite qualquer letra do alfabeto: ");
        String letra = scan.next();
        switch (letra) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("A letra " + letra + " é uma vogal.");
                break;
            default:
                System.out.println("A letra " + letra + " é uma consoante.");
        }
    }
    
    /**
     * Questão número 5
     */
    public static void Media() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite suas duas notas: ");
        double nota1 = scan.nextDouble();
        double nota2 = scan.nextDouble();
        double media = (nota1 + nota2)/2;
        if (media >= 7 && media < 10) {
            System.out.println("Aprovado");
        } else if (media == 10) {
            System.out.println("Aprovado com Distinção");
        } else {
            System.out.println("Reprovado");
        }
    }
    
    /**
     * Questão número 6
     */
    public static void MaiorNum() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite três números quaisquer: ");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double num3 = scan.nextDouble();
        if (num1 > num2 && num1 > num3) {
            System.out.println("O maior número é: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("O maior número é: " + num2);
        } else {
            System.out.println("O maior número é: " + num3);
        }
    }
    
    /**
     * Questão número 7
     */
    public static void MaiorMenorNum() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite três números quaisquer: ");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double num3 = scan.nextDouble();
        if (num1 > num2 && num1 > num3) {
            System.out.println("O maior número é: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("O maior número é: " + num2);
        } else {
            System.out.println("O maior número é: " + num3);
        }
        if (num1 < num2 && num1 < num3) {
            System.out.println("O menor número é: " + num1);
        } else if (num2 < num1 && num2 < num3) {
            System.out.println("O menor número é: " + num2);
        } else {
            System.out.println("O menor número é: " + num3);
        }
    }
    
    /**
     * Questão número 8
     */
    public static void MenorPreco() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o preço dos três produtos: ");
        double preco1 = scan.nextDouble();
        double preco2 = scan.nextDouble();
        double preco3 = scan.nextDouble();
        if (preco1 < preco2 && preco1 < preco3) {
            System.out.println("Você deve comprar o produto no valor de: " + preco1 + " reais.");
        } else if (preco2 < preco1 && preco2 < preco3) {
            System.out.println("Você deve comprar o produto no valor de: " + preco2 + " reais.");
        } else {
            System.out.println("Você deve comprar o produto no valor de: " + preco3 + " reais.");
        }
    }
    
    /**
     * Questão número 9
     */
    public static void NumDecrescente() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite três números quaisquer: ");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double num3 = scan.nextDouble();
        if (num1 < num2 && num1 < num3 && num2 < num3) {
            System.out.println(num3 + " - " + num2 + " - " + num1);
        } else if (num1 < num2 && num1 < num3 && num3 < num2) {
            System.out.println(num2 + " - " + num3 + " - " + num1);
        } else if (num2 < num1 && num2 < num3 && num1 < num3) {
            System.out.println(num3 + " - " + num1 + " - " + num2);
        } else if (num2 < num1 && num2 < num3 && num3 < num1) {
            System.out.println(num1 + " - " + num3 + " - " + num2);
        } else if (num3 < num1 && num3 < num2 && num1 < num2) {
            System.out.println(num2 + " - " + num1 + " - " + num3);
        } else if (num3 < num1 && num3 < num2 && num2 < num1) {
            System.out.println(num1 + " - " + num2 + " - " + num3);
        }
    }
    
    /**
     * Questão número 10
     */
    public static void Turno() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o turno que você estuda: ");
        String turno = scan.next();
        switch (turno) {
            case "M":
                System.out.println("Bom Dia!");
                break;
            case "V":
                System.out.println("Boa Tarde!");
                break;
            case "N":
                System.out.println("Boa Noite!");
                break;
            default:
                System.out.println("Valor Inválido.");
                break;
        }
    }
    
    /**
     * Questão número 11
     */
    public static void Aumento() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor do seu salário: ");
        double salario = scan.nextDouble();
        double aumento;
        if (salario <= 280) {
            aumento = 0.2;
        } else if (salario > 280 && salario <= 700) {
            aumento = 0.15;
        } else if (salario > 700 && salario <= 1500) {
            aumento = 0.1;
        } else {
            aumento = 0.05;
        }
        double valorAumento = salario*aumento;
        double reajuste = salario + valorAumento;
        double percentual = aumento * 100;
        System.out.println("Salario antes do reajuste: R$ " + salario);
        System.out.println("Percentual de aumento aplicado: " + percentual + "%");
        System.out.println("Valor do aumento: R$ " + valorAumento);
        System.out.println("Novo salário: R$ " + reajuste);
    }
    
    /**
     * Questão número 12
     */
    public static void Salario() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor que você ganha por hora e quantas horas você trabalha por mês: ");
        int valorHora = (int) scan.nextDouble();
        int horasMes = scan.nextInt();
        double salario = valorHora * horasMes;
        double inss = salario * 0.1;
        double impRenda;
        double fgts = salario * 0.11;       
        if (salario <= 900) {
            impRenda = 0;
        } else if (salario > 900 && salario <= 1500) {
            impRenda = 0.05;
        } else if (salario > 1500 && salario <= 2500) {
            impRenda = 0.1;
        } else {
            impRenda= 0.2;
        }
        int ir = (int) (impRenda *100);
        int inssP = (int) (0.1*100);
        int fgtsP = (int) (0.11*100);
        double imposto = salario * impRenda;
        double descontos = inss + imposto;
        double salarioLiq = salario - (descontos);
        System.out.println("Salário Bruto: (" + valorHora + " * " + horasMes + ")\t: R$ " +  salario);
        System.out.println("(-) IR (" + ir + "%)\t\t\t: R$ " + imposto);
        System.out.println("(-) INSS (" + inssP + "%)\t\t\t: R$ " + inss);
        System.out.println("FGTS (" + fgtsP + "%)\t\t\t: R$ " + fgts);
        System.out.println("Total de descontos\t\t: R$ " + descontos);
        System.out.println("Salário Líquido\t\t\t: R$ " + salarioLiq);
    }
    
    /**
     * Questão número 13
     */
    public static void DiasSemana() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha o número correspondente ao dia da semana: ");
        int numero = scan.nextInt();
        switch (numero) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Não existe este dia!");
        }
    }
    
    /**
     * Questão número 14
     */
    public static void Aprovacao() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite suas duas notas: ");
        double nota1 = scan.nextDouble();
        double nota2 = scan.nextDouble();
        double media = (nota1 + nota2)/2;
        String conceito = null;
        if (media >= 9 && media <= 10) {
            conceito = "A";
        } else if (media >= 7.5 && media < 9) {
            conceito = "B";
        } else if (media >= 6.0 && media < 7.5) {
            conceito = "C";
        } else if (media >= 4 && media < 6) {
            conceito = "D";
        } else if (media >= 0 && media < 4) {
            conceito = "E";
        } else {
            System.out.println("Nota impossível!");
        }
        System.out.println("Nota 1:" + nota1);
        System.out.println("Nota 2:" + nota2);
        System.out.println("Média: " + media);
        System.out.println("Conceito: " + conceito);
        
        switch (conceito) {
            case "A":
            case "B":
            case "C":
                System.out.println("APROVADO");
                break;
            case "D":
            case "E":
                System.out.println("REPROVADO");
                break;
            default:
                System.out.println("Erro!");
                break;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Escolha o número da questão que desejas executar entre 1 e 23: ");
        int escolha = ler.nextInt();

        switch (escolha) {
            case 1:
                NumMaior();
                break;
            case 2:
                PosNeg();
                break;
            case 3:
                Sexo();
                break;
            case 4:
                Letra();
                break;
            case 5:
                Media();
                break;
            case 6:
                MaiorNum();
                break;
            case 7:
                MaiorMenorNum();
                break;
            case 8:
                MenorPreco();
                break;
            case 9:
                NumDecrescente();
                break;
            case 10:
                Turno();
                break;
            case 11:
                Aumento();
                break;
            case 12:
                Salario();
                break;
            case 13:
                DiasSemana();
                break;
            case 14:
                Aprovacao();
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
