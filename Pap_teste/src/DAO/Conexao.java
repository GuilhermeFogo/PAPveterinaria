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
			String banco="teste_db";
			String jdbc ="jdbc:mysql://"+ ip+"/"+banco;
			Class.forName("com.mysql.jdbc.Driver");
		
			setConexao(DriverManager.getConnection(jdbc, usuario, senha));
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			return getConexao();
		}
	}
	
	public Connection Conecta_oracle() {
		try {
			String usuario = "";
			String pass ="";
			String dbname = "";
			String ip = "";
			String url = "Jbdc:oracle://"+ ip+"/"+ dbname;
			Class.forName("");
			
		} catch (Exception e) {
			String mensage = e.getMessage();
			System.err.println(mensage);
			System.exit(0);
		}finally {
			return getConexao();
		}
	}

}
