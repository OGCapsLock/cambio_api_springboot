package com.teste.api.beckend.http.controller;

import com.teste.api.beckend.entity.Cambio;
import com.teste.api.beckend.service.CambioService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/cambio")
public class CambioController {

    @Autowired
    private CambioService cambioService;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cambio salvar(@RequestBody Cambio cambio) {
        return cambioService.salvar(cambio);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Cambio> lisCambio() {
        return cambioService.listarCambio();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Cambio pesquisaCambioPorId(@PathVariable("id") Long id) {
        return cambioService.pesquisaPorId(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Moeda nao encontrada!!"));


    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removerCambio(@PathVariable("id") Long id){
        cambioService.pesquisaPorId(id)
                .map(cambio -> {
                    cambioService.removerPorId(cambio.getId());
                    return Void.TYPE;
                }).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND, "Moeda nao encontrada!!"));
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void atualizrMoeda(@PathVariable("id") Long id, @RequestBody Cambio cambio){
        cambioService.pesquisaPorId(id)
                .map(cambioBase ->{
                    modelMapper.map(cambio, cambioBase);
                    cambioService.salvar(cambioBase);
                    return Void.TYPE;
                }).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND, "Moeda nao encontrada!!"));

    }

}

