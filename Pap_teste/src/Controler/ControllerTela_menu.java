/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Controler.Helper.Campo_Fornecesor;
import Controler.Helper.Campo_consulta;
import Controler.Helper.Campo_exame;
import Controler.Helper.Campo_funcionario;
import Controler.Helper.Campo_remedio;
import Controler.Helper.Campo_veterinario;
import Controler.Helper.Campos_Clliente;
import Controler.Helper.HelperCampos_loguin;
import Controler.Helper.Helper_campo_animal;
import Model.Animais;
import Model.Cliente;
import Model.Consulta;
import Model.DAO.Crud_Animal;
import Model.DAO.Crud_Cliente;
import Model.DAO.Crud_Funcioanrio;
import Model.DAO.Crud_exame;
import Model.DAO.Crud_fornecedor;
import Model.DAO.Crud_medico;
import Model.DAO.Crud_remedio;
import Model.Exame;
import Model.Fornecedor;
import Model.Funcionario;
import Model.Medicamento;
import Model.Medico;
import Model.Pessoas;
import Model.DAO.*;
import Model.DAO.Crud_consulta_exame;
import View.tela_geral;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Pichau
 */
public class ControllerTela_menu {
    private tela_geral view;
    private ActionListener actionListener;

    public ControllerTela_menu(tela_geral view) {
        this.view = view;
    }
    
    
    // criando o controle
    public void control() {
        actionListener = new ActionListener() {
            //se algum evento de clicar o botão acontecer:
            @Override
            public void actionPerformed(ActionEvent ev) {
                //verificar se é o botão limpar
                if (ev.getSource() == view.getBtn_limpar_cliente()) {
                    limpar_campos_cliente();
                }else if (ev.getSource() == view.getBtn_limpar_funcionario()) {
                    limpar_campos_funcionario();
                }else if (ev.getSource() == view.getBtn_limpar_medico()) {
                    limpar_campos_medico();
                }else if (ev.getSource() == view.getBtn_limpar_remedios_fornecedor()) {
                    limpar_remedio_fornecedor();
                }else if (ev.getSource()== view.getBtn_alterar_medico()) {
                    alterar_medico();
                }else if(ev.getSource()== view.getBtn_atualizar_funcionario()){
                    alterar_funcionario();
                }else if(ev.getSource() == view.getBtn_alterar_consulta()){
                    alterar_consulta();
                }else if(ev.getSource()== view.getBtn_atualizar_cliente()){
                    atualiza_cliente();
                }else if(ev.getSource() == view.getBtn_atualizar_remedios_fornecedor()){
                    alterar_fornecedor();
                }else if (ev.getSource() == view.getBtn_alterar_exame()) {
                    alterar_exame();
                }else if (ev.getSource() == view.getBtn_delete_medico()) {
                    deletar_medico();
                }else if (ev.getSource() == view.getBtn_deletar_consulta()) {
                    deletar_consulta();
                }else if (ev.getSource() == view.getBtn_deletar_funcionario()) {
                    deletar_funcionario();
                }else if (ev.getSource() == view.getBtn_deletar_cliente()) {
                    deletar_cliente();
                }else if (ev.getSource() == view.getBtn_excluir_exame()) {
                    deletar_exame();
                }else if (ev.getSource() == view.getBtn_deletar_remedios_fornecedor()) {
                    deletar_fornecedor();
                }else if (ev.getSource() == view.getBtn_mostrar_consultas()) {
                    mostar_consulta();
                }else if (ev.getSource() == view.getBtn_mostar_exame()) {
                    mostar_exame();
                }else if (ev.getSource() == view.getBtn_consultar_cliente()) {
                    mostar_cliente();
                }else if (ev.getSource() == view.getBtn_consultar_funcionarios()) {
                    mostar_funcionario();
                }else if (ev.getSource() == view.getBtn_consultar_medico()) {
                    mostar_medico();
                }else if (ev.getSource() == view.getBtn_consultar_remedios_fornecedor()) {
                    mostar_fornecedor();
                }else if (ev.getSource() == view.getBtn_salvar_cliente()) {
                    inserir_cliente();
                }else if (ev.getSource() == view.getBtn_salvar_consulta()) {
                    inserir_consulta();
                }else if (ev.getSource() == view.getBtn_salvar_exame()) {
                    inserir_exame();
                }else if (ev.getSource() == view.getBtn_salvar_funcionario()) {
                    inserir_funcionario();
                }else if (ev.getSource() == view.getBtn_salvar_medico()) {
                    inserir_medico();
                }else if (ev.getSource() == view.getBtn_salvar_remedios_fornecedor()) {
                    inserir_fornecedor();
                }else if (ev.getSource() == view.getBtn_limpar_consulta()) {
                    limpar_consulta();
                }else if (ev.getSource() == view.getBtn_limpar_exame()) {
                    limpar_exame();
                }else if (ev.getSource() == view.getBtn_limpar_animal()) {
                    limpar_animal();
                }else if (ev.getSource() == view.getBtn_limpar_remedios()) {
                    limpar_remedio();
                }else if (ev.getSource() == view.getBtn_mostar_agenda_medicos()) {
                    mostrar_agenda_medico();
                }else if (ev.getSource() == view.getBtn_atualizar_animal()) {
                    alterar_animal();
                }else if (ev.getSource() == view.getBtn_deletar_animal()) {
                    deletar_animal();
                }else if (ev.getSource() == view.getBtn_salvar_animal()) {
                    inserir_animal();
                }else if (ev.getSource() == view.getBtn_salvar_remedios()) {
                    inserir_remedio();
                }else if (ev.getSource() == view.getBtn_deletar_remedios()) {
                    deletar_remedio();
                }else if (ev.getSource() == view.getBtn_atualizar_remedios()) {
                    atualizar_remedio();
                }else if (ev.getSource() == view.getBtn_consultar_remedios()) {
                    mostar_remedio();
                }
                  
            }
        };
        // botoes
        //limpar
       view.getBtn_limpar_cliente().addActionListener(actionListener);
       view.getBtn_limpar_funcionario().addActionListener(actionListener);
       view.getBtn_limpar_medico().addActionListener(actionListener);
       view.getBtn_limpar_remedios_fornecedor().addActionListener(actionListener);
       view.getBtn_limpar_consulta().addActionListener(actionListener);
       view.getBtn_limpar_exame().addActionListener(actionListener);
       view.getBtn_limpar_remedios().addActionListener(actionListener);
       view.getBtn_limpar_animal().addActionListener(actionListener);
       // alterar
       view.getBtn_alterar_medico().addActionListener(actionListener);
       view.getBtn_atualizar_funcionario().addActionListener(actionListener);
       view.getBtn_alterar_consulta().addActionListener(actionListener);
       view.getBtn_atualizar_cliente().addActionListener(actionListener);
       view.getBtn_atualizar_remedios_fornecedor().addActionListener(actionListener);
       view.getBtn_alterar_exame().addActionListener(actionListener);
       view.getBtn_atualizar_animal().addActionListener(actionListener);
       view.getBtn_atualizar_remedios().addActionListener(actionListener);
        // delete
       view.getBtn_delete_medico().addActionListener(actionListener);
       view.getBtn_deletar_consulta().addActionListener(actionListener);
       view.getBtn_deletar_funcionario().addActionListener(actionListener);
       view.getBtn_deletar_cliente().addActionListener(actionListener);
       view.getBtn_excluir_exame().addActionListener(actionListener);
       view.getBtn_deletar_remedios_fornecedor().addActionListener(actionListener);
       view.getBtn_deletar_animal().addActionListener(actionListener);
       view.getBtn_deletar_remedios().addActionListener(actionListener);
        // mostar
       view.getBtn_mostrar_consultas().addActionListener(actionListener);
       view.getBtn_mostar_exame().addActionListener(actionListener);
       view.getBtn_consultar_cliente().addActionListener(actionListener);
       view.getBtn_consultar_funcionarios().addActionListener(actionListener);
       view.getBtn_consultar_medico().addActionListener(actionListener);
       view.getBtn_consultar_remedios_fornecedor().addActionListener(actionListener);
       view.getBtn_mostar_agenda_medicos().addActionListener(actionListener);
       view.getBtn_consultar_remedios().addActionListener(actionListener);
       // salvar
       view.getBtn_salvar_cliente().addActionListener(actionListener);
       view.getBtn_salvar_consulta().addActionListener(actionListener);
       view.getBtn_salvar_exame().addActionListener(actionListener);
       view.getBtn_salvar_funcionario().addActionListener(actionListener);
       view.getBtn_salvar_medico().addActionListener(actionListener);
       view.getBtn_salvar_remedios_fornecedor().addActionListener(actionListener);
       view.getBtn_salvar_animal().addActionListener(actionListener);
       view.getBtn_salvar_remedios().addActionListener(actionListener);
    } 
    
