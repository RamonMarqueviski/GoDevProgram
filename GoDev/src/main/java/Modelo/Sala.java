/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ramom
 */
public class Sala {
    private List<Pessoa> etapa1;
    private List<Pessoa> etapa2;
    private String nome;

    public Sala(String nome,int lotacao) {
        this.nome = nome;
        etapa1 = new ArrayList<Pessoa>(lotacao);
        etapa2 = new ArrayList<Pessoa>(lotacao);
    }
    
    public void addPessoaEtapa1(Pessoa pessoa){
        etapa1.add(pessoa);
        
    }
     public void addPessoaEtapa2(Pessoa pessoa){
        etapa2.add(pessoa);
    }
     public void addPessoaEtapa2WI(int index,Pessoa pessoa){
        etapa2.add(index, pessoa);
    }

    public List<Pessoa> getEtapa1() {
        return etapa1;
    }

    public List<Pessoa> getEtapa2() {
        return etapa2;
    }
    
    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Etapa 1 \nNome da sala:" + nome + "\n";
    }
    
    public String toString2(){
        return "Etapa 2 \nNome da sala:" + nome + "\n";
    }
    
   
    
}
