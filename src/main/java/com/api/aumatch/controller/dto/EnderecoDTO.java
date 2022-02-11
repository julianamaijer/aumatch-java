package com.api.aumatch.controller.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class EnderecoDTO {

    private String rua;
    private String numero;
    private String complemento;
    private String cep;
    private String cidade;
    private String estado;

}
