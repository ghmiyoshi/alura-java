# Servlet parte 1
Fundamentos da programação web Java

## Resumo
Foi desenvolvido um sistema de CRUD básico de empresas.

* Tecnologias, ferramentas e padrões utilizados:

	* IDE Eclipse;
	* Apache Tomcat;
	* Java Web;
	* JSTL e EL;
	* HTML5;
	* CSS3;
	* BootStrap.

## Conclusão
Este curso abordou os seguintes tópicos:

* Fundamentos da Web e a API de Servlets
	* Apache Tomcat ou apenas Tomcat é um servidor web em Java;
	* Tomcat entende o protocolo HTTP e roda por padrão no http://localhost:8080;
	* O projeto Java faz parte da URL, no nosso caso: http://localhost:8080/gerenciador;
	* Uma aplicação web Java pode ter páginas HTML;
	* Uma servlet é um objeto Java que podemos chamar a partir de uma requisição HTTP;
	* Para mapear a URL para uma servlet usamos a anotação @WebServlet;
	* Uma servlet deve estender a classe HttpServlet e sobrescrever um determinado método (por exemplo service).  
	
* Trabalhando com POST e GET
	* Escrever uma servlet que atende apenas GET ou POST;
	* Ler parâmetros da requisição dentro da servlet;
	* Criar um formulário HTML usando as tags form e input;
	* Enviando os dados pelo formulário através do POST;
	* Diferença entre GET e POST.

* Definindo o nosso modelo
	* Preparamos o modelo da nossa aplicação; 
	* O modelo ou domínio são as classes que representam o mundo real, aquilo que o cliente ou usuário da aplicação define;
	* Para descobrir quais são as classes e funcionalidades do modelo o analista de requisitos conversa com o cliente e documenta cada funcionalidade.

* Páginas dinâmicas com JSP
	* JSP significa Java Server Pages;
	* JSP é uma página automaticamente processada pelo Tomcat;
	* Para gerar HTML dinamicamente no JSP usamos Scriplets;
	* Um scriptlet <% %> é um código Java dentro do HTML;
	* Um scriptlet só funciona em uma página JSP;
	* Usamos o RequestDispatcher para chamar um JSP a partir da servlet;
	* Obtemos o RequestDispatcher a partir do HttpServletRequest;
	* Usamos a requisição para colocar ou pegar um atributo (setAttribute(.., ..) ou getAttribute(..)).

* JSTL e Expression Language
	* Expression Language (EL) é uma linguagem simples e limitada para imprimir o resultado de uma expressão;
 	* EL usa a sintaxe de ${ .. };
	* JSTL é a biblioteca padrão de tags;
	* JSTL não vem com Tomcat e precisamos copiar um JAR;
	* JSTL define 4 taglibs, as mais importanes são core e fmt;
	* A taglib core serve para controle de fluxo, fmt para formatação;
	* É preciso importar as taglib, core e fmt separadamente:
		* <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
		* <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
	* JSTL e EL devem ser usados em conjunto;
	* Vimos várias tags do core como c:if, c:forEach e c:url;
	* Vimos a tag fmt:formatDate;
	* JARs ficam na pasta WEB-INF/lib do projeto.
	
* Redirecionando o fluxo
	* O problema de reenviar uma requisição;
	* A diferença entre redirecionamento pelo cliente e servidor;
	* Para redirecionar pelo navegador usamos o método response.sendRedirect("endereço");
	* O código de resposta para redirecionamento HTTP é 30X (301 ou 302).

* Completando o CRUD
	* Como implementar a remoção de empresas;
	* Como implementar a edição de empresas;
	* Qual atributo correto devemos utilizar para identificação dos elementos (id);
	* Como definir um input escondido;
	* O que significa CRUD.

* Deploy da aplicação
	* A importância do web.xml;
	* O que é inversão de controle;
	* Como o Tomcat trabalha por debaixo dos panos;
	* Como inicializar o Tomcat na linha de comando;
	* Como gerar o WAR (Web ARchive);
	* Como fazemos o deploy da nossa aplicação.
