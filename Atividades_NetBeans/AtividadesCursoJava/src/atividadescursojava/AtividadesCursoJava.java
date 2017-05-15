package atividadescursojava;

import java.util.Scanner;

/**
 * @author pedro_victor
 * Lista de Atividades do curso disponíveis em:
 * https://www.slideshare.net/loianeg/curso-java-bsico-exerccios-aulas-11-12-13
 */
public class AtividadesCursoJava {
    
    /**
     * Questão número 1
     */
    public static void Mensagem() {
        System.out.println("Alo mundo");
    }
    
    /**
     * Questão número 2
     */
    public static void Numero() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite qualquer número: ");
        double num = scan.nextDouble();
        System.out.println("O número informado foi: " + num);
    }
    
    /**
     * Questão número 3
     */
    public static void Soma() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite dois números quaisquer: ");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double soma = num1 + num2; 
        System.out.println("A soma dos números informado é: " + soma);
    } 
    
    /**
     * Qustão número 4
     */
    public static void Media() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite suas 4 notas bimestrais: ");
        double nota1 = scan.nextDouble();
        double nota2 = scan.nextDouble();
        double nota3 = scan.nextDouble();
        double nota4 = scan.nextDouble();
        double somaNotas = nota1 + nota2 + nota3 + nota4;
        double media = somaNotas/4;
        System.out.println("Sua média neste Bimestre é: " + media);
    }
    
    /**
     * Questão número 5
     * @param metro - quantidade informada como argumento no main()
     */
    public static void MetrosCentimetros(double metro) {
        double centimetro;
        centimetro = 100 * metro;
        System.out.println(metro + " metro(s) são " + centimetro + " centimetro(s)!");
    }
    
    /**
     * Questão número 6
     */
    public static void AreaCirculo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o raio (em metros) do Circulo em questão: ");
        double raio = scan.nextDouble();
        double pi = 3.14;
        double area = pi * (raio*raio);
        System.out.println("A área do círculo em questão é de aproximadamente: " + area + " m²!");
    }
    
    /**
     * Questão número 7
     * @param lado - informado como argumento no main()
     */
    public static void DobroAreaQuadrado(double lado) {
        double area = lado*lado;
        double dobroArea = 2*area;
        System.out.println("O dobro da área deste quadrado é: " + dobroArea);
    }
    
    /**
     * Questão número 8
     */
    public static void Salario() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor que você ganha por hora e quantas horas você trabalha por mês: ");
        double valorHora = scan.nextDouble();
        int horasMes = scan.nextInt();
        double salario = valorHora * horasMes;
        System.out.println("O seu salário é de " + salario + " reais.");
    }
    
    /**
     * Questão número 9
     */
    public static void Graus() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a temperatura em Farenheit: ");
        int temperaturaF = scan.nextInt();
        double temperaturaC = (5 * (temperaturaF - 32)/9);
        System.out.println("A temperatura em graus Celsius é de aproximadamente: " + temperaturaC + " ºC.");
    }
    
    /**
     * Questão número 10
     */
    public static void GrausInverso() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius: ");
        int temperaturaC = scan.nextInt();
        double temperaturaF = (1.8 * temperaturaC) + 32;
        System.out.println("A temperatura em graus Farenheit é de aproximadamente: " + temperaturaF + " ºF.");
    }
    
    /**
     * Questão número 11
     */
    public static void Resultados() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite 2 (dois) números inteiros e 1 (um) número real: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        double num3 = scan.nextDouble();
        int letraA = (num1*2) * (num2/2);
        double letraB = (num1*3) + num3;
        double letraC = num3 * num3 * num3;
        System.out.println("Resultado da letra a: " + letraA);
        System.out.println("Resultado da letra b: " + letraB);
        System.out.println("Resultado da letra c: " + letraC);
    }
    
    /**
     * Questão número 12
     */
    public static void PesoIdeal() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite sua altura: ");
        double altura = scan.nextDouble();
        double pesoIdeal = (72.7*altura) - 58;
        System.out.println("Seu peso ideal seria em torno dos " + pesoIdeal + " quilos.");
    }
    
    /**
     * Questão 13
     */
    public static void SalarioLiquido() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor que você ganha por hora e quantas horas você trabalha por mês: ");
        double valorHora = scan.nextDouble();
        int horasMes = scan.nextInt();
        double salario = valorHora * horasMes;
        double inss = salario * 0.08;
        double sindicato = salario * 0.05;
        double impRenda = salario * 0.11;
        double descontos = inss + sindicato + impRenda;
        double salarioLiq = salario - (descontos);
        System.out.println("O seu salário bruto é de " + salario + " reais.");
        System.out.println("Pago ao INSS " + inss + " reais.");
        System.out.println("Pago ao sindicato " + sindicato + " reais.");
        System.out.println("Total descontos: " + descontos);
        System.out.println("O seu salário liquido é de " + salarioLiq + " reais.");
    }
    
    /**
     * Questã0 número 14
     */
    public static void TempoDownload() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite tamanho do arquivo (em MB) para download e a velociedade do seu link de Internet (em Mbps): ");
        double tamanhoArq = scan.nextDouble();
        double velocidadeNet = scan.nextDouble();
        double tempoSeg = tamanhoArq/velocidadeNet;
        int tempoMin = (int) (tempoSeg/60);
        System.out.println("O tempo de download deste arquivo será de aproximadamente " + tempoMin + " minuto(s).");  
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Escolha o número da questão que desejas executar entre 1 e 14: ");
        int escolha = ler.nextInt();
        
        switch (escolha) {
            case 1:
                Mensagem();
                break;
            case 2:
                Numero();
                break;
            case 3:
                Soma();
                break;
            case 4:
                Media();
                break;
            case 5:
                MetrosCentimetros(752.4);
                break;
            case 6:
                AreaCirculo();
                break;
            case 7:
                DobroAreaQuadrado(10);
                break;
            case 8:
                Salario();
                break;
            case 9:
                Graus();
                break;
            case 10:
                GrausInverso();
                break;
            case 11:
                Resultados();
                break;
            case 12:
                PesoIdeal();
                break;
            case 13:
                SalarioLiquido();
                break;
            case 14:
                TempoDownload();
                break;
            default:
                System.out.println("Não existe essa questão!");
                break;
        }
    }
}
