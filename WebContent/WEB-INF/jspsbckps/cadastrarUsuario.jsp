<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<f:view>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro de Usuarios</title>
</head>
<body>
    <h:form>
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
 
            <h:commandButton value="Cadastrar" action="#{usuarioBean.persist}" style="max-width: 10px; min-width: 10px"/>
        </div>
 
        <br />
        <hr width="50%"/>
        <br />
 
        <div align="center">
            <h:dataTable value="#{usuarioBean.list}" var="_usuario" rendered="#{usuarioBean.list != null}" width="50%" border="1">
                  <h:column>
                    <f:facet name="header">
                        <h:outputText value="ID" />
                    </f:facet>
                    <h:outputText value="#{_usuario.id}" />
                </h:column>
                <h:column>
                    <f:facet name="header">
                        <h:outputText value="Nome" />
                    </f:facet>
                    <h:outputText value="#{_usuario.nome}" />
                </h:column>
                <h:column>
                    <f:facet name="header">
                        <h:outputText value="Login" />
                    </f:facet>
                    <h:outputText value="#{_usuario.login}" />
                </h:column> 
                <h:column>
                    <f:facet name="header">
                        <h:outputText value="Perfil" />
                    </f:facet>
                    <h:outputText value="#{_usuario.perfil.cargo}" />
                </h:column>
                <h:column>
                    <f:facet name="header">
                        <h:outputText value="Opções" />
                    </f:facet>
 
 
 					<h:commandLink value="Editar" action="editar" >
 					    <f:setPropertyActionListener value="#{_usuario.id}" target="#{usuarioBean.id}"/>
 					</h:commandLink>
 					
 
                    <h:commandLink value="Remover" action="#{usuarioBean.remove}">
                        <f:setPropertyActionListener value="#{_usuario.id}" target="#{usuarioBean.id}"/>
                    </h:commandLink>
                </h:column>
            </h:dataTable>
        </div>
        <h:outputLink value="index.jsf"><f:verbatim>Index</f:verbatim></h:outputLink>
    </h:form>
</body>
</html>
</f:view>