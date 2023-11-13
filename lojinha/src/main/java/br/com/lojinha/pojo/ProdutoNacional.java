package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.interfaces.Favorito;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class ProdutoNacional extends Produto implements Favorito {
    @Getter @Setter private Double imposto;

    public ProdutoNacional(String nome, String marca, Tamanho tamanho, List<ItemIncluso> itensInclusos, Double imposto) {
        super(nome, marca, tamanho, itensInclusos);
        setImposto(imposto);
    }

    public String getDadosFavoritos() {
        return this.getNome() + ", " + this.getMarca() + " e " + this.getValor();
    }
}
