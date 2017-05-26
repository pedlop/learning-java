package br.ufg.inf.dsc.servidor;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AtenderCliente implements Runnable {

	private Socket cliente;
	
	public static Map<String, String> carros = new HashMap<>();
	static {
		carros.put("audi", "Audi – As quatro argolas unidas representam as marcas alemãs que formaram a Auto Union, fundada em 1947. São elas: Horch, Audi, Wanderer e DKW. No dia 1º de janeiro de 1985, a Auto Union passou a se chamar Audi AG, com sede empresarial em Nekarsulm, na Alemanha");
		carros.put("alfa", "Alfa Romeo – O símbolo é composto pela bandeira com a cruz vermelha (brasão da cidade de Milão) e pela serpente devorando um homem (símbolo da família real milanesa). O nome do fabricante italiano, fundado em 1910, é a combinação da sigla A.L.F.A (Anonima Lombarda Fabbrica Automobili) com o sobrenome do engenheiro Nicola Romeo, fundador da marca");
		carros.put("bmw", "Bayerische Motoren Werke -> BMW – Representa uma hélice de avião, nas cores azuis e pretas. Foi criada depois que os irmãos Karl Rath e Gustav Otto conseguiram permissão do governo alemão para produzir motores de avião, em 1917. O primeiro carro a ter o símbolo da marca alemã foi o modelo Dixi 3/15, de 1928. BMW é a abreviatura de “Fábrica de Motores da Bavária” (Bayerische Motoren Werk).");
		carros.put("cadillac", "Cadillac – Marca famosa da General Motors, o seu emblema é derivado do brasão da família de Sir Antoine de la Mothe Cadillac, o fundador da empresa. Desperta muita admiração no mundo todo, com sua grinalda de plumas – um verdadeiro clássico!");
		carros.put("chevrolet", "Chevrolet – Diz a lenda que o logotipo em forma de gravata borboleta foi baseado na ilustração do papel de parede de um hotel em Paris onde um dos fundadores da marca, William Durant, teria se hospedado, em 1908. Durant guardou a amostra na carteira para usá-la como símbolo da marca de automóvel que fundou em parceria com o piloto Louis Chevrolet");
		carros.put("chrysler", "Chrysler – A antiga estrela de cinco pontas, formada a partir de um pentágono com cinco triângulos, representa a precisão da engenharia desta montadora norte-americana. A logo atual é um escudo com asas, que já havia sido foi adotado entre as décadas de 30 e 50");
		carros.put("citroen", "Citroën – Os dois “V” invertidos, conhecidos na França como “Deux Chevron”, simbolizam a engrenagem bi-helicoidal criada pelo engenheiro Andre Citroën, fundador desta tradicional marca francesa");
		carros.put("ferrari", "Ferrari – O cavalo preto empinado sobre o fundo amarelo era usado no avião de Francesco Barraca, piloto de caça italiano morto na Primeira Guerra Mundial. A pedido da mãe de Barraca, o comendador Enzo Ferrari passou a adotar o emblema em seus carros a partir de 1923.");
		carros.put("fiat", "Fábrica Italiana de Automóveis de Turim -> Fiat – A sigla em letras brancas sobre fundo azul significa Fábrica Italiana de Automóveis de Turim. Por algum tempo as 4 letras foram substituídas por 4 barras inclinadas (brancas ou cromadas) mas, atualmente, o símbolo remonta aos primeiros veículos fabricados pela Fiat.");
		carros.put("ford", "Ford – O símbolo oval com a assinatura de Henry Ford permanece quase inalterado desde a fundação da empresa, em 1903. Hoje ele inspira o desenho das grades dos carros da marca");
		carros.put("lamborghini", "Lamborghini – O touro que aparece no símbolo dos esportivos italianos é uma homenagem do fundador da marca, Ferruccio Lamborghini, às lutas de touro, pelas quais era fanático. Tanto que alguns carros da marca (Diablo e Murciélago) têm nomes de touros famosos");
		carros.put("maserati", "Maserati – O logotipo da marca italiana representa o tridente de Netuno, símbolo da cidade de Bolonha. A fábrica foi fundada em 1919 pelos irmãos Carlo, Bindo, Alfieri, Ettore e Ernesto Maserati. Hoje, simboliza uma das mais cultuadas linhas de automóveis esportivos de todo o mundo.");
		carros.put("mb", "Mercedes-Benz – A estrela de três pontas representa a fabricação de motores para uso na terra, água e ar. Surgiu depois que Gottlieb Daimler enviou cartão postal para sua mulher, dizendo que a estrela impressa no cartão iria brilhar sobre sua obra.");
		carros.put("mitsubishi", "Mitsubishi – Um diamante de três pontas que remete à resistência e preciosidade. O símbolo veio do nome da marca: “Mitsu” significa três em japonês; “Bishi”, diamante.");
		carros.put("nissan", "Nissan – Originalmente possuia uma moldura azul (cor do céu e do sucesso na cultura japonesa) e um círculo vermelho ao fundo (que representa a luz do sol e a sinceridade), uma referência ao provérbio “sinceridade leva ao sucesso”. Hoje utiliza uma versão estilizada, somente em tons de cinza. Nissan significa “irmão mais velho”");
		carros.put("peugeot", "Peugeot – O leão estilizado, que representa a “qualidade superior da marca” e homenageia a cidade de Lion (França), é usado desde 1919. Desde então, o logotipo sofreu sete modificações.");
		carros.put("porsche", "Porsche – São dois brasões sobrepostos – o da região de Baden-Württemberg e o da cidade de Stutgartt (o cavalo empinado), sede da marca alemã. A marca adotou o símbolo a partir de 1949");
		carros.put("renault", "Renault - O losango parecido com um diamante foi adotado em 1925, para sugerir sofisticação e prestígio. Desde então, teve quatro mudanças de visual. O primeiro símbolo, de 1898, era dois “R”, em homenagem aos irmãos Louis e Marcel Renault, fundadores da marca francesa");
		carros.put("rr", "Rolls Royce - Os dois “R” do logotipo eram originalmente estampados em vermelho. Com a morte de seus dois fundadores, Charles Rolls (1910) e Frederick Royce (1933), as letras passaram a ser grafadas em preto, em sinal de luto.");
		carros.put("saab", "A sueca Saab começou a fabricar aviões em 1938. O nome vem de Svenska Aeroplan Akteebolaget. A produção de automóveis começou em 1959. O logotipo circular tem um animal mitológico com cabeça de águia e garras de leão, símbolo da vigilância. O azul de fundo é a cor da marinha.");
		carros.put("subaru", "Subaru - É a divisão automotiva da Fuji Heavy Industries Ltd. Na língua japonesa, Subaru tem o significado de “plêiade” (conjunto de estrelas). Isso explica a constelação adotada como logotipo da marca.");
		carros.put("vw", "Volkswagen - Um dos mais familiares símbolos entre as marcas de veículos, este círculo envolve um “V” e um “W”, iniciais de volks (em alemão: povo) e wagen (vagão, veículo), ou seja: carro do povo, ou popular, já naquela época!");
		carros.put("volvo", "O polêmico logotipo da marca sueca (que hoje é controlada pela Ford) é o símbolo da masculinidade e por esse motivo já foi muito contestado por movimentos feministas na Europa. Esse símbolo era usado pelos alquimistas para representar o metal, uma alusão que a Volvo fez à durabilidade dos seus veículos.");
	}

	public AtenderCliente(Socket cliente) {
		this.cliente = cliente;
	}
	@Override
	public void run() {
		try {
			Scanner receberDadosDoCliente;
			receberDadosDoCliente = new Scanner(this.cliente.getInputStream());
			PrintStream saidaDadosParaCliente = new PrintStream(this.cliente.getOutputStream());
			while(true){
				String comando = receberDadosDoCliente.nextLine();
				System.out.println(comando);
				if (carros.containsKey(comando)){
					String resposta = carros.get(comando);
					saidaDadosParaCliente.println(resposta);
				}else if (comando.equals("all")) {
					for (String key : carros.keySet()) {
						System.out.println(key);
						String result = carros.get(key);
						saidaDadosParaCliente.println(result);
					}
				}else if (comando.equals("fim")){
					saidaDadosParaCliente.println("Usuário desconectado!!!");
					break;
				}else{
					saidaDadosParaCliente.println("Solicitação invalida!!!");
				}
			}
			receberDadosDoCliente.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
