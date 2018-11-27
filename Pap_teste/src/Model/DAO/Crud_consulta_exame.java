
package Model.DAO;

import Model.Animais;
import Model.Cliente;
import Model.Consulta;
import Model.Exame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import Model.DAO.Ver_ids;
public class Crud_consulta_exame {
    private Connection conn;
    
    public Crud_consulta_exame() {
        this.conn = new Model.DAO.Conexao().Conecta_oracle();
    }
    
    public void inserir(Consulta consulta, Cliente cliente, Animais animal){
        try {
   
           String sql1="insert into consulta_preco (id_consulta_preco,preco,id_consulta)"
                   + " VALUES(SEQ_CONSULTA_PRECO.nextval,?,?)";
//           String sql3= "insert into exame(id_exame, exame,realizado,preco,nome_cliente_exame,nome_animal_exame,id_consulta)"
//                   + "VALUES(SEQ_EXAME.nextval,?,?,?,?,?,?)";
           String sql2= "insert into consulta(id_consulta,tipo_consulta,tipo_pagamento,NOME_CLIEMTE, nome_animal,data_consulta)"
                   + " VALUES(SEQ_CONSULTA.nextval,?,?,?,?,?)";
            Ver_ids ids = new Ver_ids();
           PreparedStatement p2 =this.conn.prepareStatement(sql2);
            p2.setString(1, consulta.getTipo_consulta());
            p2.setString(2, consulta.getTipo_pagamento());
            p2.setString(3, cliente.getNome());
            p2.setString(4, animal.getNome_animal());
            p2.setString(5, consulta.getData_consulta());
            p2.execute();
           
           PreparedStatement p1 = this.conn.prepareStatement(sql1);
            p1.setString(1, consulta.getPreco());
            p1.setString(2, ids.consulta());
            p1.execute();
            
//           PreparedStatement p3 = this.conn.prepareStatement(sql3);
//            p3.setString(1, exame.getNome());
//            p3.setString(2, exame.getData_exame());
//            p3.setDouble(3, exame.getPreco());
//            p3.setString(4, cliente.getNome());
//            p3.setString(5, animal.getNome_animal());
//            p3.setString(6, ids.consulta());
//            p3.execute();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public  void deletar(Consulta consulta){
        try {
            
            String sql2 ="delete from consulta where id_consulta=?";
            
            PreparedStatement p2 = this.conn.prepareStatement(sql2);
            p2.setString(1, consulta.getId());
            p2.execute();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public  void atualizar(Consulta consulta, Cliente cliente, Animais animais){
        try {
//            String sql9 ="update exame set exame=?, realizado=?, preco=? where id_consulta=?";
            String sql1 ="update consulta_preco set preco=? where id_consulta=?";
            String sql2="UPDATE consulta set tipo_consulta=?, tipo_pagamento=?,NOME_CLIEMTE =?,nome_animal =?,"
                    + " data_consulta=? where id_consulta=?";
            Ver_ids ids = new Ver_ids();
            
           PreparedStatement p1 = this.conn.prepareStatement(sql1);
           p1.setString(1, consulta.getPreco());
           p1.setString(2, consulta.getId());
           p1.execute();
           
            PreparedStatement p2 = this.conn.prepareStatement(sql2);
            p2.setString(1, consulta.getTipo_consulta());
            p2.setString(2, consulta.getTipo_pagamento());
            p2.setString(3, cliente.getNome());
            p2.setString(4, animais.getNome_animal());
            p2.setString(5, consulta.getData_consulta());
            p2.setString(6, consulta.getId());
            p2.execute();
            
            //PreparedStatement p9 = this.conn.prepareStatement(sql9);
//            p9.setString(1, exame.getNome());
//            p9.setString(2, exame.getData_exame());
//            p9.setDouble(3, exame.getPreco());
//            p9.setString(4, consulta.getId());
//            p9.execute();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    public void buscar_consultas(){
        try {
            String sql = "select * from consultas";
            Statement stm = this.conn.createStatement();
            ResultSet rs = stm.executeQuery(sql); 
            
            while (rs.next()) {
                Cliente cliente = new Cliente();
                Animais animal = new Animais();
                Consulta consulta = new Consulta();
                
            consulta.setData_consulta(rs.getString("data_consulta"));
            consulta.setPreco(rs.getString("consulta_preco"));
            consulta.setTipo_pagamento(rs.getString("tipo_pagamento"));
            animal.setNome_animal(rs.getString("nome_animal"));
            cliente.setNome(rs.getString("NOME_CLIEMTE"));
            consulta.setId(rs.getString("id_consulta"));
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
