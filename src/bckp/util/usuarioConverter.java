package bckp.util;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import bckp.entity.Usuario;

public class usuarioConverter implements Converter {
	

	    public Object getAsObject(FacesContext facesContext, UIComponent uicomp, String value) {
	    	Usuario usuario = new Usuario();
	    	usuario.setNome(value);
	    	return usuario;
	    	
	    }
	    public String getAsString(FacesContext facesContext, UIComponent uicomp, Object entity) {
	    	if(entity != null && entity instanceof Usuario){
	    		return ((Usuario)entity).getNome();
	    	}
	    	return "";
	    }

}