package Model.DAO;

import Model.DAO.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import javax.management.RuntimeErrorException;

import Model.Animais;



public class Crud_Animal {
	private Connection conn;
        private Conexao connn;
	public Crud_Animal() {
		 this.conn = new Conexao().Conecta_oracle();
	}
	
	public void Inserir(Animais animal) throws SQLException {
            String sql1 ="INSERT into animal(id_animal,nome) VALUES(SEQ_ANIMAL.nextval,?)";
	    String sql2 = "insert into raca_animal(id_raca, raca,id_animal) VALUES(SEQ_ANIMAL_RACA.nextval,?,?)";
            String sql3 = "insert into especie(id_especie,espece,id_animal) VALUES(SEQ_ANIMAL_ESPECIE.nextval,?,?)";
            String sql4 = "insert into sexo_animal(id_sexo, sexo,id_animal) VALUES(SEQ_ANIMAL_SEXO.nextval,?,?)";
            String sql5 = "insert into idade_animal(id_idade, idade,id_animal) VALUES(SEQ_ANIMAL_IDADE.nextval,?,?)";
        try {
	
            Ver_ids ids = new Ver_ids();
            PreparedStatement p1 = this.conn.prepareStatement(sql1);
            p1.setString(1, animal.getNome_animal());
            p1.execute();
                        
            PreparedStatement p2 = this.conn.prepareStatement(sql2);
            p2.setString(1, animal.getRaca());
            p2.setString(2, ids.Animal());
            p2.execute();
            
            PreparedStatement p3 =this.conn.prepareStatement(sql3);            
            p3.setString(1, animal.getEspecie());
            p3.setString(2, ids.Animal());            
            p3.execute();
            
            PreparedStatement p4 =this.conn.prepareStatement(sql4);            
            p4.setString(1, animal.getSexo());
            p4.setString(2, ids.Animal());
            p4.execute();
                        
            PreparedStatement p5 = this.conn.prepareStatement(sql5);
            p5.setString(1, animal.getIdade());
            p5.setString(2, ids.Animal());
            p5.execute();
                        
                        
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}
	
	public void Delete(Animais animal) throws SQLException {
            try {
                String sql5 = "delete from Animal where id_animal=?";
		
                PreparedStatement p5 =this.conn.prepareStatement(sql5);   
                    p5.setString(1, animal.getId_animal());
                    p5.execute();
                    
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			this.conn.close();
		}
	}
	
        
        
	public void Atualiza(Animais animais) throws SQLException {
		try {
			String sql5 ="Update Animal set nome=? where id_animal=?";
			String sql1 = "Update raca_animal set raca =? where id_animal=?";
                        String sql2 = "Update idade_animal set idade= ? where id_animal=?";
                        String sql3 = "Update sexo_animal set sexo =? where id_animal=?";
                        String sql4 = "Update especie set espece =? where id_animal=?";
                        
                        Ver_ids ids = new Ver_ids();
                        PreparedStatement p1 = this.conn.prepareStatement(sql1);
			p1.setString(1, animais.getRaca());
                        
                        p1.setString(2, ids.raca_animal());
                        p1.execute();
                        
                        PreparedStatement p2 = this.conn.prepareStatement(sql2);
			p2.setString(1, animais.getIdade());
                                            
                        p2.setString(2, ids.idade_animal());
                        p2.execute();
                        
                        PreparedStatement p3 = this.conn.prepareStatement(sql3);
			p3.setString(1, animais.getSexo());
                        
                        p3.setString(2, animais.getId_animal());
                        p3.execute();
                        
                        PreparedStatement p4 = this.conn.prepareStatement(sql4);
			p4.setString(1, animais.getEspecie());
                        
                        p4.setString(2, animais.getId_animal());
                        p4.execute();
                        
                        PreparedStatement p5 = this.conn.prepareStatement(sql5);
			p5.setString(1, animais.getNome_animal());
                        
                        p5.setString(2, animais.getId_animal());
                        p5.execute();
                        
                        p1.close();
                        p2.close();
                        p3.close();
                        p4.close();
                        p5.close();
                        
                        
                        
		} catch (Error e) {
			e.printStackTrace();
		}finally {
			this.conn.close();
		}
	}
        
	public List<Animais> BuscaCliente() throws SQLException {
		try {
			String sql ="SELECT * FROM animais";
			List<Animais> lista_animal = new LinkedList<>();
			java.sql.Statement statement = this.conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			while (result.next()) {
				Animais animal = new Animais();
                                animal.setNome_animal(result.getString("nome"));
				animal.setEspecie(result.getString("espece"));
				animal.setRaca(result.getString("raca"));
                                animal.setSexo(result.getString("sexo"));
                                animal.setIdade(result.getString("idade"));
				lista_animal.add(animal);
			}
			result.close();
			return lista_animal;
		}catch (SQLException e) { 
			throw new RuntimeException(e);
		}
	}
}
