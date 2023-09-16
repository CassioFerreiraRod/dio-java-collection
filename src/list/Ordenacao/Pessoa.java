package list.Ordenacao;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private int idadde;
    private double altura;

    public Pessoa(String nome, int idadde, double altura) {
        this.nome = nome;
        this.idadde = idadde;
        this.altura = altura;
    }

    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(idadde, p.getIdadde());
    }

    public String getNome() {
        return nome;
    }

    public int getIdadde() {
        return idadde;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome:'" + nome + '\'' +
                ", idadde:" + idadde +
                ", altura:" + altura +
                '}';
    }
}

class ComparatorPorAltura implements Comparator<Pessoa> {
    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(),p2.getAltura());
    }
}
