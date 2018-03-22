/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author USUARIO
 */
public class Pessoa {
    public String nome;
    public float altura, peso;
    public int idade;
    public String parceiro = null;
    public int atratividade;
    
    public void correr(){
        System.out.println("O "+ nome + " está Runnendo");
    }
    
    public void falar(){
        System.out.println("HEEEYYY ITS UR BOI," + nome);
    }
    
    public float calcularIMC(){
        float total;
        total = peso/(altura*altura);
        return total;
    }
    public void flertar(Pessoa p){
        System.out.println(p.nome + " está dando em cima de " + nome);
        if(p.atratividade < 20){
            System.out.println("Hoje não faro!");
        }else{
            System.out.println("Me gusta");
            parceiro = p.nome;
        }
    }
    
    public void isSolteiro(){
        if(parceiro == null){
            System.out.println(nome + " está na pista!");
        }else{
            System.out.println(nome + " está prometida para " + parceiro);
        }
    }
    
    public void mandarZap(Pessoa p){
        System.out.println(nome + " está no zap com " + p.nome);
    }
    
}
