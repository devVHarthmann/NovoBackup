package br.ulbra.DAO;

import br.ulbra.model.Vendedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class VendedorDAO extends AbstractDAO implements CrudRepository<Vendedor>{

    @Override
    public void salvar(Vendedor v) throws SQLException {
        String sql = "INSERT INTO vendedor (nome, cpf, sexo, email, ativo, dataAdmissao) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection con = getConnection();
                PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, v.getNome());
            ps.setString(2, v.getCpf());
            ps.setString(3, v.getSexo());
            ps.setString(4, v.getEmail());
            ps.setBoolean(5, v.isAtivo());
            ps.setDate(6, v.getDataEmissaoSql());
            
            int affected = ps.executeUpdate();
            if (affected == 0) {
                throw new SQLException("Falha ao inserir vendedor");
            }
            try (ResultSet rs = ps.getGeneratedKeys()){
                if (rs.next()) {
                    v.setIdVendedor(rs.getInt(1));
                }
            }
        }
                
                
                
                
    }

    @Override
    public Vendedor buscarPorId(int id) throws SQLException {
           String sql = "SELECT idVendedor, nome, cpf, sexo, email, ativo, dataAdmissao FROM vendedor WHERE idVendedor = ?";
           try (Connection con = getConnection();
                   PreparedStatement ps = con.prepareStatement(sql)) {
               ps.setInt(1, id);
               try (ResultSet rs = ps.executeQuery()){
                   if (rs.next()){
                       return new Vendedor(
                               rs.getInt("idVendedor"),
                               rs.getString("nome"),
                               rs.getString("cpf"),
                               rs.getString("sexo"),
                               rs.getString("email"),
                               rs.getBoolean("ativo"),
                               rs.getDate("dataAdmissao").toLocalDate()
                               
                       );
                   }
               }
           }
              return null;
    }

    @Override
    public List<Vendedor> listar() throws SQLException {
           String sql = "SELECT idVendedor, nome, cpf, sexo, email, ativo, dataAdmissao FROM vendedor ORDER by idVendedor";
           List<Vendedor> lista = new ArrayList<>();
           try (Connection con = getConnection();
                   PreparedStatement ps = con.prepareStatement(sql);
                   ResultSet rs = ps.executeQuery()) {
               while(rs.next()) {
                   Vendedor v = new Vendedor(
                           rs.getInt("idVendedor"),
                           rs.getString("nome"),
                           rs.getString("cpf"),
                           rs.getString("sexo"),
                           rs.getString("email"),
                           rs.getBoolean("ativo"),
                           rs.getDate("dataAdmissao").toLocalDate());
                   
                   lista.add(v);
               }
           }
           return lista;
    }

    @Override
    public void atualizar(Vendedor v) throws SQLException {
           String sql = "UPDATE vendedor set nome=? ,cpf=? ,sexo=?, email=?, ativo=?, dataAdmissao=? WHERE by idVendedor=?";
           try(Connection con = getConnection();
                   PreparedStatement ps = con.prepareStatement(sql)) {
               ps.setString(1, v.getNome());
               ps.setString(2, v.getCpf());
               ps.setString(3, v.getSexo());
               ps.setString(4, v.getEmail());
               ps.setBoolean(5, v.isAtivo());
               ps.setDate(6, v.getDataEmissaoSql());
               
               ps.executeUpdate();
           }
    }

    @Override
    public void remover(int id) throws SQLException {
           String sql = "DELETE FROM vendedor WHERE idVendedor = ?";
           try (Connection con = getConnection();
                   PreparedStatement ps = con.prepareStatement(sql)) {
               ps.setInt(1, id);
               ps.executeUpdate();
           }
           
    }
    
    
}
