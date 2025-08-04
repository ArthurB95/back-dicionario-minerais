package com.example.dicionariominerais.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "minerals")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Minerals {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(name = "crystallographic_system", nullable = false)
    private String crystallographicSystem;

    @Column(nullable = false)
    private String relief;

    @Column(nullable = false)
    private String color;

    @Column(nullable = false)
    private String habit;

    @Column(columnDefinition = "TEXT")
    private String cleavage;

    @Column(columnDefinition = "TEXT")
    private String extinction;

    @Column(columnDefinition = "TEXT")
    private String paragenesis;

    @Column(name = "similar_diagnostic_and_mineral_properties", columnDefinition = "TEXT")
    private String similarDiagnosticAndMineralProperties;

    @Column(name = "image_crossed")
    private String imageCrossed;

    @Column(name = "legend_crossed", columnDefinition = "TEXT")
    private String legendCossed;

    @Column(name = "image_parallel")
    private String imageParallel;

    @Column(name = "legend_parallel", columnDefinition = "TEXT")
    private String legendParallel;
}
