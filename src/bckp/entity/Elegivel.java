package bckp.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;


@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class Elegivel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String email;
	private String telefone;
	
	//um Elegivel tem várias doações
	@OneToMany(mappedBy="elegivel", fetch = FetchType.LAZY)
	private List<Doacao> doacaos;
	
	
	public Elegivel(Long id,String email,String telefone){
		this.id = id;
		this.email = email;
		this.telefone  = telefone;
	}

	public abstract void setId();
	public abstract void setEmail();
	public abstract void setTelefone();

	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public List<Doacao> getDoacaos() {
		return doacaos;
	}

	public void setDoacaos(List<Doacao> doacaos) {
		this.doacaos = doacaos;
	}
	
	
	
	
}
