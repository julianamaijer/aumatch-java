package com.api.aumatch.service;

import com.api.aumatch.domain.model.Adotante;
import com.api.aumatch.domain.model.Animal;
import com.api.aumatch.exception.EntityNotFoundException;
import com.api.aumatch.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {

    @Autowired
    AnimalRepository animalRepository;

    public Animal procurarPorId(Long idAnimal){
        return animalRepository.findById(idAnimal).
                orElseThrow(() -> new EntityNotFoundException("Adotante " + idAnimal + "não encontrado."));
    }

    public List<Animal> listarTodos() {
        return animalRepository.findAll();
    }

}
