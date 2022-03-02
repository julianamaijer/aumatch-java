package com.api.aumatch.controller;

import com.api.aumatch.domain.model.Adotante;
import com.api.aumatch.domain.model.Animal;
import com.api.aumatch.mapper.AnimalMapper;
import com.api.aumatch.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("aumatch/v1/animais")
public class AnimalController {

    @Autowired
    AnimalService animalService;

    @Autowired
    AnimalMapper animalMapper;

    @GetMapping("/{idAnimal}")
    public ResponseEntity<Animal> selecionarAdodante(@PathVariable Long idAnimal){
        return ResponseEntity.ok(animalService.procurarPorId(idAnimal));
    }

    @GetMapping
    public ResponseEntity<List<Animal>> listarAnimais() {
        return ResponseEntity.ok(animalService.listarTodos());
    }

}
