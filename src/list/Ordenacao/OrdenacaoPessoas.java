package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> listaDePessoas;

    public OrdenacaoPessoas() {
        this.listaDePessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        listaDePessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(listaDePessoas);
        if (!listaDePessoas.isEmpty()){
            Collections.sort(pessoasPorIdade);
            return pessoasPorIdade;
        } else {
            throw new RuntimeException("A lista esta vazia!");
        }
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(listaDePessoas);
        if (!listaDePessoas.isEmpty()) {
            Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
            return pessoasPorAltura;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exivirPessoas() {
        System.out.println(listaDePessoas);
    }

    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoPessoas
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        // Adicionando pessoas à lista
        ordenacaoPessoas.adicionarPessoa("Alice", 20, 1.56);
        ordenacaoPessoas.adicionarPessoa("Bob", 30, 1.80);
        ordenacaoPessoas.adicionarPessoa("Charlie", 25, 1.70);
        ordenacaoPessoas.adicionarPessoa("David", 17, 1.56);

        ordenacaoPessoas.exivirPessoas();
        System.out.println(ordenacaoPessoas.ordenarPorIdade());
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
    }
}
