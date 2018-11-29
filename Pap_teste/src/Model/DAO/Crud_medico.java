
package Model.DAO;

import Model.DAO.Conexao;
import Model.Exame;
import Model.Medico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class Crud_medico {
    private Connection conn;
    public Crud_medico() {
        this.conn = new Conexao().Conecta_oracle();
    }
    
    public void inserir(Medico medico){
        try {
            //String sql1 = "insert into crv (id_crv, crv, id_medico) VALUES(SEQ_CRV.nextval,?,?)";
            //String sql2 = "insert into medico_especialidade (id_especialidade,especialidade,id_medico) "
                   // + "VALUES(SEQ_MEDICO_ESPECIALIDADE.nextval,?,?)";
            String sql4 = "insert into pessoa_senha(id_senha,senha, id_pessoa) values(SEQ_PESSOA_SENHA.nextval,?,?)";
            String sql5 = "insert into pessoa_telefone(id_telefone,telefone,id_pessoa) values(SEQ_PESSOA_TELEFONE.nextval,?,?)";
            String sql6 ="insert into pessoa_email(id_email,email,id_pessoa) values(SEQ_PESSOA_EMAIL.nextval,?,?)";
            String sql7 = "insert into pessoa_endereco(id_endereco,rua,bairro, estado,CEP, cidade,id_pessoa) "
                    + "VALUES(SEQ_PESSOA_ENDERECO.nextval,?,?,?,?,?,?)";
            String sql8 ="insert into Pessoa(id_pessoa,nome_real, nome_usuario,sexo,cpf,data_nasc) "
                    + "values(SEQ_PESSOA.nextval,?,?,?,?,?)"; 
            String sql9 ="insert into medico(id_medico,id_pessoa,ESPECIALIDADE,crv,data,salario) "
                    + "values(SEQ_MEDICO.nextval,?,?,?,?,?)";
            //String sql10 ="insert into agenda_medico(id_agenda,data,id_medico)"
                    //+ " VALUES(SEQ_AGENDA_MEDICO.nextval,?,?)";
            Ver_ids ids = new Ver_ids();
            PreparedStatement p8 =this.conn.prepareStatement(sql8);
           p8.setString(1, medico.getNome());
           p8.setString(2, medico.getNome_usuario());
           p8.setString(3, medico.getSexo());
           p8.setString(4, medico.getCpf());
           p8.setString(5, medico.getData_nasc());
           p8.execute();
            
            PreparedStatement p4 =this.conn.prepareStatement(sql4);
            p4.setString(1, medico.getSenha());
            p4.setString(2, ids.Pessoa());
            p4.execute();
                        
            PreparedStatement p5 =this.conn.prepareStatement(sql5);
            p5.setString(1, medico.getTelefone());
            p5.setString(2, ids.Pessoa());
            p5.execute();
                        
            PreparedStatement p6 =this.conn.prepareStatement(sql6);
            p6.setString(1, medico.getEmail());
            p6.setString(2, ids.Pessoa());
            p6.execute();
                        
           PreparedStatement p7 =this.conn.prepareStatement(sql7);
           p7.setString(1, medico.getRua());
           p7.setString(2, medico.getBairro());
           p7.setString(3, medico.getEstado());
           p7.setString(4, medico.getCEP());
           p7.setString(5, medico.getCidade());
           p7.setString(6, ids.Pessoa());
           p7.execute();
           
           PreparedStatement p9 =this.conn.prepareStatement(sql9);
           p9.setString(1, ids.Pessoa());
           p9.setString(2, medico.getEspecialidade());
           p9.setString(3, medico.getCRV());
           p9.setString(4, medico.getHorario());
           p9.setString(5, medico.getSalario());
           p9.execute();
           
//           PreparedStatement p1 = this.conn.prepareStatement(sql1);
//            p1.setString(1, medico.getCRV());
//            p1.setString(2, ids.Medico());
//            p1.execute();
            
//            PreparedStatement p2 = this.conn.prepareStatement(sql2);
//            p2.setString(1, medico.getEspecialidade());
//            p2.setString(2, ids.Medico());
//            p2.execute();
            
//            PreparedStatement p10 = this.conn.prepareStatement(sql10);
//            p10.setString(1, medico.getHorario());
//            p10.setString(2, ids.Medico());
//            p10.execute();
            
            Statement com =this.conn.createStatement();
            com.execute("commit");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public  void deletar(Medico medico){
        try {
                String sql1="delete from medico WHERE id_pessoa= ?";
                String sql2="delete from pessoa where id_pessoa= ?";
                Ver_ids ids = new Ver_ids();
                PreparedStatement p1 =this.conn.prepareStatement(sql1);
                p1.setString(1, medico.getId_pessoa());
                p1.execute();
                
                //medico.setId_pessoa(ids.Pessoa());
                PreparedStatement p2 =this.conn.prepareStatement(sql2);
                p2.setString(1, medico.getId_pessoa());
                p2.execute();
                
                Statement com =this.conn.createStatement();
            com.execute("commit");
                
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
    
    public  void atualizar(Medico medico){
        try {
            
            String sql1 = "update Pessoa set nome_real =?, nome_usuario =?, cpf =?, data_nasc =? where id_pessoa= ?";
            String sql2 ="update pessoa_senha set senha =? where id_pessoa =?";
            String sql3 ="update pessoa_telefone set telefone =? where id_pessoa =?";
            String sql4 ="update pessoa_email set email =? where id_pessoa =?";
            String sql5 ="update pessoa_endereco set rua =?, bairro=?, estado=?, cidade=?,cep=? where id_pessoa =?";
            String sql6 ="UPDATE medico set id_pessoa=?,ESPECIALIDADE=?,crv=?,data=? where id_pessoa=?";
            //String sql7 = "update crv set crv =? where id_medico=?";
            //String sql8 ="UPDATE medico_especialidade set especialidade =? where id_medico =?";
            //String sql9 ="update agenda_medico set data=? where id_medico=?";
            PreparedStatement p1 = this.conn.prepareStatement(sql1);
            p1.setString(1, medico.getNome());
            p1.setString(2, medico.getNome_usuario());
            p1.setString(3, medico.getCpf());
            p1.setString(4, medico.getData_nasc());
            p1.setString(5, medico.getId_pessoa());
            p1.execute();
                        
            PreparedStatement p2 = this.conn.prepareStatement(sql2);
            p2.setString(1, medico.getSenha());
            
            p2.setString(2, medico.getId_pessoa());
            p2.execute();
                        
            PreparedStatement p3 = this.conn.prepareStatement(sql3);
            p3.setString(1, medico.getTelefone());
            
            p3.setString(2, medico.getId_pessoa());
            p3.execute();
                        
            PreparedStatement p4 = this.conn.prepareStatement(sql4);
            p4.setString(1, medico.getEmail());
            
            p4.setString(2, medico.getId_pessoa());
            p4.execute();
                        
            PreparedStatement p5 = this.conn.prepareStatement(sql5);
            p5.setString(1, medico.getRua());
            p5.setString(2, medico.getBairro());
            p5.setString(3, medico.getEstado());
            p5.setString(4, medico.getCidade());
            p5.setString(5, medico.getCEP());
            p5.setString(6, medico.getId_pessoa());
            p5.execute();
            
//            PreparedStatement p7 = this.conn.prepareStatement(sql7);
//            p7.setString(1, medico.getCRV());
//            p7.setString(2, medico.getId_pessoa());
//            p7.execute();
//            
//            PreparedStatement p8 = this.conn.prepareStatement(sql8);
//            p8.setString(1, medico.getEspecialidade());
//            p8.setString(2, medico.getId_pessoa());
//            p8.execute();
            
            PreparedStatement p6 = this.conn.prepareStatement(sql6);
            p6.setString(1, medico.getId_pessoa());
            p6.setString(2, medico.getEspecialidade());
            p6.setString(3, medico.getCRV());
            p6.setString(4, medico.getHorario());
            p6.setString(5, medico.getId_pessoa());
            
            p6.execute();
            
//            PreparedStatement p9 =this.conn.prepareStatement(sql9);
//            p9.setString(1, medico.getHorario());
//            p9.setString(2, medico.getId_pessoa());
//            p9.execute();
//            
            Statement com =this.conn.createStatement();
            com.execute("commit");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
            
    }
    
    public ResultSet buscarMedicos() throws SQLException{
        List<Medico> lista = new LinkedList<>();
        String sql = "select * from usuarios_medico";
        Statement stm = this.conn.createStatement();
        ResultSet rs = stm.executeQuery(sql);
        
        
        return rs;
    }
    
    
    public  ResultSet agenda_medico(){
        try {
            String sql = "select * from medico";
            Statement smt = this.conn.createStatement();
            ResultSet rs = smt.executeQuery(sql);
            return  rs;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
}
