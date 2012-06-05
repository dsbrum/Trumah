package br.com.trumah.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class RotaTrackCidade {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sequancia;
	private Cidade cidade;
	private Rota rota;
	public int getSequancia() {
		return sequancia;
	}
	public void setSequancia(int sequancia) {
		this.sequancia = sequancia;
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
