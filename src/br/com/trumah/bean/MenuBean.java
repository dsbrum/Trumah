package br.com.trumah.bean;

import javax.faces.context.FacesContext;

import org.primefaces.component.menuitem.MenuItem;
import org.primefaces.component.submenu.Submenu;
import org.primefaces.model.DefaultMenuModel;
import org.primefaces.model.MenuModel;

import br.com.trumah.entity.Usuario;

public class MenuBean {

	private MenuModel model;

	public MenuBean() {
		model = new DefaultMenuModel();
		
		Usuario usuario = new Usuario();
		
		usuario = (Usuario)FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario");
 
		if(usuario.getPerfil().getId()==5){
			// First submenu
			Submenu submenu = new Submenu();
			submenu.setLabel("Administra��o de Usu�rios");

			MenuItem item = new MenuItem();
			item.setValue("Criar Usu�rio");
			item.setUrl("./cadastrarUsuario.jsf");
			submenu.getChildren().add(item);
			
			item = new MenuItem();
			item.setValue("Criar Perfil");
			item.setUrl("./cadastrarPerfil.jsf");
			submenu.getChildren().add(item);

			model.addSubmenu(submenu);
			
			// Second submenu
			submenu = new Submenu();
			submenu.setLabel("Dynamic Submenu 2");

			item = new MenuItem();
			item.setValue("Dynamic Menuitem 2.1");
			item.setUrl("#");
			submenu.getChildren().add(item);

			item = new MenuItem();
			item.setValue("Dynamic Menuitem 2.2");
			item.setUrl("#");
			submenu.getChildren().add(item);

			model.addSubmenu(submenu);
		}else{
			// First submenu
			Submenu submenu = new Submenu();
			submenu.setLabel("Teste de Usu�rios");
			
			MenuItem item = new MenuItem();
			item.setValue("Criar Usu�rio");
			item.setUrl("./cadastrarUsuario.jsf");
			submenu.getChildren().add(item);
			
			item = new MenuItem();
			item.setValue("Criar Perfil");
			item.setUrl("./cadastrarPerfil.jsf");
			submenu.getChildren().add(item);

			model.addSubmenu(submenu);
			
			// Second submenu
			submenu = new Submenu();
			submenu.setLabel("Dynamic Submenu 2");

			item = new MenuItem();
			item.setValue("Dynamic Menuitem 2.1");
			item.setUrl("#");
			submenu.getChildren().add(item);

			item = new MenuItem();
			item.setValue("Dynamic Menuitem 2.2");
			item.setUrl("#");
			submenu.getChildren().add(item);

			model.addSubmenu(submenu);
		}
		
	


	

	}

	public MenuModel getModel() {
		return model;
	}
}
