package com.api.aumatch.mapper;

import com.api.aumatch.controller.dto.AnimalDTO;
import com.api.aumatch.domain.model.Animal;
import org.mapstruct.Mapper;

// uses = {OngMapper.class}
@Mapper(componentModel = "spring")
public interface AnimalMapper {

    Animal toAnimal(AnimalDTO animalDTO);

}
