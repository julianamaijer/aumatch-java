package com.api.aumatch.mapper;

import com.api.aumatch.controller.dto.OngDTO;
import com.api.aumatch.domain.model.Ong;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OngMapper {

    Ong toOng(OngDTO ongDTO);

}
