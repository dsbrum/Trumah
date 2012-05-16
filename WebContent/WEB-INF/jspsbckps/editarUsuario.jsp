<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<f:view>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Editando Registro</title>
</head>
<body>
    <h:form>
        <h:inputHidden value="#{usuarioBean.usuario.id}" />
 
        <div align="center">
            <h:panelGrid columns="2">
                <h:outputLabel value="Nome" for="nome" />
                <h:inputText id="nome" value="#{usuarioBean.usuario.nome}" />
                 
                <h:outputLabel value="Login" for="login" />
                <h:inputText id="login" value="#{usuarioBean.usuario.login}" />
 
                <h:outputLabel value="Senha" for="senha" />
                <h:inputSecret id="senha" value="#{usuarioBean.usuario.senha}" />
  
                <h:outputLabel value="Perfil" for="perfil" />
				<h:selectOneMenu value="#{usuarioBean.usuario.perfil}" >
					<f:converter converterId="util.PerfilConverter"/>
					<f:selectItems value="#{perfilBean.list}" />
				</h:selectOneMenu>
            </h:panelGrid>
 
            <h:commandButton value="Atualizar" action="#{usuarioBean.update}" />
        </div>
    </h:form>
</body>
</html>
</f:view>