package br.com.trumah.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PessoaJuridica extends Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String cnpj;
	private String inscricaoEstadual;
	private String razaoSocial;
	private String nomeFantasia;
	private Doacao[] doacao;
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}
	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public Doacao[] getDoacao() {
		return doacao;
	}
	public void setDoacao(Doacao[] doacao) {
		this.doacao = doacao;
	}
	
}
