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
		System.out.println("Bem-vindo!\nN�s somos o Jobber, e estamos aqui para te ajudar a arrumar um emprego ou funcin�rios para sua Empresa");
		System.out.println("Vamos come�ar!\nEscolha uma das op��es abaixo: ");
		System.out.println("1 - Cadastrar Empresa");
		System.out.println("2 - Cadastrar Funcion�rio");
		if(!job.isEmpty()) System.out.println("3 - Come�ar!");
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
		System.out.println("Hora de cadastrar os cargos dispon�veis!");
		System.out.println("Adicione quantos preferir.");
		while(opt == 1) {
			System.out.println("Gostaria de adionar um cargo dispon�vel?");
			System.out.println("1 - Sim\t 2 - N�o");
			opt = scan.nextInt();
			scan.nextLine();
			if(opt == 2){
				break;
			}
			empresa.addCargo(novoCargo(scan));
		}
		System.out.println("J� terminou? OK, ent�o.");
		return ;
		
	}
	
	public static Cargo novoCargo(Scanner scan) {
		Cargo cargo = new Cargo();
		String nome = "";
		System.out.println("Certo! Vamos come�ar dando um nome ao Cargo: ");
		while(nome.compareTo("") == 0) {
			nome = scan.nextLine();
			cargo.setNome(nome);
		}
		System.out.println("Agora vamos ao requisitos");
		return cargo;
		
	}
}
