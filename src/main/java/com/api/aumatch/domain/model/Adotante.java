package com.api.aumatch.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Adotante {

    private Long idAdotante;
    private String nome;
    private String sobrenome;
    private String email;
    private String telefone;
    private Integer idade;
    private String descricaoDoPerfil;
    private String senha;
    private Endereco endereco;
    private StatusUsuarioEnum statusUsuarioEnum;
    private List<Chat> historicoChat;
    private List<Animal> animaisFavoritos;

}
