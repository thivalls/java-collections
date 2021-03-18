package br.com.alura;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Produto {
    private int id;
    private String nome;
    private int preco;

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public Produto(int id, String nome, int preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public int getPreco() {
        return preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto)) return false;

        Produto produto = (Produto) o;

        return id == produto.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}

class OrdenaPorPreco implements Comparator<Produto> {
    @Override
    public int compare(Produto o1, Produto o2) {
        return o1.getId() - o2.getId();
    }
}

public class TestandoTreeSet {
    public static void main(String[] args) {

        Set<Produto> produtos = new TreeSet<>(new OrdenaPorPreco());

        Produto p1 = new Produto(8, "Computador", 12);
        Produto p2 = new Produto(2, "Teclado", 5);
        Produto p3 = new Produto(3, "Mouse", 2);
        Produto p4 = new Produto(4, "bateria", 100);
        Produto p5 = new Produto(13, "batemia", 100);

        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);
        produtos.add(p4);
        produtos.add(p5);

        Iterator<Produto> iterator = produtos.iterator();
        while (iterator.hasNext()) {
            Produto produto = iterator.next();
            System.out.println(produto.getNome() + " - " + produto.getPreco());
        }

    }
}
