package br.com.trumah.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ItensDoacao {
	@Id@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String objetos;
	
	//Muitos Itens em uma doacao
	@ManyToOne(fetch = FetchType.EAGER) 
	@JoinColumn(name="idDoacao",insertable=true,updatable=true)
	private Doacao doacao;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getObjetos() {
		return objetos;
	}
	public void setObjetos(String objetos) {
		this.objetos = objetos;
	}
	public Doacao getDoacao() {
		return doacao;
	}
	public void setDoacao(Doacao doacao) {
		this.doacao = doacao;
	}
	

}
