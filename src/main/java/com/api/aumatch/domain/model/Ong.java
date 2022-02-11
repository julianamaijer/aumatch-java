package com.api.aumatch.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Ong {

    private String razaoSocial;
    private String cnpj;
    private List<Animal> animais;
    private List<Chat> historicoChat;
    private Endereco endereco;
    private StatusOngEnum statusOngEnum;

}
