package br.com.trumah.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Grupo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long tipoGrupo;
	private String descricao;
	private Usuario[] usuario;
	
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
	public Usuario[] getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario[] usuario) {
		this.usuario = usuario;
	}
}
