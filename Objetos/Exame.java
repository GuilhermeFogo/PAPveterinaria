package Objetos;

import java.util.Date;
import java.util.Scanner;

public class Exame {
	
	private Medico veterinario;
	private Date data_exame;
	private String nome;
	private double preço; 
	private Animais animal;
	
	public Date getData_exame() {
		return data_exame;
	}
	public void setData_exame(Date data_exame) {
		this.data_exame = data_exame;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreço() {
		return preço;
	}
	public void setPreço(double preço) {
		this.preço = preço;
	}

	
	
	public void emitir_exame() {
		
	}
}
