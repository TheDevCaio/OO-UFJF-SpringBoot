package com.ufjf.Aula;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RestController
@RequestMapping("/tarefas")
public class Tarefa {

    @Autowired
private ServiceTarefa serviceTarefa = new ServiceTarefa();

    @PostMapping("/criar")
    public String criarNovaTarefaString(@ResquestBody String descricao) {
        serviceTarefa.addTarefa(descricao);
        return "Tarefa criada com sucesso";
    }
}