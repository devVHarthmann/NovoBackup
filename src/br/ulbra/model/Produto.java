package br.ulbra.model;

public class Produto {
private int idProduto;
    private String nomeProduto;
    private String descricao;
    private double valorUnitario;
    private int quantEstoque;

    public Produto() {
    }

    public Produto(int idProduto, String nomeProduto, String descricao, double valorUnitario, int quantEstoque) {
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.descricao = descricao;
        this.valorUnitario = valorUnitario;
        this.quantEstoque = quantEstoque;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public int getQuantEstoque() {
        return quantEstoque;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public void setQuantEstoque(int quantEstoque) {
        this.quantEstoque = quantEstoque;
    }
}
