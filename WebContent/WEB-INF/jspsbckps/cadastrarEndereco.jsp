<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<f:view>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro de endereco</title>
</head>
<body>
    <h:form>
        <div align="center">
            <h:panelGrid columns="2">
                <h:outputLabel value="Logradouro" for="logradouro" />
                <h:inputText id="logradouro" value="#{enderecoBean.endereco.logradouro}" />
                 
                <h:outputLabel value="Numero" for="numero" />
                <h:inputText id="numero" value="#{enderecoBean.endereco.numero}" />
 
                <h:outputLabel value="Bairro" for="bairro" />
                <h:inputText id="bairro" value="#{enderecoBean.endereco.bairro}" />

                 
                <h:outputLabel value="Complemento" for="complemento" />
                <h:inputText id="complemento" value="#{enderecoBean.endereco.complemento}" />
 
                <h:outputLabel value="Cep" for="cep" />
                <h:inputText id="cep" value="#{enderecoBean.endereco.cep}" />
  
                <h:outputLabel value="Princial" for="principal" />
                <h:selectOneRadio id="principal" value="#{enderecoBean.endereco.principal}">
                    <f:selectItem itemLabel="Sim" itemValue="true"/>
                    <f:selectItem itemLabel="Não" itemValue="false"/>
                </h:selectOneRadio>
 

            </h:panelGrid>
 
            <h:commandButton value="Cadastrar" action="#{enderecoBean.persist}" />
        </div>
 
        <br />
        <hr width="50%"/>
        <br />
 
        <div align="center">
            <h:dataTable value="#{enderecoBean.list}" var="_endereco" rendered="#{enderecoBean.list != null}" width="50%" border="1">
                <h:column>
                    <f:facet name="header">
                        <h:outputText value="Logradouro" />
                    </f:facet>
                    <h:outputText value="#{_endereco.logradouro}" />
                </h:column>
                <h:column>
                    <f:facet name="header">
                        <h:outputText value="Numero" />
                    </f:facet>
                    <h:outputText value="#{_endereco.numero}" />
                </h:column> 
                <h:column>
                    <f:facet name="header">
                        <h:outputText value="Bairro" />
                    </f:facet>
                    <h:outputText value="#{_endereco.bairro}" />
                </h:column>
                <h:column>
                    <f:facet name="header">
                        <h:outputText value="Complemento" />
                    </f:facet>
                    <h:outputText value="#{_endereco.complemento}" />
                </h:column>
                <h:column>
                    <f:facet name="header">
                        <h:outputText value="Cep" />
                    </f:facet>
                    <h:outputText value="#{_endereco.cep}" />
                </h:column>                                                
                <h:column>
                    <f:facet name="header">
                        <h:outputText value="Principal" />
                    </f:facet>
                    <h:outputText value="#{_endereco.principal}" />
                </h:column> 
                <h:column>
                    <f:facet name="header">
                        <h:outputText value="Opções" />
                    </f:facet>
 
                    <h:commandLink value="Editar" action="editar">
                        <f:setPropertyActionListener value="#{_endereco.id}" target="#{enderecoBean.id}"/>
                    </h:commandLink>
 
                    <h:commandLink value="Remover" action="#{enderecoBean.remove}">
                        <f:setPropertyActionListener value="#{_endereco.id}" target="#{enderecoBean.id}"/>
                    </h:commandLink>
                </h:column>
            </h:dataTable>
        </div>
    </h:form>
</body>
</html>
</f:view>