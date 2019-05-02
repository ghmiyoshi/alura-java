package br.com.alura.gerenciador.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

//@WebFilter("/entrada")
public class MonitoramentoFilter implements Filter {
	
	@Override
	public void init(FilterConfig fConfig) throws ServletException {}
	
	@Override
	public void destroy() {}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		System.out.println("Monitoramento Filter");

		long inicio = System.currentTimeMillis();

		String acao = ((HttpServletRequest) request).getParameter("acao");

		// executa a ação
		chain.doFilter(request, response);

		long fim = System.currentTimeMillis();
		System.out.println("Tempo de execução da ação " + acao + " -> " + (fim - inicio));

	}
	
}
