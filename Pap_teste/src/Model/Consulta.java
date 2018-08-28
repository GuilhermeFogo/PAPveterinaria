package Model;

import java.util.Date;
import java.util.Scanner;

public class Consulta {
	private Date data_consulta;
	private Cliente cliente;
	private Medico veterinario;
	private Pagamento pagamento;
	private String tipo_consulta;
	private Medicamento remedio;
	
	public Date getData_consulta() {
		return data_consulta;
	}
	public void setData_consulta(Date data_consulta) {
		this.data_consulta = data_consulta;
	}
	public String getTipo_consulta() {
		return tipo_consulta;
	}
	public void setTipo_consulta(String tipo_consulta) {
		this.tipo_consulta = tipo_consulta;
	}
	
	public void Agendamento() {
		
	}
	
	

}
