package com.api.aumatch.controller.dto;

import com.api.aumatch.domain.model.Animal;
import com.api.aumatch.domain.model.Chat;
import com.api.aumatch.domain.model.Endereco;
import com.api.aumatch.domain.model.StatusUsuarioEnum;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

import java.util.List;


@Value
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class AdotanteDTO {

    private String nome;
    private String sobrenome;
    private String email;
    private String telefone;
    private Integer idade;
    private String descricaoDoPerfil;
    private String senha;
    private EnderecoDTO endereco;
    private StatusUsuarioEnum statusUsuarioEnum;
    private List<ChatDTO> historicoChat;
    private List<AnimalDTO> animaisFavoritos;

}
