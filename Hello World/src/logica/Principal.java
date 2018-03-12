/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;
import modelo.Pessoa;

/**
 *
 * @author USUARIO
 */
public class Principal {
    public static void main(String[] arg){
        Pessoa pessoaA = new Pessoa(), pessoaB  = new Pessoa(), pessoaC = new Pessoa();
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
        
        
    }
}
