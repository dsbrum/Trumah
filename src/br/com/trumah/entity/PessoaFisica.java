package br.com.trumah.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PessoaFisica extends Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private String cpf;
	private String nome;
	private String rg;
	private Date dataNascimento;
	private Doacao[] doacao;
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Doacao[] getDoacao() {
		return doacao;
	}
	public void setDoacao(Doacao[] doacao) {
		this.doacao = doacao;
	}
	
}
