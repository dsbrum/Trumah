<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<f:view>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Tela Inicial</title>
</head>
<body>
    <h:form>
        <div align="center">
            <h:panelGrid columns="2">
                 
              <h:outputLink value="cadastrarEndereco.jsf"><f:verbatim>Cadastro de Endereços</f:verbatim></h:outputLink>
              <br />
              <h:outputLink value="cadastrarUsuario.jsf"><f:verbatim>Cadastro de Usuários</f:verbatim></h:outputLink>        

			  
            </h:panelGrid>
        </div>
 
        <br />
        <hr width="50%"/>
        <br />
    </h:form>
</body>
</html>
</f:view>