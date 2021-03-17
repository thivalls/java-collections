package br.com.alura;

import br.com.alura.modelos.Aula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Aula a1 = new Aula("b", 40);
        Aula a2 = new Aula("f", 35);
        Aula a3 = new Aula("a", 36);

        ArrayList<Aula> aulas = new ArrayList<>();

        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        // estes dois métodos não exigem que a classe implemente um Comparable pois o Comparator já implementa
        // aulas.sort(Comparator.comparing(Aula::getTempo));
        // Collections.sort(aulas, Comparator.comparing(Aula::getTempo));

        // Utilizando a classe COLLECTIONS e aplicando o método sort, sem passar o um Comparator, temos que impmementar o Comparable na class alvo
        // e informar com qual class T ela deve ser comparável
        Collections.sort(aulas);

        System.out.println(aulas);
    }
}
