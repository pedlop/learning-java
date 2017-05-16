package atividades2cursojava;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Lista de Atividades 2 do curso disponíveis em:
 * https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15
 * IF-ELSE/SWITCH-CASE
 *
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
        double media = (nota1 + nota2) / 2;
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
        double valorAumento = salario * aumento;
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
            impRenda = 0.2;
        }
        int ir = (int) (impRenda * 100);
        int inssP = (int) (0.1 * 100);
        int fgtsP = (int) (0.11 * 100);
        double imposto = salario * impRenda;
        double descontos = inss + imposto;
        double salarioLiq = salario - (descontos);
        System.out.println("Salário Bruto: (" + valorHora + " * " + horasMes + ")\t: R$ " + salario);
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
        double media = (nota1 + nota2) / 2;
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
     * Questão número 15
     */
    public static void Triangulo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite três valores, para os lados de um triângulo: ");
        int lado1 = scan.nextInt();
        int lado2 = scan.nextInt();
        int lado3 = scan.nextInt();
        if (((lado1 + lado2) > lado3) || ((lado1 + lado3) > lado2) || ((lado2 + lado3) > lado1)) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Temos em questão um Triângulo Equilátero!");
            } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                System.out.println("Temos em questão um Triângulo Isósceles!");
            } else {
                System.out.println("Temos em questão um Triângulo Escaleno!");
            }
        } else {
            System.out.println("Não temos nenhum triângulo em questão!");
        }
    }

    /**
     * Questão número 16
     */
    public static void EquacaoSegundoGrau() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Para calcular as raizes informe os valores de: ");
        System.out.println("a: ");
        int a = scan.nextInt();
        if (a == 0) {
            System.out.println("Com o valor de 'a' zerado esta equação não é do Segundo Grau!");
        } else {
            System.out.println("b: ");
            int b = scan.nextInt();
            System.out.println("c: ");
            int c = scan.nextInt();
            double delta = ((b * b) - (4 * a * c));
            double bhaskaraRaiz1 = (-b + (Math.sqrt(delta))) / (2 * a);
            double bhaskaraRaiz2 = (-b - (Math.sqrt(delta))) / (2 * a);
            if (delta < 0) {
                System.out.println("Equação não possui raízes reais!");
            } else if (delta == 0) {
                System.out.println("Equação possui apenas 1 (uma) raíz real!");
            } else {
                System.out.println("Equação possui 2 (duas) raízes reais!\nPrimeira Raiz = " + bhaskaraRaiz1 + "\nSegunda Raiz = " + bhaskaraRaiz2);
            }
        }
    }
    
    /**
     * Questão número 17
     */
    public static void Bissexto() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com um ano: ");
        int ano = scan.nextInt();
        if ( (ano % 4) == 0) {
            System.out.println("O ano " + ano + " é bissexto!");
        } else {
            System.out.println("O ano " + ano + " NÃO é bissexto!");
        }
    }
    
    /**
     * Questão número 18
     */
    public static void ParImpar() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com um número inteiro: ");
        int num = scan.nextInt();
        if ( (num % 2) == 0) {
            System.out.println("O número " + num + " é PAR!");
        } else {
            System.out.println("O numéro " + num + " é IMPAR!");
        }
    }
    
    /**
     * Questão número 19
     */
    public static void Operacao() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com dois números: ");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        String parImpar;
        String posNeg;
        System.out.println("Digite o número da operação que desejas realizar!");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        int resultado = scan.nextInt();
        switch (resultado) {
            case 1:
                double soma = num1 + num2;
                if (soma < 0) {
                    posNeg = "Negativo";
                } else {
                    posNeg = "Positivo";
                }
                if ( (soma%2) == 0) {
                    parImpar = "Par";
                } else {
                    parImpar = "Impar";
                }
                System.out.println("O resultado da soma é: " + soma + "\nEste número é " + posNeg + " e " + parImpar);
                break;
            case 2:
                double sub = num1 - num2;
                if (sub < 0) {
                    posNeg = "Negativo";
                } else {
                    posNeg = "Positivo";
                }
                if ( (sub%2) == 0) {
                    parImpar = "Par";
                } else {
                    parImpar = "Impar";
                }
                System.out.println("O resultado da soma é: " + sub + "\nEste número é " + posNeg + " e " + parImpar);
                break;
            case 3:
                double mult = num1 * num2;
                if (mult < 0) {
                    posNeg = "Negativo";
                } else {
                    posNeg = "Positivo";
                }
                if ( (mult%2) == 0) {
                    parImpar = "Par";
                } else {
                    parImpar = "Impar";
                }
                System.out.println("O resultado da soma é: " + mult + "\nEste número é " + posNeg + " e " + parImpar);
                break;
            case 4:
                double div = num1 * num2;
                if (div < 0) {
                    posNeg = "Negativo";
                } else {
                    posNeg = "Positivo";
                }
                if ( (div%2) == 0) {
                    parImpar = "Par";
                } else {
                    parImpar = "Impar";
                }
                System.out.println("O resultado da soma é: " + div + "\nEste número é " + posNeg + " e " + parImpar);
                break;
        }
    }
    
    /**
     * Questão número 20
     */
    public static void Crime() {
        int cont = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Responda com sim ou nao.\nTelefonou para a vítima?");
        String resposta1 = scan.nextLine();
        if ("sim".equals(resposta1)) {
            cont++;
        }
        System.out.println("Esteve no local do crime?");
        String resposta2 = scan.nextLine();
        if ("sim".equals(resposta2)) {
            cont++;
        }
        System.out.println("Mora perto da vítima?");
        String resposta3 = scan.nextLine();
        if ("sim".equals(resposta3)) {
            cont++;
        }
        System.out.println("Devia para a vítima?");
        String resposta4 = scan.nextLine();
        if ("sim".equals(resposta4)) {
            cont++;
        }
        System.out.println("Já trabalhou para a vítima?");
        String resposta5 = scan.nextLine();
        if ("sim".equals(resposta5)) {
            cont++;
        }
        
        switch (cont) {
            case 2:
                System.out.println("Suspeita!");
            case 3:
            case 4:
                System.out.println("Cúmplice!");
                break;
            case 5:
                System.out.println("Assassino!");
                break;
            default:
                System.out.println("Inocente!");
        }
    }
    
    /**
     * Questão número 21
     */
    public static void Posto() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantidade de litros vendidos: ");
        double litros = scan.nextDouble();
        System.out.println("Tipo de combustível, A-álcool ou G-gasolina: ");
        String combustivel = scan.next();
        double totalA = litros*1.9;
        double totalG = litros*2.5;
        double desconto = 0;
        if (litros <= 20 && "A".equals(combustivel)) {
            desconto = 0.03*totalA;
        } else if (litros > 20 && "A".equals(combustivel)) {
            desconto = 0.05*totalA;
        } else if (litros <= 20 && "G".equals(combustivel)) {
            desconto = 0.04*totalG;
        } else if (litros > 20 && "G".equals(combustivel)) {
            desconto = 0.06*totalG;
        } else {
            System.out.println("Erro!");
        }
        double finalA = totalA - desconto;
        double finalG = totalG - desconto;
        switch (combustivel) {
            case "A":
                System.out.println("Valor Total - Álcool SEM desconto: " + totalA);
                System.out.println("Valor Final - Álcool COM desconto (a se pagar): " + finalA);
                break;
            case "G":
                System.out.println("Valor Total - Gasolina SEM desconto: " + totalG);
                System.out.println("Valor Final - Gasolina COM desconto (a se pagar): " + finalG);
                break;
            default:
                System.out.println("Combustível inexistente!");
                break;
        }
    }
    
    /**
     * Questão número 22
     */
    public static void Fruteira() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantidade de morangos adquiridos(em Kg): ");
        double qtdMorango = scan.nextDouble();
        System.out.println("Quantidade de maçãs adquiridas (em Kg): ");
        double qtdMaca = scan.nextDouble();
        double qtdFrutas = qtdMorango + qtdMaca;
        double valorMorango;
        double valorMaca;
        if (qtdMorango <= 5) {
            valorMorango = 2.5*qtdMorango;
        } else {
            valorMorango = 2.2*qtdMorango;
        }
        if (qtdMaca <= 5) {
            valorMaca = 1.8*qtdMaca;
        } else {
            valorMaca = 1.5*qtdMaca;
        }
        double valorTotal = valorMorango + valorMaca;
        if (qtdFrutas > 8 || valorTotal > 25) {
            valorTotal = valorTotal - (valorTotal*0.1);
        }
        System.out.println("Valor a se pagar: R$ " + valorTotal);
    }
    
    public static void TabajaraHiper() {
        DecimalFormat df = new DecimalFormat("R$ #,###.00");
        DecimalFormat kg = new DecimalFormat("#.# kg");
        Scanner scan = new Scanner(System.in);
        System.out.println("Tipo de carne, F-File Duplo ou A-Alcatra ou P-Picanha: ");
        String carne = scan.next();
        System.out.println("Quantidade de quilos de carne comprada: ");
        double quilos = scan.nextDouble();
        System.out.println("Tipo de pagamento, CT-Catão Tabajara ou D-Dinheiro ou C-Cheque ou CA-Cartão Qualquer: ");
        String card = scan.next();
        double preco = 0;
        double valorDesconto = 0;
        double precoDesconto = 0;
        double desconto = 0.05;
        switch (card) {
            case "CT":
                //card = "Cartão Tabajara";
                if ("F".equals(carne) && quilos <= 5) {
                    preco = 4.9*quilos;
                    carne = "File Duplo";
                } else if ("F".equals(carne) && quilos > 5) {
                    preco = 5.8*quilos;
                    carne = "File Duplo";
                } else if ("A".equals(carne) && quilos <= 5) {
                    preco = 5.9*quilos;
                    carne = "Alcatra";
                } else if ("A".equals(carne) && quilos > 5) {
                    preco = 6.8*quilos;
                    carne = "Alcatra";
                } else if ("P".equals(carne) && quilos <= 5) {
                    preco = 6.9*quilos;
                    carne = "Picanha";
                } else if ("P".equals(carne) && quilos > 5) {
                    preco = 7.8*quilos;
                    carne = "Picanha";
                } else {
                    System.out.println("Error!");
                }
                valorDesconto = preco * desconto;
                precoDesconto = preco - valorDesconto;
                break;
            case "D":
                //card = "Dinheiro";
            case "C":
                //card = "Cheque";                
            case "CA":
                //card = "Cartão";                
                if ("F".equals(carne) && quilos <= 5) {
                    preco = 4.9*quilos;
                    carne = "File Duplo";
                } else if ("F".equals(carne) && quilos > 5) {
                    preco = 5.8*quilos;
                    carne = "File Duplo";
                } else if ("A".equals(carne) && quilos <= 5) {
                    preco = 5.9*quilos;
                    carne = "Alcatra";
                } else if ("A".equals(carne) && quilos > 5) {
                    preco = 6.8*quilos;
                    carne = "Alcatra";
                } else if ("P".equals(carne) && quilos <= 5) {
                    preco = 6.9*quilos;
                    carne = "Picanha";
                } else if ("P".equals(carne) && quilos > 5) {
                    preco = 7.8*quilos;
                    carne = "Picanha";
                } else {
                    System.out.println("Error!");
                }
                valorDesconto = 0;
                precoDesconto = preco;
                break;
            default:
                System.out.println("Não existe.");
                break;
        }
        System.out.println("|---------------------------------------|");
        System.out.println("|Tipo de Carne\t\t: " + carne + "\t|");
        System.out.println("|Quantidade de Carne\t: " + (kg.format(quilos)) + "\t\t|");
        System.out.println("|Preço Total\t\t: " + (df.format(preco)) + "\t|");
        System.out.println("|Tipo de Pagamento\t: " + card + "\t\t|");
        System.out.println("|Valor desconto\t\t: " + (df.format(valorDesconto)) + "\t|");
        System.out.println("|Valor a pagar\t\t: " + (df.format(precoDesconto)) + "\t|");
        System.out.println("|---------------------------------------|");
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
                Triangulo();
                break;
            case 16:
                EquacaoSegundoGrau();
                break;
            case 17:
                Bissexto();
                break;
            case 18:
                ParImpar();
                break;
            case 19:
                Operacao();
                break;
            case 20:
                Crime();
                break;
            case 21:
                Posto();
                break;
            case 22:
                Fruteira();
                break;
            case 23:
                TabajaraHiper();
                break;
            default:
                System.out.println("Não existe essa questão!");
                break;
        }
    }

}
