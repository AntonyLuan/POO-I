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
public class Androide {
    private String modelo;
    private float altura;
    private float peso;
    
    public void  falar(){
        System.out.println("Androide ainda não aprendeu a falar");
    }
    
    public void calcular(){
        System.out.println("Androide não é seu empregado!");
    }
    
    private float calcularForca(){
        return this.altura + this.peso ;
    }
    
    public Androide lutar(Androide and){
        if(and.calcularForca() > calcularForca()){
            return and;
        }
        return this;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    public float getAltura(){
        return this.altura;
    }
    public float getPeso(){
        return this.peso;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public void setAltura(float altura){
        this.altura = altura;
    }
    
    public void setPeso(float peso){
        this.peso = peso;
    }
    
    public void printAndroide(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Peso: " + this.peso);
        System.out.println("Altura: " + this.altura);
    }
}
