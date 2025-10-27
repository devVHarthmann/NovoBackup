package br.ulbra.model;

public class Fornecedor {
    private int idFornecedor;
    private String razaoSocial;
    private String nomeFantasia;
    private String cnpj;
    private String email;
    private String telefone;

    public Fornecedor() {
    }

    public int getIdFornecedor() {
        return idFornecedor;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setIdFornecedor(int idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
