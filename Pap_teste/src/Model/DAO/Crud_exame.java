/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Animais;
import Model.Cliente;
import Model.Consulta;
import Model.Exame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class Crud_exame {
    private Connection conn;
    
    public Crud_exame() {
        this.conn = new Conexao().Conecta_oracle();
    }
    
    public void inserir(Exame exame, Cliente cliente, Animais animal){
        try {
   
           
           String sql3= "insert into exame(id_exame, exame,realizado,preco,nome_cliente_exame,nome_animal_exame)"
                   + "VALUES(SEQ_EXAME.nextval,?,?,?,?,?)";
//           PreparedStatement p2 =this.conn.prepareStatement(sql2);
//            p2.setString(1, consulta.getTipo_consulta());
//            p2.setString(2, consulta.getTipo_pagamento());
//            p2.setString(3, cliente.getNome());
//            p2.setString(4, animal.getNome_animal());
//            p2.setString(5, consulta.getData_consulta());
//            p2.execute();
//           
//           PreparedStatement p1 = this.conn.prepareStatement(sql1);
//            p1.setDouble(1, consulta.getPreco());
//            p1.setString(2, ids.consulta());
//            p1.execute();
            
           PreparedStatement p3 = this.conn.prepareStatement(sql3);
            p3.setString(1, exame.getNome());
            p3.setString(2, exame.getData_exame());
            p3.setString(3, exame.getPreco());
            p3.setString(4, cliente.getNome());
            p3.setString(5, animal.getNome_animal());
            p3.execute();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public  void deletar(Exame exame){
        try {
            
            String sql2 ="delete from exame where id_exame=?";
            
            PreparedStatement p2 = this.conn.prepareStatement(sql2);
            p2.setString(1, exame.getId_exame());
            p2.execute();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public  void atualizar(Exame exame, Cliente cliente, Animais animais){
        try {
            String sql9 ="update exame set exame=?, realizado=?, preco=?,"
                    + "nome_cliente_exame=?,nome_animal_exame=?"
                    + "where id_exame=?";
            
            
//           PreparedStatement p1 = this.conn.prepareStatement(sql1);
//           p1.setDouble(1, consulta.getPreco());
//           p1.setString(2, consulta.getId());
//           p1.execute();
           
           PreparedStatement p9 = this.conn.prepareStatement(sql9);
            p9.setString(1, exame.getNome());
            p9.setString(2, exame.getData_exame());
            p9.setString(3, exame.getPreco());
            p9.setString(4, cliente.getNome());
            p9.setString(5, animais.getNome_animal());
            p9.setString(6, exame.getId_exame());
            p9.execute();
           
//            PreparedStatement p2 = this.conn.prepareStatement(sql2);
//            p2.setString(1, consulta.getTipo_consulta());
//            p2.setString(2, consulta.getTipo_pagamento());
//            p2.setString(3, cliente.getNome());
//            p2.setString(4, animais.getNome_animal());
//            p2.setString(5, consulta.getData_consulta());
//            p2.setString(6, consulta.getId());
//            p2.execute();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public ResultSet buscar_exame(){
        try {
            String sql = "select * from exame";
            Statement stm = this.conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            return  rs;
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
