package br.ulbra.model;

public class Vendedor {
    private int idVendedor;
    private String nome;
    private String cpf;
    private String sexo;
    private String email;
    private boolean ativo;
    private date dataEmissao; //arrumar no curso

    public Vendedor() {
    }

    public Vendedor(int idVendedor, String nome, String cpf, String sexo, String email, boolean ativo, date dataEmissao) {
        this.idVendedor = idVendedor;
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.email = email;
        this.ativo = ativo;
        this.dataEmissao = dataEmissao;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public String getEmail() {
        return email;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public date getDataEmissao() {
        return dataEmissao;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void setDataEmissao(date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }
}
