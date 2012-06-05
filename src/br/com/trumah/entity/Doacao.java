package br.com.trumah.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Doacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)		
	private Long Numero;
	private Date dataPedido;
	private Date dataOferta;
	private Date dateEntrega;
	private PessoaJuridica pessoaJuridica;
	private PessoaFisica pessoaFisica;
	private StatusDoacoes statusDoacoes;
	private Itens[] itens;
	private Rota rota;
	public Long getNumero() {
		return Numero;
	}
	public void setNumero(Long numero) {
		Numero = numero;
	}
	public Date getDataPedido() {
		return dataPedido;
	}
	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}
	public Date getDataOferta() {
		return dataOferta;
	}
	public void setDataOferta(Date dataOferta) {
		this.dataOferta = dataOferta;
	}
	public Date getDateEntrega() {
		return dateEntrega;
	}
	public void setDateEntrega(Date dateEntrega) {
		this.dateEntrega = dateEntrega;
	}
	public PessoaJuridica getPessoaJuridica() {
		return pessoaJuridica;
	}
	public void setPessoaJuridica(PessoaJuridica pessoaJuridica) {
		this.pessoaJuridica = pessoaJuridica;
	}
	public PessoaFisica getPessoaFisica() {
		return pessoaFisica;
	}
	public void setPessoaFisica(PessoaFisica pessoaFisica) {
		this.pessoaFisica = pessoaFisica;
	}
	public StatusDoacoes getStatusDoacoes() {
		return statusDoacoes;
	}
	public void setStatusDoacoes(StatusDoacoes statusDoacoes) {
		this.statusDoacoes = statusDoacoes;
	}
	public Itens[] getItens() {
		return itens;
	}
	public void setItens(Itens[] itens) {
		this.itens = itens;
	}
	public Rota getRota() {
		return rota;
	}
	public void setRota(Rota rota) {
		this.rota = rota;
	}
}
