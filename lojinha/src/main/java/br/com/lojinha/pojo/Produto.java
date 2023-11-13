package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class Produto {
    @Getter @Setter private String nome;
    @Getter @Setter private String marca;
    @Getter @Setter private Tamanho tamanho;
    @Getter protected Double valor;
    @Getter @Setter private List<ItemIncluso> itensInclusos;

    public Produto(String nome, String marca, Tamanho tamanho, List<ItemIncluso> itensInclusos) {
        setNome(nome);
        setMarca(marca);
        setValor(10.0);
        setTamanho(tamanho);
        setItensInclusos(itensInclusos);
    }

    public void setValor(Double valor) {
        if (valor > 0) {
            this.valor = valor;
        } else {
            throw new IllegalArgumentException("Valor deve ser maior que 0");
        }
    }
}
