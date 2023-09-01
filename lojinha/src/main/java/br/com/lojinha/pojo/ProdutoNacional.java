package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.interfaces.Favorito;

import java.util.List;

public class ProdutoNacional extends Produto implements Favorito {
    private Double imposto;

    public ProdutoNacional(String nome, String marca, Tamanho tamanho, List<ItemInclusos> itensInclusos, Double imposto) {
        super(nome, marca, tamanho, itensInclusos);
        setImposto(imposto);
    }

    public Double getImposto() {
        return imposto;
    }

    public void setImposto(Double imposto) {
        this.imposto = imposto;
    }

    public String getDadosFavoritos() {
        return this.getNome() + ", " + this.getMarca() + " e " + this.getValor();
    }
}
