package br.com.alura.gerenciador.acao;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.dao.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

public class ListaEmpresas implements Acao {

	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		System.out.println("Listando empresas");

		Banco dao = new Banco();

		List<Empresa> listaEmpresas = dao.getEmpresas();

		request.setAttribute("empresas", listaEmpresas);

		return "forward:listaEmpresas.jsp";

	}

}
