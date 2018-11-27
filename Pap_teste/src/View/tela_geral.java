/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controler.ControllerTela_menu;
import Model.Cliente;
import Model.Pessoas;
import java.awt.Label;
import java.text.SimpleDateFormat;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.util.Date;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

/**
 *
 * @author Pichau
 */
public class tela_geral extends javax.swing.JFrame {
  private ControllerTela_menu controllerTela_menu;
    public tela_geral() {
        initComponents();
        controllerTela_menu = new ControllerTela_menu(this);
        controllerTela_menu.estatos_preenchidos(campo_estado);
        controllerTela_menu.estatos_preenchidos(campo_estado_cliente);
        controllerTela_menu.estatos_preenchidos(campo_estado_medico);
        
        
        
    }

    public JLabel getLblData() {
        return lblData;
    }

    public Label getLblUsuario() {
        return lblUsuario;
    }

    public JTextField getCampo_validade_remedio() {
        return campo_validade_remedio;
    }

    public JTextField getCampo_tipo_consulta() {
        return campo_tipo_consulta;
    }

    
    
    public JComboBox<String> getCampo_estado_medico() {
        return campo_estado_medico;
    }

    public JTextField getCampo_bairro_medico() {
        return campo_bairro_medico;
    }

    public JTextField getCampo_nome_animal() {
        return campo_nome_animal;
    }

    public JTextField getCampo_especie_animal() {
        return campo_especie_animal;
    }

    public JTextField getCampo_email_cliente() {
        return campo_email_cliente;
    }

    public JComboBox<String> getCampo_estado() {
        return campo_estado;
    }

    public JTextField getCampo_telefone_medico() {
        return campo_telefone_medico;
    }

    public JTextField getCampo_usuario_cliente() {
        return campo_usuario_cliente;
    }

    public JTextField getCampo_tipo_exame1() {
        return campo_tipo_exame;
    }

    public JTextField getCampo_rua_medico() {
        return campo_rua_medico;
    }

    public JPasswordField getCampo_senha_medico() {
        return campo_senha_medico;
    }

    public JTextField getCampo_real_funcionario() {
        return campo_real_funcionario;
    }

    public JTextField getCampo_telefone_funcionario() {
        return campo_telefone_funcionario;
    }

    public JTextField getCampo_telefone_fornecedor() {
        return campo_telefone_fornecedor;
    }

    public JTextField getCampo_telefone_cliente() {
        return campo_telefone_cliente;
    }

    public JTextField getCampo_preco_fornecedor() {
        return campo_preco_fornecedor;
    }

    public JTextField getCampo_nome_real_cliente() {
        return Campo_nome_real_cliente;
    }

    public JTextField getCampo_senha_funcionario() {
        return campo_senha_funcionarios;
    }

    public JTextField getCampo_raca_animal() {
        return campo_raca_animal;
    }

    public JTextField getCampo_rua_cliente() {
        return campo_rua_cliente;
    }

    public JTextField getCampo_quantidade() {
        return campo_quantidade;
    }

    public JTextField getCampo_cod_consulta() {
        return campo_cod_consulta;
    }

    public JTextField getCampo_nome_empresa_fornecedor() {
        return campo_nome_empresa_fornecedor1;
    }

    public JTextField getCampo_preco_remedio() {
        return campo_preco_remedio;
    }

    public JTextField getCampo_descricao_remedio() {
        return campo_descricao_remedio;
    }

    public JTextField getCampo_cep_medico() {
        return campo_cep_medico;
    }

    public JTextField getCampo_cpf_medico() {
        return campo_cpf_medico;
    }

    public JTextField getCampo_data_exame() {
        return campo_data_exame;
    }

    public JTextField getCampo_cep_cliente() {
        return campo_cep_cliente;
    }

    public JTextField getCampo_cpf_cliente() {
        return campo_cpf_cliente;
    }

    public JTextField getCampo_dose_remedio() {
        return campo_dose_remedio;
    }

    public JTextField getCampo_email_funcionario() {
        return campo_email_funcionario;
    }

    public JTextField getCampo_email_medico() {
        return campo_email_medico;
    }

    public JTextField getCampo_idade_animal() {
        return campo_idade_animal;
    }

    public JTextField getCampo_cidade_medico() {
        return campo_cidade_medico;
    }

    public JTextField getCampo_cliente_exame() {
        return campo_cliente_exame;
    }

    public JTextField getCampo_data_consulta() {
        return campo_data_consulta;
    }

    public JTextField getCampo_cod_exame() {
        return campo_cod_exame;
    }

    public JTextField getCampo_bairro_cliente() {
        return campo_bairro_cliente;
    }

    public JTextField getCampo_cidade_cliente() {
        return campo_cidade_cliente;
    }

    public JTextField getCampo_cep_funcionario() {
        return campo_cep_funcionario1;
    }

    public JTextField getCampo_cpf_funcionario() {
        return campo_cpf_funcionario;
    }


    public JTextField getCampo_cliente_consulta() {
        return campo_cliente_consulta;
    }

    public JTextField getCampo_data_nasc_medico() {
        return campo_data_nasc_medico;
    }

    public JTextField getCampo_email_fornecedor() {
        return campo_email_fornecedor;
    }

    public JTextField getCampo_cargo_funcionario() {
        return campo_cargo_funcionario;
    }

    public JPasswordField getCampo_conf_senha_medico() {
        return campo_conf_senha_medico;
    }

    public JTextField getCampo_data_nasc_cliente() {
        return campo_data_nasc_cliente;
    }

    public JTextField getCampo_bairro_funcionario() {
        return campo_bairro_funcionario;
    }

    public JTextField getCampo_cidade_funcionario() {
        return campo_cidade_funcionario;
    }

    public JPasswordField getCampo_conf_senha_cliente() {
        return campo_conf_senha_cliente;
    }

    public JTextField getCampo_contato_fornecedor() {
        return campo_contato_fornecedor;
    }

    public JTextField getCampo_bairro_funcionario1() {
        return campo_bairro_funcionario1;
    }

    public JTextField getCampo_usuario_funcionario() {
        return campo_usuario_funcionario;
    }

    public JTextField getCampo_data_nasc_funcionario() {
        return campo_data_nasc_funcionario;
    }

    public JPasswordField getCampo_conf_senha_funcionario() {
        return campo_conf_senha_funcionario;
    }

    public JTextField getCampo_cod_animal() {
        return campo_cod_animal;
    }

    public JTextField getCampo_cod_medico() {
        return campo_cod_medico;
    }

    public JTextField getCampo_cod_cliente() {
        return campo_cod_cliente;
    }

    public JTextField getCampo_cod_remedio() {
        return campo_cod_remedio;
    }

    public JTextField getCampo_cod_fornecedor() {
        return campo_cod_fornecedor;
    }

    public JTextField getCampo_cod_funcionario() {
        return campo_cod_funcionario;
    }

    public JTextField getCampo_salario_medico() {
        return campo_salario_medico;
    }

    public JTextField getCampo_salario_funcionario() {
        return campo_salario_funcionario;
    }
     
          

    public JTextField getCampo_preco_consulta() {
        return campo_preco_consulta;
    }

    public JTextField getCampo_usuario_medico() {
        return campo_usuario_medico;
    }

    public JTextField getCampo_nome_animal_consulta() {
        return campo_nome_animal_consulta;
    }

    public JPasswordField getCampo_senha_cliente() {
        return campo_senha_cliente;
    }

    public JComboBox<String> getCampo_estado_cliente() {
        return campo_estado_cliente;
    }

    public JTextField getCampo_rua_funcionario() {
        return campo_rua_funcionario1;
    }

    public JTextField getCampo_usuario23() {
        return campo_usuario23;
    }

    public JTextField getCampo_animal_exame() {
        return campo_animal_exame;
    }

    public JTextField getCampo_preco_exame() {
        return campo_preco_exame;
    }

    public JButton getBtn_limpar_consulta() {
        return btn_limpar_consulta;
    }

    public JButton getBtn_limpar_exame() {
        return btn_limpar_exame;
    }
    
    public JTextField getCampo_nome_remedio() {
        return campo_nome_remedio;
    }

    public JTextField getCampo_usuario29() {
        return campo_usuario29;
    }

    public JTextField getCampo_real_medico() {
        return campo_real_medico;
    }

    public JTextField getCampo_especialidade_medico() {
        return campo_especialidade_medico;
    }

    public ButtonGroup getSexo_animal() {
        return sexo_animal;
    }

    public ButtonGroup getSexo_cliente() {
        return sexo_cliente;
    }

    public ButtonGroup getSexo_funcionarios() {
        return sexo_funcionarios;
    }

    public JTextField getCampo_crv_medico1() {
        return campo_crv_medico1;
    }

    public JTextField getCampo_horario_medico() {
        return campo_horario_medico;
    }

    public JTextField getCampo_tipo_exame() {
        return campo_tipo_exame;
    }

    
    
    
    
    
    
    // botoes

    
    public JButton getBtn_mostar_agenda_medicos() {
        return btn_mostar_agenda_medicos;
    }

    public JButton getBtn_alterar_consulta() {
        return btn_alterar_consulta;
    }

    public JButton getBtn_atualizar_funcionario() {
        return btn_atualizar_funcionario;
    }

    public JButton getBtn_mostar_exame() {
        return btn_mostar_exame;
    }

    public JButton getBtn_salvar_consulta() {
        return btn_salvar_consulta;
    }

    public JButton getBtn_salvar_exame() {
        return btn_salvar_exame;
    }

    public JButton getBtn_alterar_exame() {
        return btn_alterar_exame;
    }

    public JButton getBtn_deletar_remedios_fornecedor() {
        return btn_deletar_remedios_fornecedor;
    }

    public JButton getBtn_delete_medico() {
        return btn_delete_medico;
    }

    public JButton getBtn_excluir_exame() {
        return btn_excluir_exame;
    }

    public JButton getBtn_limpar_funcionario() {
        return btn_limpar_funcionario;
    }

    public JButton getBtn_limpar_cliente() {
        return btn_limpar_cliente;
    }

