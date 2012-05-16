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



@Entity
public class Doacao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date dtPedido;
	private Date dtOferta;
	private Date dtEntrega;
	
	//uma Rota tem várias doações
	@OneToMany(mappedBy="doacao", fetch = FetchType.LAZY)
	private List<ItensDoacao> itensDoacao;

	
	//Muitas doações tem uma rota
	@ManyToOne(fetch = FetchType.EAGER) 
	@JoinColumn(name="idRota",insertable=true,updatable=true)
	private Rota rota;
	
	
	

	public Rota getRota() {
		return rota;
	}
	public void setRota(Rota rota) {
		this.rota = rota;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDtPedido() {
		return dtPedido;
	}
	public void setDtPedido(Date dtPedido) {
		this.dtPedido = dtPedido;
	}
	public Date getDtOferta() {
		return dtOferta;
	}
	public void setDtOferta(Date dtOferta) {
		this.dtOferta = dtOferta;
	}
	public Date getDtEntrega() {
		return dtEntrega;
	}
	public void setDtEntrega(Date dtEntrega) {
		this.dtEntrega = dtEntrega;
	}
	public List<ItensDoacao> getItensDoacao() {
		return itensDoacao;
	}
	public void setItensDoacao(List<ItensDoacao> itensDoacao) {
		this.itensDoacao = itensDoacao;
	}
	
	

}
