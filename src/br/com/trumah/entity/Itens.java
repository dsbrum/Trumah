package br.com.trumah.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Itens {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long codigoItem;
	private String descricao;
	private Doacao doacao;
	
	public Long getCodigoItem() {
		return codigoItem;
	}
	public void setCodigoItem(Long codigoItem) {
		this.codigoItem = codigoItem;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Doacao getDoacao() {
		return doacao;
	}
	public void setDoacao(Doacao doacao) {
		this.doacao = doacao;
	}

}
