package bckp.bean;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import bckp.dao.GenericDAOJPA;
import bckp.entity.Doacao;
import bckp.entity.ItensDoacao;

public class DoacaoBean {
	
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger(DoacaoBean.class);
	
	private Doacao doacao = new Doacao();
	private ItensDoacao itensDoacao = new ItensDoacao();
	private Long id;
	private GenericDAOJPA<Doacao> genericDAOJPA = new GenericDAOJPA<Doacao>();

	
	public String persist() {
		try {

				genericDAOJPA.incluir(doacao);
				newInstance();

				return "sucesso";

		} catch (Exception e) {
			e.printStackTrace();
			return "falhou";
		}
	}

	public String update() {
		try {
			genericDAOJPA.alterar(doacao);
			newInstance();

			return "sucesso";

		} catch (Exception e) {
			e.printStackTrace();
			return "falhou";
		}
	}

	public String remove() {
		try {

			genericDAOJPA.excluir(Doacao.class, id);
			newInstance();

			return "sucesso";

		} catch (Exception e) {
			e.printStackTrace();
			return "falhou";
		}
	}
	public void newInstance() {
		doacao = new Doacao();
	}
	public List<Doacao> getList(){
		List<Doacao> list = new ArrayList<Doacao>();
		for(int i=0;i<genericDAOJPA.obterTodos(Doacao.class).size(); i++){
			doacao = genericDAOJPA.obterPorId(Doacao.class, Long.valueOf(i + 1));
			list.add(new Doacao());
		}
		return list;
	}

/*	public List<SelectItem> getNList() {
		List<SelectItem> lista = new ArrayList<SelectItem>(); 
		for(int i=0;i<genericDAOJPA.obterTodos(Doacao.class).size(); i++){
			doacao = genericDAOJPA.obterPorId(Doacao.class, Long.valueOf(i + 1));
			lista.add(new SelectItem(doacao.getId(), doacao.get));
		}
		
	}*/
	
	public Doacao getDoacao() {
		return doacao;
	}

	public void setDoacao(Doacao doacao) {
		this.doacao = doacao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

}
