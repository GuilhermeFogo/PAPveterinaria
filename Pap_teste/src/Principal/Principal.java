/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Controler.ControllerLoguin;
import View.telaLogin;

/**
 *
 * @author Pichau
 */
public class Principal {
    
    public static void main(String[] args) {
        telaLogin tela1 = new telaLogin();
        Controler.ControllerLoguin log = new ControllerLoguin(tela1);
        log.control();
        tela1.setVisible(true);
        
        
        
        
        /* talves no controler deva criara um metodo de peghar_camo_atualizado , isso para todos os btn_alterar_"algo"
        para realizart uma validação mais precisa.
        Deve fazer CRT+c no pegar_dadados e adicionar o campo de codigo. na classe controlelr de menu
        */
    
    }
    
}
