package bckp.bean;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import bckp.dao.GenericDAOJPA;
import bckp.entity.PessoaFisica;

public class PFBean {


	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger(PFBean.class);
	

	private Long id;
	private GenericDAOJPA<PessoaFisica> genericDAOJPA = new GenericDAOJPA<PessoaFisica>();
	private Long idPfisica;
	private String email;
	private String telefone;

	
	
	PessoaFisica pessoaFisica = new PessoaFisica(idPfisica, email, telefone);

	public String persist() {
		try {

			genericDAOJPA.incluir(pessoaFisica);
			newInstance();

			return "sucesso";

		} catch (Exception e) {
			e.printStackTrace();
			return "falhou";
		}
	}

	public String update() {
		try {
			genericDAOJPA.alterar(pessoaFisica);
			newInstance();

			return "sucesso";

		} catch (Exception e) {
			e.printStackTrace();
			return "falhou";
		}
	}

	public String remove() {
		try {

			genericDAOJPA.excluir(PessoaFisica.class, id);
			newInstance();

			return "sucesso";

		} catch (Exception e) {
			e.printStackTrace();
			return "falhou";
		}
	}
	public List<PessoaFisica> getList() {
		List<PessoaFisica> list = new ArrayList<PessoaFisica>();
		for (int i = 0; i < genericDAOJPA.obterTodos(PessoaFisica.class).size(); i++) {
			pessoaFisica = genericDAOJPA
					.obterPorId(PessoaFisica.class, Long.valueOf(i + 1));
			//list.add(new Perfil(pessoaFisica.getId(), pessoaFisica.getCargo()));
		}

		return list;
	}

	public PessoaFisica getPerfil() {
		return pessoaFisica;
	}

	public void setPerfil(PessoaFisica pessoaFisica) {
		this.pessoaFisica = pessoaFisica;
	}
	
	public void newInstance() {
		pessoaFisica = new PessoaFisica(id, email, email);
	}

	public void setId(Long id) {
		this.id = id;

	}

	public Long getId() {
		return id;
	}

}
