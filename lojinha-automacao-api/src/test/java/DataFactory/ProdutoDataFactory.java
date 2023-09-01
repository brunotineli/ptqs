package DataFactory;

import Pojo.ComponentePojo;
import Pojo.ProdutoPojo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDataFactory {
    public static ProdutoPojo adicionarProdutoComumComValorDe(Double valor) {
        ProdutoPojo produto = new ProdutoPojo();
        produto.setProdutoNome("Playstation 2021");
        produto.setProdutoValor(valor);

        List<String> cores = new ArrayList<>();
        cores.add("Preto");
        cores.add("Branco");
        produto.setProdutoCores(cores);

        List<ComponentePojo> componentes = new ArrayList<>();
        ComponentePojo componente1 = new ComponentePojo();
        componente1.setComponenteNome("Controle");
        componente1.setComponenteQuantidade(2);
        componentes.add(componente1);
        ComponentePojo componente2 = new ComponentePojo();
        componente2.setComponenteNome("Carregador");
        componente2.setComponenteQuantidade(1);
        componentes.add(componente2);
        produto.setProdutoComponentes(componentes);

        return produto;
    }
}
