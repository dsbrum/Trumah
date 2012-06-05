package bckp.entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class PessoaFisica extends Elegivel {

	public PessoaFisica(Long id, String email, String telefone) {
		super(id, email, telefone);
	}
	private String cpf;
	private String rg;
	private String nome;

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
