package br.com.alura.gerenciador.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.dao.Banco;

public class RemoveEmpresa {
	public void executa(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		System.out.println("Removendo empresa");
		
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		Banco dao = new Banco();
		dao.removeEmpresa(id);
		
		response.sendRedirect("listaEmpresas");
		
		
	}

}
