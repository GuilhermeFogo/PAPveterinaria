package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import javax.management.RuntimeErrorException;

import Objetos.Animais;
import Objetos.Cliente;

public class Crud_Animal {
	private Connection conn;
	public Crud_Animal() {
		 this.conn = new Conexao().Conecat_mysql();
	}
	
	public void Inserir(Animais animal) throws SQLException {
		try {
			// colocar a tabela
			String sql ="insert into";
			PreparedStatement prepare = getValores(animal, sql);
			prepare.executeQuery();		
		} catch (Error e) {
			throw new RuntimeErrorException(e);
		}finally {
			this.conn.close();
		}
	}
	
	
	private PreparedStatement getValores(Animais animal, String sql) throws SQLException {
		PreparedStatement prepare= this.conn.prepareStatement(sql);
		prepare.setString(1, animal.getNome_animal());
		prepare.setString(2, animal.getEspecie());
		
		return prepare;
	}
	
	private PreparedStatement getID_db(String sql, Animais animal) throws SQLException{
		PreparedStatement prepare = this.conn.prepareStatement(sql);
		prepare.setString(1, animal.getId_animal());
		prepare.executeQuery();
		return prepare;
	}
	
	
	public void Delete(Animais animal) throws SQLException {
		try {
			String sql = "delete from Cliente where id=?";
			PreparedStatement prepeare= getID_db(sql, animal);
			prepeare.executeQuery();
			
		} catch (Error e) {
			throw new RuntimeErrorException(e);
		}finally {
			this.conn.close();
		}
	}
	
	public void Atualiza(Animais animais) throws SQLException {
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
	
	public List<Animais> BuscaCliente() throws SQLException {
		try {
			String sql ="Select * from Animal";
			List<Animais> lista_cliente = new LinkedList<>();
			java.sql.Statement statement = this.conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			while (result.next()) {
				Animais animal = new Animais();
				animal.setEspecie(result.getString("Especie"));
				animal.setRaca(result.getString("raca"));
				lista_cliente.add(animal);
			}
			result.close();
			return lista_cliente;
		}catch (SQLException e) { 
			throw new RuntimeException(e);
		}
	}
}
