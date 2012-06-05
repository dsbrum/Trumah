package bckp.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Rota {
	@Id@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	//uma Rota tem várias doações
	@OneToMany(mappedBy="rota", fetch = FetchType.LAZY)
	private List<Doacao> doacaos;
	
	//uma Rota tem vários endereços
	@OneToMany(mappedBy="rota", fetch = FetchType.LAZY)
	private List<Endereco> enderecos;
	
	private String descricao;
	
	
	public Rota(Long id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}
	public Rota() {
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<Endereco> getEnderecos() {
		return enderecos;
	}
	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}
	public List<Doacao> getDoacaos() {
		return doacaos;
	}
	public void setDoacaos(List<Doacao> doacaos) {
		this.doacaos = doacaos;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	

	
	

}
