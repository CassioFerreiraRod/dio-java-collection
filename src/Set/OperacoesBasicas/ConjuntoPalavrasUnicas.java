package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavraSet;

    public ConjuntoPalavrasUnicas() {
        palavraSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavraSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if (!palavraSet.isEmpty()){
            if (palavraSet.contains(palavra)){
                palavraSet.remove(palavra);
            } else {
                System.out.println("Palavra não encontrada.");
            }
        }else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public boolean verificarPalavra(String palavra) {
       return palavraSet.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        if (!palavraSet.isEmpty()) {
            System.out.println(palavraSet);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoDeLinguas = new ConjuntoPalavrasUnicas();

        conjuntoDeLinguas.adicionarPalavra("Inglês");
        conjuntoDeLinguas.adicionarPalavra("Espanhol");
        conjuntoDeLinguas.adicionarPalavra("Russo");
        conjuntoDeLinguas.adicionarPalavra("Japonês");
        conjuntoDeLinguas.adicionarPalavra("Chinês");
        conjuntoDeLinguas.adicionarPalavra("Portugês");

        conjuntoDeLinguas.exibirPalavrasUnicas();

        conjuntoDeLinguas.removerPalavra("Russo");
        conjuntoDeLinguas.exibirPalavrasUnicas();

        conjuntoDeLinguas.removerPalavra("Francês");

        System.out.println("A língua 'Português'  está no conjunto: " + conjuntoDeLinguas.verificarPalavra("Portugês"));
        System.out.println("A língua 'Russo'  está no conjunto: " + conjuntoDeLinguas.verificarPalavra("Russo"));

        conjuntoDeLinguas.exibirPalavrasUnicas();
    }

}
