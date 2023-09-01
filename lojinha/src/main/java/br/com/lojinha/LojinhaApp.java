package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.ItemInclusos;
import br.com.lojinha.pojo.Produto;
import br.com.lojinha.pojo.ProdutoInternacional;
import br.com.lojinha.pojo.ProdutoNacional;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) {
        List<ItemInclusos> listaItensInclusos = new ArrayList<>();
        listaItensInclusos.add(new ItemInclusos("Controle", 2));
        listaItensInclusos.add(new ItemInclusos("Jogo", 3));
        listaItensInclusos.add(new ItemInclusos("Cabos de energia", 2));

        ProdutoInternacional meuProduto = new ProdutoInternacional("PS4",
                "Sony",
                Tamanho.GRANDE,
                listaItensInclusos,
                1.33);

        System.out.println(meuProduto.getNome());
        System.out.println(meuProduto.getMarca());
        meuProduto.setValor(100.00);
        System.out.println(meuProduto.getValor());
        System.out.println(meuProduto.getTamanho());

        System.out.println("Itens Inclusos:");
        for (ItemInclusos itemAtual : meuProduto.getItensInclusos()) {
            System.out.println(itemAtual.getNome());
            System.out.println(itemAtual.getQuantidade());
        }
        System.out.println(meuProduto.getTaxaDeImportacao());
        System.out.println(meuProduto.getDadosFavoritos());
    }
}
