package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {
    public static void main(String[] args) {

        Collection<Integer> numeros = new HashSet<>();



        for (int i = 1; i <= 50000; i++) {
            numeros.add(i);
        }


        long inicio = System.currentTimeMillis();

        for (Integer numero : numeros) {
            numeros.contains(numero);
        }

        long fim = System.currentTimeMillis();

        long tempoDeExecucao = fim - inicio;



        System.out.println("Tempo gasto: " + tempoDeExecucao);

    }
}