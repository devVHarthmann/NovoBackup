
package br.ulbra.model;


public class produtoFornecedor {
       
    private Produto idProduto;
    private Fornecedor idFornecedor;

    public produtoFornecedor() {
    }

    public produtoFornecedor(Produto idProduto, Fornecedor idFornecedor) {
        this.idProduto = idProduto;
        this.idFornecedor = idFornecedor;
    }

    public Produto getIdProduto() {
        return idProduto;
    }

    public Fornecedor getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdProduto(Produto idProduto) {
        this.idProduto = idProduto;
    }

    public void setIdFornecedor(Fornecedor idFornecedor) {
        this.idFornecedor = idFornecedor;
    }
    
    
}
