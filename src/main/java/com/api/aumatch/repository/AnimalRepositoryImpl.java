package com.api.aumatch.repository;

import com.api.aumatch.domain.model.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Component
public class AnimalRepositoryImpl implements AnimalRepository{

    Animal animal1 = new Animal(1L, "Lily", "SRD", 2, PorteEnum.PEQUENO, TipoAnimalEnum.GATO, SexoEnum.FEMEA, StatusAnimalEnum.ATIVO, null);
    Animal animal2 = new Animal(2L, "Aly", "SRD", 4, PorteEnum.PEQUENO, TipoAnimalEnum.CAO, SexoEnum.MACHO, StatusAnimalEnum.ATIVO, null);

    List<Animal> listaAnimal = Arrays.asList(animal1, animal2);

    @Override
    public Optional<Animal> findById(Long idAnimal) {
        Animal animalEncontrado = listaAnimal.stream()
                .filter(animal -> idAnimal == animal.getIdAnimal())
                .findAny()
                .orElse(null);
        return Optional.ofNullable(animalEncontrado);
    }

    @Override
    public List<Animal> findAll() {
        return listaAnimal;
    }

}
