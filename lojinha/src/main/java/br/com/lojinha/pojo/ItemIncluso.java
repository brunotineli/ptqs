package br.com.lojinha.pojo;

import lombok.Getter;
import lombok.Setter;

public class ItemIncluso {
    @Getter @Setter private String nome;
    @Getter @Setter private Integer quantidade;

    public ItemIncluso(String nome, Integer quantidade) {
        setNome(nome);
        setQuantidade(quantidade);
    }
}
