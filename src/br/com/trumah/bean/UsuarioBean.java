package br.com.trumah.bean;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.persistence.Query;

import org.apache.log4j.Logger;

import br.com.trumah.dao.GenericDAOJPA;
import br.com.trumah.entity.Usuario;

public class UsuarioBean {

	private static final Logger log = Logger.getLogger(UsuarioBean.class);

	private Usuario usuario = new Usuario();
	private Long id;
	private GenericDAOJPA<Usuario> genericDAOJPA = new GenericDAOJPA<Usuario>();

	private List<Usuario> list;

	public String persist() {
		try {

			if (usuario.getPerfil().getId() != 0) {
				genericDAOJPA.incluir(usuario);
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
			genericDAOJPA.alterar(usuario);
			newInstance();

			return "sucesso";

		} catch (Exception e) {
			e.printStackTrace();
			return "falhou";
		}
	}

	public String remove() {
		try {

			genericDAOJPA.excluir(Usuario.class, id);
			newInstance();

			return "sucesso";

		} catch (Exception e) {
			e.printStackTrace();
			return "falhou";
		}
	}

	public List<Usuario> getList() {
		log.info(list);
		if (list == null) {
			list = genericDAOJPA.obterTodos(Usuario.class);
		}
		return list;
	}

	public String loggin() {
		try {

			FacesMessage msg = null;
			
			Usuario usuariologgin = new Usuario();

			Query q = genericDAOJPA.getEntityManager().createNamedQuery("Usuario.obterPorLoggin");
			q.setParameter("logginParam", usuario.getLogin());
			usuariologgin = (Usuario) q.getSingleResult();

			if (usuariologgin.getLogin().equalsIgnoreCase(usuario.getLogin())&& usuariologgin.getSenha().equals(usuario.getSenha())) {
				FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", usuariologgin);
				return "sucesso";
			}else{
				msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error Loggin/Senha", "Login ou senha inválida");
				 FacesContext.getCurrentInstance().addMessage("username", msg);
				return "falhou";
			}
		} catch (Exception e) {
			e.printStackTrace();
			return "falhou";
		}

	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public void setId(Long id) {
		this.id = id;
		if (id != null) {
			usuario = genericDAOJPA.getEntityManager().find(Usuario.class, id);
		}
	}

	public Long getId() {
		return id;
	}

	public void newInstance() {
		usuario = new Usuario();
	}
}
