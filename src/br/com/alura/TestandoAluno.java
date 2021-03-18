package br.com.alura;

import br.com.alura.modelos.Aluno;

import java.util.HashSet;
import java.util.Set;

public class TestandoAluno {
    public static void main(String[] args) {
//        Set<Aluno> alunos = new HashSet<>();
        Set<String> alunos = new HashSet<>();

        alunos.add("Thiago");
        alunos.add("Thalita");
        alunos.add("João");

        System.out.println(alunos.size());

        for (String aluno: alunos) {
            System.out.println(aluno);
        }


    }
}
