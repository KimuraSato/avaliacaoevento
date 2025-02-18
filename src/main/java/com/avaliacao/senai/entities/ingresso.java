package com.avaliacao.senai.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "tb_ingresso")

public class ingresso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private tipo tipo;

    private double preco;

    @OneToMany(mappedBy = "eventos", cascade = CascadeType.ALL)
    private List<evento> eventos;

    @OneToMany(mappedBy = "participante", cascade = CascadeType.ALL)
    private List<participante> participantes;
}
