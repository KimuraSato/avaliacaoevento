package com.avaliacao.senai.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "tb_atividade")

public class atividade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;

    @OneToMany(mappedBy = "palestrante", cascade = CascadeType.ALL)
    private List<palestrante> palestrantes;

    @OneToMany(mappedBy = "eventos", cascade = CascadeType.ALL)
    private List<evento> eventos;

}
