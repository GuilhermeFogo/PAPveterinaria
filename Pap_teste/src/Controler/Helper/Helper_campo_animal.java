/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler.Helper;

import Model.Animais;

/**
 *
 * @author Pichau
 */
public class Helper_campo_animal {
    private String campo_raca;
    private String campo_nome_animal;
    private String campo_idade;
    private String campo_sexo;
    private String campo_especie;
    private String id_animal;

    
    
    
    public  boolean pegar_campo_animal(Animais animal){
        if (campo_especie.equals("")|| campo_especie.isEmpty()) {
            return  false;
        }else{
            if (campo_idade.equals("")|| campo_idade.isEmpty()) {
                return false;
            }else{
                if (campo_raca.isEmpty()|| campo_raca.equals("")) {
                    return  false;
                }else{
                    if (campo_sexo.isEmpty()|| campo_sexo.equals("")) {
                        return false;
                    }else{
                        animal.setEspecie(campo_especie);
                        animal.setIdade(campo_idade);
                        animal.setNome_animal(campo_nome_animal);
                        animal.setSexo(campo_sexo);
                        animal.setRaca(campo_raca);
                        return true;
                    }
                }
                    
            }
        }
    }
    
    public boolean pega_campo_del(Animais animal){
        if (this.id_animal.isEmpty()|| this.id_animal.equals("")) {
            return false;
        }else{
            animal.setId_animal(id_animal);
            return  true;
        }
    }
    
    
    
    public  boolean atualiza_campo_animal(Animais animal){
        if (campo_especie.equals("")|| campo_especie.isEmpty()) {
            return  false;
        }else{
            if (campo_idade.equals("")|| campo_idade.isEmpty()) {
                return false;
            }else{
                if (campo_raca.isEmpty()|| campo_raca.equals("")) {
                    return  false;
                }else{
                    if (campo_sexo.isEmpty()|| campo_sexo.equals("") || this.id_animal.isEmpty()) {
                        return false;
                    }else{
                        animal.setEspecie(campo_especie);
                        animal.setIdade(campo_idade);
                        animal.setNome_animal(campo_nome_animal);
                        animal.setSexo(campo_sexo);
                        animal.setRaca(campo_raca);
                        animal.setId_animal(id_animal);
                        return true;
                    }
                }
                    
            }
        }
    }
    
    
    
    public String getCampo_especie() {
        return campo_especie;
    }

    public String getCampo_idade() {
        return campo_idade;
    }

    public String getCampo_nome_animal() {
        return campo_nome_animal;
    }

    public String getCampo_raca() {
        return campo_raca;
    }

    public String getCampo_sexo() {
        return campo_sexo;
    }

    public void setCampo_especie(String campo_especie) {
        this.campo_especie = campo_especie;
    }

    public void setCampo_idade(String campo_idade) {
        this.campo_idade = campo_idade;
    }

    public void setCampo_nome_animal(String campo_nome_animal) {
        this.campo_nome_animal = campo_nome_animal;
    }

    public void setCampo_raca(String campo_raca) {
        this.campo_raca = campo_raca;
    }

    public void setCampo_sexo(String campo_sexo) {
        this.campo_sexo = campo_sexo;
    }

    public String getId_animal() {
        return id_animal;
    }

    public void setId_animal(String id_animal) {
        this.id_animal = id_animal;
    }
    
    
           
    
}
