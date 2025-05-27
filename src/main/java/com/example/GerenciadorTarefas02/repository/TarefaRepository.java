package com.example.GerenciadorTarefas02.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.GerenciadorTarefas02.model.Tarefa;

@Repository
public interface TarefaRepository extends JpaRepository <Tarefa, Long>{

}
