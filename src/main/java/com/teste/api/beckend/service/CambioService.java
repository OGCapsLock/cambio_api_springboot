package com.teste.api.beckend.service;

import com.teste.api.beckend.entity.Cambio;
import com.teste.api.beckend.repository.CambioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CambioService {

    @Autowired
    private CambioRepository cambioRepository;

    public Cambio salvar(Cambio cambio){
        return cambioRepository.save(cambio);
    }

    public List<Cambio> listarCambio(){
        return cambioRepository.findAll();
    }

    public Optional<Cambio> pesquisaPorId(Long id){
        return cambioRepository.findById(id);

    }

    public void removerPorId(Long id){
        cambioRepository.deleteById(id);
    }
}