    public  void data(){
        Date data = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = formato.format(data);     
        view.getLblData().setText(dataFormatada);
    }
    
    public  void lable_usu(String nome){
        view.getLblUsuario().setText(nome);
    }
    
    
    public void limpar_campos_medico(){
        view.getCampo_usuario_medico().setText("");
        view.getCampo_real_medico().setText("");
        view.getCampo_bairro_medico().setText("");
        view.getCampo_estado_medico().setSelectedIndex(0);
        view.getCampo_email_medico().setText("");
        view.getCampo_cep_medico().setText("");
        view.getCampo_telefone_medico().setText("");
        view.getCampo_rua_medico().setText("");
        view.getCampo_cidade_medico().setText("");
        view.getCampo_data_nasc_medico().setText("");
        view.getCampo_especialidade_medico().setText("");
        view.getCampo_cpf_medico().setText("");
        view.getCampo_senha_medico().setText("");
        view.getCampo_conf_senha_medico().setText("");
        view.getCampo_cod_medico().setText("");
        view.getCampo_salario_medico().setText("");
        view.getSexo_medico().clearSelection();
        view.getCampo_horario_medico().setText("");
        
    }
    
    
    public void limpar_campos_cliente(){
        view.getCampo_usuario_cliente().setText("");
        view.getCampo_nome_real_cliente().setText("");
        view.getCampo_bairro_cliente().setText("");
        view.getCampo_estado_cliente().setSelectedIndex(0);
        view.getCampo_email_cliente().setText("");
        view.getCampo_cep_cliente().setText("");
        view.getCampo_telefone_cliente().setText("");
        view.getCampo_rua_cliente().setText("");
        view.getCampo_cidade_cliente().setText("");
        view.getCampo_data_nasc_cliente().setText("");
        view.getCampo_cpf_cliente().setText("");
        view.getCampo_senha_cliente().setText("");
        view.getCampo_conf_senha_cliente().setText("");
        view.getCampo_cod_cliente().setText("");
        view.getSexo_cliente().clearSelection();
    }
    
    
    public  void limpar_animal(){
        view.getCampo_nome_animal().setText("");
        view.getCampo_raca_animal().setText("");
        view.getCampo_idade_animal().setText("");
        view.getCampo_cod_animal().setText("");
        view.getCampo_especie_animal().setText("");
        view.getSexo_animal().clearSelection();
        
    }
    
