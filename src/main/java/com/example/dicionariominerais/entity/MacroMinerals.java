package com.example.dicionariominerais.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "macro_minerals")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MacroMinerals {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String classe;

    @Column(nullable = false)
    private String dureza;

    @Column(nullable = false)
    private String cor;

    @Column(nullable = false, length = 1000)
    private String habito;

    @Column(nullable = false)
    private String fratura;

    @Column(nullable = false)
    private String diafaneidade;

    @Column(nullable = false)
    private String brilho;

    @Column(nullable = false)
    private String clivagem;

    @Column(nullable = false, length = 1000)
    private String genese;

    @Column(nullable = false)
    private String grupo;

    @Column(nullable = false)
    private String subgrupo;

    @Column(nullable = false)
    private String sistema;

    @Column(nullable = false)
    private String classe_cristalografica;

    @Column(nullable = false)
    private String tenacidade;

    @Column(nullable = false)
    private String traco;

    @Column(nullable = false)
    private Boolean macroMineral;

    @Column(nullable = false)
    private String imagem;
}
