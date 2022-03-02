package com.api.aumatch.controller;

import com.api.aumatch.controller.dto.AdotanteDTO;
import com.api.aumatch.domain.model.Adotante;
import com.api.aumatch.mapper.AdotanteMapper;
import com.api.aumatch.service.AdotanteService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("aumatch/v1/adotantes")
public class AdotanteController {

    @Autowired
    private AdotanteService adotanteService;

    @Autowired
    private AdotanteMapper adotanteMapper;

    @GetMapping("/{idAdotante}")
    public ResponseEntity<Adotante> selecionarAdodante(@PathVariable Long idAdotante){
        return ResponseEntity.ok(adotanteService.procurarPorId(idAdotante));
    }

    @GetMapping
    public ResponseEntity<List<Adotante>> listarAnimais() {
        return ResponseEntity.ok(adotanteService.listarTodos());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Adotante cadastrarAdotante(@RequestBody AdotanteDTO adotanteDTO){
        Adotante adotante = adotanteMapper.toAdotante(adotanteDTO);
        return adotanteService.salvar(adotante);
    }


    @PutMapping("/{idAdotante}")
    public ResponseEntity<?> alterarAdotante(@PathVariable Long idAdotante, @RequestBody AdotanteDTO adotanteDTO){
        Adotante adotante = adotanteMapper.toAdotante(adotanteDTO);
        return ResponseEntity.ok(adotanteService.atualizar(idAdotante,adotante));
    }

    @DeleteMapping("/{idAdotante}")
    public ResponseEntity<Adotante> delete(@PathVariable Long idAdotante){
        adotanteService.delete(idAdotante);
        return ResponseEntity.noContent().build();
    }

}
