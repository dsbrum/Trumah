package bckp.bean;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import bckp.dao.GenericDAOJPA;
import bckp.entity.Perfil;

public class PerfilBean {

	// private List<SelectItem> list;
	//private List<Perfil> perfils;

	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger(PerfilBean.class);
	Perfil perfil = new Perfil();


	private Long id;
	private GenericDAOJPA<Perfil> genericDAOJPA = new GenericDAOJPA<Perfil>();

	public String persist() {
		try {

			genericDAOJPA.incluir(perfil);
			newInstance();

			return "sucesso";

		} catch (Exception e) {
			e.printStackTrace();
			return "falhou";
		}
	}

	public String update() {
		try {
			genericDAOJPA.alterar(perfil);
			newInstance();

			return "sucesso";

		} catch (Exception e) {
			e.printStackTrace();
			return "falhou";
		}
	}

	public String remove() {
		try {

			genericDAOJPA.excluir(Perfil.class, id);
			newInstance();

			return "sucesso";

		} catch (Exception e) {
			e.printStackTrace();
			return "falhou";
		}
	}
	public List<Perfil> getList() {
		List<Perfil> list = new ArrayList<Perfil>();
		for (int i = 0; i < genericDAOJPA.obterTodos(Perfil.class).size(); i++) {
			perfil = genericDAOJPA
					.obterPorId(Perfil.class, Long.valueOf(i + 1));
			list.add(new Perfil(perfil.getId(), perfil.getCargo()));
		}

		return list;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}
	
	public void newInstance() {
		perfil = new Perfil();
	}

	public void setId(Long id) {
		this.id = id;

	}

	public Long getId() {
		return id;
	}

}
