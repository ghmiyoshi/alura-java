package br.com.alura.gerenciador.acao;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.dao.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

public class NovaEmpresa implements Acao {

	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		System.out.println("Cadastrando empresa");

		String paramNome = request.getParameter("nome");
		String paramData = request.getParameter("data");

		Date data = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			data = sdf.parse(paramData);
		} catch (Exception e) {
			throw new ServletException(e.getMessage());
		}

		Empresa empresa = new Empresa();
		empresa.setNome(paramNome);
		empresa.setData(data);

		Banco dao = new Banco();
		dao.adiciona(empresa);

		request.setAttribute("empresa", empresa);

		return "redirect:listaEmpresas";
	}

}
