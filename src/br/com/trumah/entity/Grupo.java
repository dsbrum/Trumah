package br.com.trumah.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Grupo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long tipoGrupo;
	private String descricao;

	@OneToMany(mappedBy="grupo", fetch = FetchType.LAZY)
	private List<Usuario> usuarios;
	
	public Long getTipoGrupo() {
		return tipoGrupo;
	}
	public void setTipoGrupo(Long tipoGrupo) {
		this.tipoGrupo = tipoGrupo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public List<Usuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

}
