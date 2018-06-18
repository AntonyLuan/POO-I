package logica;

import java.util.Scanner;

import modelo.Evento;
import modelo.Lance;
import modelo.Leilao;
import modelo.Pessoa;
import modelo.Produto;
public class Principal {

	public static void main(String[] args){
		Evento evento = null;
		Scanner scan = new Scanner(System.in);
		System.out.println("Bem vindo!");
		int option = 0;
		while(option != 3) {
			printMenu();
			option = scan.nextInt();
			scan.nextLine();
			
			if(option == 1) {
				evento = novoEvento(scan);
				System.out.println("Evento criado com sucesso;");
			}
			if(option == 2) {
				if(evento == null) {
					System.out.println("Nenhum evento encontrado.\nNada Aconteceu.");
				} else {
					for(Leilao leilao : evento.getLeilao()) {
						System.out.println("Selecione as pessoas que irão participar desse leilão: ");
						for(Pessoa pessoa : evento.getPessoas()) {
							pessoa.printPessoa();
							System.out.println("Participar?\n1 - Sim\nQualquer outro valor - Não");
							option = scan.nextInt();
							scan.nextLine();
							if(option == 1) {
								leilao.cadastrarPessoa(pessoa);
							}
							System.out.println("\n");
						}
						System.out.println("O produto a ser leiloado é: "+ leilao.getProduto().getNome());
						System.out.println("Valor inicial de lance: " + leilao.getProduto().getValorM());
						leilao.setRodada(1);;
						int doulhe = 0;
						while(doulhe < 3) {
							for(Pessoa pessoa : leilao.getPessoas()) {
								if(leilao.getLanceAtual() != null) {
									if(leilao.getLanceAtual().getPessoa() == pessoa) {
										continue;
									}
								}
								pessoa.printPessoa();
								System.out.println("Rodada - " + leilao.getRodada() + " / Dou-lhe - " + doulhe);
								System.out.println("Dar lance?\n1 - Sim\nQualquer outro valor - Não");
								option = scan.nextInt();
								scan.nextLine();
								if(option == 1) {
									doulhe = 0;
									System.out.println("Informe o valor do lance: ");
									System.out.println("(Maior ou igual que o valor inicial ou R$5,00 maior que o anterior.)");
									System.out.println(">> ");
									Lance lance = new Lance(scan.nextFloat(), pessoa);
									scan.nextLine();
									if(lance.getPessoa().getCash() - lance.getValor() < 0) {
										System.out.println("Saldo insuficiente. Lance não realizado.");
									}else if(leilao.getLanceAtual() != null){
										if(lance.getValor() - leilao.getLanceAtual().getValor() < 5) {
											System.out.println("P lance deve ser R$5,00 maior que o anterior. Lance não realizado.");
										}
									}else {
										pessoa.pushLance(lance);
										leilao.darLance(lance);
									}
								}
								
							}
							leilao.setRodada(leilao.getRodada()+1);
							doulhe++;
						}
						if(leilao.getLanceAtual() == null) {
							System.out.println("Produto não arrematado.");
						}else {
							leilao.vender();
						}
						
					}
				}
				option = 0;
				while(option != 5) {
					menuEvento();
					option = scan.nextInt();
					if(option == 1) {
						System.out.println("A pessoa que fez mais lances foi: ");
						evento.maisLances().printPessoa();
						System.out.println("Lances: " + evento.maisLances().getLancesQtd());
					}
					if(option == 2) {
						System.out.println("A pessoa que comprou mais produtos foi: ");
						evento.maisProdutos().printPessoa();
						System.out.println("Produtos: " + evento.maisProdutos().getProdutosQtd());
					}
					if(option == 3) {
						System.out.println("A pessoa que gastou a maior quantia foi: ");
						evento.maiorQuantia().printPessoa();
						System.out.println("Quantia: " + evento.maiorQuantia().valorGasto());
					}
					if(option == 4) {
						System.out.println("A pessoa que gastou a menor quantia foi: ");
						evento.menorQuantia().printPessoa();
						System.out.println("Quantia: " + evento.menorQuantia().valorGasto());
					}
				}
				
				
				
			}
			
		}
		System.out.println("Volte sempre");
		

	}
	
	private static void printMenu() {
		System.out.println("\nOpções:\n");
		System.out.println("1 - Cadastrar Evento");
		System.out.println("2 - Iniciar Evento");
		System.out.println("3 - Sair");
		System.out.println("\n>> ");
	}
	
	private static void menuEvento() {
		System.out.println("\nOpções:\n");
		System.out.println("1 - Participante que realizou mais lances.");
		System.out.println("2 - Participante que arrematou mais produtos.");
		System.out.println("3 - Participante que gastou a maior quantia.");
		System.out.println("4 - Participante que gastou a menos quantiar quantia.");
		System.out.println("5 - Sair");
		System.out.println("\n>> ");
	}
	
	private static Evento novoEvento(Scanner scan) {
		Evento evento = new Evento();
		System.out.println("Insira o nome do evento: ");
		evento.setNome(scan.nextLine());
		int option = 1;
		System.out.println("Agora adicione os participantes. (Minimo 1)\n");
		while(option == 1) {
			Pessoa pessoa = new Pessoa();
			System.out.println("Insira o Nome do participante: ");
			pessoa.setNome(scan.nextLine());
			System.out.println("Insira a quantidade de dinheiro inicial: ");
			pessoa.setCash(scan.nextFloat());
			scan.nextLine();
			evento.cadastrarPessoa(pessoa);
			System.out.println("Deseja adicionar outro participante?\n1 - Sim\nQualquer valor - Não\n>>");
			option = scan.nextInt();
			scan.nextLine();
		}
		System.out.println("Agora cadastre os produtos a serem leiloados no Evento. (Minimo 1)");
		option = 1;
		while(option == 1) {
			Produto produto = new Produto();
			System.out.println("Insira o nome do produto: \n>>");
			produto.setNome(scan.nextLine());
			System.out.println("Agora insira o valor inicial do produto: \n>>");
			produto.setValorM(scan.nextFloat());
			scan.nextLine();
			Leilao leilao = new Leilao(produto);
			evento.cadastrarLeilao(leilao);
			System.out.println("Deseja adicionar outro produto?\n1 - Sim\nQualquer outro valor - Não\n>>");
			option = scan.nextInt();
			scan.nextLine();
		}
		
		return evento;
	}

}
