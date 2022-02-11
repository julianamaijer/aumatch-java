package com.api.aumatch.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Animal {

    private String nome;
    private String raca;
    private Integer idade;
    private PorteEnum porte;
    private TipoAnimalEnum tipoAnimal;
    private SexoEnum sexo;
    private StatusAnimalEnum statusAnimal;
    private Ong ongOrigem;

}
