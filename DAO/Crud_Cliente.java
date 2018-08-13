package DAO;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import javax.management.RuntimeErrorException;

import Objetos.Cliente;

public class Crud_Cliente {
	private Connection conn;
	public Crud_Cliente() {
		 this.conn = new Conexao().Conecat_mysql();
	}
	
	public void Inserir(Cliente cliente) throws SQLException {
		try {
			String sql ="insert into Cliente(nome,telefone) values(?,?)";
			PreparedStatement prepare = getValores(cliente, sql);
			prepare.executeQuery();		
		} catch (Error e) {
			throw new RuntimeErrorException(e);
		}finally {
			this.conn.close();
		}
	}
	
	
	private PreparedStatement getValores(Cliente cliente, String sql) throws SQLException {
		PreparedStatement prepare= this.conn.prepareStatement(sql);
		prepare.setString(1, cliente.getNome());
		prepare.setString(2, cliente.getTelefone());
		
		return prepare;
	}
	
	private PreparedStatement getID_db(String sql, Cliente cliente) throws SQLException{
		PreparedStatement prepare = this.conn.prepareStatement(sql);
		prepare.setString(1, cliente.getId());
		prepare.executeQuery();
		return prepare;
	}
	
	
	public void Delete(Cliente cliente) throws SQLException {
		try {
			String sql = "delete from Cliente where id=?";
			PreparedStatement prepeare= getID_db(sql, cliente);
			prepeare.executeQuery();
			
		} catch (Error e) {
			throw new RuntimeErrorException(e);
		}finally {
			this.conn.close();
		}
	}
	
	public void Atualiza(Cliente cliente) throws SQLException {
		try {
			String sql ="Update from Cliente set nome=?, telefone=? where id=?";
			PreparedStatement prepare = this.conn.prepareStatement(sql);
			prepare.executeQuery();
		} catch (Error e) {
			throw new RuntimeErrorException(e);
		}finally {
			this.conn.close();
		}
	}
	
	public List<Cliente> BuscaCliente() throws SQLException {
		try {
			String sql ="Select * Cliente";
			Cliente cliente = new Cliente();
			List<Cliente> lista_cliente = new LinkedList<>();
			java.sql.Statement statement = this.conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			while (result.next()) {
				cliente.setNome(result.getString("nome"));
				cliente.setTelefone(result.getString("telefone"));
				
				lista_cliente.add(cliente);
			}
			result.close();
			return lista_cliente;
		}catch (SQLException e) { 
			throw new RuntimeException(e);
		}
	}

}