    public JButton getBtn_limpar_medico() {
        return btn_limpar_medico;
    }

    public JButton getBtn_salvar_medico() {
        return btn_salvar_medico;
    }

    public JButton getBtn_alterar_medico() {
        return btn_alterar_medico;
    }

    public JButton getBtn_salvar_cliente() {
        return btn_salvar_cliente;
    }

    public JButton getBtn_deletar_cliente() {
        return btn_deletar_cliente;
    }

    public JButton getBtn_consultar_medico() {
        return btn_consultar_medico;
    }

    public JButton getBtn_deletar_consulta() {
        return btn_deletar_consulta;
    }

    public JButton getBtn_atualizar_cliente() {
        return btn_atualizar_cliente;
    }

    public JButton getBtn_consultar_cliente() {
        return btn_consultar_cliente;
    }

    public JButton getBtn_mostrar_consultas() {
        return btn_mostrar_consultas;
    }

    public JButton getBtn_salvar_funcionario() {
        return btn_salvar_funcionario;
    }

    public JButton getBtn_deletar_funcionario() {
        return btn_deletar_funcionario;
    }

    public JButton getBtn_consultar_funcionarios() {
        return btn_consultar_funcionarios;
    }

    public JButton getBtn_limpar_remedios_fornecedor() {
        return btn_limpar_remedios_fornecedor;
    }

    public JButton getBtn_salvar_remedios_fornecedor() {
        return btn_salvar_remedios_fornecedor;
    }

    public JButton getBtn_atualizar_remedios_fornecedor() {
        return btn_atualizar_remedios_fornecedor;
    }

    public JButton getBtn_consultar_remedios_fornecedor() {
        return btn_consultar_remedios_fornecedor;
    }

    public JButton getBtn_salvar_animal() {
        return btn_salvar_animal;
    }

    public JButton getBtn_limpar_animal() {
        return btn_limpar_animal;
    }

    public JButton getBtn_deletar_animal() {
        return btn_deletar_animal;
    }

    public JButton getBtn_limpar_remedios() {
        return btn_limpar_remedios;
    }

    public JButton getBtn_salvar_remedios() {
        return btn_salvar_remedios;
    }

    public JButton getBtn_atualizar_animal() {
        return btn_atualizar_animal;
    }

    public JButton getBtn_deletar_remedios() {
        return btn_deletar_remedios;
    }

    public JButton getBtn_consultar_remedios() {
        return btn_consultar_remedios;
    }

    public JButton getBtn_atualizar_remedios() {
        return btn_atualizar_remedios;
    }
    
    
   
    
    
    // radio button
    
    

    public JRadioButton getRadio_masculino_animal() {
        return radio_masculino_animal;
    }

    public JRadioButton getRadio_feminino_animal() {
        return radio_feminino_animal;
    }

    public ButtonGroup getGrupoExame() {
        return grupoExame;
    }

    public ButtonGroup getGrupo_consulta() {
        return grupo_consulta;
    }
    
    public ButtonGroup getSexo_medico() {
        return buttonGroup1;
    }

    public JRadioButton getRadio_credito_consulta() {
        return radio_credito_consulta;
    }

    public JRadioButton getRadio_credito_exames() {
        return radio_credito_exames;
    }

    public JRadioButton getRadio_feminino_cliente() {
        return radio_feminino_cliente;
    }

    public JRadioButton getRadio_feminino_funcionario() {
        return radio_feminino_funcionario;
    }

    

    public JRadioButton getRadio_feminino4() {
        return radio_feminino_animal;
    }

    public JRadioButton getRadio_masculino_funcionario() {
        return radio_masculino_funcionario;
    }

   

    public JRadioButton getRadio_masculino4() {
        return radio_masculino_animal;
    }

    public JRadioButton getRadio_vista_exames() {
        return radio_vista_exames;
    }

    public JRadioButton getRadio_vista_consulta() {
        return radio_vista_consulta;
    }

    public JRadioButton getRadio_feminino_medico() {
        return radio_feminino_medico;
    }

    public JRadioButton getRadio_masculino_medico() {
        return radio_masculino_medico;
    }

    public JRadioButton getRadio_masculino_cliente() {
        return radio_masculino_cliente;
    }
    
    
    
    // MOSTAR

    public JTextArea getArea_mostar_agenda_medico() {
        return area_mostar_agenda_medico;
    }

    public JTextArea getArea_mostar_exame() {
        return area_mostar_exame;
    }

    public JTextArea getArea_mostar_consultas() {
        return area_mostar_consultas;
    }

    public JTextArea getArea_mostar_medico() {
        return area_mostar_medico;
    }

    public JTextArea getArea_mostrar_cliente() {
        return area_mostrar_cliente;
    }

    public JTextArea getArea_mostrar_remedio() {
        return area_mostrar_remedio;
    }

    public JTextArea getArea_mostar_funcionario() {
        return area_mostar_funcionario;
    }

    public JTextArea getArea_mostrar_fornecedor() {
        return area_mostrar_fornecedor;
    }

    public JTextArea getArea_mostar_consultas2() {
        return area_mostar_consultas2;
    }

    public JTextArea getArea_mostar_exame2() {
        return area_mostar_exame2;
    }

    
    
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel77 = new javax.swing.JLabel();
        campo_bairro_funcionario1 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        sexo_funcionarios = new javax.swing.ButtonGroup();
        sexo_cliente = new javax.swing.ButtonGroup();
        sexo_animal = new javax.swing.ButtonGroup();
        grupo_consulta = new javax.swing.ButtonGroup();
        grupoExame = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        btn_mostrar_consultas = new javax.swing.JButton();
        btn_mostar_exame = new javax.swing.JButton();
        jScrollPane12 = new javax.swing.JScrollPane();
        area_mostar_consultas = new javax.swing.JTextArea();
        jScrollPane13 = new javax.swing.JScrollPane();
        area_mostar_exame = new javax.swing.JTextArea();
        jLabel76 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        area_mostar_agenda_medico = new javax.swing.JTextArea();
        btn_mostar_agenda_medicos = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btn_salvar_consulta = new javax.swing.JButton();
        jLabel50 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        campo_data_consulta = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        campo_cod_consulta = new javax.swing.JTextField();
        campo_cliente_consulta = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        campo_nome_animal_consulta = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        radio_vista_consulta = new javax.swing.JRadioButton();
        radio_credito_consulta = new javax.swing.JRadioButton();
        jLabel67 = new javax.swing.JLabel();
        campo_preco_consulta = new javax.swing.JTextField();
        campo_usuario23 = new javax.swing.JTextField();
        btn_alterar_consulta = new javax.swing.JButton();
        btn_deletar_consulta = new javax.swing.JButton();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        campo_data_exame = new javax.swing.JTextField();
        campo_cod_exame = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        campo_cliente_exame = new javax.swing.JTextField();
        campo_animal_exame = new javax.swing.JTextField();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        radio_credito_exames = new javax.swing.JRadioButton();
        jLabel74 = new javax.swing.JLabel();
        campo_preco_exame = new javax.swing.JTextField();
        radio_vista_exames = new javax.swing.JRadioButton();
        campo_usuario29 = new javax.swing.JTextField();
        btn_salvar_exame = new javax.swing.JButton();
        btn_alterar_exame = new javax.swing.JButton();
        btn_excluir_exame = new javax.swing.JButton();
        jLabel75 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        campo_tipo_exame = new javax.swing.JTextField();
        btn_limpar_consulta = new javax.swing.JButton();
        btn_limpar_exame = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        area_mostar_consultas2 = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        area_mostar_exame2 = new javax.swing.JTextArea();
        jLabel105 = new javax.swing.JLabel();
        campo_tipo_consulta = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        campo_usuario_funcionario = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        campo_telefone_funcionario = new javax.swing.JTextField();
        radio_masculino_funcionario = new javax.swing.JRadioButton();
        radio_feminino_funcionario = new javax.swing.JRadioButton();
        jLabel32 = new javax.swing.JLabel();
        campo_email_funcionario = new javax.swing.JTextField();
        campo_bairro_funcionario = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        campo_real_funcionario = new javax.swing.JTextField();
        campo_cargo_funcionario = new javax.swing.JTextField();
        campo_cpf_funcionario = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        campo_data_nasc_funcionario = new javax.swing.JTextField();
        campo_cidade_funcionario = new javax.swing.JTextField();
        campo_rua_funcionario = new javax.swing.JTextField();
        campo_cep_funcionario = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        campo_conf_senha_funcionario = new javax.swing.JPasswordField();
        jLabel47 = new javax.swing.JLabel();
        campo_senha_funcionario = new javax.swing.JPasswordField();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        btn_limpar_funcionario = new javax.swing.JButton();
        btn_deletar_funcionario = new javax.swing.JButton();
        btn_atualizar_funcionario = new javax.swing.JButton();
        btn_salvar_funcionario = new javax.swing.JButton();
        btn_consultar_funcionarios = new javax.swing.JButton();
        campo_estado = new javax.swing.JComboBox<>();
        jLabel95 = new javax.swing.JLabel();
        campo_salario_funcionario = new javax.swing.JTextField();
        jLabel96 = new javax.swing.JLabel();
        campo_cod_funcionario = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        area_mostar_funcionario = new javax.swing.JTextArea();
        jLabel106 = new javax.swing.JLabel();
        campo_senha_funcionarios = new javax.swing.JTextField();
        jLabel107 = new javax.swing.JLabel();
        campo_rua_funcionario1 = new javax.swing.JTextField();
        jLabel108 = new javax.swing.JLabel();
        campo_cep_funcionario1 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        campo_quantidade = new javax.swing.JTextField();
        jLabel81 = new javax.swing.JLabel();
        campo_nome_remedio = new javax.swing.JTextField();
        jLabel82 = new javax.swing.JLabel();
        campo_dose_remedio = new javax.swing.JTextField();
        campo_contato_fornecedor = new javax.swing.JTextField();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        campo_preco_remedio = new javax.swing.JTextField();
        campo_descricao_remedio = new javax.swing.JTextField();
        campo_preco_fornecedor = new javax.swing.JTextField();
        campo_telefone_fornecedor = new javax.swing.JTextField();
        campo_email_fornecedor = new javax.swing.JTextField();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        btn_limpar_remedios_fornecedor = new javax.swing.JButton();
        btn_deletar_remedios_fornecedor = new javax.swing.JButton();
        btn_atualizar_remedios_fornecedor = new javax.swing.JButton();
        btn_salvar_remedios_fornecedor = new javax.swing.JButton();
        btn_consultar_remedios_fornecedor = new javax.swing.JButton();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        campo_nome_empresa_fornecedor = new javax.swing.JTextField();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        btn_consultar_remedios = new javax.swing.JButton();
        btn_salvar_remedios = new javax.swing.JButton();
        btn_atualizar_remedios = new javax.swing.JButton();
        btn_deletar_remedios = new javax.swing.JButton();
        btn_limpar_remedios = new javax.swing.JButton();
        campo_validade_remedio = new javax.swing.JTextField();
        campo_cod_fornecedor = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        area_mostrar_remedio = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        area_mostrar_fornecedor = new javax.swing.JTextArea();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        campo_nome_empresa_fornecedor1 = new javax.swing.JTextField();
        jLabel104 = new javax.swing.JLabel();
        campo_cod_remedio = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        radio_feminino_medico = new javax.swing.JRadioButton();
        radio_masculino_medico = new javax.swing.JRadioButton();
        campo_senha_medico = new javax.swing.JPasswordField();
        campo_conf_senha_medico = new javax.swing.JPasswordField();
        btn_consultar_medico = new javax.swing.JButton();
        btn_salvar_medico = new javax.swing.JButton();
        btn_alterar_medico = new javax.swing.JButton();
        btn_limpar_medico = new javax.swing.JButton();
        btn_delete_medico = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        campo_usuario_medico = new javax.swing.JTextField();
        campo_cidade_medico = new javax.swing.JTextField();
        campo_real_medico = new javax.swing.JTextField();
        campo_telefone_medico = new javax.swing.JTextField();
        campo_email_medico = new javax.swing.JTextField();
        campo_especialidade_medico = new javax.swing.JTextField();
        campo_rua_medico = new javax.swing.JTextField();
        campo_cep_medico = new javax.swing.JTextField();
        campo_cpf_medico = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        campo_data_nasc_medico = new javax.swing.JTextField();
        campo_estado_medico = new javax.swing.JComboBox<>();
        jLabel59 = new javax.swing.JLabel();
        campo_bairro_medico = new javax.swing.JTextField();
        jLabel93 = new javax.swing.JLabel();
        campo_salario_medico = new javax.swing.JTextField();
        jLabel94 = new javax.swing.JLabel();
        campo_cod_medico = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        area_mostar_medico = new javax.swing.JTextArea();
        jLabel100 = new javax.swing.JLabel();
        campo_horario_medico = new javax.swing.JTextField();
        jLabel101 = new javax.swing.JLabel();
        campo_crv_medico1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        radio_feminino_cliente = new javax.swing.JRadioButton();
        radio_masculino_cliente = new javax.swing.JRadioButton();
        btn_salvar_cliente = new javax.swing.JButton();
        btn_deletar_cliente = new javax.swing.JButton();
        btn_atualizar_cliente = new javax.swing.JButton();
        btn_limpar_cliente = new javax.swing.JButton();
        btn_consultar_cliente = new javax.swing.JButton();
        campo_usuario_cliente = new javax.swing.JTextField();
        Campo_nome_real_cliente = new javax.swing.JTextField();
        campo_email_cliente = new javax.swing.JTextField();
        campo_bairro_cliente = new javax.swing.JTextField();
        campo_senha_cliente = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        campo_cidade_cliente = new javax.swing.JTextField();
        campo_rua_cliente = new javax.swing.JTextField();
        campo_cep_cliente = new javax.swing.JTextField();
        campo_conf_senha_cliente = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        campo_cpf_cliente = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        campo_raca_animal = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        campo_data_nasc_cliente = new javax.swing.JTextField();
        campo_idade_animal = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        campo_nome_animal = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        radio_feminino_animal = new javax.swing.JRadioButton();
        radio_masculino_animal = new javax.swing.JRadioButton();
        campo_estado_cliente = new javax.swing.JComboBox<>();
        campo_especie_animal = new javax.swing.JTextField();
        jLabel92 = new javax.swing.JLabel();
        campo_telefone_cliente = new javax.swing.JTextField();
        campo_cod_animal = new javax.swing.JTextField();
        jLabel97 = new javax.swing.JLabel();
        campo_cod_cliente = new javax.swing.JTextField();
        btn_salvar_animal = new javax.swing.JButton();
        btn_atualizar_animal = new javax.swing.JButton();
        btn_deletar_animal = new javax.swing.JButton();
        btn_limpar_animal = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        area_mostrar_cliente = new javax.swing.JTextArea();
        label1 = new java.awt.Label();
        lblUsuario = new java.awt.Label();
        lblData = new javax.swing.JLabel();
        lblUsuario1 = new java.awt.Label();

