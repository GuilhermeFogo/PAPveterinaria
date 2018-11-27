/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.DAO.Conexao;
import Model.Medicamento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PcLocal
 */
public class Crud_remedio {
    private Connection conn;
    public Crud_remedio() {
        this.conn = new Conexao().Conecta_oracle();
    }
    
    public void inserir(Medicamento remedio){
        try {
            String sql1 ="insert into doenca_descricao(id_descricao,descricao,id_remedio) "
                    + "VALUES(SEQ_DOENCA_DESCRICAO.nextval,?,?)";
            String sql2 = "insert into doenca_dose(id_dose,dose,id_remedio) "
                    + "VALUES(SEQ_DOENCA_DOSE.nextval,?,?)";
            String sql3 ="insert into doenca_preco(id_preco,preco,id_remedio) "
                    + "VALUES(SEQ_DOENCA_PRECO.nextval,?,?)";
            String sql4 ="insert into remedio(id_remedio,nome,validade,quantidade)"
                    + " VALUES(SEQ_REMEDIO.nextval,?,?,?)";
            
            Ver_ids ids = new Ver_ids();
            PreparedStatement p4 = this.conn.prepareStatement(sql4);
            p4.setString(1, remedio.getNome());
            p4.setString(2, remedio.getValidade());
            p4.setString(3, remedio.getQuantidade());
            p4.execute();
            
            PreparedStatement p1 = this.conn.prepareStatement(sql1);
            p1.setString(1, remedio.getDescricao());
            p1.setString(2, ids.remedio());
            p1.execute();
            
            PreparedStatement p2 = this.conn.prepareStatement(sql2);
            p2.setDouble(1, remedio.getDose());
            p2.setString(2, ids.remedio());
            p2.execute();
            
            PreparedStatement p3 = this.conn.prepareStatement(sql3);
            p3.setString(1, remedio.getPreco());
            p3.setString(2, ids.remedio());
            p3.execute();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    public void remover(Medicamento remedio) {
        String sql4 ="DELETE from remedio where id_remedio=?";
        
        try {
           
            PreparedStatement p4 = this.conn.prepareStatement(sql4);
            p4.setString(1, remedio.getId());
            p4.execute();
            
        } catch (SQLException e) {
           e.printStackTrace();
        }
    }
    
    public  void atualiza(Medicamento remedio){
        try {
            String sql1 ="UPDATE doenca_descricao set descricao=? where id_remedio=?";
            String sql2="update doenca_dose set dose=? where id_remedio=?";
            String sql3="update doenca_preco set preco=? where id_remedio=?";
            String sql4 ="UPDATE remedio set nome=?,validade=?,quantidade =? where id_remedio=?";
            
            PreparedStatement p1 = this.conn.prepareStatement(sql1);
            p1.setString(1, remedio.getDescricao());
            p1.setString(2, remedio.getId());
            p1.execute();
            
            PreparedStatement p2 = this.conn.prepareStatement(sql2);
            p2.setDouble(1, remedio.getDose());
            p2.setString(2, remedio.getId());
            p2.execute();
            
            PreparedStatement p3 = this.conn.prepareStatement(sql3);
            p3.setString(1, remedio.getPreco());
            p3.setString(2, remedio.getId());
            p3.execute();
            
            PreparedStatement p4 = this.conn.prepareStatement(sql4);
            p4.setString(1, remedio.getNome());
            p4.setString(2, remedio.getValidade());
            p4.setString(3, remedio.getQuantidade());
            p4.setString(4, remedio.getId());
            p4.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public  List<Medicamento> Busca_Remedio() {
        List<Medicamento> lista = new LinkedList<>();
        try {
            String sql ="select * from remedios";
            Statement smt = this.conn.createStatement();
            ResultSet rs = smt.executeQuery(sql);
            while (rs.next()) {
                Medicamento remedio = new Medicamento();
                remedio.setDescricao(rs.getString("descricao"));
                remedio.setDose((int) Double.parseDouble(rs.getString("dose")));
                remedio.setPreco(rs.getString("preco"));
                remedio.setNome(rs.getString("nome"));
                remedio.setQuantidade(rs.getString("quantidade"));
                remedio.setValidade(rs.getString("validade"));
                lista.add(remedio);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }
}