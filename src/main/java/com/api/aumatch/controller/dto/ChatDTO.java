package com.api.aumatch.controller.dto;

import com.api.aumatch.domain.model.Ong;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

import java.time.LocalDate;
import java.util.List;

@Value
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class ChatDTO {

    private LocalDate dataInicio;
    private Long idAdotante;
    private OngDTO ong;
    private List<String> mensagens;
    private AnimalDTO animal;
}
