package com.desafio.agendaTelefonica.controller;

import com.desafio.agendaTelefonica.model.AgendaModel;
import com.desafio.agendaTelefonica.service.AgendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AgendaController {

    @Autowired
    private AgendaService agendaService;

    @GetMapping(path = "/agenda")
    public List<AgendaModel>buscarContatos(){
        return agendaService.buscarTodosContatos();
    }

    @GetMapping(path = "/agenda/{codigoDoContato}")
    public Optional<AgendaModel> buscarContatoPorId(@PathVariable Long codigoDoContato){
        return agendaService.buscarContatoPorId(codigoDoContato);
    }

    @PostMapping(path = "/agenda")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public AgendaModel cadastrarContato(@RequestBody AgendaModel contato){
        return agendaService.cadastrar(contato);
    }

    @PutMapping(path = "/agenda/{codigoDoContato}")
    public AgendaModel alterarContato(@RequestBody AgendaModel contato){
        return agendaService.alterar(contato);
    }

    @DeleteMapping(path = "/agenda/{codigoDoContato}")
    public void deletarContato(@PathVariable Long codigoDoContato){
        agendaService.deletar(codigoDoContato);
    }

}
