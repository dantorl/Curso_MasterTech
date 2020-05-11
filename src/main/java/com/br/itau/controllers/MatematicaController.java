package com.br.itau.controllers;

import com.br.itau.models.Matematica;
import com.br.itau.services.MatematicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/")

public class MatematicaController {

    @Autowired
    private MatematicaService matematicaService;

    @PostMapping("soma")
    public Integer soma(@RequestBody Matematica matematica) {
        List<Integer> numeros = matematica.getNumeros();
        if (numeros.isEmpty() || numeros.size() < 2){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Necessário ao menos 2 números para soma");
        }
        return matematicaService.soma(numeros);
    }
    @PostMapping("subtrai")
    public Integer subtrai(@RequestBody Matematica matematica) {
        List<Integer> numeros = matematica.getNumeros();
        if (numeros.isEmpty() || numeros.size() < 2){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Necessário ao menos 2 números para subtração");
        }
        return matematicaService.subtrai(numeros);
    }
    @PostMapping("multiplica")
    public Integer multiplica(@RequestBody Matematica matematica) {
        List<Integer> numeros = matematica.getNumeros();
        if (numeros.isEmpty() || numeros.size() < 2){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Necessário ao menos 2 números para mutiplicação");
        }
        return matematicaService.multiplica(numeros);
    }
    @PostMapping("divide")
    public Double divide(@RequestBody Matematica matematica) {
        List<Integer> numeros = matematica.getNumeros();
        if (numeros.isEmpty() || numeros.size() < 2 || numeros.size() > 2){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Necessário 2 números para divisão");
        }
        return matematicaService.divide(numeros);
    }
}
