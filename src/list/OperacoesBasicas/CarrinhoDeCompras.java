package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itemParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()) {
            for (Item item : itemList) {
                if (item.getNome().equalsIgnoreCase(nome)) {
                    itemParaRemover.add(item);
                }
            }
        } else {
            throw new RuntimeException("A lista está vazia.");
        }
        itemList.removeAll(itemParaRemover);
    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        if (!itemList.isEmpty()) {
            for (Item item :
                    itemList) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia.");
        }
    }

    public void exibirItens() {
        System.out.println(itemList);
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" + itemList +
                "}";
    }

    public static void main(String[] args) {
        CarrinhoDeCompras compras = new CarrinhoDeCompras();
        compras.adicionarItem("Lápis", 2d, 3);
        compras.adicionarItem("Lápis", 2d, 3);
        compras.adicionarItem("Caderno", 35d, 1);
        compras.adicionarItem("Borracha", 2d, 2);

        compras.exibirItens();

        compras.removerItem("Lápis");

        compras.exibirItens();

        System.out.println("O valor total da compra é = " + compras.calcularValorTotal());

    }
}


