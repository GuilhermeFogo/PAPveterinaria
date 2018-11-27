package Model.DAO;

import Model.DAO.Conexao;
import Model.Cliente;
import Model.Pessoas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
public class Loguin_geral {
    private  Connection conn;
    public Loguin_geral() {
        conn = new Conexao().Conecta_oracle();
    }
    
    public Pessoas loguin_geral(){
        String sql ="select nome_usuario,senha from usuarios_pessoas";
        Statement smt =null;
        ResultSet result = null;
        Pessoas p = new Pessoas();
        try {
            smt = this.conn.createStatement();
            result = smt.executeQuery(sql);
            while (result.next()) {
                
               p.setNome_usuario(result.getString("nome_usuario"));
               p.setSenha(result.getString("senha"));
               
            }
           
        smt.close();
        result.close();
         return p;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro fatal");
        }
        return p;
    }
    
    public void loguin_geralvoid(){
        String sql ="select nome_usuario,senha from usuarios_pessoas";
        Statement smt =null;
        ResultSet result = null;
        try {
            smt = this.conn.createStatement();
            result = smt.executeQuery(sql);
            while (result.next()) {
               Pessoas p = new Pessoas();
               p.setNome_usuario(result.getString("nome_usuario"));
               p.setSenha(result.getString("senha"));
              
            }
            
        smt.close();
        result.close();
        
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro fatal");
        }
        
    }
}
