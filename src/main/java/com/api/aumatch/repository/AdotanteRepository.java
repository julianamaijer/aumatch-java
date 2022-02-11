package com.api.aumatch.repository;

import com.api.aumatch.domain.model.Adotante;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AdotanteRepository {
    Optional<Adotante> save(Adotante adotante);
    Optional<Adotante> findById(Long idAdotante);
    void delete(Adotante adotante);
    List<Adotante> findAll();
}
