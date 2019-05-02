package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.alura.gerenciador.acao.Acao;

//@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Usando o nome da URL para definir a ação do if
		// String url = request.getRequestURI();

		String paramAcao = request.getParameter("acao");
		String nomeDaClasse = "br.com.alura.gerenciador.acao." + paramAcao;

		System.out.println(nomeDaClasse);

		String nome;
		try {
			Class classe = Class.forName(nomeDaClasse);
			Acao acao = (Acao) classe.newInstance();
			nome = acao.executa(request, response);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			throw new ServletException(e);
		}

		String[] tipoEEndereco = nome.split(":");

		if (tipoEEndereco[0].equals("forward")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/" + tipoEEndereco[1]);
			rd.forward(request, response);
		} else {
			response.sendRedirect(tipoEEndereco[1]);
		}

//		if (url.equals(request.getContextPath() + "/listaEmpresas")) {
//			ListaEmpresas acao = new ListaEmpresas();
//			nome = acao.executa(request, response);
//		} else if (url.equals(request.getContextPath() + "/removeEmpresa")) {
//			RemoveEmpresa acao = new RemoveEmpresa();
//			nome = acao.executa(request, response);
//		} else if (url.equals(request.getContextPath() + "/mostraEmpresa")) {
//			MostraEmpresa acao = new MostraEmpresa();
//			nome = acao.executa(request, response);
//		} else if (url.equals(request.getContextPath() + "/alteraEmpresa")) {
//			AlteraEmpresa acao = new AlteraEmpresa();
//			nome = acao.executa(request, response);
//		} else if (url.equals(request.getContextPath() + "/novaEmpresa")) {
//			NovaEmpresa acao = new NovaEmpresa();
//			nome = acao.executa(request, response);
//		} else if(url.equals(request.getContextPath() + "/novaEmpresaForm")) {
//			NovaEmpresaForm acao = new NovaEmpresaForm();
//			nome = acao.executa(request, response);
//		}

	}

}
