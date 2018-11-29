package Model.DAO;

import Model.DAO.Conexao;
import Model.Agenda_medico;
import Model.Animais;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import javax.management.RuntimeErrorException;

import Model.Cliente;
import Model.Funcionario;


public class Crud_Cliente {
	private Connection conn;
	public Crud_Cliente() {
		 this.conn = new Conexao().Conecta_oracle();
	}
	
	public void Inserir_cliente(Cliente cliente) {
		try {
                        String sql2 ="insert into pessoa_senha(id_senha,senha,id_pessoa) values(SEQ_PESSOA_SENHA.nextval,?,?)";
                        String sql3 ="insert into pessoa_telefone(id_telefone,telefone,id_pessoa) values(SEQ_PESSOA_TELEFONE.nextval,?,?)";
                        String sql4 ="insert into pessoa_email(id_email,email,id_pessoa) values(SEQ_PESSOA_EMAIL.nextval,?,?)";
                        String sql5 ="insert into pessoa_endereco(id_endereco,rua,bairro, estado, CEP, cidade,id_pessoa) "
                                + "VALUES(SEQ_PESSOA_ENDERECO.nextval,?,?,?,?,?,?)";
                        String sql1 = "insert into Pessoa(id_pessoa,nome_real, nome_usuario,sexo,cpf,data_nasc)"
                                + "values(SEQ_PESSOA.nextval,?,?,?,?,?)";
                        String sql6 = "insert into cliente(id_cliente,id_pessoa)"
                                + "values(SEQ_CLIENTE.nextval,?)";
                        
                        Ver_ids ids = new Ver_ids();
                        
                        PreparedStatement p1 =this.conn.prepareStatement(sql1);
                        p1.setString(1, cliente.getNome());
                        p1.setString(2, cliente.getNome_usuario());
                        p1.setString(3, cliente.getSexo());
                        p1.setString(4, cliente.getCpf());
                        p1.setString(5, cliente.getData_nasc());
                        p1.execute();
                        
                        PreparedStatement p2 =this.conn.prepareStatement(sql2);
                        p2.setString(1, cliente.getSenha());
                        p2.setString(2, ids.Pessoa());
                        p2.execute();
                        
                        PreparedStatement p3 =this.conn.prepareStatement(sql3);
                        p3.setString(1, cliente.getTelefone());
                        p3.setString(2, ids.Pessoa());
                        p3.execute();
                        
                        PreparedStatement p4 =this.conn.prepareStatement(sql4);
                        p4.setString(1, cliente.getEmail());
                        p4.setString(2, ids.Pessoa());
                        p4.execute();
                        
                        PreparedStatement p5 =this.conn.prepareStatement(sql5);
                        p5.setString(1, cliente.getRua());
                        p5.setString(2, cliente.getBairro());
                        p5.setString(3, cliente.getEstado());
                        p5.setString(4, cliente.getCEP());
                        p5.setString(5, cliente.getCidade());
                        p5.setString(6, ids.Pessoa());
                        p5.execute();
		
                        PreparedStatement p6 =this.conn.prepareStatement(sql6);
                        p6.setString(1, ids.Pessoa());
                        p6.execute();
                        
                        java.sql.Statement com =this.conn.createStatement();
            com.execute("commit");
                        
                        
                        p1.close();
                        p2.close();
                        p3.close();
                        p4.close();
                        p5.close();
                        p6.close();
                } catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public void deletar(Cliente cliente){
            try {
                String sql = "delete from cliente where id_pessoa =?";
                String sql1 ="delete from pessoa where id_pessoa =?";
                
                PreparedStatement p1 =this.conn.prepareStatement(sql);
                   p1.setString(1, cliente.getId_pessoa());
                   p1.execute();
                   
               PreparedStatement p2 =this.conn.prepareStatement(sql1);
                   p2.setString(1, cliente.getId_pessoa());
                   p2.execute();
            
                   java.sql.Statement com =this.conn.createStatement();
            com.execute("commit");
            } catch (SQLException e) {
                e.printStackTrace();
            }
	}
	
	// metodo atualiza funcionario, tem que tetar e verificar se 2 comandos sql funcionaram
	// Updade tabela set campo = ?, set campo = ? where id = ?
	public void Atualizar(Cliente cliente) {
		try {
			String sql1 = "update Pessoa set nome_real =?, nome_usuario =?, cpf =?, data_nasc =? where id_pessoa= ?";
			String sql2 ="update pessoa_senha set senha =? where id_pessoa =?";
                        String sql3 ="update pessoa_telefone set telefone =? where id_pessoa =?";
                        String sql4 ="update pessoa_email set email =? where id_pessoa =?";
                        String sql5 ="update pessoa_endereco set rua =?, bairro=?, estado=? where id_pessoa =?";
			String sql6 ="update cliente set id_pessoa=? where id_pessoa=?";
//String sql = sql1 + sql2+sql3+sql4 + sql5;
                        
                        PreparedStatement p1 = this.conn.prepareStatement(sql1);
                        p1.setString(1, cliente.getNome());
                        p1.setString(2, cliente.getNome_usuario());
                        p1.setString(3, cliente.getCpf());
                        p1.setString(4, cliente.getData_nasc());
                        p1.setString(5, cliente.getId_pessoa());
                        p1.execute();
                        
                        PreparedStatement p2 = this.conn.prepareStatement(sql2);
                        p2.setString(1, cliente.getSenha());
                        
                        p2.setString(2, cliente.getId_pessoa());
                        p2.execute();
                        
                        PreparedStatement p3 = this.conn.prepareStatement(sql3);
                        p3.setString(1, cliente.getTelefone());
                        
                        p3.setString(2, cliente.getId_pessoa());
                        p3.execute();
                        
                        PreparedStatement p4 = this.conn.prepareStatement(sql4);
                        p4.setString(1, cliente.getEmail());
                        
                        p4.setString(2, cliente.getId_pessoa());
                        p4.execute();
                        
                        PreparedStatement p5 = this.conn.prepareStatement(sql5);
                        p5.setString(1, cliente.getRua());
                        p5.setString(2, cliente.getBairro());
                        p5.setString(3, cliente.getEstado());
                        
                        p5.setString(4, cliente.getId_pessoa());
			p5.execute();
                        
                        PreparedStatement p6 = this.conn.prepareStatement(sql6);
                        p6.setString(1, cliente.getId_pessoa());
                        p6.setString(2, cliente.getId_pessoa());
                        p6.execute();
                        
                        
           java.sql.Statement com =this.conn.createStatement();
                        com.execute("commit");
                        
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
        
	@SuppressWarnings("finally")
	public List<Cliente> BuscaCliente(){
		List<Cliente> lista = new LinkedList<>();
		try {
			String sql = "SELECT * FROM clientes";
			java.sql.Statement statement = this.conn.createStatement();
			ResultSet resultado = statement.executeQuery(sql);
			while (resultado.next()) {
				Cliente cliente = new Cliente();
				cliente.setNome(resultado.getString("nome_real"));
				cliente.setNome_usuario(resultado.getString("nome_usuario"));
                                cliente.setCEP(resultado.getString("cep"));
                                cliente.setEstado(resultado.getString("estado"));
                                cliente.setRua(resultado.getString("rua"));
                                cliente.setCidade(resultado.getString("cidade"));
                                cliente.setBairro(resultado.getString("bairro"));
                                cliente.setId(resultado.getString("id_pessoa"));
                                cliente.setId_pessoa(resultado.getString("id_pessoa"));
                                cliente.setSexo(resultado.getString("sexo"));
                                cliente.setSenha(resultado.getString("senha"));
                                cliente.setTelefone(resultado.getString("telefone"));
                                cliente.setEmail(resultado.getString("email"));
                                lista.add(cliente);
			}
			statement.close();
		} catch (SQLException e) {
			System.exit(0);
		}finally {
			return lista;
		}
	}

}