    public void limpar_campos_funcionario(){
        view.getCampo_usuario_funcionario().setText("");
        view.getCampo_real_funcionario().setText("");
        view.getCampo_bairro_funcionario().setText("");
        view.getCampo_estado().setSelectedIndex(0);
        view.getCampo_email_funcionario().setText("");
        view.getCampo_cep_funcionario().setText("");
        view.getCampo_telefone_funcionario().setText("");
        view.getCampo_rua_funcionario().setText("");
        view.getCampo_cidade_funcionario().setText("");
        view.getCampo_data_nasc_funcionario().setText("");
        view.getCampo_cpf_funcionario().setText("");
        view.getCampo_senha_funcionario().setText("");
        view.getCampo_conf_senha_funcionario().setText("");
        view.getCampo_cargo_funcionario().setText("");
        view.getSexo_funcionarios().clearSelection();
        view.getCampo_cod_funcionario().setText("");
        view.getCampo_salario_funcionario().setText("");
    }
    
    
    public  void limpar_remedio(){
        view.getCampo_nome_remedio().setText("");
        view.getCampo_quantidade().setText("");
        view.getCampo_dose_remedio().setText("");
        view.getCampo_descricao_remedio().setText("");
        view.getCampo_preco_remedio().setText("");
        view.getCampo_cod_remedio().setText("");
        view.getCampo_validade_remedio().setText("");
    }
    public void limpar_remedio_fornecedor(){
        view.getCampo_email_fornecedor().setText("");
        view.getCampo_telefone_fornecedor().setText("");
        view.getCampo_preco_fornecedor().setText("");
        view.getCampo_contato_fornecedor().setText("");
        view.getCampo_nome_empresa_fornecedor().setText("");
        view.getCampo_cod_fornecedor().setText("");
    }
    
    public void limpar_consulta(){
        view.getCampo_data_consulta().setText("");
        view.getCampo_cod_consulta().setText("");
        view.getCampo_cliente_consulta().setText("");
        view.getCampo_nome_animal_consulta().setText("");
        view.getCampo_preco_consulta().setText("");
        view.getGrupo_consulta().clearSelection();
        view.getCampo_tipo_consulta().setText("");
    }
    
    public void limpar_exame(){
        view.getCampo_data_exame().setText("");
        view.getCampo_cod_exame().setText("");
        view.getCampo_cliente_exame().setText("");
        view.getCampo_animal_exame().setText("");
        view.getCampo_preco_exame().setText("");
        view.getCampo_tipo_exame().setText("");
        view.getGrupoExame().clearSelection();
        
    }
    //===========================================================================================================
    // INSERIR
    public  void inserir_cliente(){
        //conexao
        Crud_Cliente crud_Cliente = new Crud_Cliente();
        ;// pegando os valores
        Campos_Clliente campos = new Campos_Clliente();
        Cliente cliente = new Cliente();
        // definindo valores
        campos.setBairro(view.getCampo_bairro_cliente().getText());
        campos.setCep(view.getCampo_cep_cliente().getText());
        campos.setCidade(view.getCampo_cidade_cliente().getText());
        campos.setEmail(view.getCampo_email_cliente().getText());
        campos.setEstado((String)view.getCampo_estado_cliente().getSelectedItem());
        campos.setNome_real(view.getCampo_nome_real_cliente().getText());
        campos.setNome_uauario(view.getCampo_usuario_cliente().getText());
        campos.setRua(view.getCampo_rua_cliente().getText());
        campos.setSenha(view.getCampo_senha_cliente().getText());
        campos.setTelefone(view.getCampo_telefone_cliente().getText());
        campos.setData_nasc(view.getCampo_data_nasc_cliente().getText());
        campos.setCpf(view.getCampo_cpf_cliente().getText());
        campos.setCod_cliente(view.getCampo_cod_cliente().getText());
        
        
        String genero = "";
        if (view.getRadio_feminino_cliente().isSelected()) {
            genero = "Feminino";
        } else {
            genero = "Masculino";
        }
        campos.setSexo(genero);
        
        // verificando
        boolean verifica = campos.pega_campo_cliente(cliente);
        
        if (verifica) {
            // inseindo no banco
            crud_Cliente.Inserir_cliente(cliente);
            // mensagem ok
            JOptionPane.showMessageDialog(null, "OK");
        }else{
            // mensagem de erro
            JOptionPane.showMessageDialog(null, "Preencha todos os campos, tente novamente");
        }   
    }
    
    
    public void inserir_animal(){
        Crud_Animal crud_Animal = new Crud_Animal();
        Helper_campo_animal campo = new Helper_campo_animal();
        Animais animal = new Animais();
        campo.setCampo_especie(view.getCampo_especie_animal().getText());
        campo.setCampo_idade(view.getCampo_idade_animal().getText());
        campo.setCampo_nome_animal(view.getCampo_nome_animal().getText());
        campo.setCampo_raca(view.getCampo_raca_animal().getText());
        
        String sexo = "";
        if (view.getRadio_feminino_animal().isSelected()) {
            sexo = "Feminino";
        } else {
            sexo = "Masculino";
        }
        campo.setCampo_sexo(sexo);
        
        boolean verifica = campo.pegar_campo_animal(animal);
        if (verifica) {
            try {
                crud_Animal.Inserir(animal);
            } catch (SQLException ex) {
               String m = ex.getMessage();
               JOptionPane.showMessageDialog(null, m);
            }
            JOptionPane.showMessageDialog(null, "OK");
        }else{
            JOptionPane.showMessageDialog(null, "Preencha todos os campos, tente novamente");
        }   
    }
    
