package br.com.alura.gerenciador.acao;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.dao.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

public class AlteraEmpresa implements Acao{
	
	public String executa(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		String paramNome = request.getParameter("nome");
		String paramData = request.getParameter("data");
		
		System.out.println("Alterando empresa" + id);

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
		
		return "redirect:entrada?acao=ListaEmpresas";

	}

}
