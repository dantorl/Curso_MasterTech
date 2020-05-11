package com.br.itau.services;

import com.br.itau.models.Matematica;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatematicaService {
    public int soma(List<Integer> numeros) {
        int resultado = 0;
        for (int numero : numeros) {
            resultado += numero;
        }
        return resultado;
    }
    public int subtrai(List<Integer> numeros) {
        int resultado = 0;
        for (int numero : numeros) {
            if (numeros.indexOf(numero) == 0) {
                resultado = numero;
            } else {
                resultado -= numero;
            }

        }
        return resultado;
    }
    public int multiplica(List<Integer> numeros) {
        int resultado = 1;
        for (int numero : numeros) {
            resultado = Math.multiplyExact(resultado, numero);
        }
        return resultado;
    }

    public double divide(List<Integer> numeros) {
        double resultado = 1;
        for (int numero : numeros) {
            if (numeros.indexOf(numero) == 0) {
                resultado = numero;
            } else if (resultado >= numero) {

                resultado = resultado / numero;
            } else {
                resultado = numero / resultado;
            }
        }
        return resultado;
    }
}
