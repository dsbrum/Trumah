package br.com.trumah.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)		
	private Long codigoPessoa;
	private String tipoPessoa;
	private String logradouro;
	private int numero;
	private String complemento;
	private String bairro;
	private String cep;
	private String telefone1;
	private String telefone2;
	private Usuario usuario;
	private Coordenada[] coordenada;
	
	public Long getCodigoPessoa() {
		return codigoPessoa;
	}
	public void setCodigoPessoa(Long codigoPessoa) {
		this.codigoPessoa = codigoPessoa;
	}
	public String getTipoPessoa() {
		return tipoPessoa;
	}
	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getTelefone1() {
		return telefone1;
	}
	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}
	public String getTelefone2() {
		return telefone2;
	}
	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Coordenada[] getCoordenada() {
		return coordenada;
	}
	public void setCoordenada(Coordenada[] coordenada) {
		this.coordenada = coordenada;
	}
	
	

}
