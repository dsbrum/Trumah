package br.com.trumah.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Coordenada {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)		
	private Long idCoordenada;
	private Float latitude;
	private Float longetude;
	private String descricao;
	private Pessoa pessoa;
	
	public Long getIdCoordenada() {
		return idCoordenada;
	}
	public void setIdCoordenada(Long idCoordenada) {
		this.idCoordenada = idCoordenada;
	}
	public Float getLatitude() {
		return latitude;
	}
	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}
	public Float getLongetude() {
		return longetude;
	}
	public void setLongetude(Float longetude) {
		this.longetude = longetude;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

}