    // Funcionario
    public void inserir_funcionario(){
        Crud_Funcioanrio crud_Funcioanrio = new Crud_Funcioanrio();
        Campo_funcionario campos = new Campo_funcionario();
        Funcionario fun = new Funcionario();
        campos.setBairro(view.getCampo_bairro_funcionario().getText());
        campos.setCep(view.getCampo_cep_funcionario().getText());
        campos.setCidade(view.getCampo_cidade_funcionario().getText());
        campos.setEmail(view.getCampo_email_funcionario().getText());
        campos.setEstado((String)view.getCampo_estado().getSelectedItem());
        campos.setNome_real(view.getCampo_real_funcionario().getText());
        campos.setNome_uauario(view.getCampo_usuario_funcionario().getText());
        campos.setRua(view.getCampo_rua_funcionario().getText());
        campos.setSenha(view.getCampo_senha_funcionario().getText());
        campos.setTelefone(view.getCampo_telefone_funcionario().getText());
        campos.setData_nasc(view.getCampo_data_nasc_funcionario().getText());
        campos.setCpf(view.getCampo_cpf_funcionario().getText());
        
        String genero = "";
        if (view.getRadio_feminino_funcionario().isSelected()) {
            genero = "Feminino";
        } else {
            genero = "Masculino";
        }
        campos.setSexo(genero);
        
        boolean verifica = campos.pega_campo_funcionario(fun);
        if (verifica) {
            crud_Funcioanrio.Inserir_funcionario(fun);
            JOptionPane.showMessageDialog(null, "OK");
        }else{
            JOptionPane.showMessageDialog(null, "Preencha todos os campos, tente novamente");
        }   
    }
    
    public void inserir_medico(){
        Crud_medico crud_medico = new Crud_medico();
        Campo_veterinario campos = new Campo_veterinario();
        Medico medico = new Medico();
        campos.setBairro(view.getCampo_bairro_medico().getText());
        campos.setCep(view.getCampo_cep_medico().getText());
        campos.setCidade(view.getCampo_cidade_medico().getText());
        campos.setEmail(view.getCampo_email_medico().getText());
        campos.setEstado((String)view.getCampo_estado_medico().getSelectedItem());
        campos.setNome_real(view.getCampo_real_medico().getText());
        campos.setNome_uauario(view.getCampo_usuario_medico().getText());
        campos.setRua(view.getCampo_rua_medico().getText());
        campos.setSenha(view.getCampo_senha_medico().getText());
        campos.setTelefone(view.getCampo_telefone_medico().getText());
        campos.setData_nasc(view.getCampo_data_nasc_medico().getText());
        campos.setCpf(view.getCampo_cpf_medico().getText());
        campos.setEspecialidade(view.getCampo_especialidade_medico().getText());
        campos.setHorario(view.getCampo_horario_medico().getText());
        campos.setCrv(view.getCampo_crv_medico1().getText());
        campos.setSalario(view.getCampo_salario_medico().getText());
        
        
        String genero = "";
        if (view.getRadio_feminino_medico().isSelected()) {
            genero = "Feminino";
        } else {
            genero = "Masculino";
        }
        campos.setSexo(genero);
        
        
        boolean verifica = campos.pega_campos(medico);
        if (verifica) {
            crud_medico.inserir(medico);
            JOptionPane.showMessageDialog(null, "OK");
        }else{
            JOptionPane.showMessageDialog(null, "Preencha todos os campos, tente novamente");
        }   
    }
    
    public void inserir_fornecedor(){
        Campo_Fornecesor campo = new Campo_Fornecesor();
        Fornecedor fornecedor = new Fornecedor();
        Crud_fornecedor crud_fornecedor = new Crud_fornecedor();
        campo.setEmail(view.getCampo_email_fornecedor().getText());
        campo.setNome_contato(view.getCampo_contato_fornecedor().getText());
        campo.setNome_empresa(view.getCampo_nome_empresa_fornecedor().getText());
        campo.setPreco_fornecedor(view.getCampo_preco_fornecedor().getText());
        campo.setTelefone(view.getCampo_telefone_fornecedor().getText());
        
        
        boolean verifica = campo.pega_campo_fornecedor(fornecedor);
        if (verifica) {
            crud_fornecedor.inserir(fornecedor);
            JOptionPane.showMessageDialog(null, "OK");
        }else{
            JOptionPane.showMessageDialog(null, "Preencha todos os campos, tente novamente");
        }   
    }
    
