/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import Controler.Helper.HelperCampos_loguin;
import Model.Pessoas;
import View.telaLogin;
import View.tela_geral;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Pichau
 */
public class ControllerLoguin {
    private telaLogin view;
    private ActionListener actionListener;

    public ControllerLoguin(telaLogin view) {
        this.view = view;
    }
    
    // criando o controle
    public void control() {
        actionListener = new ActionListener() {
            //se algum evento de clicar o botão acontecer:
            @Override
            public void actionPerformed(ActionEvent ev) {
                //verificar se é o botão limpar
                if (ev.getSource() == view.getBtnEntrar()) {
                    loguin_controller();
                }
                  
            }
        };
       view.getBtnEntrar().addActionListener(actionListener);
    } 
    
    
    
    public  void loguin_controller(){
        HelperCampos_loguin loguin = new HelperCampos_loguin();
        loguin.setCampo_usuario(this.view.getCampo_usuario().getText());
        loguin.setCampo_pass(this.view.getCampo_senha().getText());
        //tela_geral.usuario = "gui";
        boolean verifica = loguin.loguin();
        //boolean verifica = true;
        if (verifica == true) {
            tela_geral teal = new tela_geral();
            ControllerTela_menu  controllerTela_menu = new ControllerTela_menu(teal);
            controllerTela_menu.data();
            controllerTela_menu.lable_usu(loguin.getCampo_usuario());
            controllerTela_menu.control();
            teal.setVisible(true);
            this.view.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null, "Erro ao entrar, tente novamente");
        }
    }
    
    
    
}
