package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> listaDeLivros;

    public CatalogoLivros() {
        listaDeLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        listaDeLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!listaDeLivros.isEmpty()) {
            for (Livro livro : listaDeLivros) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(livro);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorAno = new ArrayList<>();
        if (!listaDeLivros.isEmpty()) {
            for (Livro livro : listaDeLivros) {
                if (livro.getAnoPublicao() >= anoInicial && livro.getAnoPublicao() <= anoFinal)
                    livrosPorAno.add(livro);
            }
        }
        return livrosPorAno;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!listaDeLivros.isEmpty()) {
            for (Livro livro : listaDeLivros) {
                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = livro;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        // Adicionando livros ao catálogo
        catalogoLivros.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
        catalogoLivros.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
        catalogoLivros.adicionarLivro("Código Limpo", "Robert C. Martin", 2008);
        catalogoLivros.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
        catalogoLivros.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);

        System.out.println(catalogoLivros.pesquisarPorAutor("Peter Jandl Junior"));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Código Limpo"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2009, 2012));
    }
}


