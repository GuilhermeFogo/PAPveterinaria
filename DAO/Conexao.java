package DAO;

import java.sql.Connection;
import java.sql.DriverAction;
import java.sql.DriverManager;

public class Conexao {
	private Connection conexao;
	
	public Connection getConexao() {
		return conexao;
	}
	
	public void setConexao(Connection conexao) {
		this.conexao = conexao;
	}
	
	
	@SuppressWarnings("finally")
	public Connection Conecat_mysql() {
		try {
			String usuario ="root";
			String senha ="123456";
			String ip ="localhost";
			String banco="mysql";
			String jdbc ="jdbc:mysql://"+ ip+"/"+banco;
			Class.forName("com.mysql.jdbc.Driver");
			setConexao(DriverManager.getConnection(jdbc, usuario, senha));
		} catch (Exception e) {
			String mensagem =  e.getMessage();
			System.err.println(mensagem);
			System.exit(0);
		}finally {
			return getConexao();
		}
	}

}
