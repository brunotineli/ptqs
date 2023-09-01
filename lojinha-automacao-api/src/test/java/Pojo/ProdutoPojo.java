package Pojo;

import java.util.List;

public class ProdutoPojo {
    private String produtoNome;
    private Double produtoValor;
    private List<String> produtoCores;
    private List<ComponentePojo> produtoComponentes;

    public String getProdutoNome() {
        return produtoNome;
    }

    public void setProdutoNome(String produtoNome) {
        this.produtoNome = produtoNome;
    }

    public Double getProdutoValor() {
        return produtoValor;
    }

    public void setProdutoValor(Double produtoValor) {
        this.produtoValor = produtoValor;
    }

    public List<String> getProdutoCores() {
        return produtoCores;
    }

    public void setProdutoCores(List<String> produtoCores) {
        this.produtoCores = produtoCores;
    }

    public List<ComponentePojo> getProdutoComponentes() {
        return produtoComponentes;
    }

    public void setProdutoComponentes(List<ComponentePojo> produtoComponentes) {
        this.produtoComponentes = produtoComponentes;
    }
}
