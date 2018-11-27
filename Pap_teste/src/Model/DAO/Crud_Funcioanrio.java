package Model.DAO;

import Model.DAO.Conexao;
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
		this.conn = new Conexao().Conecta_oracle();
	}
	
	public void Inserir_funcionario(Funcionario funcionario) {
		try {
			
                        String sql2 ="insert into pessoa_senha(id_senha,senha,id_pessoa) values(SEQ_PESSOA_SENHA.nextval,?,?)";
                        String sql3 ="insert into pessoa_telefone(id_telefone,telefone,id_pessoa) values(SEQ_PESSOA_TELEFONE.nextval,?,?)";
                        String sql4 ="insert into pessoa_email(id_email,email,id_pessoa) values(SEQ_PESSOA_EMAIL.nextval,?,?)";
                        //String sql5 ="insert into Funcionario_cargo(id_cargo,cargo,id_funcionario) values(SEQ_FUNCIONARIO_CARGO.nextval,?,?)";
                        //String sql6 ="insert into funcionario_salario(id_salario,salario,id_funcionario) VALUES(SEQ_FUNCIONARIO_SALARIO.nextval,?,?)";
                        String sql7 ="insert into pessoa_endereco(id_endereco,bairro,cep,rua,estado,cidade,id_pessoa) "
                                + "VALUES(SEQ_PESSOA_ENDERECO.nextval,?,?,?,?,?,?)";
                        String sql1 = "insert into pessoa(id_pessoa, nome_real,nome_usuario,sexo,cpf,data_nasc)"
                                + " values(SEQ_PESSOA.nextval,?,?,?,?,?)";
                        String sql8 = "insert into funcionario(id_funcionario,id_pessoa,cargo,salario)"
                                + "values(SEQ_FUNCIONARIO.nextval,?,?,?)";
                        
                       Ver_ids ids = new Ver_ids();
                       PreparedStatement p1 =this.conn.prepareStatement(sql1);
                        p1.setString(1, funcionario.getNome());
                        p1.setString(2, funcionario.getNome_usuario());
                        p1.setString(3, funcionario.getSexo());
                        p1.setString(4, funcionario.getCpf());
                        p1.setString(5, funcionario.getData_nasc());
                        
                        p1.execute(); 
                       PreparedStatement p2 =this.conn.prepareStatement(sql2);
                        p2.setString(1, funcionario.getSenha());
                        p2.setString(2, ids.Pessoa());
                        p2.execute();
                        
                        PreparedStatement p3 =this.conn.prepareStatement(sql3);
                        p3.setString(1, funcionario.getTelefone());
                        p3.setString(2, ids.Pessoa());
                        p3.execute();
                        
                        PreparedStatement p4 =this.conn.prepareStatement(sql4);
                        p4.setString(1, funcionario.getEmail());
                        p4.setString(2, ids.Pessoa());
                        p4.execute();
                        
                        PreparedStatement p7 =this.conn.prepareStatement(sql7);
                        p7.setString(1, funcionario.getBairro());
                        p7.setString(2, funcionario.getCEP());
                        p7.setString(3, funcionario.getRua());
                        p7.setString(4, funcionario.getEstado());
                        p7.setString(5, funcionario.getCidade());
                        p7.setString(6, ids.Pessoa());
                        p7.execute();
                        
                        PreparedStatement p8 =this.conn.prepareStatement(sql8);
                        p8.setString(1, ids.Pessoa());
                        p8.setString(2, funcionario.getCargo());
                        p8.setString(3, funcionario.getSalario());
                        p8.execute();
                        
//                        PreparedStatement p5 =this.conn.prepareStatement(sql5);
//                        p5.setString(1, funcionario.getCargo());
//                        p5.setString(2, ids.Funcionario());
//                        p5.execute();
                        
                        
                        
                        p1.close();
                        p2.close();
                        p3.close();
                        p4.close();
                        
                        p7.close();
                        p8.close();
                        
                    Statement com =this.conn.createStatement();
                        com.execute("commit");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deletar(Funcionario funcionario){
            try {
                String sql1="delete from funcionario WHERE id_pessoa=?";
                String sql2="delete from pessoa where id_pessoa= ?";
                //Ver_ids ids = new Ver_ids();
                PreparedStatement p1 =this.conn.prepareStatement(sql1);
                p1.setString(1, funcionario.getId_pessoa());
                p1.execute();
                
                //funcionario.setId_funcionario(ids.Pessoa());
                PreparedStatement p2 =this.conn.prepareStatement(sql2);
                p2.setString(1, funcionario.getId_pessoa());
                p2.execute();
                
                Statement com =this.conn.createStatement();
                        com.execute("commit");
                
            } catch (Exception e) {
                e.printStackTrace();
            }
            
	}
	
	
        
	// metodo atualiza funcionario, tem que tetar e verificar se 2 comandos sql funcionaram
	// Updade tabela set campo = ?, set campo = ? where id = ?
	public void Atualizar(Funcionario funcionario) {
		try {
                        String sql1 ="update Pessoa set nome_real =?, nome_usuario =?,cpf =?, data_nasc=? where id_pessoa= ?";
			String sql2 ="update pessoa_senha set senha =? where id_pessoa =?";
                        String sql3 ="update pessoa_telefone set telefone =? where id_pessoa =?";
                        String sql4 ="update pessoa_email set email =? where id_pessoa =?";
                        //String sql5 ="update funcionario_cargo set cargo =? where id_funcionario=?";
                        //String sql6 ="update funcionario_salario set salario =? where id_funcionario =?";
                        String sql7 ="update pessoa_endereco set rua =?, bairro=?, estado=? where id_pessoa =?";
			String sql8 ="update funcionario set cargo =?,salario =? where id_pessoa=?";
                        
			Ver_ids ids = new Ver_ids();
                        
                        PreparedStatement p1 = this.conn.prepareStatement(sql1);
                        p1.setString(1, funcionario.getNome());
                        p1.setString(2, funcionario.getNome_usuario());
                        p1.setString(3, funcionario.getCpf());
                        p1.setString(4, funcionario.getData_nasc());
                        p1.setString(5, funcionario.getId_pessoa());
                        p1.execute();
                        
                        PreparedStatement p2 = this.conn.prepareStatement(sql2);
                        p2.setString(1, funcionario.getSenha());
                        p2.setString(2, funcionario.getId_pessoa());
                        p2.execute();
                        
                        PreparedStatement p3 = this.conn.prepareStatement(sql3);
                        p3.setString(1, funcionario.getTelefone());
                        p3.setString(2, funcionario.getId_pessoa());
                        p3.execute();
                       PreparedStatement p4 = this.conn.prepareStatement(sql4);
                        p4.setString(1, funcionario.getEmail());
                        p4.setString(2, funcionario.getId_pessoa());
                        p4.execute();
                        
//                        PreparedStatement p5 = this.conn.prepareStatement(sql5);
//                        p5.setString(1, funcionario.getCargo());
//                        p5.setString(2, funcionario.getId_funcionario());
//                        p5.execute();
//                        
//                        PreparedStatement p6 = this.conn.prepareStatement(sql6);
//                        p6.setString(1, funcionario.getSalario());
//                        p6.setString(2, funcionario.getId_funcionario());
//                        p6.execute();
                        
                        PreparedStatement p7 = this.conn.prepareStatement(sql7);
                        p7.setString(1, funcionario.getRua());
                        p7.setString(2, funcionario.getBairro());
                        p7.setString(3, funcionario.getEstado());
                        p7.setString(4, funcionario.getId_pessoa());
			p7.execute();
                        
                        PreparedStatement p8 =this.conn.prepareStatement(sql8);
                        p8.setString(1, funcionario.getCargo());
                        p8.setString(2, funcionario.getSalario());
                        p8.setString(3, funcionario.getId_pessoa());
                        
                        p8.execute();
                        
                        Statement com =this.conn.createStatement();
                        com.execute("commit");
                } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
        
	
	
	@SuppressWarnings("finally")
	public List<Funcionario> BuscaFuncionario(){
		List<Funcionario> lista = new LinkedList<>();
		try {
			String sql = "SELECT * from usuarios_funcionario";
			Statement statement = this.conn.createStatement();
			ResultSet resultado = statement.executeQuery(sql);
			while (resultado.next()) {
				Funcionario funcionario = new Funcionario();
				funcionario.setNome_usuario(resultado.getString("nome_usuario"));
				funcionario.setNome(resultado.getString("nome_real"));
                                funcionario.setRua(resultado.getString("rua"));
                                funcionario.setCEP(resultado.getString("cep"));
                                funcionario.setBairro(resultado.getString("bairro"));
                                funcionario.setCargo(resultado.getString("cargo"));
                                funcionario.setEstado(resultado.getString("estado"));
                                funcionario.setSalario(resultado.getString("salario"));
                                funcionario.setSexo(resultado.getString("sexo"));
                                
                                lista.add(funcionario);
			}
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			return lista;
		}
	}
	
	
	
}
