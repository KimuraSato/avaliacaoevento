package com.avaliacao.senai.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "tb_evento")

public class evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String nome;
    String descricao;
    LocalDate data_inicio;
    LocalDate data_fim;
    String local;

    @ManyToOne
    @JoinColumn(name = "organizador_id")
    private organizador organizador;

    @OneToMany
    @JoinColumn(name = "ingresso_id")
    private List<ingresso> ingressos;

    @OneToMany
    @JoinColumn(name = "atividade_id")
    private List<atividade> atividades;
}
