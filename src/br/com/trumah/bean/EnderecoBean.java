package br.com.trumah.bean;

import java.util.List;

import org.apache.log4j.Logger;

import br.com.trumah.dao.GenericDAOJPA;
import br.com.trumah.entity.Endereco;

public class EnderecoBean {

	private static final Logger log = Logger.getLogger(Endereco.class);
	//private EntityManager entityManager;
	private Endereco endereco = new Endereco();

	GenericDAOJPA<Endereco> genericDAOJPA = new GenericDAOJPA<Endereco>();
	
	private Long id;
	private List<Endereco> list;
	
	public String persist(){
		try{	
			genericDAOJPA.incluir(endereco);
			newInstance();
			list = null;
	
			return "sucesso";
	
		} catch (Exception e) {
			e.printStackTrace();
			return "falhou";
		}
	}

	public String update(){
		try {
			genericDAOJPA.alterar(endereco);
			newInstance();
			list = null;
	
			return "sucesso";
		} catch (Exception e) {
			e.printStackTrace();
			return "falhou";
		}
	}
	
	public String remove(){
		try {
			genericDAOJPA.excluir(Endereco.class, id);
			newInstance();
			list = null;
	
			return "sucesso";
		} catch (Exception e) {
			e.printStackTrace();
			return "falhou";
		}
	}

	public List<Endereco> getList() {
		 log.info(list);
		if (list == null) {
			list = genericDAOJPA.obterTodos(Endereco.class);

		}
		return list;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
		if (id != null) {
			endereco = genericDAOJPA.obterPorId(Endereco.class, id);
		}
	}

	public void newInstance() {
		endereco = new Endereco();
	}
}