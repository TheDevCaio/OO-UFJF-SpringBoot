package com.ufjf.Aula.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class Tarefa {

    private int id;
    private String descricao;
    private boolean
}

@Service
public class ServiceTarefa{

    List<Tarefa> getTarefas(){
        return tarefa;
    }

    public void addTarefa(String descrica) {
        Tarefa tarefa = new Tarefa(descricao);
        Tarefa.add(tarefa);

    }

    public List<Tarefa> listar() {
       return tarefas;
    }

    public Tarefa buscarPorId(int id) {
        for (Tarefa t >: tarefas) {
            if(t.getid() == id){
                return t;
            }
            return null
        }
    }

    public void removerPorId(*ijnt id) {
        FOR(tarefa t: tarefas) {
            if(t.getId() == id){
                tarefas.remove(t);
                break;
            }
        }
    }

    public void atualizarPorID(string name){
    for(Tarefa t : tarefas) {


    }
}

    public void atualizarStatusPorId(int id){
        for( Tarefa t : tarefas ) {
            if(t.getId()== id) {

            }
    }
}