    public void inserir_consulta(){
        Crud_consulta_exame crud_consulta_exame = new Crud_consulta_exame();
        Cliente cliente = new Cliente();
        Consulta consulta = new Consulta();
        Animais animal = new Animais();
        Campo_consulta campo = new Campo_consulta();
        
        campo.setHorario(view.getCampo_data_consulta().getText());
        campo.setNome_animal(view.getCampo_nome_animal_consulta().getText());
        campo.setNome_cliente(view.getCampo_cliente_consulta().getText());
        campo.setPreco_consulta(view.getCampo_preco_consulta().getText());
        campo.setTipo_consulta(view.getCampo_tipo_consulta().getText());
        
        String pagamento = "";
        if (view.getRadio_vista_consulta().isSelected()) {
            pagamento = "cartão vista";
        } else {
            pagamento = "cartão de credito";
        }
       
        campo.setTipo_pagamento(pagamento);
                
        boolean verifica = campo.pega_campos_consulta(consulta, cliente, animal);
        if (verifica) {
            crud_consulta_exame.inserir(consulta, cliente, animal);
            JOptionPane.showMessageDialog(null, "OK");
        }else{
            JOptionPane.showMessageDialog(null, "Preencha todos os campos, tente novamente");
        }   
    }
    
    
    public void inserir_remedio(){
        Crud_remedio crud_remedio = new Crud_remedio();
        Campo_remedio campo = new Campo_remedio();
        Medicamento remedio = new Medicamento();
        campo.setDescricao(view.getCampo_descricao_remedio().getText());
        campo.setDose(view.getCampo_dose_remedio().getText());
        campo.setPreco_remedio(view.getCampo_preco_remedio().getText());
        campo.setQuantidade(view.getCampo_quantidade().getText());
        campo.setValidade(view.getCampo_validade_remedio().getText());
        campo.setNome_remedio(view.getCampo_nome_remedio().getText());
       
        boolean verifica = campo.pega_campo_remedio(remedio) ;
        if (verifica) {
            crud_remedio.inserir(remedio);
            JOptionPane.showMessageDialog(null, "OK");
        }else{
            JOptionPane.showMessageDialog(null, "Preencha todos os campos, tente novamente");
        }   
    }
    
    
    public void inserir_exame(){
        Crud_exame crud_exame = new Crud_exame();
        Cliente cliente = new Cliente();
        Exame exame = new Exame();
        Animais animal = new Animais();
        Campo_exame campo = new Campo_exame();
        
        campo.setRealizado(view.getCampo_data_exame().getText());
        campo.setNome_animal(view.getCampo_animal_exame().getText());
        campo.setNome_cliente(view.getCampo_cliente_exame().getText());
        campo.setPreco_exame(view.getCampo_preco_exame().getText());
        campo.setNome_exame(view.getCampo_tipo_exame().getText());
        
        String pagamento = "";
        if (view.getRadio_vista_consulta().isSelected()) {
            pagamento = "cartão vista";
        } else {
            pagamento = "cartão de credito";
        }
       
        campo.setTipo_pagamento(pagamento);
                
        boolean verifica = campo.pega_campos_consultaexame(exame, cliente, animal);
        if (verifica) {
            crud_exame.inserir(exame, cliente, animal);
            JOptionPane.showMessageDialog(null, "OK");
        }else{
            JOptionPane.showMessageDialog(null, "Preencha todos os campos, tente novamente");
        }   
    }
    //=====================================================================================================================
    // Deletar
    public  void deletar_cliente(){
        Crud_Cliente crud_Cliente = new Crud_Cliente();
        Campos_Clliente campos = new Campos_Clliente();
        Cliente cliente = new Cliente();
        
        campos.setCod_cliente(view.getCampo_cod_cliente().getText());
        
        boolean verifica =
        campos.pega_campo_del(cliente);
        if (verifica) {
            crud_Cliente.deletar(cliente);
            JOptionPane.showMessageDialog(null, "OK");
        }else{
            JOptionPane.showMessageDialog(null, "Preencha o campo Codigo, tente novamente");
        }   
    }
    
    public void deletar_funcionario(){
        Crud_Funcioanrio crud_Funcioanrio = new Crud_Funcioanrio();
        Campo_funcionario campos = new Campo_funcionario();
        Funcionario fun = new Funcionario();
        
        campos.setCodigo(view.getCampo_cod_funcionario().getText());
        
        boolean verifica = campos.pega_campo_del(fun);
        if (verifica) {
            crud_Funcioanrio.deletar(fun);
            JOptionPane.showMessageDialog(null, "OK");
        }else{
            JOptionPane.showMessageDialog(null, "Preencha o campo Codigo, tente novamente");
        }   
    }
    
    public void deletar_medico(){
        Crud_medico crud_medico = new Crud_medico();
        Campo_veterinario campos = new Campo_veterinario();
        Medico medico = new Medico();
        
        campos.setCodigo(view.getCampo_cod_medico().getText());
        
        
        
        boolean verifica = campos.pega_campo_del(medico);
        if (verifica) {
            crud_medico.deletar(medico);
            JOptionPane.showMessageDialog(null, "OK");
        }else{
            JOptionPane.showMessageDialog(null, "Preencha o campo Codigo, tente novamente");
        }   
    }
    
    
    public void deletar_remedio(){
        Crud_remedio crud_remedio = new Crud_remedio();
        Campo_remedio campo = new Campo_remedio();
        Medicamento remedio = new Medicamento();
        campo.setCodigo(view.getCampo_cod_remedio().getText());
        
        boolean verifica = campo.pega_campo_del(remedio);
        if (verifica) {
            crud_remedio.remover(remedio);
            JOptionPane.showMessageDialog(null, "OK");
        }else{
            JOptionPane.showMessageDialog(null, "Preencha o campo Codigo, tente novamente");
        }   
    }
    
    public void deletar_consulta(){
        Crud_consulta_exame crud_consulta_exame = new Crud_consulta_exame();
        Campo_consulta campo_consulta_exame = new Campo_consulta();
        Consulta consulta = new Consulta();
        
        campo_consulta_exame.setCodigo(view.getCampo_cod_consulta().getText());
        
        boolean verifica = campo_consulta_exame.pega_campo_del(consulta);
        if (verifica) {
            crud_consulta_exame.deletar(consulta);
            JOptionPane.showMessageDialog(null, "OK");
        }else{
            JOptionPane.showMessageDialog(null, "Preencha o campo Codigo, tente novamente");
        }   
    }
    
    public void deletar_fornecedor(){
        Crud_fornecedor crud_fornecedor = new Crud_fornecedor();
        Campo_Fornecesor campo = new Campo_Fornecesor();
        Fornecedor fornecedor = new Fornecedor();
       
        campo.setCodigo(view.getCampo_cod_fornecedor().getText());
        
        boolean verifica = campo.pega_campo_del(fornecedor);
        if (verifica) {
            crud_fornecedor.deletar(fornecedor);
            JOptionPane.showMessageDialog(null, "OK");
        }else{
            JOptionPane.showMessageDialog(null, "Preencha o campo Codigo, tente novamente");
        }   
    }
    
    
    public void deletar_animal(){
        Crud_Animal crud_Animal = new Crud_Animal();
        Helper_campo_animal campo = new Helper_campo_animal();
        Animais animal = new Animais();
        
        campo.setId_animal(view.getCampo_cod_animal().getText());
        
        boolean verifica = campo.pega_campo_del(animal);
        if (verifica) {
            try {
                crud_Animal.Delete(animal);
            } catch (SQLException ex) {
                String m = ex.getMessage();
                JOptionPane.showMessageDialog(null,m);
            }
            JOptionPane.showMessageDialog(null, "OK");
        }else{
            JOptionPane.showMessageDialog(null, "Preencha o campo Codigo, tente novamente");
        }   
    }
    
    
    public  void deletar_exame(){
        Crud_exame crud_exame = new Crud_exame();
    Cliente cliente = new Cliente();
        Exame exame = new Exame();
        Animais animal = new Animais();
        Campo_exame campo = new Campo_exame();
        
        campo.setId_exame(view.getCampo_cod_exame().getText());
       
        
                
        boolean verifica = campo.pega_campo_del(exame);
        if (verifica) {
            crud_exame.deletar(exame);
            JOptionPane.showMessageDialog(null, "OK");
        }else{
            JOptionPane.showMessageDialog(null, "Preencha todos os campos, tente novamente");
        }
    }
    
