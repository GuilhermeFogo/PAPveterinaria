package Model.DAO;

import Model.DAO.Conexao;
import Model.Fornecedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;


public class Crud_fornecedor {
    private Connection conn;

    public Crud_fornecedor() {
     this.conn = new Conexao().Conecta_oracle();
    }
    public void inserir(Fornecedor fornecedor){
        try {
        String sql1 = "insert into fornecedor_contato(id_fornecedor_contato,nome,id_fornecedor) "
                + "values(SEQ_FORNECEDOR_CONTATO.nextval,?,?)";
        String sql2 ="insert into fornecedor_preco(id_fornecedor_preco,preco_fornecedor,id_fornecedor) "
                + "VALUES(SEQ_FORNECEDOR_PRECO.nextval,?,?)";
        String sql3="insert into fornecedor(id_fornecedor,nome_empresa,email,telefone)"
                + "VALUES(SEQ_FORNECEDOR.nextval,?,?,?)";
        
        Ver_ids ids = new Ver_ids();
        PreparedStatement p3= this.conn.prepareStatement(sql3);
            p3.setString(1, fornecedor.getNome_empresa());
            p3.setString(2, fornecedor.getEmail());
            p3.setString(3, fornecedor.getTelefone());
            p3.execute();
            
        PreparedStatement p1= this.conn.prepareStatement(sql1);
        p1.setString(1, fornecedor.getNome_contato());
        p1.setString(2, ids.fornecedor());
        p1.execute();
            
        PreparedStatement p2= this.conn.prepareStatement(sql2);
        p2.setString(1, fornecedor.getPreco());
        p2.setString(2, ids.fornecedor());
        p2.execute();
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public  void deletar(Fornecedor fornecedor){
        try {
            String sql3="DELETE from fornecedor where id_fornecedor= ?";
            
            
            PreparedStatement p3= this.conn.prepareStatement(sql3);
            p3.setString(1, fornecedor.getId());
            p3.execute();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public  void Atualizar(Fornecedor fornecedor){
        try {
            String sql2 = "update fornecedor_preco set preco_fornecedor=? where id_fornecedor= ?";
            String sql1 ="update fornecedor_contato set nome=? where id_fornecedor= ?";
            String sql3="update fornecedor set nome_empresa=?, email=?,telefone=? where id_fornecedor=?";
            
           PreparedStatement p1= this.conn.prepareStatement(sql1);
            p1.setString(1, fornecedor.getNome_contato());
            p1.setString(2, fornecedor.getId());
            p1.execute();
            
            PreparedStatement p2= this.conn.prepareStatement(sql2);
            p2.setString(1, fornecedor.getPreco());
            p2.setString(2, fornecedor.getId());
            p2.execute();
            
            PreparedStatement p3= this.conn.prepareStatement(sql3);
            p3.setString(1, fornecedor.getNome_empresa());
            p3.setString(2, fornecedor.getEmail());
            p3.setString(3, fornecedor.getTelefone());
            p3.setString(4,fornecedor.getId());
            p3.execute();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public List<Fornecedor> BuscarFornecedor(){
        List<Fornecedor> lista = new LinkedList<>();
        try {
            String sql ="select * from fornecedores";
            Statement stm = this.conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                Fornecedor form = new Fornecedor();
                form.setEmail(rs.getString("email"));
                form.setNome_contato(rs.getString("nome"));
                form.setNome_empresa(rs.getString("nome_empresa"));
                form.setPreco(rs.getString("preco_fornecedor"));
                form.setTelefone(rs.getString("telefone"));
                form.setId(rs.getString("id_fornecedor"));
                
                lista.add(form);
            }
            rs.close();
                   
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }
}
