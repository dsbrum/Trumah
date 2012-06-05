package br.com.trumah.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class RotaTrackCidade {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sequencia;
	//Muitas tracks tem uma cidade
	@ManyToOne(fetch = FetchType.EAGER) 
	@JoinColumn(name="idCidade",insertable=true,updatable=true)
	private Cidade cidade;
	@ManyToOne(fetch = FetchType.EAGER) 
	@JoinColumn(name="idRota",insertable=true,updatable=true)	
	private Rota rota;
	public int getSequencia() {
		return sequencia;
	}
	public void setSequencia(int sequencia) {
		this.sequencia = sequencia;
	}
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	public Rota getRota() {
		return rota;
	}
	public void setRota(Rota rota) {
		this.rota = rota;
	}

}
