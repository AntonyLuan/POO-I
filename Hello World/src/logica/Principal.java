/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;
//import modelo.Pessoa;
//import modelo.Androide;
import modelo.Conta;
import modelo.Livro;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Principal {
    public static void main(String[] arg){
        /*Pessoa pessoaA = new Pessoa(), pessoaB  = new Pessoa(), pessoaC = new Pessoa();
        pessoaA.nome = "Pedro";
        pessoaA.idade = 18;
        pessoaA.altura = 1.87f;
        pessoaA.peso = 84f;
        pessoaA.atratividade = 19;
        
        pessoaB.nome = "Jéssica";
        pessoaB.idade = 19;
        pessoaB.atratividade = 21;
        
        pessoaC.nome = "Antony";
        pessoaC.idade = 19;
        pessoaC.atratividade = 100;
        
        pessoaB.isSolteiro();
        pessoaB.flertar(pessoaA);
        pessoaB.flertar(pessoaC);
        pessoaB.isSolteiro();
        pessoaB.mandarZap(pessoaC);
        System.out.println();*/
        
        /*Androide and = new Androide();
        Androide zeta = new Androide();
        
        and.setModelo("Mark 1");
        and.setAltura(1.85f);
        and.setPeso(40.55f);
        
        zeta.setModelo("Mark 2");
        zeta.setAltura(1.84f);
        zeta.setPeso(40.55f);
        
        System.out.println("De um lado: ");
        and.printAndroide();
        System.out.println("\nE do outro:");
        zeta.printAndroide();
        System.out.println("\nQue comece a luta!!!!");
        System.out.println("E termina a luta.");
        
        //and.falar();
        System.out.println("\nO Androide vencedor é: ");
        Androide vencedor = and.lutar(zeta);
        
        vencedor.printAndroide();*/
        
        //Conta conta = new Conta("AntonyLuan", 100.00f, 1.00f);
        /*Conta conta = new Conta("Antony Luan", 100.00f, 1.00f);
        
        conta.sacar(98.00f);
        conta.depositar(100.00f);
        conta.exibirInformacoes();*/
        
        ArrayList<Livro> lista = new ArrayList();
        Livro livro = new Livro();
        livro.criarLivro(lista, "Joao e Maria", 20);
        System.out.println("Parte 1\n");
        livro.listarLivros(lista);
        System.out.println("parte 2\n");
        livro.setTitulo("Maria E Joao");
        livro.setQtdPaginas(20);
        livro.criarLivro(lista, livro.getTitulo(), livro.getQtdPaginas());
        livro.listarLivros(lista);
        System.out.println("Parte 3\n");
        livro.apagarLivro(lista, 0);
        livro.listarLivros(lista);
        System.out.println("Parte 4\n");
        livro.editarLivro(lista, 0, "Joao e o pé de Feijão", 30);
        livro.listarLivros(lista);
        
    }
}
