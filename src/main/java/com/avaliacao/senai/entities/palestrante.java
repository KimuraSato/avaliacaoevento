package com.avaliacao.senai.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "tb_palestrante")

public class palestrante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String nome;
    String bio;

    @OneToMany(mappedBy = "atividade", cascade = CascadeType.ALL)
    private List<atividade> atividades;



}
