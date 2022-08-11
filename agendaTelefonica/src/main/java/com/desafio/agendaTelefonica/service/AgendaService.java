package com.desafio.agendaTelefonica.service;

import com.desafio.agendaTelefonica.model.AgendaModel;
import com.desafio.agendaTelefonica.repository.AgendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AgendaService {

    @Autowired
    private AgendaRepository agendaRepository;

    public List<AgendaModel> buscarTodosContatos() {
        return agendaRepository.findAll();
    }

    public Optional<AgendaModel> buscarContatoPorId(Long codigoDoLivro){
        return agendaRepository.findById(codigoDoLivro);
    }

    public AgendaModel cadastrar(AgendaModel cadastroDoContato){
        cadastroDoContato.getCodigoDoContato();
        cadastroDoContato.getNomeDoContato();
        cadastroDoContato.getNumTelefDoContato();

        return agendaRepository.save(cadastroDoContato);
    }

    public AgendaModel alterar(AgendaModel cadastroDoContato){
        cadastroDoContato.getCodigoDoContato();
        cadastroDoContato.getNomeDoContato();
        cadastroDoContato.getNumTelefDoContato();

        return agendaRepository.save(cadastroDoContato);
    }

    public void deletar(Long codigoDoContato){
        agendaRepository.deleteById(codigoDoContato);
    }
}
