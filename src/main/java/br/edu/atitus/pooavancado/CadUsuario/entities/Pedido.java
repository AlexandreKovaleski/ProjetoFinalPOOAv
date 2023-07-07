package br.edu.atitus.pooavancado.CadUsuario.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "pedidos")
public class pPedidos extends GenericEntity{

	private static final long serialVersionUID = 1L;

	@Column(length = 150, nullable = true)
	private String nome;
	
	
	public date getdate() {
		return data;
	}
	
	public void setdate(date data ) {
		this.data = data;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public static void alteraStatus(long id) {
	}
}