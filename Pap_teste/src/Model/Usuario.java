package Model;

import java.lang.Thread.State;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DAO.Conexao;

public class Usuario {
	private String senha;
	private String nome_usu;
	private Connection conn;
	
	public Usuario() {
		this.conn = new Conexao().Conecat_mysql();
	}
	
	public String getNome_usu() {
		return nome_usu;
	}
	public String getSenha() {
		return senha;
	}
	public void setNome_usu(String nome_usu) {
		this.nome_usu = nome_usu;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public void Ver_banco() {
		String sql = "select * from Usuario";
		try {
			Statement statement=  this.conn.createStatement();
			ResultSet resultado = statement.executeQuery(sql);
			while (resultado.next()) {
				Usuario usu = new Usuario();
				usu.setNome_usu(resultado.getString("nome_usu"));
				usu.setSenha(resultado.getString("senha"));
				
			}
			statement.close();
			resultado.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
