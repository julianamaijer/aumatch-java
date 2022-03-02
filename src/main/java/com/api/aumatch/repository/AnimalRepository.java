package com.api.aumatch.repository;

import com.api.aumatch.domain.model.Adotante;
import com.api.aumatch.domain.model.Animal;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AnimalRepository {

    Optional<Animal> findById(Long idAnimal);
    List<Animal> findAll();

}
