package Model.DAO;

import Model.DAO.Conexao;
import Model.Animais;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Ver_ids {
    private Connection conn;

    public Ver_ids() {
    this.conn = new Conexao().Conecta_oracle();
    }
    
    
    
    
    public String Endereco(){
        ResultSet resultado = null;
        String resultados= null;
        try {
            String sql = "select id_endereco from pessoa_endereco order by id_endereco";
            Statement stm = this.conn.createStatement();
            resultado = stm.executeQuery(sql);
            while (resultado.next()) {
                resultados=  resultado.getString("id_endereco");
            }
        } catch (Exception e) {
            e.printStackTrace();
            //JOptionPane.showMessageDialog(null, "Erro fatal");
        }finally{
            return  resultados;
        }
        
    }
    
    public String Email(){
        ResultSet resultado = null;
        String resultados = null;
        try {
            String sql = "select id_email from pessoa_email";
            Statement stm = this.conn.createStatement();
            resultado = stm.executeQuery(sql);
            while (resultado.next()) {
                resultados = resultado.getString("id_email");
            }
        } catch (Exception e) {
            e.printStackTrace();
            //JOptionPane.showMessageDialog(null, "Erro fatal");
        }finally{
            return  resultados;
        }
    }
    
    public String Telefone(){
        ResultSet resultado = null;
        String resultados = null;
        try {
            String sql = "select id_telefone from pessoa_telefone";
            Statement stm = this.conn.createStatement();
            resultado = stm.executeQuery(sql);
            while (resultado.next()) {
               resultados =resultado.getString("id_telefone");
            }
        } catch (Exception e) {
            e.printStackTrace();
            //JOptionPane.showMessageDialog(null, "Erro fatal");
        }finally{
            return  resultados;
        }
    }
    
    public String Pessoa(){
        ResultSet resultado = null;
        String resultados = null;
        try {
            String sql = "select id_pessoa from pessoa";
            Statement stm = this.conn.createStatement();
            resultado = stm.executeQuery(sql);
            while (resultado.next()) {
                resultados=  resultado.getString("id_pessoa");
            }
        } catch (Exception e) {
            e.printStackTrace();
            //JOptionPane.showMessageDialog(null, "Erro fatal");
        }finally{
            return  resultados;
        }
    }
    
    public String Senha(){
        ResultSet resultado = null;
        String resultados = null;
        try {
            String sql = "select id_senha from pessoa_senha";
            Statement stm = this.conn.createStatement();
            resultado = stm.executeQuery(sql);
            while (resultado.next()) {
                resultados= resultado.getString("id_senha");
            }
        } catch (Exception e) {
            e.printStackTrace();
            //JOptionPane.showMessageDialog(null, "Erro fatal");
        }finally{
            return  resultados;
        }
    }
    
    public String Funcionario_cargo(){
        ResultSet resultado = null;
        String resultados = null;
        try {
            String sql = "select id_cargo from funcionario_cargo";
            Statement stm = this.conn.createStatement();
            resultado = stm.executeQuery(sql);
            while (resultado.next()) {
                resultados = resultado.getString("id_cargo");
            }
        } catch (Exception e) {
            e.printStackTrace();
            //JOptionPane.showMessageDialog(null, "Erro fatal");
        }finally{
            return  resultados;
        }
    }
    
    
    public String Funcionario_salario(){
        ResultSet resultado = null;
        String resultados = null;
        try {
            String sql = "select id_salario from funcionario_salario";
            Statement stm = this.conn.createStatement();
            resultado = stm.executeQuery(sql);
            while (resultado.next()) {
               resultados= resultado.getString("id_salario");
            }
        } catch (Exception e) {
            e.printStackTrace();
            //JOptionPane.showMessageDialog(null, "Erro fatal");
        }finally{
            return  resultados;
        }
    }
    
    public String Funcionario(){
        ResultSet resultado = null;
        String resultados = null;
        try {
            String sql = "select id_funcionario from funcionario";
            Statement stm = this.conn.createStatement();
            resultado = stm.executeQuery(sql);
            while (resultado.next()) {
               resultados= resultado.getString("id_funcionario");
            }
        } catch (Exception e) {
            e.printStackTrace();
            //JOptionPane.showMessageDialog(null, "Erro fatal");
        }finally{
            return  resultados;
        }
    }
    
    public String Cliente(){
        ResultSet resultado = null;
        String resultados = null;
        try {
            String sql = "select id_cliente from cliente";
            Statement stm = this.conn.createStatement();
            resultado = stm.executeQuery(sql);
            while (resultado.next()) {
               resultados= resultado.getString("id_cliente");
            }
        } catch (Exception e) {
            e.printStackTrace();
            //JOptionPane.showMessageDialog(null, "Erro fatal");
        }finally{
            return  resultados;
        }
    }
    
    public String Medico(){
        ResultSet resultado = null;
        String resultados = null;
        try {
            String sql = "select id_medico from medico";
            Statement stm = this.conn.createStatement();
            resultado = stm.executeQuery(sql);
            while (resultado.next()) {
               resultados= resultado.getString("id_medico");
            }
        } catch (Exception e) {
           e.printStackTrace();
            //JOptionPane.showMessageDialog(null, "Erro fatal");
        }finally{
            return  resultados;
        }
    }
    
    public String Medico_especialidade(){
        ResultSet resultado = null;
        String resultados = null;
        try {
            String sql = "select id_especialidade from medico_especialidade";
            Statement stm = this.conn.createStatement();
            resultado = stm.executeQuery(sql);
            while (resultado.next()) {
               resultados= resultado.getString("id_especialidade");
            }
        } catch (Exception e) {
            e.printStackTrace();
            //JOptionPane.showMessageDialog(null, "Erro fatal");
        }finally{
            return  resultados;
        }
    }
    
    
    public String Animal(){
        String resultados = null;
        try {
            String sql = "SELECT id_animal FROM animal ORDER by id_animal";
            Statement stm = this.conn.createStatement();
             ResultSet rs =stm.executeQuery(sql);
            while (rs.next()) {
              
                 resultados = rs.getString("id_animal");
              
            }
        } catch (Exception e) {
            e.printStackTrace();
            //JOptionPane.showMessageDialog(null, "Erro fatal");
        }
        return resultados;
    }
    
    public String sexo_animal(){
        ResultSet resultado = null;
        String resultados = null;
        try {
            String sql = "SELECT id_sexo from sexo_animal ORDER by id_sexo";
            Statement stm = this.conn.createStatement();
            resultado = stm.executeQuery(sql);
            while (resultado.next()) {
               resultados= resultado.getString("id_sexo");
            }
        } catch (Exception e) {
            e.printStackTrace();
            //JOptionPane.showMessageDialog(null, "Erro fatal");
        }finally{
            return  resultados;
        }
    }
    
    public String raca_animal(){
        ResultSet resultado = null;
        String resultados = null;
        try {
            String sql = "SELECT id_raca from raca_animal ORDER by id_raca";
            Statement stm = this.conn.createStatement();
            resultado = stm.executeQuery(sql);
            while (resultado.next()) {
               resultados= resultado.getString("id_raca");
            }
        } catch (Exception e) {
            e.printStackTrace();
            //JOptionPane.showMessageDialog(null, "Erro fatal");
        }finally{
            return  resultados;
        }
    }
    
    public String animal_especie(){
        ResultSet resultado = null;
        String resultados = null;
        try {
            String sql = "SELECT id_especie from especie ORDER by id_especie";
            Statement stm = this.conn.createStatement();
            resultado = stm.executeQuery(sql);
            while (resultado.next()) {
               resultados= resultado.getString("id_especie");
            }
        } catch (Exception e) {
           e.printStackTrace();
            //JOptionPane.showMessageDialog(null, "Erro fatal");
        }finally{
            return  resultados;
        }
    }
    
    public String remedio(){
        ResultSet resultado = null;
        String resultados = null;
        try {
            String sql = "select id_remedio from remedio order by id_remedio";
            Statement stm = this.conn.createStatement();
            resultado = stm.executeQuery(sql);
            while (resultado.next()) {
               resultados= resultado.getString("id_remedio");
            }
        } catch (Exception e) {
            e.printStackTrace();
            //JOptionPane.showMessageDialog(null, "Erro fatal");
        }finally{
            return  resultados;
        }
    }
    
    public String doenca_descricao(){
        ResultSet resultado = null;
        String resultados = null;
        try {
            String sql = "select id_descricao from doenca_descricao";
            Statement stm = this.conn.createStatement();
            resultado = stm.executeQuery(sql);
            while (resultado.next()) {
               resultados= resultado.getString("id_descricao");
            }
        } catch (Exception e) {
            e.printStackTrace();
            //JOptionPane.showMessageDialog(null, "Erro fatal");
        }finally{
            return  resultados;
        }
    }
    
    public String doenca_preco(){
        ResultSet resultado = null;
        String resultados = null;
        try {
            String sql = "select id_preco from doenca_preco order by id_preco";
            Statement stm = this.conn.createStatement();
            resultado = stm.executeQuery(sql);
            while (resultado.next()) {
               resultados= resultado.getString("id_preco");
            }
        } catch (Exception e) {
            e.printStackTrace();
            //JOptionPane.showMessageDialog(null, "Erro fatal");
        }finally{
            return  resultados;
        }
    }
    
    public String doenca_dose(){
        ResultSet resultado = null;
        String resultados = null;
        try {
            String sql = "select id_dose from doenca_dose order by id_dose";
            Statement stm = this.conn.createStatement();
            resultado = stm.executeQuery(sql);
            while (resultado.next()) {
               resultados= resultado.getString("id_dose");
            }
        } catch (Exception e) {
            e.printStackTrace();
            //JOptionPane.showMessageDialog(null, "Erro fatal");
        }finally{
            return  resultados;
        }
    }
    
    public String fornecedor(){
        ResultSet resultado = null;
        String resultados = null;
        try {
            String sql = "select id_fornecedor from fornecedor order by id_fornecedor";
            Statement stm = this.conn.createStatement();
            resultado = stm.executeQuery(sql);
            while (resultado.next()) {
               resultados= resultado.getString("id_fornecedor");
            }
        } catch (Exception e) {
            e.printStackTrace();
            //JOptionPane.showMessageDialog(null, "Erro fatal");
        }finally{
            return  resultados;
        }
    }
    
    public String fornecedor_contato(){
        ResultSet resultado = null;
        String resultados = null;
        try {
            String sql = "select id_fornecedor_contato from fornecedor_contato order by id_fornecedor_contato";
            Statement stm = this.conn.createStatement();
            resultado = stm.executeQuery(sql);
            while (resultado.next()) {
               resultados= resultado.getString("id_fornecedor_contato");
            }
        } catch (Exception e) {
            e.printStackTrace();
            //JOptionPane.showMessageDialog(null, "Erro fatal");
        }finally{
            return  resultados;
        }
    }
    
    
    public String fornecedor_preco(){
        ResultSet resultado = null;
        String resultados = null;
        try {
            String sql = "select id_fornecedor_preco from fornecedor_preco order by id_fornecedor_preco";
            Statement stm = this.conn.createStatement();
            resultado = stm.executeQuery(sql);
            while (resultado.next()) {
               resultados= resultado.getString("id_fornecedor_preco");
            }
        } catch (Exception e) {
            e.printStackTrace();
            //JOptionPane.showMessageDialog(null, "Erro fatal");
        }finally{
            return  resultados;
        }
    }
    
    public String consulta(){
        ResultSet resultado = null;
        String resultados = null;
        try {
            String sql = "select id_consulta from consulta order by id_consulta";
            Statement stm = this.conn.createStatement();
            resultado = stm.executeQuery(sql);
            while (resultado.next()) {
               resultados= resultado.getString("id_consulta");
            }
        } catch (Exception e) {
            e.printStackTrace();
            //JOptionPane.showMessageDialog(null, "Erro fatal");
        }finally{
            return  resultados;
        }
    }
    
    public String consulta_preco(){
        ResultSet resultado = null;
        String resultados = null;
        try {
            String sql = "select id_consulta_preco from consulta_preco order by id_consulta_preco";
            Statement stm = this.conn.createStatement();
            resultado = stm.executeQuery(sql);
            while (resultado.next()) {
               resultados= resultado.getString("id_consulta_preco");
            }
        } catch (Exception e) {
            e.printStackTrace();
            //JOptionPane.showMessageDialog(null, "Erro fatal");
        }finally{
            return  resultados;
        }
    }
    
    public String exame(){
        ResultSet resultado = null;
        String resultados = null;
        try {
            String sql = "select id_exame from exame order by id_exame";
            Statement stm = this.conn.createStatement();
            resultado = stm.executeQuery(sql);
            while (resultado.next()) {
               resultados= resultado.getString("id_exame");
            }
        } catch (Exception e) {
            e.printStackTrace();
            //JOptionPane.showMessageDialog(null, "Erro fatal");
        }finally{
            return  resultados;
        }
    }
    
    public String agenda_medico(){
        ResultSet resultado = null;
        String resultados = null;
        try {
            String sql = "select id_agenda from agenda_medico order by id_agenda";
            Statement stm = this.conn.createStatement();
            resultado = stm.executeQuery(sql);
            while (resultado.next()) {
               resultados= resultado.getString("id_agenda");
            }
        } catch (Exception e) {
            e.printStackTrace();
            //JOptionPane.showMessageDialog(null, "Erro fatal");
        }finally{
            return  resultados;
        }
    }
    
    public String estoque(){
        ResultSet resultado = null;
        String resultados = null;
        try {
            String sql = "select id_estoque from estoque order by id_estoque";
            Statement stm = this.conn.createStatement();
            resultado = stm.executeQuery(sql);
            while (resultado.next()) {
               resultados= resultado.getString("id_estoque");
            }
        } catch (Exception e) {
            e.printStackTrace();
            //JOptionPane.showMessageDialog(null, "Erro fatal");
        }finally{
            return  resultados;
        }
    }
    
    public String estoque_quantidade(){
        ResultSet resultado = null;
        String resultados = null;
        try {
            String sql = "select id_quantidade from estoque_quantidade order by id_quantidade ";
            Statement stm = this.conn.createStatement();
            resultado = stm.executeQuery(sql);
            while (resultado.next()) {
               resultados= resultado.getString("id_quantidade");
            }
        } catch (Exception e) {
            e.printStackTrace();
            //JOptionPane.showMessageDialog(null, "Erro fatal");
        }finally{
            return  resultados;
        }
    }
    
    public String compra(){
        ResultSet resultado = null;
        String resultados = null;
        try {
            String sql = "SELECT id_compra from comprar order by id_compra";
            Statement stm = this.conn.createStatement();
            resultado = stm.executeQuery(sql);
            while (resultado.next()) {
               resultados= resultado.getString("id_compra");
            }
        } catch (Exception e) {
            e.printStackTrace();
            //JOptionPane.showMessageDialog(null, "Erro fatal");
        }finally{
            return  resultados;
        }
    }
    public String idade_animal(){
        ResultSet resultado = null;
        String resultados = null;
        try {
            String sql = "SELECT id_idade from idade_animal ORDER BY id_idade";
            Statement stm = this.conn.createStatement();
            resultado = stm.executeQuery(sql);
            while (resultado.next()) {
               resultados= resultado.getString("id_idade");
            }
        } catch (Exception e) {
            e.printStackTrace();
            //JOptionPane.showMessageDialog(null, "Erro fatal");
        }finally{
            return  resultados;
        }
    }
    
    public String crv(){
        ResultSet resultado = null;
        String resultados = null;
        try {
            String sql = "SELECT id_crv from crv order by id_crv";
            Statement stm = this.conn.createStatement();
            resultado = stm.executeQuery(sql);
            while (resultado.next()) {
               resultados= resultado.getString("id_crv");
            }
        } catch (Exception e) {
            e.printStackTrace();
            //JOptionPane.showMessageDialog(null, "Erro fatal");
        }finally{
            return  resultados;
        }
    }
}
