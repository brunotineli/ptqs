package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;

import java.util.List;

public class Produto {
    private String nome;
    private String marca;
    private Tamanho tamanho;
    protected Double valor;
    private List<ItemInclusos> itensInclusos;

    public Produto(String nome, String marca, Tamanho tamanho, List<ItemInclusos> itensInclusos) {
        setNome(nome);
        setMarca(marca);
        setTamanho(tamanho);
        setItensInclusos(itensInclusos);
    }

    public String getNome() {
        return this.nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return this.marca;
    }

    private void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getValor() {
        return this.valor;
    }

    public void setValor(Double valor) {
        if (valor > 0) {
            this.valor = valor;
        } else {
            throw new IllegalArgumentException("Valor deve ser maior que 0");
        }
    }

    public Tamanho getTamanho() {
        return this.tamanho;
    }

    private void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    public List<ItemInclusos> getItensInclusos() {
        return this.itensInclusos;
    }

    private void setItensInclusos(List<ItemInclusos> itensInclusos) {
        this.itensInclusos = itensInclusos;
    }
}
