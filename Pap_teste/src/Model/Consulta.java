package Model;

public class Consulta extends Pagamento{
	private String data_consulta;
        private String id;
	private Cliente cliente;
	private Medico veterinario;
	private String tipo_consulta;
	public String getData_consulta() {
		return data_consulta;
	}
	public void setData_consulta(String data_consulta) {
		this.data_consulta = data_consulta;
	}
	public String getTipo_consulta() {
		return tipo_consulta;
	}
	public void setTipo_consulta(String tipo_consulta) {
		this.tipo_consulta = tipo_consulta;
	}
	

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        Cliente cliente = new Cliente();
        Animais animal = new Animais();
        return getId() +" "+ getTipo_pagamento()+" " + getData_consulta()+" "+ getTipo_consulta()+
                " "+ getPreco() +" " + cliente.getNome()+" "+ animal.getNome_animal();
    }
        
    
	
	

}
