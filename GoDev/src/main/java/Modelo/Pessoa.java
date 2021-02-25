/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author ramom
 */
public class Pessoa{
    private String nome;
    private String sobrenome;

    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }
    

    @Override
    public String toString() {
        return "nome:" + nome + ", sobrenome:" + sobrenome + "\n";
    }
    
}
