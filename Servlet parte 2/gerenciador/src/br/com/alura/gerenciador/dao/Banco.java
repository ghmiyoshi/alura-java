package br.com.alura.gerenciador.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.com.alura.gerenciador.modelo.Empresa;
import br.com.alura.gerenciador.modelo.Usuario;

public class Banco {
	private static Integer chaveSequencial = 1;
	private static List<Empresa> lista = new ArrayList<>();
	private static List<Usuario> listaUsuarios = new ArrayList<>();

	static {
		Empresa empresa = new Empresa();
		empresa.setId(Banco.chaveSequencial++);
		empresa.setNome("Alura");

		Empresa empresa2 = new Empresa();
		empresa2.setId(Banco.chaveSequencial++);
		empresa2.setNome("Caelum");

		lista.add(empresa);
		lista.add(empresa2);

		Usuario usuario = new Usuario();
		usuario.setLogin("gabriel");
		usuario.setSenha("12345");

		Usuario usuario2 = new Usuario();
		usuario2.setLogin("hideki");
		usuario2.setSenha("12345");

		listaUsuarios.add(usuario);
		listaUsuarios.add(usuario2);

	}

	public void adiciona(Empresa empresa) {
		empresa.setId(Banco.chaveSequencial++);
		Banco.lista.add(empresa);
	}

	public List<Empresa> getEmpresas() {
		return Banco.lista;
	}

	public void removeEmpresa(Integer id) {
		Iterator<Empresa> it = lista.iterator();

		while (it.hasNext()) {
			Empresa empresa = it.next();

			if (empresa.getId() == id) {
				it.remove();
			}
		}

//		for (Empresa empresa : lista) {
//			if (empresa.getId() == id) {
//				Banco.lista.remove(empresa);
//			}
//		}
	}

	public Empresa buscaEmpresaPelaId(Integer id) {
		for (Empresa empresa : lista) {
			if (empresa.getId() == id) {
				return empresa;
			}

		}
		return null;
	}

	public Usuario existeUsuario(String loginParam, String senhaParam) {
		for (Usuario usuario : listaUsuarios) {
			if (usuario.ehIgual(loginParam, senhaParam)) {
				return usuario;
			}
		}
		return null;
	}

}
