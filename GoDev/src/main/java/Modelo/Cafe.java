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
public class Cafe {
    private List<Pessoa> intervalo1;
    private List<Pessoa> intervalo2;
    private String nomeDaSala;
    

    public Cafe(String nomeDaSala,int lotacao) {
        this.nomeDaSala = nomeDaSala;
        intervalo1 = new ArrayList<Pessoa>(lotacao);
        intervalo2 = new ArrayList<Pessoa>(lotacao);
    }
    public void addPessoaIntervalo1(Pessoa pessoa){
        intervalo1.add(pessoa);
    }
    public void addPessoaIntervalo2(Pessoa pessoa){
        intervalo2.add(pessoa);
    }

    public List<Pessoa> getPessoasIntervalo1() {
        return intervalo1;
    }
    public List<Pessoa> getPessoasIntervalo2() {
        return intervalo2;
    }

    public String getNomeDaSala() {
        return nomeDaSala;
    }
      @Override
    public String toString() {
        return "Intervalo 1 \nNome da sala:" + nomeDaSala + "\n";
    }
    
    public String toString2(){
        return "Intervalo 2 \nNome da sala:" + nomeDaSala + "\n";
    }
    
    
}
