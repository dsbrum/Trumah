package br.com.trumah.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Doacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)		
	private Long Numero;
	private Date dataPedido;
	private Date dataOferta;
	private Date dateEntrega;
	
	@ManyToOne(fetch = FetchType.EAGER) 
	@JoinColumn(name="idPj",insertable=true,updatable=true)
	private PessoaJuridica pessoaJuridica;
	
	@ManyToOne(fetch = FetchType.EAGER) 
	@JoinColumn(name="idPf",insertable=true,updatable=true)	
	private PessoaFisica pessoaFisica;
	
	@ManyToOne(fetch = FetchType.EAGER) 
	@JoinColumn(name="idStatus",insertable=true,updatable=true)	
	private StatusDoacoes statusDoacoes;
	
	
	@OneToMany(mappedBy="doacao", fetch = FetchType.LAZY)
	private List<Itens> itens;
	
	
	@OneToOne
	private Coordenada coordenada;
	
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
	public List<Itens> getItens() {
		return itens;
	}
	public void setItens(List<Itens> itens) {
		this.itens = itens;
	}
	public Coordenada getCoordenada() {
		return coordenada;
	}
	public void setCoordenada(Coordenada coordenada) {
		this.coordenada = coordenada;
	}

}
