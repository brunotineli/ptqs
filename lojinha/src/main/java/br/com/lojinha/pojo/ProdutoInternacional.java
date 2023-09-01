package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.interfaces.Favorito;

import java.util.List;

public class ProdutoInternacional extends Produto implements Favorito {
    private Double taxaDeImportacao;

    public ProdutoInternacional(String nome, String marca, Tamanho tamanho, List<ItemInclusos> itensInclusos, Double taxaDeImportacao) {
        super(nome, marca, tamanho, itensInclusos);
        setTaxaDeImportacao(taxaDeImportacao);
    }

    public Double getTaxaDeImportacao() {
        return taxaDeImportacao;
    }

    public void setTaxaDeImportacao(Double taxaDeImportacao) {
        this.taxaDeImportacao = taxaDeImportacao;
    }


    public void setValor(Double valor) {
        if (valor > -100) {
            this.valor = valor;
        } else {
            throw new IllegalArgumentException("Valor deve ser maior que -100");
        }
    }

    public String getDadosFavoritos() {
        return this.getNome() + ", " + this.getMarca() + " e " + this.getValor();
    }
}
