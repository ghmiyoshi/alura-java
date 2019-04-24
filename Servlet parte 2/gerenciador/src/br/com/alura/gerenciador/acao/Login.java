package br.com.alura.gerenciador.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.alura.gerenciador.dao.Banco;
import br.com.alura.gerenciador.modelo.Usuario;

public class Login implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		String loginParam = request.getParameter("login");
		String senhaParam = request.getParameter("senha");

		Banco dao = new Banco();
		Usuario usuario = dao.existeUsuario(loginParam, senhaParam);
		System.out.println("Logando " + loginParam);

		if (usuario != null) {
			HttpSession sessao = request.getSession();
			sessao.setAttribute("usuarioLogado", usuario);
			return "redirect:entrada?acao=ListaEmpresas";
		} else {
			return "redirect:entrada?acao=LoginForm";
		}
	}

}
