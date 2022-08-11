package com.desafio.agendaTelefonica.repository;

import com.desafio.agendaTelefonica.model.AgendaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AgendaRepository extends JpaRepository<AgendaModel, Long> {
}
