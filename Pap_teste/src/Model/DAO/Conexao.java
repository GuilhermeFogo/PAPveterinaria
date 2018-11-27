package Model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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
	
        @SuppressWarnings("finally")
	public Connection Conecta_oracle(){
		try {
			String usuario = "PAP_RENOVARE";
			String pass ="PAP_RENOVARE";
                        Class.forName("oracle.jdbc.driver.OracleDriver");
                        String url = "jdbc:oracle:thin:@localhost:1521:xe";
                        System.out.println("sucesso");
                        setConexao(DriverManager.getConnection(url,usuario,pass));
                } catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			return getConexao();
		}
	}

}
