package br.ulbra.controller;

import br.ulbra.DAO.VendedorDAO;
import br.ulbra.model.Vendedor;
import java.sql.SQLException;
import java.util.List;

public class VendedorController {
    private VendedorDAO dao = new VendedorDAO();
    
    public void salvar(Vendedor v)throws SQLException{
        dao.salvar(v);
    }
    public Vendedor buscar (int id)throws SQLException{
        return dao.buscarPorId(id);
    }
    public List<Vendedor> listar()throws SQLException{
        return dao.listar();
    }
    public void atualizar(Vendedor v)throws SQLException{
        dao.atualizar(v);
    }
    public void remover(int id)throws SQLException{
        dao.remover(id);
    }
}
