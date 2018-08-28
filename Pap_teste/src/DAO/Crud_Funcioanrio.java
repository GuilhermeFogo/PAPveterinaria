package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import Model.Funcionario;

public class Crud_Funcioanrio {
	private Connection conn;
	
	public Crud_Funcioanrio() {
		conn = new Conexao().Conecat_mysql();
	}
	
	public void Inserir_funcionario(Funcionario funcionario) {
		try {
			String sql = "insert into Funcioanrio(nome, telefone, email) values(?,?,?)";
			PreparedStatement prepare = setPrepare(sql, funcionario);
			prepare.executeQuery();
		} catch (Exception e) {
			System.exit(0);
		}
	}
	
	private PreparedStatement setPrepare(String sql, Funcionario funcioanrio) throws SQLException {
		PreparedStatement prepare = this.conn.prepareStatement(sql);
		prepare.setString(1, funcioanrio.getNome());
		prepare.setString(2, funcioanrio.getTelefone());
		prepare.setString(3, funcioanrio.getEmail());
		return prepare;
	}
	
	public void deletar(Funcionario funcionario){
		try {
			String sql = "delete from Funcionario where id=?";
			PreparedStatement prepare = setPrepareid(sql, funcionario);
			prepare.executeQuery();
		} catch (SQLException e) {
			System.exit(0);
		}
		
	}
	
	private PreparedStatement setPrepareid(String sql, Funcionario funcioanrio) throws SQLException {
		PreparedStatement prepare = this.conn.prepareStatement(sql);
		prepare.setString(1, funcioanrio.getId_funcionario());
		return prepare;
	}
	
	
	
	
	
	// metodo atualiza funcionario, tem que tetar e verificar se 2 comandos sql funcionaram
	// Updade tabela set campo = ?, set campo = ? where id = ?
	public void Atualizar(Funcionario funcionario) {
		try {
			String sql = "";
			String sql1 ="";
			PreparedStatement prepare1 = setPrepare(sql, funcionario);
			PreparedStatement prepare2 = setPrepareid(sql1, funcionario);
			prepare1.executeQuery();
			prepare2.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@SuppressWarnings("finally")
	public List<Funcionario> BuscaFuncionario(){
		List<Funcionario> lista = new LinkedList<>();
		try {
			String sql = "select * from Funcionario";
			Statement statement = this.conn.createStatement();
			ResultSet resultado = statement.executeQuery(sql);
			while (resultado.next()) {
				Funcionario funcionario = new Funcionario();
				funcionario.setNome(resultado.getString("nome"));
				lista.add(funcionario);
			}
			statement.close();
		} catch (SQLException e) {
			System.exit(0);
		}finally {
			return lista;
		}
	}
	
	
	
}
