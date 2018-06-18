package logica;

import java.util.Scanner;

import modelo.Cargo;
import modelo.Empresa;
import modelo.Jobber;

public class Principal {

	public static void main(String[] args) {
		int opt = 1;
		Jobber job = new Jobber();	
		Scanner scan = new Scanner(System.in);
		while(opt > 0 && opt < 4) {
			printMenu(job);
			opt = scan.nextInt();
			scan.nextLine();
			switch (opt) {
			case 1:
				Empresa empresa = cadastrarEmpresa(scan);
				
				break;
				
			case 2:
				
				break;
				
			case 3:
				
				break;

			default:
				System.exit(0);
				break;
			}
		}
	}
	
	
	public static void printMenu(Jobber job) {
		System.out.println("Bem-vindo!\nNós somos o Jobber, e estamos aqui para te ajudar a arrumar um emprego ou funcinários para sua Empresa");
		System.out.println("Vamos começar!\nEscolha uma das opções abaixo: ");
		System.out.println("1 - Cadastrar Empresa");
		System.out.println("2 - Cadastrar Funcionário");
		if(!job.isEmpty()) System.out.println("3 - Começar!");
		System.out.println("(Ou outro valor para sair do programa.)");
		System.out.print("-> ");
	}
	
	public static Empresa cadastrarEmpresa(Scanner scan) {
		String nome = "";
		Empresa empresa = new Empresa();
		while(nome.compareTo("") == 0) {
			System.out.println("Insira o nome da sua Empresa: ");
			nome = scan.nextLine();
			empresa.setNome(nome);
		}
		System.out.println("Pronto!\nA empresa " + empresa.getNome() + " foi criada!");
		return empresa;
	}
	
	public static void cadastrarCargos(Empresa empresa, Scanner scan) {
		int opt = 1;
		System.out.println("Hora de cadastrar os cargos disponíveis!");
		System.out.println("Adicione quantos preferir.");
		while(opt == 1) {
			System.out.println("Gostaria de adionar um cargo disponível?");
			System.out.println("1 - Sim\t 2 - Não");
			opt = scan.nextInt();
			scan.nextLine();
			if(opt == 2){
				break;
			}
			empresa.addCargo(novoCargo(scan));
		}
		System.out.println("Já terminou? OK, então.");
		return ;
		
	}
	
	public static Cargo novoCargo(Scanner scan) {
		Cargo cargo = new Cargo();
		String nome = "";
		System.out.println("Certo! Vamos começar dando um nome ao Cargo: ");
		while(nome.compareTo("") == 0) {
			nome = scan.nextLine();
			cargo.setNome(nome);
		}
		System.out.println("Agora vamos ao requisitos");
		return cargo;
		
	}
}
