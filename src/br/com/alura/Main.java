package br.com.alura;

import br.com.alura.modelos.Aula;
import br.com.alura.modelos.Curso;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Aula a1 = new Aula("Aprendendo ArrayList", 40);
        Aula a2 = new Aula("Ordenando Itens de um Array", 35);
        Aula a3 = new Aula("Aprendendo mais sobre Comparable", 36);

        ArrayList<Aula> aulas = new ArrayList<>();

        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        Curso curso = new Curso("Curso de Collections da Alura", "Thiago Valls");


        /** Adiciona um por um */
        // curso.add(new Aula("Aprendendo ArrayList", 40));
        // curso.add(new Aula("Ordenando Itens de um Array", 35));
        // curso.add(new Aula("Aprendendo mais sobre Comparable", 36));

        /**
         * Adiciona grupo de aulas
         */
        curso.addAll(aulas);

        /**
         * A diferença entre ArrayList e LinkedList está mais ligada a regra de negócio da aplicação
         * 1. Se precisamos remover ou incluir elementos de uma lista seria mais performático utilizar o linked list
         * pois ele trabalhar com alteração de ponteiros e isso acaba sendo mais fácil, uma vez que o ArrayList iria trocar a posição de elemento
         * por elemento para fazer esta manipulação. E pensando em muitos dados isso não seria performático.
         * 2. Se precisarmos pegar um único elemento de uma lista para mostrar já seria melhor utilizarmos o ArrayList porque nós podemos informar o índice
         * que o elemento se encontra e mostrar diretamente em qualquer lugar do código e de forma muito mais rápido, já o LinkedList se quisermos mostrar
         * o elemento da posição 1000 ele não mostra diretamente ele teria que passar por todos os demais.
         */

        System.out.println(curso);
    }
}
