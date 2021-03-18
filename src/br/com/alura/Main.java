package br.com.alura;

import br.com.alura.modelos.Aluno;
import br.com.alura.modelos.Aula;
import br.com.alura.modelos.Curso;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso("Collections na Prática", "Thiago Valls");

        List<Aula> aulasImataveis = curso.getAulas();


        /** Adiciona um por um */
         curso.addClass(new Aula("Aprendendo ArrayList", 40));
         curso.addClass(new Aula("Ordenando Itens de um Array", 35));
         curso.addClass(new Aula("Aprendendo mais sobre Comparable", 36));
        // Aula a1 = new Aula("Aprendendo ArrayList", 40);
        // Aula a2 = new Aula("Ordenando Itens de um Array", 35);
        // Aula a3 = new Aula("Aprendendo mais sobre Comparable", 36);
        // curso.add(a1);
        // curso.add(a2);
        // curso.add(a3);


        /**
         * Adiciona grupo de aulas
         */
        // curso.addAll(aulasImataveis);

        /**
         * A diferença entre ArrayList e LinkedList está mais ligada a regra de negócio da aplicação
         * 1. Se precisamos remover ou incluir elementos de uma lista seria mais performático utilizar o linked list
         * pois ele trabalhar com alteração de ponteiros e isso acaba sendo mais fácil, uma vez que o ArrayList iria trocar a posição de elemento
         * por elemento para fazer esta manipulação. E pensando em muitos dados isso não seria performático.
         * 2. Se precisarmos pegar um único elemento de uma lista para mostrar já seria melhor utilizarmos o ArrayList porque nós podemos informar o índice
         * que o elemento se encontra e mostrar diretamente em qualquer lugar do código e de forma muito mais rápido, já o LinkedList se quisermos mostrar
         * o elemento da posição 1000 ele não mostra diretamente ele teria que passar por todos os demais.
         */
        // List<Aula> aulas = new ArrayList<>(aulasImataveis);
        // Collections.sort(aulas);
        // System.out.println(aulasImataveis.size());

        Aluno a1 = new Aluno("Thiago", 20403570);
        Aluno a2 = new Aluno("Thalita", 1244);
        Aluno a3 = new Aluno("Miro", 123);
        Aluno a5 = new Aluno("Jhonatas", 1236677);
        Aluno a6 = new Aluno("Amanda", 1234411);

        curso.matricula(a1);
        curso.matricula(a2);
        curso.matricula(a3);
        curso.matricula(a6);

        System.out.println("Verificando se o aluno " + a5.getName() + " está matriculado");
        System.out.println(curso.verificaMatricula(a5));

        System.out.println("Curso: " + curso.getNome());
        System.out.println("Aulas");
        curso.getAulas().forEach(aula -> {
            System.out.println(aula.getTitulo() + " ("+aula.getTempo()+"min)" );
        });
        System.out.println("Duração do curso : " + curso.getDuracaoCurso());
        System.out.println("Alunos matriculados:");
        curso.getAlunos().forEach(aluno -> {
            System.out.println(aluno.getName() + " - Matricula: " + aluno.getMatricula());
        });

        System.out.println("Listagem de alunos com iterator");
//        curso.getAlunos().forEach(aluno -> {
//            System.out.println(aluno.getName());
//        });

        Iterator<Aluno> iterator = curso.getAlunos().iterator();
        while (iterator.hasNext()) {
            Aluno next = iterator.next();
            System.out.println(next.getName());
        }
    }
}
