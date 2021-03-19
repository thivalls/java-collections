package br.com.alura;

import br.com.alura.modelos.Aluno;
import br.com.alura.modelos.Aula;
import br.com.alura.modelos.Curso;

import java.util.NoSuchElementException;

public class TesteMap {
    public static void main(String[] args) {
        Curso curso = new Curso("Curso Alura", "Luiz");

        curso.addClass(new Aula("Utilizando MAP no Java pt1", 12));
        curso.addClass(new Aula("Utilizando MAP no Java pt2", 13));
        curso.addClass(new Aula("Utilizando MAP no Java pt3", 14));

        curso.matricula(new Aluno("Amanda Melo", 1234));
        curso.matricula(new Aluno("Thiago Valls", 13));
        curso.matricula(new Aluno("Théo Henrique", 12345));

        Aluno aluno = curso.buscaMatriculado(13);

        if(aluno != null) {
            System.out.println(aluno);
        }else {
            throw new NoSuchElementException("Nenhum aluno encontrado com esta matricula");
        }

        // Listando as keys
        curso.getMatriculados().keySet().forEach(item -> {
            System.out.println(item);
        });

        // Listando os values
        curso.getMatriculados().values().forEach(item -> {
            System.out.println(item);
        });

        // Listando keys e values associoativamente
        curso.getMatriculados().entrySet().forEach(item -> {
            System.out.println(item);
        });
    }
}
