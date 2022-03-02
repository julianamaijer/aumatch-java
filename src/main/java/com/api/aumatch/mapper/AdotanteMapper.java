package com.api.aumatch.mapper;

import com.api.aumatch.controller.dto.AdotanteDTO;
import com.api.aumatch.controller.dto.AnimalDTO;
import com.api.aumatch.controller.dto.ChatDTO;
import com.api.aumatch.controller.dto.EnderecoDTO;
import com.api.aumatch.domain.model.Adotante;
import com.api.aumatch.domain.model.Animal;
import com.api.aumatch.domain.model.Chat;
import com.api.aumatch.domain.model.Endereco;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AdotanteMapper {

    Adotante toAdotante(AdotanteDTO adotanteDTO);

}