    //================================================================================================================
    // ATUALIZAR
    
    
    public  void atualiza_cliente(){
        Crud_Cliente crud_Cliente = new Crud_Cliente();
        Campos_Clliente campos = new Campos_Clliente();
        Cliente cliente = new Cliente();
        campos.setBairro(view.getCampo_bairro_cliente().getText());
        campos.setCep(view.getCampo_cep_cliente().getText());
        campos.setCidade(view.getCampo_cidade_cliente().getText());
        campos.setEmail(view.getCampo_email_cliente().getText());
        campos.setEstado((String)view.getCampo_estado_cliente().getSelectedItem());
        campos.setNome_real(view.getCampo_nome_real_cliente().getText());
        campos.setNome_uauario(view.getCampo_usuario_cliente().getText());
        campos.setRua(view.getCampo_rua_cliente().getText());
        campos.setSenha(view.getCampo_senha_cliente().getText());
        campos.setTelefone(view.getCampo_telefone_cliente().getText());
        campos.setData_nasc(view.getCampo_data_nasc_cliente().getText());
        campos.setCpf(view.getCampo_cpf_cliente().getText());
        campos.setCod_cliente(view.getCampo_cod_cliente().getText());
        
        
        String genero = "";
        if (view.getRadio_feminino_cliente().isSelected()) {
            genero = "Feminino";
        } else {
            genero = "Masculino";
        }
        campos.setSexo(genero);
        
        campos.setCod_cliente(view.getCampo_cod_cliente().getText());
        
        boolean verifica = campos.atualiza_campo_cliente(cliente);
        if (verifica) {
            crud_Cliente.Atualizar(cliente);
            JOptionPane.showMessageDialog(null, "OK");
        }else{
            JOptionPane.showMessageDialog(null, "Preencha todos os campos, tente novamente");
        }   
    }
    
    
    
    public void alterar_funcionario(){
        Crud_Funcioanrio crud_Funcioanrio = new Crud_Funcioanrio();
        Campo_funcionario campos = new Campo_funcionario();
        Funcionario fun = new Funcionario();
        campos.setBairro(view.getCampo_bairro_funcionario().getText());
        campos.setCep(view.getCampo_cep_funcionario().getText());
        campos.setCidade(view.getCampo_cidade_funcionario().getText());
        campos.setEmail(view.getCampo_email_funcionario().getText());
        campos.setEstado((String)view.getCampo_estado().getSelectedItem());
        campos.setNome_real(view.getCampo_real_funcionario().getText());
        campos.setNome_uauario(view.getCampo_usuario_funcionario().getText());
        campos.setRua(view.getCampo_rua_funcionario().getText());
        campos.setSenha(view.getCampo_senha_funcionario().getText());
        campos.setTelefone(view.getCampo_telefone_funcionario().getText());
        campos.setData_nasc(view.getCampo_data_nasc_funcionario().getText());
        campos.setCpf(view.getCampo_cpf_funcionario().getText());
        
        String genero = "";
        if (view.getRadio_feminino_funcionario().isSelected()) {
            genero = "Feminino";
        } else {
            genero = "Masculino";
        }
        campos.setSexo(genero);
        
        campos.setCodigo(view.getCampo_cod_funcionario().getText());
        
        boolean verifica = campos.atualiza_campo_funcionario(fun);
        if (verifica) {
            crud_Funcioanrio.Atualizar(fun);
            JOptionPane.showMessageDialog(null, "OK");
        }else{
            JOptionPane.showMessageDialog(null, "Preencha todos os campos, tente novamente");
        }   
    }
    
    
    
