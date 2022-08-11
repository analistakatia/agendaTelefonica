package com.desafio.agendaTelefonica.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "agenda")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AgendaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoDoContato;

    @Column(length = 60, nullable = false)
    private String nomeDoContato;

    @Column(length = 20, nullable = false)
    private String numTelefDoContato;
}
