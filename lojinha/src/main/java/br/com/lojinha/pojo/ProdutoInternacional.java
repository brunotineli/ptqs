package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.interfaces.Favorito;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class ProdutoInternacional extends Produto implements Favorito {
    @Getter @Setter private Double taxaDeImportacao;

    public ProdutoInternacional(String nome, String marca, Tamanho tamanho, List<ItemIncluso> itensInclusos, Double taxaDeImportacao) {
        super(nome, marca, tamanho, itensInclusos);
        setTaxaDeImportacao(taxaDeImportacao);
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