    public void alterar_medico(){
        Crud_medico crud_medico = new Crud_medico();
        Campo_veterinario campos = new Campo_veterinario();
        Medico medico = new Medico();
        campos.setBairro(view.getCampo_bairro_medico().getText());
        campos.setCep(view.getCampo_cep_medico().getText());
        campos.setCidade(view.getCampo_cidade_medico().getText());
        campos.setEmail(view.getCampo_email_medico().getText());
        campos.setEstado((String)view.getCampo_estado_medico().getSelectedItem());
        campos.setNome_real(view.getCampo_real_medico().getText());
        campos.setNome_uauario(view.getCampo_usuario_medico().getText());
        campos.setRua(view.getCampo_rua_medico().getText());
        campos.setSenha(view.getCampo_senha_medico().getText());
        campos.setTelefone(view.getCampo_telefone_medico().getText());
        campos.setData_nasc(view.getCampo_data_nasc_medico().getText());
        campos.setCpf(view.getCampo_cpf_medico().getText());
        campos.setEspecialidade(view.getCampo_especialidade_medico().getText());
        campos.setHorario(view.getCampo_horario_medico().getText());
        campos.setCrv(view.getCampo_crv_medico1().getText());
        campos.setSalario(view.getCampo_salario_medico().getText());
        
        
        String genero = "";
        if (view.getRadio_feminino_medico().isSelected()) {
            genero = "Feminino";
        } else {
            genero = "Masculino";
        }
        campos.setSexo(genero);
        
        campos.setCodigo(view.getCampo_cod_medico().getText());
        
        
        boolean verifica = campos.atualiza_campos(medico);
        if (verifica) {
            crud_medico.atualizar(medico);
            JOptionPane.showMessageDialog(null, "OK");
        }else{
            JOptionPane.showMessageDialog(null, "Preencha todos os campos, tente novamente");
        }   
    }
    
    
   
    
    public void alterar_consulta(){
        Crud_consulta_exame crud_consulta_exame = new Crud_consulta_exame();
        Campo_consulta campo = new Campo_consulta();
        Cliente cliente = new Cliente();
        Animais animal = new Animais();
        Consulta consulta = new Consulta();
        
        campo.setHorario(view.getCampo_data_consulta().getText());
        campo.setNome_animal(view.getCampo_nome_animal_consulta().getText());
        campo.setNome_cliente(view.getCampo_cliente_consulta().getText());
        campo.setPreco_consulta(view.getCampo_preco_consulta().getText());
        campo.setTipo_consulta(view.getCampo_tipo_consulta().getText());
        
        String pagamento = "";
        if (view.getRadio_vista_consulta().isSelected()) {
            pagamento = "cartão vista";
        } else {
            pagamento = "cartão de credito";
        }
       
        campo.setTipo_pagamento(pagamento);
        
        campo.setCodigo(view.getCampo_cod_consulta().getText());
        
        boolean verifica = campo.atualiza_campos_consulta(consulta, cliente, animal);
        if (verifica) {
            crud_consulta_exame.atualizar(consulta, cliente, animal);
            JOptionPane.showMessageDialog(null, "OK");
        }else{
            JOptionPane.showMessageDialog(null, "Preencha todos os campos, tente novamente");
        }   
    }
    
    
    
    
    
    public void atualizar_remedio(){
        Crud_remedio crud_remedio = new Crud_remedio();
        Campo_remedio campo = new Campo_remedio();
        Medicamento remedio = new Medicamento();
        campo.setDescricao(view.getCampo_descricao_remedio().getText());
        campo.setDose(view.getCampo_dose_remedio().getText());
        campo.setPreco_remedio(view.getCampo_preco_remedio().getText());
        campo.setQuantidade(view.getCampo_quantidade().getText());
        campo.setValidade(view.getCampo_validade_remedio().getText());
        campo.setNome_remedio(view.getCampo_nome_remedio().getText());
        campo.setCodigo(view.getCampo_cod_remedio().getText());
        
        boolean verifica = campo.atualiza_campo_remedio(remedio);
        if (verifica) {
            crud_remedio.atualiza(remedio);
            JOptionPane.showMessageDialog(null, "OK");
        }else{
            JOptionPane.showMessageDialog(null, "Preencha todos os campos, tente novamente");
        }   
    }
    
    
    
    public void alterar_fornecedor(){
        Crud_fornecedor crud_fornecedor = new Crud_fornecedor();
        Campo_Fornecesor campo = new Campo_Fornecesor();
        Fornecedor fornecedor = new Fornecedor();
        
        campo.setEmail(view.getCampo_email_fornecedor().getText());
        campo.setNome_contato(view.getCampo_contato_fornecedor().getText());
        campo.setNome_empresa(view.getCampo_nome_empresa_fornecedor().getText());
        campo.setPreco_fornecedor(view.getCampo_preco_fornecedor().getText());
        campo.setTelefone(view.getCampo_telefone_fornecedor().getText());
        
        campo.setCodigo(view.getCampo_cod_fornecedor().getText());
        
        boolean verifica = campo.alterar_campo_fornecedor(fornecedor);
        if (verifica) {
            crud_fornecedor.Atualizar(fornecedor);
            JOptionPane.showMessageDialog(null, "OK");
        }else{
            JOptionPane.showMessageDialog(null, "Preencha todos os campos, tente novamente");
        }   
    }
    
