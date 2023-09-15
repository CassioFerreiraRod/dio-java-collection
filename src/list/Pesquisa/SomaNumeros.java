package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    List<Integer> listaNumeros;

    public SomaNumeros() {
        listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        listaNumeros.add(numero);
    }

    public int calcularSoma() {
        int valortotal = 0;
        if (!listaNumeros.isEmpty()) {
            for (Integer numero: listaNumeros){
                valortotal += numero;
            }
        }
        return valortotal;
    }

    public int encontrarMaiorNumero() {
        int numeroMaior = Integer.MIN_VALUE;
        if (!listaNumeros.isEmpty()){
            for (Integer numero : listaNumeros) {
                if (numero > numeroMaior)
                    numeroMaior = numero;
            }
        }
        return numeroMaior;
    }

    public int encontrarMenorNumero() {
        int numeroMaior = Integer.MAX_VALUE;
        if (!listaNumeros.isEmpty()){
            for (Integer numero : listaNumeros) {
                if (numero < numeroMaior)
                    numeroMaior = numero;
            }
        }
        return numeroMaior;
    }

    public void exibirNumeros() {
        System.out.println(listaNumeros);
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        // Adicionando números à lista
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(10);

        System.out.println("Números adicionados:");
        somaNumeros.exibirNumeros();

        System.out.println("A soma dos números é: " + somaNumeros.calcularSoma());

        System.out.println("O maior número é: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("O menor número é: " + somaNumeros.encontrarMenorNumero());
    }
}
