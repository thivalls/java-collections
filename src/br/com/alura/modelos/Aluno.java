package br.com.alura.modelos;

public class Aluno implements Comparable<Aluno>{
    private String name;
    private int matricula;

    public Aluno(String name, int matricula) {
        if (name == null) {
            throw new NullPointerException("Nome não pode ser nulo");
        }
        this.name = name;
        this.matricula = matricula;
    }

    public String getName() {
        return name;
    }

    public int getMatricula() {
        return matricula;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno)) return false;

        Aluno aluno = (Aluno) o;

        return getMatricula() == aluno.getMatricula();
    }

    @Override
    public int hashCode() {
        return getMatricula();
    }

    @Override
    public int compareTo(Aluno compare) {
        return name.compareTo(compare.name);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "name='" + name + '\'' +
                ", matricula=" + matricula +
                '}';
    }
}
