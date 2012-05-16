package br.com.trumah.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;


@Entity
@PrimaryKeyJoinColumn(name="id")
public class PessoaJuridica extends Elegivel {
	public PessoaJuridica(Long id, String email, String telefone) {
		super(id, email, telefone);
	}
	private String cnpj;
	private String razaoSocial;
	private String nomeFantasia;
	private Date dtAbertura;
	


	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
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

	public Date getDtAbertura() {
		return dtAbertura;
	}

	public void setDtAbertura(Date dtAbertura) {
		this.dtAbertura = dtAbertura;
	}

	@Override
	public void setId() {
		super.setId(getId());
		
	}

	@Override
	public void setEmail() {
		super.setEmail(getEmail());
		
	}

	@Override
	public void setTelefone() {
		super.setTelefone(getTelefone());
		
	}
	
	
	
	

}
