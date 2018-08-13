package Objetos;

import java.util.Scanner;

import Principal.Veterianaria_main;

public class Pagamento {
	private Cliente ciente;
	private double preco;
	private String tipo_pagamento;
	private Funcionario funcioanrio;
	private Medico veterinario;
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getTipo_pagamento() {
		return tipo_pagamento;
	}
	public void setTipo_pagamento(String tipo_pagamento) {
		this.tipo_pagamento = tipo_pagamento;
	}
	
	
	public void Pagar() {
		
	}
	
	public double validar_pagamento() {
		return 0;
	}
	
	

}
