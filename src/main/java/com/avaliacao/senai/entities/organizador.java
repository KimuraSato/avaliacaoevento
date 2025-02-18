package com.avaliacao.senai.entities;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "tb_organizador")

public class organizador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String nome;
    String email;

    @OneToMany(mappedBy = "eventos", cascade = CascadeType.ALL)
    private List<evento> eventos;
}
