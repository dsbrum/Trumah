package br.com.trumah.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Cidade {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private String nome;
	private Estado estado;
	private RotaTrackCidade rotaTrackCidade;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public RotaTrackCidade getRotaTrackCidade() {
		return rotaTrackCidade;
	}
	public void setRotaTrackCidade(RotaTrackCidade rotaTrackCidade) {
		this.rotaTrackCidade = rotaTrackCidade;
	}
	
}
