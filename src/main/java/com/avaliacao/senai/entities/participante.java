package com.avaliacao.senai.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "tb_participante")

public class participante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String nome;
    String email;

    @ManyToMany(mappedBy = "eventos", cascade = CascadeType.ALL)
    private List<evento> eventos;

}
