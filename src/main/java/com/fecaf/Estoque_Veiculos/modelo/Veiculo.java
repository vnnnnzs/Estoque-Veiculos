package com.fecaf.Estoque_Veiculos.modelo;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tb_veiculos")
@Data
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String marca;

    @Column(nullable = false)
    private String modelo;

    @Column(nullable = false)
    private Integer ano;

    @Column(nullable = false)
    private String cor;

    @Column(nullable = false)
    private Double preco;

    @Column(nullable = false)
    private Integer quilometragem;

    @Column(nullable = false)
    private String status;
}