package br.com.alura.gerenciador.acao;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.dao.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

public class MostraEmpresa implements Acao {

	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		System.out.println("Mostrando dados da empresa");

		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);

		Banco dao = new Banco();

		Empresa empresa = dao.buscaEmpresaPelaId(id);

		request.setAttribute("empresa", empresa);

		return "forward:formAlteraEmpresa.jsp";

	}

}