        jLabel77.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel77.setText("Bairro");

        campo_bairro_funcionario1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        campo_bairro_funcionario1.setToolTipText("");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1000, 650));
        getContentPane().setLayout(null);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setMinimumSize(new java.awt.Dimension(2000, 2000));

        jLabel51.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel51.setText("Agenda de exames:");

        jLabel52.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel52.setText("Agenda de consultas:");

        btn_mostrar_consultas.setBackground(new java.awt.Color(255, 255, 255));
        btn_mostrar_consultas.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        btn_mostrar_consultas.setText("Imprimir agenda");

        btn_mostar_exame.setBackground(new java.awt.Color(255, 255, 255));
        btn_mostar_exame.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        btn_mostar_exame.setText("Imprimir agenda");

        area_mostar_consultas.setColumns(20);
        area_mostar_consultas.setRows(5);
        jScrollPane12.setViewportView(area_mostar_consultas);

        area_mostar_exame.setColumns(20);
        area_mostar_exame.setRows(5);
        jScrollPane13.setViewportView(area_mostar_exame);

        jLabel76.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel76.setText("Agenda de Médicos:");

        area_mostar_agenda_medico.setColumns(20);
        area_mostar_agenda_medico.setRows(5);
        jScrollPane14.setViewportView(area_mostar_agenda_medico);

        btn_mostar_agenda_medicos.setBackground(new java.awt.Color(255, 255, 255));
        btn_mostar_agenda_medicos.setFont(new java.awt.Font("Arial", 2, 10)); // NOI18N
        btn_mostar_agenda_medicos.setText("Imprimir agenda");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(147, 147, 147)
                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141)
                        .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(btn_mostrar_consultas)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(178, 178, 178)
                                .addComponent(btn_mostar_exame)
                                .addGap(181, 181, 181)
                                .addComponent(btn_mostar_agenda_medicos))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(1086, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(jLabel51)
                    .addComponent(jLabel76))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_mostrar_consultas)
                            .addComponent(btn_mostar_exame)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_mostar_agenda_medicos)))
                .addContainerGap(1481, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Principal", jPanel1);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setPreferredSize(new java.awt.Dimension(1047, 548));
        jPanel4.setLayout(null);

        btn_salvar_consulta.setBackground(new java.awt.Color(0, 204, 51));
        btn_salvar_consulta.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btn_salvar_consulta.setText("Concluir");
        jPanel4.add(btn_salvar_consulta);
        btn_salvar_consulta.setBounds(20, 410, 100, 25);

        jLabel50.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel50.setText("Inserir Consulta");
        jPanel4.add(jLabel50);
        jLabel50.setBounds(44, 11, 191, 22);

        jLabel61.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel61.setText("Agenda de consultas:");
        jPanel4.add(jLabel61);
        jLabel61.setBounds(400, 10, 191, 19);

        jLabel62.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel62.setText("Data:");
        jPanel4.add(jLabel62);
        jLabel62.setBounds(22, 47, 34, 17);

        campo_data_consulta.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        campo_data_consulta.setToolTipText("");
        jPanel4.add(campo_data_consulta);
        campo_data_consulta.setBounds(66, 41, 282, 30);

        jLabel63.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel63.setText("Cod consulta");
        jPanel4.add(jLabel63);
        jLabel63.setBounds(22, 83, 83, 17);

        campo_cod_consulta.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        campo_cod_consulta.setToolTipText("");
        jPanel4.add(campo_cod_consulta);
        campo_cod_consulta.setBounds(115, 77, 150, 30);

        campo_cliente_consulta.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        campo_cliente_consulta.setToolTipText("");
        jPanel4.add(campo_cliente_consulta);
        campo_cliente_consulta.setBounds(70, 113, 240, 30);

        jLabel64.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel64.setText("Tutor:");
        jPanel4.add(jLabel64);
        jLabel64.setBounds(22, 119, 38, 17);

        jLabel65.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel65.setText("Tipo Consulta");
        jPanel4.add(jLabel65);
        jLabel65.setBounds(20, 210, 100, 17);

        campo_nome_animal_consulta.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        campo_nome_animal_consulta.setToolTipText("");
        jPanel4.add(campo_nome_animal_consulta);
        campo_nome_animal_consulta.setBounds(90, 150, 138, 30);

        jLabel66.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel66.setText("Forma de pagamento:");
        jPanel4.add(jLabel66);
        jLabel66.setBounds(20, 240, 140, 17);

        grupo_consulta.add(radio_vista_consulta);
        radio_vista_consulta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        radio_vista_consulta.setText("À Vista");
        radio_vista_consulta.setToolTipText("");
        jPanel4.add(radio_vista_consulta);
        radio_vista_consulta.setBounds(20, 310, 69, 38);

        grupo_consulta.add(radio_credito_consulta);
        radio_credito_consulta.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        radio_credito_consulta.setText("Crédito");
        radio_credito_consulta.setToolTipText("");
        jPanel4.add(radio_credito_consulta);
        radio_credito_consulta.setBounds(20, 260, 71, 38);

        jLabel67.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel67.setText("Preço:");
        jPanel4.add(jLabel67);
        jLabel67.setBounds(90, 270, 41, 17);

        campo_preco_consulta.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        campo_preco_consulta.setToolTipText("");
        jPanel4.add(campo_preco_consulta);
        campo_preco_consulta.setBounds(140, 270, 75, 30);

        campo_usuario23.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        campo_usuario23.setText("Pago, sim ou não?");
        campo_usuario23.setToolTipText("");
        jPanel4.add(campo_usuario23);
        campo_usuario23.setBounds(20, 360, 138, 30);

        btn_alterar_consulta.setBackground(new java.awt.Color(0, 204, 51));
        btn_alterar_consulta.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btn_alterar_consulta.setText("Alterar");
        jPanel4.add(btn_alterar_consulta);
        btn_alterar_consulta.setBounds(130, 410, 90, 25);

        btn_deletar_consulta.setBackground(new java.awt.Color(0, 204, 51));
        btn_deletar_consulta.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btn_deletar_consulta.setText("Excluir");
        jPanel4.add(btn_deletar_consulta);
        btn_deletar_consulta.setBounds(220, 410, 90, 25);

        jLabel68.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel68.setText("Inserir Exames");
        jPanel4.add(jLabel68);
        jLabel68.setBounds(685, 11, 191, 22);

        jLabel69.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel69.setText("Data:");
        jPanel4.add(jLabel69);
        jLabel69.setBounds(663, 47, 34, 17);

        campo_data_exame.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        campo_data_exame.setToolTipText("");
        jPanel4.add(campo_data_exame);
        campo_data_exame.setBounds(707, 41, 256, 30);

        campo_cod_exame.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        campo_cod_exame.setToolTipText("");
        jPanel4.add(campo_cod_exame);
        campo_cod_exame.setBounds(748, 77, 130, 30);

        jLabel70.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel70.setText("Cod_exame");
        jPanel4.add(jLabel70);
        jLabel70.setBounds(663, 83, 75, 17);

        jLabel71.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel71.setText("Tutor:");
        jPanel4.add(jLabel71);
        jLabel71.setBounds(663, 119, 38, 17);

        campo_cliente_exame.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        campo_cliente_exame.setToolTipText("");
        jPanel4.add(campo_cliente_exame);
        campo_cliente_exame.setBounds(711, 113, 240, 30);

        campo_animal_exame.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        campo_animal_exame.setToolTipText("");
        jPanel4.add(campo_animal_exame);
        campo_animal_exame.setBounds(732, 154, 138, 30);

        jLabel72.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel72.setText("Paciente:");
        jPanel4.add(jLabel72);
        jLabel72.setBounds(663, 160, 59, 17);

        jLabel73.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel73.setText("Forma de pagamento:");
        jPanel4.add(jLabel73);
        jLabel73.setBounds(663, 243, 140, 17);

        grupoExame.add(radio_credito_exames);
        radio_credito_exames.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        radio_credito_exames.setText("Crédito");
        radio_credito_exames.setToolTipText("");
        jPanel4.add(radio_credito_exames);
        radio_credito_exames.setBounds(663, 278, 71, 38);

        jLabel74.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel74.setText("Preço");
        jPanel4.add(jLabel74);
        jLabel74.setBounds(752, 284, 37, 17);

        campo_preco_exame.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        campo_preco_exame.setToolTipText("");
        jPanel4.add(campo_preco_exame);
        campo_preco_exame.setBounds(793, 278, 75, 30);

        grupoExame.add(radio_vista_exames);
        radio_vista_exames.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        radio_vista_exames.setText("À Vista");
        radio_vista_exames.setToolTipText("");
        jPanel4.add(radio_vista_exames);
        radio_vista_exames.setBounds(663, 331, 69, 38);

        campo_usuario29.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        campo_usuario29.setText("Pago, sim ou não?");
        campo_usuario29.setToolTipText("");
        jPanel4.add(campo_usuario29);
        campo_usuario29.setBounds(663, 387, 138, 30);

        btn_salvar_exame.setBackground(new java.awt.Color(0, 204, 51));
        btn_salvar_exame.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btn_salvar_exame.setText("Concluir");
        jPanel4.add(btn_salvar_exame);
        btn_salvar_exame.setBounds(663, 435, 100, 25);

        btn_alterar_exame.setBackground(new java.awt.Color(0, 204, 51));
        btn_alterar_exame.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btn_alterar_exame.setText("Alterar");
        jPanel4.add(btn_alterar_exame);
        btn_alterar_exame.setBounds(764, 435, 90, 25);

        btn_excluir_exame.setBackground(new java.awt.Color(0, 204, 51));
        btn_excluir_exame.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btn_excluir_exame.setText("Excluir");
        jPanel4.add(btn_excluir_exame);
        btn_excluir_exame.setBounds(853, 435, 90, 25);

        jLabel75.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel75.setText("Tipo Exame:");
        jPanel4.add(jLabel75);
        jLabel75.setBounds(663, 201, 78, 17);

        jLabel78.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel78.setText("Agenda de Exames:");
        jPanel4.add(jLabel78);
        jLabel78.setBounds(410, 270, 191, 19);

        campo_tipo_exame.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        campo_tipo_exame.setToolTipText("");
        jPanel4.add(campo_tipo_exame);
        campo_tipo_exame.setBounds(751, 195, 138, 30);

        btn_limpar_consulta.setBackground(new java.awt.Color(0, 204, 51));
        btn_limpar_consulta.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btn_limpar_consulta.setText("LImpar");
        jPanel4.add(btn_limpar_consulta);
        btn_limpar_consulta.setBounds(20, 450, 90, 25);

        btn_limpar_exame.setBackground(new java.awt.Color(0, 204, 51));
        btn_limpar_exame.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btn_limpar_exame.setText("LImpar");
        jPanel4.add(btn_limpar_exame);
        btn_limpar_exame.setBounds(853, 389, 90, 25);

        area_mostar_consultas2.setColumns(20);
        area_mostar_consultas2.setRows(5);
        jScrollPane6.setViewportView(area_mostar_consultas2);

        jPanel4.add(jScrollPane6);
        jScrollPane6.setBounds(370, 40, 244, 220);

        area_mostar_exame2.setColumns(20);
        area_mostar_exame2.setRows(5);
        jScrollPane8.setViewportView(area_mostar_exame2);

        jPanel4.add(jScrollPane8);
        jScrollPane8.setBounds(330, 290, 323, 140);

        jLabel105.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel105.setText("Paciente:");
        jPanel4.add(jLabel105);
        jLabel105.setBounds(22, 160, 59, 17);

        campo_tipo_consulta.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        campo_tipo_consulta.setToolTipText("");
        jPanel4.add(campo_tipo_consulta);
        campo_tipo_consulta.setBounds(120, 200, 138, 30);

        jTabbedPane1.addTab("Consultas / Exames", jPanel4);

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setMinimumSize(new java.awt.Dimension(1035, 600));

        jLabel29.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel29.setText("Cadastrar Funcionario");

        campo_usuario_funcionario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        campo_usuario_funcionario.setToolTipText("");

        jLabel30.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel30.setText("Nome Usuario:");

        jLabel31.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel31.setText("Nome real:");

        campo_telefone_funcionario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        campo_telefone_funcionario.setToolTipText("");

        sexo_funcionarios.add(radio_masculino_funcionario);
        radio_masculino_funcionario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        radio_masculino_funcionario.setText("Masculino");
        radio_masculino_funcionario.setToolTipText("");

        sexo_funcionarios.add(radio_feminino_funcionario);
        radio_feminino_funcionario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        radio_feminino_funcionario.setText("Feminino");

        jLabel32.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel32.setText("Sexo:");

        campo_email_funcionario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        campo_email_funcionario.setToolTipText("");

        campo_bairro_funcionario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        campo_bairro_funcionario.setToolTipText("");

        jLabel33.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel33.setText("Estado:");

        jLabel34.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel34.setText("Bairro");

        jLabel35.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel35.setText("Email:");

        jLabel36.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel36.setText("Cargo:");

        jLabel37.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel37.setText("Telefone");

        campo_real_funcionario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        campo_real_funcionario.setToolTipText("");

        campo_cargo_funcionario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        campo_cargo_funcionario.setToolTipText("");

        campo_cpf_funcionario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel42.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel42.setText("CPF:");

        jLabel43.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel43.setText("Data de nascimento:");

        campo_data_nasc_funcionario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        campo_cidade_funcionario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        campo_cidade_funcionario.setToolTipText("");

        campo_rua_funcionario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        campo_rua_funcionario.setToolTipText("");

        campo_cep_funcionario.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        campo_cep_funcionario.setToolTipText("");

        jLabel44.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel44.setText("CEP:");

        jLabel45.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel45.setText("Rua:");

        jLabel46.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel46.setText("Cidade:");

        jLabel47.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel47.setText("Confirmar Senha:");

        jLabel48.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel48.setText("Senha:");

        jLabel49.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel49.setText("Dados Funcionario:");

        btn_limpar_funcionario.setBackground(new java.awt.Color(0, 204, 51));
        btn_limpar_funcionario.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btn_limpar_funcionario.setText("Limpar");

        btn_deletar_funcionario.setBackground(new java.awt.Color(0, 204, 51));
        btn_deletar_funcionario.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btn_deletar_funcionario.setText("Deletar");

        btn_atualizar_funcionario.setBackground(new java.awt.Color(0, 204, 51));
        btn_atualizar_funcionario.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btn_atualizar_funcionario.setText("Atulaizar");

        btn_salvar_funcionario.setBackground(new java.awt.Color(0, 204, 51));
        btn_salvar_funcionario.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btn_salvar_funcionario.setText("Salvar");

        btn_consultar_funcionarios.setBackground(new java.awt.Color(0, 204, 51));
        btn_consultar_funcionarios.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btn_consultar_funcionarios.setText("Consultar");

        campo_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

        jLabel95.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel95.setText("Salario");

        jLabel96.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel96.setText("cod Funcionario");

        area_mostar_funcionario.setColumns(20);
        area_mostar_funcionario.setRows(5);
        jScrollPane2.setViewportView(area_mostar_funcionario);

        jLabel106.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel106.setText("Senha:");

        campo_senha_funcionarios.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        campo_senha_funcionarios.setToolTipText("");

        jLabel107.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel107.setText("Rua");

        campo_rua_funcionario1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        campo_rua_funcionario1.setToolTipText("");

        jLabel108.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel108.setText("CEP");

        campo_cep_funcionario1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        campo_cep_funcionario1.setToolTipText("");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel45)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campo_rua_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel44)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campo_cep_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel48)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campo_senha_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel47)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campo_conf_senha_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(575, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(224, 224, 224))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campo_usuario_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel36)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campo_cargo_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel96)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campo_cod_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel35)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campo_email_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(jLabel31)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(campo_real_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel42)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(campo_cpf_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                    .addComponent(jLabel32)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(radio_feminino_funcionario)
                                    .addGap(18, 18, 18)
                                    .addComponent(radio_masculino_funcionario)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel43)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(campo_data_nasc_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel46)
                                            .addComponent(jLabel37))
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(campo_cidade_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(campo_telefone_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel95))))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addComponent(jLabel107)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(campo_rua_funcionario1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel108)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(campo_cep_funcionario1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addComponent(jLabel106)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(campo_senha_funcionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campo_salario_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campo_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campo_bairro_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_consultar_funcionarios)
                        .addGap(18, 18, 18)
                        .addComponent(btn_salvar_funcionario)
                        .addGap(22, 22, 22)
                        .addComponent(btn_atualizar_funcionario)
                        .addGap(18, 18, 18)
                        .addComponent(btn_deletar_funcionario)
                        .addGap(18, 18, 18)
                        .addComponent(btn_limpar_funcionario)
                        .addGap(118, 118, 118))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel29))
                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(campo_usuario_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(campo_real_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel42)
                            .addComponent(campo_cpf_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(radio_feminino_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radio_masculino_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43)
                            .addComponent(campo_data_nasc_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel95)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel37)
                                .addComponent(campo_telefone_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(campo_salario_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(campo_cargo_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel96)
                    .addComponent(campo_cod_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(campo_email_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_consultar_funcionarios)
                        .addComponent(btn_salvar_funcionario)
                        .addComponent(btn_atualizar_funcionario)
                        .addComponent(btn_deletar_funcionario)
                        .addComponent(btn_limpar_funcionario))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campo_bairro_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel34)))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(campo_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_cidade_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46))
                .addGap(9, 9, 9)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel107)
                    .addComponent(campo_rua_funcionario1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel108)
                    .addComponent(campo_cep_funcionario1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel106)
                    .addComponent(campo_senha_funcionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 561, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(campo_rua_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(campo_cep_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(jLabel47)
                    .addComponent(campo_senha_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_conf_senha_funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(836, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Funcionário", jPanel6);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setLayout(null);

        jLabel79.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel79.setText("Fornecedores");
        jPanel5.add(jLabel79);
        jLabel79.setBounds(10, 280, 119, 22);

        jLabel80.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel80.setText("Quantidade de Frascos:");
        jPanel5.add(jLabel80);
        jLabel80.setBounds(310, 40, 153, 17);

        campo_quantidade.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        campo_quantidade.setToolTipText("");
        jPanel5.add(campo_quantidade);
        campo_quantidade.setBounds(470, 30, 58, 30);

        jLabel81.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel81.setText("Nome do remedio:");
        jPanel5.add(jLabel81);
        jLabel81.setBounds(0, 39, 115, 17);

        campo_nome_remedio.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        campo_nome_remedio.setToolTipText("");
        jPanel5.add(campo_nome_remedio);
        campo_nome_remedio.setBounds(125, 33, 164, 30);

        jLabel82.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel82.setText("Quantidade de Doses:");
        jPanel5.add(jLabel82);
        jLabel82.setBounds(310, 100, 142, 17);

        campo_dose_remedio.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        campo_dose_remedio.setToolTipText("");
        jPanel5.add(campo_dose_remedio);
        campo_dose_remedio.setBounds(470, 90, 58, 30);

        campo_contato_fornecedor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        campo_contato_fornecedor.setToolTipText("");
        jPanel5.add(campo_contato_fornecedor);
        campo_contato_fornecedor.setBounds(140, 310, 220, 30);

        jLabel83.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel83.setText("Nome do Fornecedor:");
        jPanel5.add(jLabel83);
        jLabel83.setBounds(0, 320, 138, 17);

        jLabel84.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel84.setText("Preco remedio:");
        jPanel5.add(jLabel84);
        jLabel84.setBounds(0, 170, 110, 17);

        campo_preco_remedio.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        campo_preco_remedio.setToolTipText("");
        jPanel5.add(campo_preco_remedio);
        campo_preco_remedio.setBounds(130, 160, 70, 30);

        campo_descricao_remedio.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        campo_descricao_remedio.setToolTipText("");
        jPanel5.add(campo_descricao_remedio);
        campo_descricao_remedio.setBounds(130, 90, 160, 60);

        campo_preco_fornecedor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        campo_preco_fornecedor.setToolTipText("");
        jPanel5.add(campo_preco_fornecedor);
        campo_preco_fornecedor.setBounds(140, 420, 151, 30);

        campo_telefone_fornecedor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        campo_telefone_fornecedor.setToolTipText("");
        jPanel5.add(campo_telefone_fornecedor);
        campo_telefone_fornecedor.setBounds(60, 370, 150, 30);

        campo_email_fornecedor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        campo_email_fornecedor.setToolTipText("");
        jPanel5.add(campo_email_fornecedor);
        campo_email_fornecedor.setBounds(410, 310, 213, 30);

        jLabel85.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel85.setText("CNPJ");
        jPanel5.add(jLabel85);
        jLabel85.setBounds(630, 320, 38, 17);

        jLabel86.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel86.setText("Telefone:");
        jPanel5.add(jLabel86);
        jLabel86.setBounds(0, 380, 60, 17);

        jLabel87.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel87.setText("Nome da Empresa:");
        jPanel5.add(jLabel87);
        jLabel87.setBounds(230, 380, 120, 17);

        jLabel88.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel88.setText("Preco do fornecedor:");
        jPanel5.add(jLabel88);
        jLabel88.setBounds(0, 430, 150, 17);

        jLabel89.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel89.setText("Descrição remedio");
        jPanel5.add(jLabel89);
        jLabel89.setBounds(0, 90, 118, 17);

        btn_limpar_remedios_fornecedor.setBackground(new java.awt.Color(0, 204, 51));
        btn_limpar_remedios_fornecedor.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        btn_limpar_remedios_fornecedor.setText("Limpar");
        jPanel5.add(btn_limpar_remedios_fornecedor);
        btn_limpar_remedios_fornecedor.setBounds(490, 480, 110, 23);

        btn_deletar_remedios_fornecedor.setBackground(new java.awt.Color(0, 204, 51));
        btn_deletar_remedios_fornecedor.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        btn_deletar_remedios_fornecedor.setText("Deletar");
        jPanel5.add(btn_deletar_remedios_fornecedor);
        btn_deletar_remedios_fornecedor.setBounds(370, 480, 120, 23);

        btn_atualizar_remedios_fornecedor.setBackground(new java.awt.Color(0, 204, 51));
        btn_atualizar_remedios_fornecedor.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        btn_atualizar_remedios_fornecedor.setText("Atulaizar");
        jPanel5.add(btn_atualizar_remedios_fornecedor);
        btn_atualizar_remedios_fornecedor.setBounds(240, 480, 130, 23);

        btn_salvar_remedios_fornecedor.setBackground(new java.awt.Color(0, 204, 51));
        btn_salvar_remedios_fornecedor.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        btn_salvar_remedios_fornecedor.setText("Salvar");
        jPanel5.add(btn_salvar_remedios_fornecedor);
        btn_salvar_remedios_fornecedor.setBounds(130, 480, 110, 23);

        btn_consultar_remedios_fornecedor.setBackground(new java.awt.Color(0, 204, 51));
        btn_consultar_remedios_fornecedor.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        btn_consultar_remedios_fornecedor.setText("Consultar");
        jPanel5.add(btn_consultar_remedios_fornecedor);
        btn_consultar_remedios_fornecedor.setBounds(0, 480, 130, 23);

        jLabel90.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel90.setText("Remedios em Estoque:");
        jPanel5.add(jLabel90);
        jLabel90.setBounds(680, 0, 191, 22);

        jLabel91.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel91.setText("Dados fornecedor:");
        jPanel5.add(jLabel91);
        jLabel91.setBounds(720, 340, 191, 22);

        campo_nome_empresa_fornecedor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        campo_nome_empresa_fornecedor.setToolTipText("");
        jPanel5.add(campo_nome_empresa_fornecedor);
        campo_nome_empresa_fornecedor.setBounds(670, 310, 180, 30);

        jLabel98.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel98.setText("Validade:");
        jPanel5.add(jLabel98);
        jLabel98.setBounds(300, 140, 59, 17);

        jLabel99.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel99.setText("cod fornecedor");
        jPanel5.add(jLabel99);
        jLabel99.setBounds(320, 430, 96, 17);

        btn_consultar_remedios.setBackground(new java.awt.Color(0, 204, 51));
        btn_consultar_remedios.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        btn_consultar_remedios.setText("Consultar");
        jPanel5.add(btn_consultar_remedios);
        btn_consultar_remedios.setBounds(210, 220, 110, 23);

        btn_salvar_remedios.setBackground(new java.awt.Color(0, 204, 51));
        btn_salvar_remedios.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        btn_salvar_remedios.setText("Salvar");
        jPanel5.add(btn_salvar_remedios);
        btn_salvar_remedios.setBounds(410, 220, 80, 23);

        btn_atualizar_remedios.setBackground(new java.awt.Color(0, 204, 51));
        btn_atualizar_remedios.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        btn_atualizar_remedios.setText("Atulaizar");
        jPanel5.add(btn_atualizar_remedios);
        btn_atualizar_remedios.setBounds(490, 220, 90, 23);

        btn_deletar_remedios.setBackground(new java.awt.Color(0, 204, 51));
        btn_deletar_remedios.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        btn_deletar_remedios.setText("Deletar");
        jPanel5.add(btn_deletar_remedios);
        btn_deletar_remedios.setBounds(320, 220, 90, 23);

        btn_limpar_remedios.setBackground(new java.awt.Color(0, 204, 51));
        btn_limpar_remedios.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        btn_limpar_remedios.setText("Limpar");
        jPanel5.add(btn_limpar_remedios);
        btn_limpar_remedios.setBounds(880, 250, 73, 23);
        jPanel5.add(campo_validade_remedio);
        campo_validade_remedio.setBounds(370, 130, 110, 28);
        jPanel5.add(campo_cod_fornecedor);
        campo_cod_fornecedor.setBounds(440, 420, 100, 28);

        area_mostrar_remedio.setColumns(20);
        area_mostrar_remedio.setRows(5);
        jScrollPane1.setViewportView(area_mostrar_remedio);

        jPanel5.add(jScrollPane1);
        jScrollPane1.setBounds(590, 30, 360, 210);

        area_mostrar_fornecedor.setColumns(20);
        area_mostrar_fornecedor.setRows(5);
        jScrollPane4.setViewportView(area_mostrar_fornecedor);

        jPanel5.add(jScrollPane4);
        jScrollPane4.setBounds(600, 370, 360, 140);

        jLabel102.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel102.setText("Remédios:");
        jPanel5.add(jLabel102);
        jLabel102.setBounds(0, 0, 191, 22);

        jLabel103.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel103.setText("Email:");
        jPanel5.add(jLabel103);
        jLabel103.setBounds(370, 320, 38, 17);

        campo_nome_empresa_fornecedor1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        campo_nome_empresa_fornecedor1.setToolTipText("");
        jPanel5.add(campo_nome_empresa_fornecedor1);
        campo_nome_empresa_fornecedor1.setBounds(360, 370, 180, 30);

        jLabel104.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel104.setText("cod remedio");
        jPanel5.add(jLabel104);
        jLabel104.setBounds(20, 220, 78, 17);
        jPanel5.add(campo_cod_remedio);
        campo_cod_remedio.setBounds(130, 210, 70, 28);

        jTabbedPane1.addTab("Farmácia", jPanel5);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setMinimumSize(new java.awt.Dimension(1100, 630));
        jPanel3.setPreferredSize(new java.awt.Dimension(1022, 300));
        jPanel3.setLayout(null);

        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setText("Nome Usuario:");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(18, 45, 92, 17);

        jLabel16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel16.setText("Nome real:");
        jPanel3.add(jLabel16);
        jLabel16.setBounds(18, 86, 68, 17);

        jLabel17.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel17.setText("Sexo:");
        jPanel3.add(jLabel17);
        jLabel17.setBounds(20, 140, 35, 17);

        jLabel18.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel18.setText("Email:");
        jPanel3.add(jLabel18);
        jLabel18.setBounds(400, 200, 38, 17);

        jLabel19.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel19.setText("Telefone:");
        jPanel3.add(jLabel19);
        jLabel19.setBounds(730, 210, 60, 17);

        jLabel20.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel20.setText("Estado:");
        jPanel3.add(jLabel20);
        jLabel20.setBounds(250, 260, 48, 17);

        jLabel21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel21.setText("Cidade:");
        jPanel3.add(jLabel21);
        jLabel21.setBounds(400, 260, 49, 17);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Rua:");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(750, 260, 30, 17);

        jLabel22.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel22.setText("Cadastrar Médico");
        jPanel3.add(jLabel22);
        jLabel22.setBounds(18, 11, 191, 22);

        jLabel23.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel23.setText("Dados Médico:");
        jPanel3.add(jLabel23);
        jLabel23.setBounds(437, 11, 191, 22);

        jLabel24.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel24.setText("CEP:");
        jPanel3.add(jLabel24);
        jLabel24.setBounds(600, 300, 32, 17);

        jLabel25.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel25.setText("Senha:");
        jPanel3.add(jLabel25);
        jLabel25.setBounds(600, 340, 45, 17);

        jLabel26.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel26.setText("Confirmar Senha:");
        jPanel3.add(jLabel26);
        jLabel26.setBounds(790, 340, 111, 17);

        buttonGroup1.add(radio_feminino_medico);
        radio_feminino_medico.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        radio_feminino_medico.setText("Feminino");
        jPanel3.add(radio_feminino_medico);
        radio_feminino_medico.setBounds(80, 130, 83, 38);

        buttonGroup1.add(radio_masculino_medico);
        radio_masculino_medico.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        radio_masculino_medico.setText("Masculino");
        radio_masculino_medico.setToolTipText("");
        jPanel3.add(radio_masculino_medico);
        radio_masculino_medico.setBounds(180, 130, 89, 38);
        jPanel3.add(campo_senha_medico);
        campo_senha_medico.setBounds(650, 340, 129, 20);
        jPanel3.add(campo_conf_senha_medico);
        campo_conf_senha_medico.setBounds(910, 340, 119, 20);

        btn_consultar_medico.setBackground(new java.awt.Color(0, 204, 51));
        btn_consultar_medico.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btn_consultar_medico.setText("Consultar");
        jPanel3.add(btn_consultar_medico);
        btn_consultar_medico.setBounds(600, 420, 110, 25);

        btn_salvar_medico.setBackground(new java.awt.Color(0, 204, 51));
        btn_salvar_medico.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btn_salvar_medico.setText("Salvar");
        jPanel3.add(btn_salvar_medico);
        btn_salvar_medico.setBounds(710, 420, 90, 25);

        btn_alterar_medico.setBackground(new java.awt.Color(0, 204, 51));
        btn_alterar_medico.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btn_alterar_medico.setText("Atualizar");
        jPanel3.add(btn_alterar_medico);
        btn_alterar_medico.setBounds(910, 420, 120, 25);

        btn_limpar_medico.setBackground(new java.awt.Color(0, 204, 51));
        btn_limpar_medico.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btn_limpar_medico.setText("Limpar");
        jPanel3.add(btn_limpar_medico);
        btn_limpar_medico.setBounds(750, 460, 120, 40);

        btn_delete_medico.setBackground(new java.awt.Color(0, 204, 51));
        btn_delete_medico.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btn_delete_medico.setText("Deletar");
        jPanel3.add(btn_delete_medico);
        btn_delete_medico.setBounds(810, 420, 100, 25);

        jLabel28.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel28.setText("Especialidade:");
        jPanel3.add(jLabel28);
        jLabel28.setBounds(20, 210, 92, 17);

        campo_usuario_medico.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        campo_usuario_medico.setToolTipText("");
        jPanel3.add(campo_usuario_medico);
        campo_usuario_medico.setBounds(120, 39, 290, 30);

        campo_cidade_medico.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        campo_cidade_medico.setToolTipText("");
        jPanel3.add(campo_cidade_medico);
        campo_cidade_medico.setBounds(450, 250, 270, 30);

        campo_real_medico.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        campo_real_medico.setToolTipText("");
        jPanel3.add(campo_real_medico);
        campo_real_medico.setBounds(96, 80, 290, 30);

        campo_telefone_medico.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        campo_telefone_medico.setToolTipText("");
        jPanel3.add(campo_telefone_medico);
        campo_telefone_medico.setBounds(800, 200, 210, 30);

        campo_email_medico.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        campo_email_medico.setToolTipText("");
        jPanel3.add(campo_email_medico);
        campo_email_medico.setBounds(450, 190, 270, 30);

        campo_especialidade_medico.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        campo_especialidade_medico.setToolTipText("");
        jPanel3.add(campo_especialidade_medico);
        campo_especialidade_medico.setBounds(120, 200, 205, 30);

        campo_rua_medico.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        campo_rua_medico.setToolTipText("");
        jPanel3.add(campo_rua_medico);
        campo_rua_medico.setBounds(800, 250, 210, 30);

        campo_cep_medico.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        campo_cep_medico.setToolTipText("");
        jPanel3.add(campo_cep_medico);
        campo_cep_medico.setBounds(640, 290, 290, 30);

        campo_cpf_medico.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel3.add(campo_cpf_medico);
        campo_cpf_medico.setBounds(810, 130, 200, 30);

        jLabel40.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel40.setText("CPF:");
        jPanel3.add(jLabel40);
        jLabel40.setBounds(740, 140, 32, 17);

        jLabel41.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel41.setText("Data de nascimento:");
        jPanel3.add(jLabel41);
        jLabel41.setBounds(390, 90, 130, 17);

        campo_data_nasc_medico.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel3.add(campo_data_nasc_medico);
        campo_data_nasc_medico.setBounds(530, 80, 160, 30);

        campo_estado_medico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jPanel3.add(campo_estado_medico);
        campo_estado_medico.setBounds(300, 250, 90, 25);

        jLabel59.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel59.setText("Bairro");
        jPanel3.add(jLabel59);
        jLabel59.setBounds(20, 260, 38, 17);

        campo_bairro_medico.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        campo_bairro_medico.setToolTipText("");
        jPanel3.add(campo_bairro_medico);
        campo_bairro_medico.setBounds(70, 250, 173, 31);

        jLabel93.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel93.setText("Salario");
        jPanel3.add(jLabel93);
        jLabel93.setBounds(610, 380, 44, 17);

        campo_salario_medico.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        campo_salario_medico.setToolTipText("");
        jPanel3.add(campo_salario_medico);
        campo_salario_medico.setBounds(660, 370, 290, 30);

        jLabel94.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel94.setText("Cod Medico");
        jPanel3.add(jLabel94);
        jLabel94.setBounds(450, 50, 75, 17);
        jPanel3.add(campo_cod_medico);
        campo_cod_medico.setBounds(540, 40, 150, 31);

        area_mostar_medico.setColumns(20);
        area_mostar_medico.setRows(5);
        jScrollPane7.setViewportView(area_mostar_medico);

        jPanel3.add(jScrollPane7);
        jScrollPane7.setBounds(10, 300, 580, 200);

        jLabel100.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel100.setText("Horario do medico");
        jPanel3.add(jLabel100);
        jLabel100.setBounds(700, 50, 115, 17);
        jPanel3.add(campo_horario_medico);
        campo_horario_medico.setBounds(820, 40, 101, 31);

        jLabel101.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel101.setText("CRV");
        jPanel3.add(jLabel101);
        jLabel101.setBounds(390, 140, 29, 17);
        jPanel3.add(campo_crv_medico1);
        campo_crv_medico1.setBounds(430, 130, 200, 31);

        jTabbedPane1.addTab("Médico", jPanel3);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setMinimumSize(new java.awt.Dimension(1035, 600));
        jPanel2.setPreferredSize(new java.awt.Dimension(1022, 300));
        jPanel2.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel10.setText("Cadastrar Tutor");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(18, 11, 219, 22);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Nome Usuario:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(18, 45, 92, 17);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("Rua:");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(30, 380, 30, 17);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Nome real:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(18, 86, 68, 17);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Cidade:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(260, 330, 49, 17);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("Senha:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(10, 450, 45, 17);

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setText("Telefone:");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(18, 275, 60, 17);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("CEP:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(280, 380, 32, 17);

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setText("Email:");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(18, 239, 38, 17);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Estado:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(20, 330, 48, 17);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Sexo:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(18, 126, 35, 17);

        sexo_cliente.add(radio_feminino_cliente);
        radio_feminino_cliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        radio_feminino_cliente.setText("Feminino");
        jPanel2.add(radio_feminino_cliente);
        radio_feminino_cliente.setBounds(71, 115, 83, 38);

        sexo_cliente.add(radio_masculino_cliente);
        radio_masculino_cliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        radio_masculino_cliente.setText("Masculino");
        radio_masculino_cliente.setToolTipText("");
        jPanel2.add(radio_masculino_cliente);
        radio_masculino_cliente.setBounds(172, 115, 89, 38);

        btn_salvar_cliente.setBackground(new java.awt.Color(0, 204, 51));
        btn_salvar_cliente.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btn_salvar_cliente.setText("Salvar");
        jPanel2.add(btn_salvar_cliente);
        btn_salvar_cliente.setBounds(130, 480, 100, 25);

        btn_deletar_cliente.setBackground(new java.awt.Color(0, 204, 51));
        btn_deletar_cliente.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btn_deletar_cliente.setText("Deletar");
        jPanel2.add(btn_deletar_cliente);
        btn_deletar_cliente.setBounds(340, 480, 100, 25);

        btn_atualizar_cliente.setBackground(new java.awt.Color(0, 204, 51));
        btn_atualizar_cliente.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btn_atualizar_cliente.setText("Atulaizar");
        jPanel2.add(btn_atualizar_cliente);
        btn_atualizar_cliente.setBounds(230, 480, 110, 25);

        btn_limpar_cliente.setBackground(new java.awt.Color(0, 204, 51));
        btn_limpar_cliente.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btn_limpar_cliente.setText("Limpar");
        jPanel2.add(btn_limpar_cliente);
        btn_limpar_cliente.setBounds(440, 480, 110, 25);

        btn_consultar_cliente.setBackground(new java.awt.Color(0, 204, 51));
        btn_consultar_cliente.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btn_consultar_cliente.setText("Consultar");
        jPanel2.add(btn_consultar_cliente);
        btn_consultar_cliente.setBounds(10, 480, 120, 25);
        btn_consultar_cliente.getAccessibleContext().setAccessibleName("Pesquisar");

        campo_usuario_cliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        campo_usuario_cliente.setToolTipText("");
        jPanel2.add(campo_usuario_cliente);
        campo_usuario_cliente.setBounds(114, 39, 290, 30);

        Campo_nome_real_cliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Campo_nome_real_cliente.setToolTipText("");
        jPanel2.add(Campo_nome_real_cliente);
        Campo_nome_real_cliente.setBounds(96, 80, 290, 30);

        campo_email_cliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jPanel2.add(campo_email_cliente);
        campo_email_cliente.setBounds(60, 233, 290, 30);

        campo_bairro_cliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel2.add(campo_bairro_cliente);
        campo_bairro_cliente.setBounds(300, 270, 170, 30);

        campo_senha_cliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jPanel2.add(campo_senha_cliente);
        campo_senha_cliente.setBounds(70, 450, 126, 21);

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setText("Confirmar Senha:");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(210, 450, 111, 17);

        campo_cidade_cliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jPanel2.add(campo_cidade_cliente);
        campo_cidade_cliente.setBounds(310, 320, 160, 30);

        campo_rua_cliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        campo_rua_cliente.setToolTipText("");
        jPanel2.add(campo_rua_cliente);
        campo_rua_cliente.setBounds(70, 380, 190, 30);

        campo_cep_cliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        campo_cep_cliente.setToolTipText("");
        jPanel2.add(campo_cep_cliente);
        campo_cep_cliente.setBounds(320, 370, 150, 30);

        campo_conf_senha_cliente.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jPanel2.add(campo_conf_senha_cliente);
        campo_conf_senha_cliente.setBounds(330, 450, 125, 21);

        jLabel14.setFont(new java.awt.Font("Arial", 3, 16)); // NOI18N
        jLabel14.setText("Dados do Tutor:");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(490, 11, 191, 22);

        campo_cpf_cliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel2.add(campo_cpf_cliente);
        campo_cpf_cliente.setBounds(54, 161, 150, 30);

        jLabel38.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel38.setText("CPF:");
        jPanel2.add(jLabel38);
        jLabel38.setBounds(18, 167, 32, 17);

        jLabel39.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel39.setText("Data de nascimento:");
        jPanel2.add(jLabel39);
        jLabel39.setBounds(18, 203, 130, 17);

        campo_raca_animal.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel2.add(campo_raca_animal);
        campo_raca_animal.setBounds(620, 310, 150, 30);

        jLabel53.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel53.setText("Raça:");
        jPanel2.add(jLabel53);
        jLabel53.setBounds(550, 320, 37, 17);

        jLabel54.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel54.setText("cod Animal");
        jPanel2.add(jLabel54);
        jLabel54.setBounds(540, 280, 69, 17);

        campo_data_nasc_cliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel2.add(campo_data_nasc_cliente);
        campo_data_nasc_cliente.setBounds(152, 197, 150, 30);

        campo_idade_animal.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel2.add(campo_idade_animal);
        campo_idade_animal.setBounds(620, 350, 150, 30);

        jLabel55.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel55.setText("Idade:");
        jPanel2.add(jLabel55);
        jLabel55.setBounds(550, 350, 39, 17);

        jLabel56.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel56.setText("Nome:");
        jPanel2.add(jLabel56);
        jLabel56.setBounds(550, 390, 40, 17);

        campo_nome_animal.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel2.add(campo_nome_animal);
        campo_nome_animal.setBounds(620, 390, 156, 30);

        jLabel57.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel57.setText("Especie:");
        jPanel2.add(jLabel57);
        jLabel57.setBounds(550, 430, 54, 17);

        jLabel58.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel58.setText("Paciente:");
        jPanel2.add(jLabel58);
        jLabel58.setBounds(520, 240, 191, 22);

        jLabel60.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel60.setText("Sexo:");
        jPanel2.add(jLabel60);
        jLabel60.setBounds(870, 410, 35, 17);

        sexo_animal.add(radio_feminino_animal);
        radio_feminino_animal.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        radio_feminino_animal.setText("Femea");
        jPanel2.add(radio_feminino_animal);
        radio_feminino_animal.setBounds(800, 430, 69, 38);

        sexo_animal.add(radio_masculino_animal);
        radio_masculino_animal.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        radio_masculino_animal.setText("Macho");
        radio_masculino_animal.setToolTipText("");
        jPanel2.add(radio_masculino_animal);
        radio_masculino_animal.setBounds(910, 430, 67, 38);

        campo_estado_cliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jPanel2.add(campo_estado_cliente);
        campo_estado_cliente.setBounds(80, 320, 168, 29);

        campo_especie_animal.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel2.add(campo_especie_animal);
        campo_especie_animal.setBounds(620, 430, 160, 30);

        jLabel92.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel92.setText("Bairro");
        jPanel2.add(jLabel92);
        jLabel92.setBounds(260, 280, 38, 17);

        campo_telefone_cliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel2.add(campo_telefone_cliente);
        campo_telefone_cliente.setBounds(88, 269, 150, 30);

        campo_cod_animal.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel2.add(campo_cod_animal);
        campo_cod_animal.setBounds(620, 270, 150, 30);

        jLabel97.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel97.setText("Cod Cliente");
        jPanel2.add(jLabel97);
        jLabel97.setBounds(302, 126, 74, 17);

        campo_cod_cliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel2.add(campo_cod_cliente);
        campo_cod_cliente.setBounds(386, 120, 71, 30);

        btn_salvar_animal.setBackground(new java.awt.Color(0, 204, 51));
        btn_salvar_animal.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btn_salvar_animal.setText("Salvar");
        jPanel2.add(btn_salvar_animal);
        btn_salvar_animal.setBounds(780, 270, 100, 25);

        btn_atualizar_animal.setBackground(new java.awt.Color(0, 204, 51));
        btn_atualizar_animal.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btn_atualizar_animal.setText("Atulaizar");
        jPanel2.add(btn_atualizar_animal);
        btn_atualizar_animal.setBounds(880, 270, 100, 25);

        btn_deletar_animal.setBackground(new java.awt.Color(0, 204, 51));
        btn_deletar_animal.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btn_deletar_animal.setText("Deletar");
        jPanel2.add(btn_deletar_animal);
        btn_deletar_animal.setBounds(780, 330, 100, 25);

        btn_limpar_animal.setBackground(new java.awt.Color(0, 204, 51));
        btn_limpar_animal.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btn_limpar_animal.setText("Limpar");
        jPanel2.add(btn_limpar_animal);
        btn_limpar_animal.setBounds(880, 330, 100, 25);

        area_mostrar_cliente.setColumns(20);
        area_mostrar_cliente.setRows(5);
        jScrollPane3.setViewportView(area_mostrar_cliente);

        jPanel2.add(jScrollPane3);
        jScrollPane3.setBounds(490, 39, 447, 196);

        jTabbedPane1.addTab("Cliente", jPanel2);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 30, 1040, 2031);
        jTabbedPane1.getAccessibleContext().setAccessibleName("Principal");

        label1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        label1.setText("Menu");
        getContentPane().add(label1);
        label1.setBounds(60, 0, 52, 20);

        lblUsuario.setText("Usuário");
        getContentPane().add(lblUsuario);
        lblUsuario.setBounds(680, 0, 48, 20);

        lblData.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblData.setText("Data");
        getContentPane().add(lblData);
        lblData.setBounds(770, 0, 100, 16);

        lblUsuario1.setText("Usuário:");
        getContentPane().add(lblUsuario1);
        lblUsuario1.setBounds(630, 0, 51, 20);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Campo_nome_real_cliente;
    private javax.swing.JTextArea area_mostar_agenda_medico;
    private javax.swing.JTextArea area_mostar_consultas;
    private javax.swing.JTextArea area_mostar_consultas2;
    private javax.swing.JTextArea area_mostar_exame;
    private javax.swing.JTextArea area_mostar_exame2;
    private javax.swing.JTextArea area_mostar_funcionario;
    private javax.swing.JTextArea area_mostar_medico;
    private javax.swing.JTextArea area_mostrar_cliente;
    private javax.swing.JTextArea area_mostrar_fornecedor;
    private javax.swing.JTextArea area_mostrar_remedio;
    private javax.swing.JButton btn_alterar_consulta;
    private javax.swing.JButton btn_alterar_exame;
    private javax.swing.JButton btn_alterar_medico;
    private javax.swing.JButton btn_atualizar_animal;
    private javax.swing.JButton btn_atualizar_cliente;
    private javax.swing.JButton btn_atualizar_funcionario;
    private javax.swing.JButton btn_atualizar_remedios;
    private javax.swing.JButton btn_atualizar_remedios_fornecedor;
    private javax.swing.JButton btn_consultar_cliente;
    private javax.swing.JButton btn_consultar_funcionarios;
    private javax.swing.JButton btn_consultar_medico;
    private javax.swing.JButton btn_consultar_remedios;
    private javax.swing.JButton btn_consultar_remedios_fornecedor;
    private javax.swing.JButton btn_deletar_animal;
    private javax.swing.JButton btn_deletar_cliente;
    private javax.swing.JButton btn_deletar_consulta;
    private javax.swing.JButton btn_deletar_funcionario;
    private javax.swing.JButton btn_deletar_remedios;
    private javax.swing.JButton btn_deletar_remedios_fornecedor;
    private javax.swing.JButton btn_delete_medico;
    private javax.swing.JButton btn_excluir_exame;
    private javax.swing.JButton btn_limpar_animal;
    private javax.swing.JButton btn_limpar_cliente;
    private javax.swing.JButton btn_limpar_consulta;
    private javax.swing.JButton btn_limpar_exame;
    private javax.swing.JButton btn_limpar_funcionario;
    private javax.swing.JButton btn_limpar_medico;
    private javax.swing.JButton btn_limpar_remedios;
    private javax.swing.JButton btn_limpar_remedios_fornecedor;
    private javax.swing.JButton btn_mostar_agenda_medicos;
    private javax.swing.JButton btn_mostar_exame;
    private javax.swing.JButton btn_mostrar_consultas;
    private javax.swing.JButton btn_salvar_animal;
    private javax.swing.JButton btn_salvar_cliente;
    private javax.swing.JButton btn_salvar_consulta;
    private javax.swing.JButton btn_salvar_exame;
    private javax.swing.JButton btn_salvar_funcionario;
    private javax.swing.JButton btn_salvar_medico;
    private javax.swing.JButton btn_salvar_remedios;
    private javax.swing.JButton btn_salvar_remedios_fornecedor;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField campo_animal_exame;
    private javax.swing.JTextField campo_bairro_cliente;
    private javax.swing.JTextField campo_bairro_funcionario;
    private javax.swing.JTextField campo_bairro_funcionario1;
    private javax.swing.JTextField campo_bairro_medico;
    private javax.swing.JTextField campo_cargo_funcionario;
    private javax.swing.JTextField campo_cep_cliente;
    private javax.swing.JTextField campo_cep_funcionario;
    private javax.swing.JTextField campo_cep_funcionario1;
    private javax.swing.JTextField campo_cep_medico;
    private javax.swing.JTextField campo_cidade_cliente;
    private javax.swing.JTextField campo_cidade_funcionario;
    private javax.swing.JTextField campo_cidade_medico;
    private javax.swing.JTextField campo_cliente_consulta;
    private javax.swing.JTextField campo_cliente_exame;
    private javax.swing.JTextField campo_cod_animal;
    private javax.swing.JTextField campo_cod_cliente;
    private javax.swing.JTextField campo_cod_consulta;
    private javax.swing.JTextField campo_cod_exame;
    private javax.swing.JTextField campo_cod_fornecedor;
    private javax.swing.JTextField campo_cod_funcionario;
    private javax.swing.JTextField campo_cod_medico;
    private javax.swing.JTextField campo_cod_remedio;
    private javax.swing.JPasswordField campo_conf_senha_cliente;
    private javax.swing.JPasswordField campo_conf_senha_funcionario;
    private javax.swing.JPasswordField campo_conf_senha_medico;
    private javax.swing.JTextField campo_contato_fornecedor;
    private javax.swing.JTextField campo_cpf_cliente;
    private javax.swing.JTextField campo_cpf_funcionario;
    private javax.swing.JTextField campo_cpf_medico;
    private javax.swing.JTextField campo_crv_medico1;
    private javax.swing.JTextField campo_data_consulta;
    private javax.swing.JTextField campo_data_exame;
    private javax.swing.JTextField campo_data_nasc_cliente;
    private javax.swing.JTextField campo_data_nasc_funcionario;
    private javax.swing.JTextField campo_data_nasc_medico;
    private javax.swing.JTextField campo_descricao_remedio;
    private javax.swing.JTextField campo_dose_remedio;
    private javax.swing.JTextField campo_email_cliente;
    private javax.swing.JTextField campo_email_fornecedor;
    private javax.swing.JTextField campo_email_funcionario;
    private javax.swing.JTextField campo_email_medico;
    private javax.swing.JTextField campo_especialidade_medico;
    private javax.swing.JTextField campo_especie_animal;
    private javax.swing.JComboBox<String> campo_estado;
    private javax.swing.JComboBox<String> campo_estado_cliente;
    private javax.swing.JComboBox<String> campo_estado_medico;
    private javax.swing.JTextField campo_horario_medico;
    private javax.swing.JTextField campo_idade_animal;
    private javax.swing.JTextField campo_nome_animal;
    private javax.swing.JTextField campo_nome_animal_consulta;
    private javax.swing.JTextField campo_nome_empresa_fornecedor;
    private javax.swing.JTextField campo_nome_empresa_fornecedor1;
    private javax.swing.JTextField campo_nome_remedio;
    private javax.swing.JTextField campo_preco_consulta;
    private javax.swing.JTextField campo_preco_exame;
    private javax.swing.JTextField campo_preco_fornecedor;
    private javax.swing.JTextField campo_preco_remedio;
    private javax.swing.JTextField campo_quantidade;
    private javax.swing.JTextField campo_raca_animal;
    private javax.swing.JTextField campo_real_funcionario;
    private javax.swing.JTextField campo_real_medico;
    private javax.swing.JTextField campo_rua_cliente;
    private javax.swing.JTextField campo_rua_funcionario;
    private javax.swing.JTextField campo_rua_funcionario1;
    private javax.swing.JTextField campo_rua_medico;
    private javax.swing.JTextField campo_salario_funcionario;
    private javax.swing.JTextField campo_salario_medico;
    private javax.swing.JPasswordField campo_senha_cliente;
    private javax.swing.JPasswordField campo_senha_funcionario;
    private javax.swing.JTextField campo_senha_funcionarios;
    private javax.swing.JPasswordField campo_senha_medico;
    private javax.swing.JTextField campo_telefone_cliente;
    private javax.swing.JTextField campo_telefone_fornecedor;
    private javax.swing.JTextField campo_telefone_funcionario;
    private javax.swing.JTextField campo_telefone_medico;
    private javax.swing.JTextField campo_tipo_consulta;
    private javax.swing.JTextField campo_tipo_exame;
    private javax.swing.JTextField campo_usuario23;
    private javax.swing.JTextField campo_usuario29;
    private javax.swing.JTextField campo_usuario_cliente;
    private javax.swing.JTextField campo_usuario_funcionario;
    private javax.swing.JTextField campo_usuario_medico;
    private javax.swing.JTextField campo_validade_remedio;
    private javax.swing.ButtonGroup grupoExame;
    private javax.swing.ButtonGroup grupo_consulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private java.awt.Label label1;
    private javax.swing.JLabel lblData;
    private java.awt.Label lblUsuario;
    private java.awt.Label lblUsuario1;
    private javax.swing.JRadioButton radio_credito_consulta;
    private javax.swing.JRadioButton radio_credito_exames;
    private javax.swing.JRadioButton radio_feminino_animal;
    private javax.swing.JRadioButton radio_feminino_cliente;
    private javax.swing.JRadioButton radio_feminino_funcionario;
    private javax.swing.JRadioButton radio_feminino_medico;
    private javax.swing.JRadioButton radio_masculino_animal;
    private javax.swing.JRadioButton radio_masculino_cliente;
    private javax.swing.JRadioButton radio_masculino_funcionario;
    private javax.swing.JRadioButton radio_masculino_medico;
    private javax.swing.JRadioButton radio_vista_consulta;
    private javax.swing.JRadioButton radio_vista_exames;
    private javax.swing.ButtonGroup sexo_animal;
    private javax.swing.ButtonGroup sexo_cliente;
    private javax.swing.ButtonGroup sexo_funcionarios;
    // End of variables declaration//GEN-END:variables

}
