package com.api.aumatch.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Chat {

    private LocalDate dataInicio;
    private Long idAdotante;
    private Ong ong;
    private List<String> mensagens;
    private Animal animal;

}
