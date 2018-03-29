/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Livro {
    private String titulo;
    private int qtdPaginas;
    
    public Livro(){
        
    }
    
    public Livro(String titulo, int qtdPag){
        this.titulo = titulo;
        this.qtdPaginas = qtdPag;
    }
    
    public void criarLivro(ArrayList<Livro> lista, String titulo, int qtdPag){
        if(titulo == ""){
            System.out.println("O titulo não pode ser vazio.");
            System.exit(0);
        }
        if(qtdPag == 0){
            System.out.println("A quantidade de páginas não pode ser 0 ou menor.");
            System.exit(0);
        }
        Livro livro = new Livro(titulo, qtdPag);
        lista.add(livro);
    }
    
    public void editarLivro(ArrayList<Livro> lista, int codigo, String titulo, int qtdPag){
        if(titulo == ""){
            System.out.println("O titulo não pode ser vazio.");
            System.exit(0);
        }
        if(qtdPag == 0){
            System.out.println("A quantidade de páginas não pode ser 0 ou menor.");
            System.exit(0);
        }
        if(codigo < 0){
            System.out.println("O codigo deve ser maior que -1");
            System.exit(0);
        }
        Livro livro = new Livro(titulo, qtdPag);
        lista.add(codigo, livro);
        lista.remove(codigo+1);
        
        
    }
    
    public void apagarLivro(ArrayList<Livro> lista, int codigo){
        if(codigo < 0){
            System.out.println("O codigo deve ser maior que -1");
            System.exit(0);
        }
        lista.remove(codigo);
    }
    
    public void listarLivros(ArrayList<Livro> lista){
        if(lista.size() < 1){
            System.out.println("A lista está vazia.");
            System.exit(0);
        }
        for(Livro livro : lista){
            System.out.println("Livro: "+livro.getTitulo());
            System.out.println("Número de páginas: " + livro.getQtdPaginas()+"\n");
        }
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    public int getQtdPaginas(){
        return this.qtdPaginas;
    }
    
    public void setTitulo(String titulo){
        if(titulo == ""){
            System.out.println("O titulo não pode ser vazio.");
            System.exit(0);
        }
        this.titulo = titulo;
    }
    
    public void setQtdPaginas(int pag){
        if(pag < 1){
            System.out.println("A quantidade de páginas deve ser maior que 0");
            System.exit(0);
        }
        this.qtdPaginas = pag;
    }
}
