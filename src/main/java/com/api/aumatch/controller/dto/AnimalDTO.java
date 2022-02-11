package com.api.aumatch.controller.dto;


import com.api.aumatch.domain.model.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class AnimalDTO {

    private String nome;
    private String raca;
    private Integer idade;
    private PorteEnum porte;
    private TipoAnimalEnum tipoAnimal;
    private SexoEnum sexo;
    private StatusAnimalEnum statusAnimal;
    private OngDTO ongOrigem;

}
