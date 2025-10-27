package br.ulbra.model;

public class Venda {
    private int idVenda;
    private date dataVenda;
    private double valorTotal;
    private Vendedor idVendedor;

    public Venda() {
    }

    public Venda(int idVenda, date dataVenda, double valorTotal, Vendedor idVendedor) {
        this.idVenda = idVenda;
        this.dataVenda = dataVenda;
        this.valorTotal = valorTotal;
        this.idVendedor = idVendedor;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public date getDataVenda() {
        return dataVenda;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public Vendedor getIdVendedor() {
        return idVendedor;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public void setDataVenda(date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setIdVendedor(Vendedor idVendedor) {
        this.idVendedor = idVendedor;
    }
}
