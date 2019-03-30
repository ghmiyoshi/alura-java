package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.dao.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

@WebServlet("/alteraEmpresa")
public class AlteraEmpresaServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);

		String paramNome = request.getParameter("nome");
		String paramData = request.getParameter("data");

		Date dataAbertura = null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			dataAbertura = sdf.parse(paramData);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		Banco dao = new Banco();
		Empresa empresa = dao.buscaEmpresaPelaId(id);
		empresa.setNome(paramNome);
		empresa.setData(dataAbertura);
		
		System.out.println("Alterando empresa");
		
		response.sendRedirect("listaEmpresas");

	}

}