    public void alterar_animal(){
        Crud_Animal crud_Animal = new Crud_Animal();
        Helper_campo_animal campo = new Helper_campo_animal();
        Animais animal = new Animais();
        campo.setCampo_especie(view.getCampo_especie_animal().getText());
        campo.setCampo_idade(view.getCampo_idade_animal().getText());
        campo.setCampo_nome_animal(view.getCampo_nome_animal().getText());
        campo.setCampo_raca(view.getCampo_raca_animal().getText());
        String sexo = "";
        if (view.getRadio_feminino_animal().isSelected()) {
            sexo = "Feminino";
        } else {
            sexo = "Masculino";
        }
        campo.setCampo_sexo(sexo);
        
        campo.setId_animal(view.getCampo_cod_animal().getText());
        
        
        boolean verifica = campo.atualiza_campo_animal(animal);
        if (verifica) {
            try {
                crud_Animal.Atualiza(animal);
            } catch (SQLException ex) {
                Logger.getLogger(ControllerTela_menu.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "OK");
        }else{
            JOptionPane.showMessageDialog(null, "Preencha todos os campos, tente novamente");
        }   
    }
    
    
    public void alterar_exame(){
        Crud_exame crud_exame = new Crud_exame();
        Cliente cliente = new Cliente();
        Exame exame = new Exame();
        Animais animal = new Animais();
        Campo_exame campo = new Campo_exame();
        
        campo.setRealizado(view.getCampo_data_exame().getText());
        campo.setNome_animal(view.getCampo_animal_exame().getText());
        campo.setNome_cliente(view.getCampo_cliente_exame().getText());
        campo.setPreco_exame(view.getCampo_preco_exame().getText());
        campo.setNome_exame(view.getCampo_tipo_exame().getText());
        campo.setId_exame(view.getCampo_cod_exame().getText());
        
        String pagamento = "";
        if (view.getRadio_vista_consulta().isSelected()) {
            pagamento = "cartão vista";
        } else {
            pagamento = "cartão de credito";
        }
       
        campo.setTipo_pagamento(pagamento);
               
        boolean verifica = campo.atualiza_campo(exame, cliente, animal);
        if (verifica) {
            crud_exame.atualizar(exame, cliente, animal);
            JOptionPane.showMessageDialog(null, "OK");
        }else{
            JOptionPane.showMessageDialog(null, "Preencha todos os campos, tente novamente");
        }   
    }
    
    //========================================================================================================
    //MOSTAR
    
    public void mostar_cliente(){
        Crud_Cliente crud_Cliente = new Crud_Cliente();
        List<Cliente> lista = crud_Cliente.BuscaCliente();
        Cliente cliente = new Cliente();
        for (int i = 0; i < lista.size(); i++) {
         view.getArea_mostrar_cliente().append(lista.toString());   
        }
    }
    public void mostar_funcionario(){
        Crud_Funcioanrio crud_Funcioanrio = new Crud_Funcioanrio();
        List<Funcionario>lista = crud_Funcioanrio.BuscaFuncionario();
        Funcionario funcionario = new Funcionario();
        for (int i = 0; i <lista.size() ; i++) {
            view.getArea_mostar_funcionario().append(lista.toString()
            +" ");
        }
    }
    
    public void mostar_medico(){
        Crud_medico crud_medico = new Crud_medico();
        
        try {
            ResultSet rs = crud_medico.buscarMedicos();
            
            while (rs.next()) {
            Medico medico = new Medico();
            medico.setBairro(rs.getString("bairro"));
        medico.setCEP(rs.getString("cep"));
        medico.setCidade(rs.getString("cidade"));
        medico.setEmail(rs.getString("email"));
        medico.setEstado(rs.getString("estado"));
        medico.setNome(rs.getString("nome_real"));
        medico.setNome_usuario(rs.getString("nome_usuario"));
        medico.setRua(rs.getString("rua"));
        medico.setSexo(rs.getString("sexo"));
        medico.setTelefone(rs.getString("telefone"));
        medico.setSenha(rs.getString("senha"));
        medico.setEspecialidade(rs.getString("especialidade"));
        medico.setCRV(rs.getString("crv"));
        medico.setId_pessoa(rs.getString("id_pessoa"));
        medico.setEmail(rs.getString("email"));
        medico.setData_nasc(rs.getString("data_nasc"));
        medico.setSalario(rs.getString("salario"));
         view.getArea_mostar_medico().append(medico.toString());
        }
        } catch (SQLException ex) {
            Logger.getLogger(ControllerTela_menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public void mostar_fornecedor(){
        Crud_fornecedor crud_fornecedor = new Crud_fornecedor();
        List<Fornecedor> lista =crud_fornecedor.BuscarFornecedor();
        Fornecedor fornecedor = new Fornecedor();
        for (int i = 0; i < lista.size(); i++) {
            view.getArea_mostrar_fornecedor().append(lista.toString());
        }
    }
    
    public void mostar_remedio(){
        Crud_remedio crud_remedio = new Crud_remedio();
        List<Medicamento> lista = crud_remedio.Busca_Remedio();
        for (Iterator<Medicamento> iterator = lista.iterator(); iterator.hasNext();) {
            Medicamento next = iterator.next();
            view.getArea_mostrar_remedio().append(next.toString());
        }
    }
    
    public void mostar_consulta(){
        Crud_consulta_exame crud_consulta_exame = new Crud_consulta_exame();
        ResultSet rs = crud_consulta_exame.buscar_consultas();
        try {
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
            
        view.getArea_mostar_consultas().append(consulta.toString() + animal.getNome_animal() + cliente.getNome());
        view.getArea_mostar_consultas2().append(consulta.toString() + animal.getNome_animal() + cliente.getNome());
            
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ControllerTela_menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void mostar_exame(){
        Crud_exame crud_exame = new Crud_exame();
        ResultSet rs = crud_exame.buscar_exame();
        
        
        try {
            while (rs.next()) {
                Cliente cliente = new Cliente();
                Animais animal = new Animais();
                Exame exame = new Exame();
                
                exame.setData_exame(rs.getString("realizado"));
                exame.setNome(rs.getString("exame"));
                exame.setPreco(rs.getString("preco"));
                exame.setTipo_pagamento(rs.getString("tipo_pagamento"));
                animal.setNome_animal(rs.getString("nome_animal_exame"));
                cliente.setNome(rs.getString("nome_cliente_exame"));
                exame.setId_exame(rs.getString("id_exame"));
            
            view.getArea_mostar_exame().append(exame.toString() + animal.getNome_animal() + cliente.getNome());
        view.getArea_mostar_exame2().append(exame.toString() + animal.getNome_animal() + cliente.getNome());

            }
        } catch (SQLException ex) {
            Logger.getLogger(ControllerTela_menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    public void estatos_preenchidos(JComboBox campo_estado){
        
        String[] dados = {"SP","MG", "RJ","ES","PR","SC","RS","MS","MT","GO","DF","BA","PI","SE",
            "PE","PB","MA","RN","PA","AM","AP","RR","AC","RO","TO"};
        for (int i = 0; i < dados.length; i++) {
            campo_estado.addItem(dados[i]);
        }
    }
   
    public void mostrar_agenda_medico(){
      Crud_medico crud_medico = new Crud_medico();
      ResultSet rs = crud_medico.agenda_medico();
      try {
            while (rs.next()) {
            Medico medico = new Medico();
            medico.setHorario(rs.getString("DATA"));
            
            view.getArea_mostar_agenda_medico().setText(medico.getHorario());
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(ControllerTela_menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
