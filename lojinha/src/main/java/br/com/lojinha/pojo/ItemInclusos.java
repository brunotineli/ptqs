package br.com.lojinha.pojo;

public class ItemInclusos {
    private String nome;
    private Integer quantidade;

    public ItemInclusos(String nome, Integer quantidade) {
        setNome(nome);
        setQuantidade(quantidade);
    }

    public String getNome() { return this.nome; }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
