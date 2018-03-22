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
public class Conta {
    private float saldo;
    private String titular;
    private float custoPorOperacao;
    
    public Conta(){
        
    }
    public Conta(String titular, float saldo){
        if(titular == null){
            System.out.println("O titular não pode ser nulo.");
            System.exit(0);
        }
        if(!titular.contains(" ")){
            System.out.println("O nome do titular deve ser composto.");
            System.exit(0);
        }
        if(saldo == 0.0f){
            System.out.println("O saldo não pode ser 0.");
            System.exit(0);
        }
        this.titular = titular;
        this.saldo = saldo;
    }
    public Conta(String titular, float saldo, float custoPorOperacao){
        if(titular == null){
            System.out.println("O titular não pode ser nulo.");
            System.exit(0);
        }
        if(!titular.contains(" ")){
            System.out.println("O nome do titular deve ser composto.");
            System.exit(0);
        }
        if(saldo == 0.0f){
            System.out.println("O saldo não pode ser 0.");
            System.exit(0);
        }
        if(custoPorOperacao == 0.0f){
            System.out.println("O custo por operação não pode ser 0.");
            System.exit(0);
        }
        this.titular = titular;
        this.saldo = saldo;
        this.custoPorOperacao = custoPorOperacao;
        
    }
    
    public String getTitular(){
        if(this.titular == null){
            System.out.println("O titular ainda não foi definido.");
            System.exit(0);
        }
        return this.titular;
    }
    public float getSaldo(){
        if(this.saldo == 0.0f){
            System.out.println("O saldo ainda não foi definido.");
            System.exit(0);
        }
        return this.saldo;
    }
    public float getCustoPorOperacao(){
        if(this.custoPorOperacao == 0.0f){
            System.out.println("O custo por operação ainda não foi definido.");
            System.exit(0);
        }
        return this.custoPorOperacao;
    }
    
    public void setTitular(String titular){
        if(titular == null){
            System.out.println("O titulat não pode ser nulo.");
            System.exit(0);
        }
        if(!titular.contains(" ")){
            System.out.println("O nome do titular deve ser composto.");
            System.exit(0);
        }
        this.titular = titular;
        
    }
    public void setSaldo(float valor){
        if(valor == 0.0f){
            System.out.println("O saldo não pode ser 0.");
            System.exit(0);
        }
        this.saldo = valor;
        
    }
    public void setCustoPorOperacao(float valor){
        if(valor == 0.0f){
            System.out.println("O custo por operação não pode ser nulo.");
            System.exit(0);
        }
        this.custoPorOperacao = valor;
    }
    
    public void sacar(float valor){
        if(this.titular == null){
            System.out.println("O titular deve ser definido para realizar a operação.");
            System.exit(0);
        }
        if(this.saldo == 0.0f){
            System.out.println("O saldo deve ser definido para realizar a operação.");
            System.exit(0);
        }
        if(this.custoPorOperacao == 0.0f){
            System.out.println("O custo por operação deve ser definido para realizar a operação.");
            System.exit(0);
        }
        if(valor+this.custoPorOperacao > this.saldo){
            System.out.println("Você não tem saldo para realizar essa operação.");
            System.out.println("Saldo: R$"+this.saldo);
            System.out.println("Custo por operação: R$"+this.custoPorOperacao);
            System.exit(0);
        }
        this.saldo -= valor+this.custoPorOperacao;
        System.out.println("O saque foi realizado com sucesso.");
        
    }
    public void depositar(float valor){
        if(this.titular == null){
            System.out.println("O titular deve ser definido para realizar a operação.");
            System.exit(0);
        }
        if(this.saldo == 0.0f){
            System.out.println("O saldo deve ser definido para realizar a operação.");
            System.exit(0);
        }
        if(this.custoPorOperacao == 0.0f){
            System.out.println("O custo por operação deve ser definido para realizar a operação.");
            System.exit(0);
        }
        if(this.saldo < this.custoPorOperacao){
            System.out.println("Você mão tem saldo suficiente para realizar essa operação.");
            System.out.println("Saldo: R$"+this.saldo);
            System.out.println("Custo por operação: R$"+this.custoPorOperacao);
            System.exit(0);
        }
        this.saldo += valor-this.custoPorOperacao;
    }
    public void exibirInformacoes(){
        if(this.titular == null){
            System.out.println("O titular deve ser definido para realizar a operação.");
            System.exit(0);
        }
        if(this.saldo == 0.0f){
            System.out.println("O saldo deve ser definido para realizar a operação.");
            System.exit(0);
        }
        if(this.custoPorOperacao == 0.0f){
            System.out.println("O custo por operação deve ser definido para realizar a operação.");
            System.exit(0);
        }
        if(this.saldo < this.custoPorOperacao){
            System.out.println("Você mão tem saldo suficiente para realizar essa operação.");
            System.out.println("Saldo: R$"+this.saldo);
            System.out.println("Custo por operação: R$"+this.custoPorOperacao);
            System.exit(0);
        }
        System.out.println("Titular: "+this.titular);
        System.out.println("Saldo: R$"+this.saldo);
        System.out.println("Custo por operação: R$"+this.custoPorOperacao);
    }
}
