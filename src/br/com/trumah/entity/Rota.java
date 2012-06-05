package br.com.trumah.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Rota {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRota;
	private String descricao;


	
	public int getIdRota() {
		return idRota;
	}
	public void setIdRota(int idRota) {
		this.idRota = idRota;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


}
