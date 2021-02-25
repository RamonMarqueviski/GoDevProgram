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
public class Sistema {
    private static final List<Sala> salas = new ArrayList<Sala>();
    private static final List<Cafe> cafes = new ArrayList<Cafe>();

    public Sistema() {
        
    }
    public void addSala(Sala sala){
        salas.add(sala);
    }
    public void addCafes(Cafe cafe){
        cafes.add(cafe);
    }

    public List<Sala> getSalas() {
        return salas;
    }

    public List<Cafe> getCafes() {
        return cafes;
    }
    public void intervalo1() {
    for(int i=0;i<salas.size();i++){
           int x=salas.get(i).getEtapa1().size()/2;
           for(int j=0;j<x;j++){
                cafes.get(0).addPessoaIntervalo1(salas.get(i).getEtapa1().get(j));
           }
       }
     
    
     for(int i=0;i<salas.size();i++){
           int x=salas.get(i).getEtapa1().size();
           for(int j=x/2;j<x;j++){
                cafes.get(1).addPessoaIntervalo1(salas.get(i).getEtapa1().get(j));
           }
       }
    
    }
    public void intervalo2(){
       for(int i=0;i<salas.size();i++){
           int x=salas.get(i).getEtapa1().size();
           for(int j=x/2;j<x;j++){
                cafes.get(0).addPessoaIntervalo2(salas.get(i).getEtapa1().get(j));
           }
       }
        for(int i=0;i<salas.size();i++){
           int x=salas.get(i).getEtapa1().size()/2;
           for(int j=0;j<x;j++){
                cafes.get(1).addPessoaIntervalo2(salas.get(i).getEtapa1().get(j));
           }
       }
    }
    
    
    public void etapa2(){
        
        //copia as lists até a sua metade
       for(int i=0;i<salas.size();i++){
           int x=salas.get(i).getEtapa1().size()/2;
           for(int j=0;j<x;j++){
                salas.get(i).addPessoaEtapa2(salas.get(i).getEtapa1().get(j));
           }
       }
       //colocando a outra metade de modo que trocam para a proxima sala
       for(int i=0;i<salas.size();i++){
           int y=salas.get(i).getEtapa1().size();
           for(int j=y/2;j<y;j++){
               if(salas.size()-1==i){
                   salas.get(0).addPessoaEtapa2(salas.get(i).getEtapa1().get(j));
               }else{
                   if(salas.get(i).getEtapa2().size()%2==0){
                    salas.get(1-i).addPessoaEtapa2(salas.get(i).getEtapa1().get(j));
                    }else{
                    salas.get(1+i).addPessoaEtapa2(salas.get(i).getEtapa1().get(j));
                    }

               }
           }
       }
    }
}
        
    

