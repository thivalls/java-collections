package br.com.alura.modelos;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;

public class Curso {
    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<>();
    private Set<Aluno> alunos = new TreeSet<>();
    private LocalDateTime createdAt;
    private int duracao;
    private Map<Integer, Aluno> matriculados = new HashMap<>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    /**
     * GETTERS
     */

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    // Neste caso estamos retornando uma referência para a memória do array de aulas dentro de curso variavel AULAS
    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public Set<Aluno> getIterableAlunos() {
        return Collections.synchronizedSet(alunos);
    }

    public Map<Integer, Aluno> getMatriculados() {
        return matriculados;
    }

    /**
     * SETTERS
     */


    /**
     * METHODS
     */
    public void addClass(Aula aula) {
        this.aulas.add(aula);
    }

    public void matricula(Aluno aluno) {
        this.alunos.add(aluno);
        this.matriculados.put(aluno.getMatricula(), aluno);
    }

    /**
     * Forma mais longa e ANTIGA de se fazer, mas que funciona.
     */
    // public int getDuracaoCurso() {
    //     int tempoTotal = 0;
    //     for (Aula aula: aulas) {
    //         tempoTotal += aula.getTempo();
    //     }
    //     return tempoTotal;
    // }
    public int getDuracaoCurso() {
        return aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    /**
     * OVERRIDES
     */
    @Override
    public String toString() {
        return "Curso: " + this.getNome() + " \' Aulas: " + aulas + "\' Tempo do Curso " + this.getDuracaoCurso() + " Alunos: " + alunos;
    }

    public boolean verificaMatricula(Aluno a1) {
        return alunos.contains(a1);
    }

    public Aluno buscaMatriculado(int matricula) {
        return matriculados.get(matricula);
    }
}
