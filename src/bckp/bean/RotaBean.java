package bckp.bean;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.model.DataModel;
import javax.faces.model.SelectItem;

import org.apache.log4j.Logger;

import bckp.dao.GenericDAOJPA;
import bckp.entity.Doacao;
import bckp.entity.Rota;

public class RotaBean {
	
	private static final Logger log = Logger.getLogger(RotaBean.class);

	private Rota rota = new Rota();
	private Doacao doacao = new Doacao();
	private Long id;
	private GenericDAOJPA<Rota> genericDAOJPA = new GenericDAOJPA<Rota>();
	private DataModel doacoes;
	private Rota selectedRota;
	
	
	public String persist() {
		try {

			if (rota.getId() != 0) {
				genericDAOJPA.incluir(rota);
				newInstance();

				return "sucesso";
			} else {
				return "falhou";
			}

		} catch (Exception e) {
			e.printStackTrace();
			return "falhou";
		}
	}

	public String update() {
		try {
			genericDAOJPA.alterar(rota);
			newInstance();

			return "sucesso";

		} catch (Exception e) {
			e.printStackTrace();
			return "falhou";
		}
	}

	public String remove() {
		try {

			genericDAOJPA.excluir(Rota.class, id);
			newInstance();

			return "sucesso";

		} catch (Exception e) {
			e.printStackTrace();
			return "falhou";
		}
	}

	public Rota getRota() {
		return rota;
	}

	public void setRota(Rota rota) {
		this.rota = rota;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public void newInstance() {
		rota = new Rota();
	}
	public String prepararAlterarDoacoes(){
		doacao = (Doacao) doacoes.getRowData();
		
		return "";
	}
/*	public List<Rota> getList(){
		List<Rota> list = new ArrayList<Rota>();
		for(int i=0;i<genericDAOJPA.obterTodos(Rota.class).size(); i++){
			rota = genericDAOJPA.obterPorId(Rota.class, Long.valueOf(i + 1));
			list.add(new Rota(rota.getId(),rota.getDescricao()));
			
		}
		
		return list;
		
	}*/
	public List<SelectItem> getList(){
		List<SelectItem> list = new ArrayList<SelectItem>();
		list.add(new SelectItem(null, "Inclua a Rota"));
		for(int i=0;i<genericDAOJPA.obterTodos(Rota.class).size(); i++){
			rota = genericDAOJPA.obterPorId(Rota.class, Long.valueOf(i + 1));
			System.out.println(rota.getId());
			list.add(new SelectItem(rota, rota.getId()+": "+rota.getDescricao()));
			
		}
		return list;
	}
	public List<Rota> getRotas(){
		List<Rota> rotas = new ArrayList<Rota>();
		for(int i=0;i<genericDAOJPA.obterTodos(Rota.class).size(); i++){
			rota = genericDAOJPA.obterPorId(Rota.class, Long.valueOf(i + 1));
			rotas.add(rota);
		}
		return rotas;
	}

	public Rota getSelectedRota() {
		return selectedRota;
	}

	public void setSelectedRota(Rota selectedRota) throws IOException {
		/*
		 * Executar aqui a transição de pagina passando o parametro
		 * 
		 * */
		this.selectedRota = selectedRota;
		FacesContext faces = FacesContext.getCurrentInstance();  
		ExternalContext context = faces.getExternalContext();  
		context.redirect("\\Trumah\\doacaoItens.jsf"); 
	}

}
