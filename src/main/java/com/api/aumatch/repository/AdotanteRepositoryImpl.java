package com.api.aumatch.repository;

import com.api.aumatch.domain.model.Adotante;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class AdotanteRepositoryImpl implements AdotanteRepository{

    List<Adotante> listaAdotante = new ArrayList<>();

    @Override
    public Optional<Adotante> save(Adotante adotante) {
        if (adotante.getIdAdotante() == null){
            adotante.setIdAdotante((long) (listaAdotante.size()+1));
        }else{
            delete(adotante);
        }
        listaAdotante.add(adotante);
        return Optional.of(adotante);
/*        Endereco endereco = new Endereco("rua bla bla", "13", null, "1111111",
                "São Paulo", "SP");*/
/*        return new Adotante(1L, "Diego", "Lucas da Silva", "11943502294", 28,
                "Sou um cara carismático.", "12345", endereco, StatusUsuarioEnum.ATIVO,
                Arrays.asList(LocalDate.now(), ), "");*/
    }

    @Override
    public Optional<Adotante> findById(Long idAdotante) {
        Adotante adotanteEncontrado = listaAdotante.stream()
                .filter(adotante -> idAdotante == adotante.getIdAdotante())
                .findAny()
                .orElse(null);
        return Optional.ofNullable(adotanteEncontrado);
    }

    @Override
    public void delete(Adotante adotante) {
        listaAdotante.remove(adotante);
    }

    @Override
    public List<Adotante> findAll() {
        return listaAdotante;
    }
}
