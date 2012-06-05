package br.com.trumah.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class StatusDoacoes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigoStatusDoacoes;
	private String descricao;
	private Doacao[] doacao;
	
	
	public int getCodigoStatusDoacoes() {
		return codigoStatusDoacoes;
	}
	public void setCodigoStatusDoacoes(int codigoStatusDoacoes) {
		this.codigoStatusDoacoes = codigoStatusDoacoes;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Doacao[] getDoacao() {
		return doacao;
	}
	public void setDoacao(Doacao[] doacao) {
		this.doacao = doacao;
	}
}
