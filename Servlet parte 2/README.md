# Servlet parte 2
Autenticação, autorização e o padrão MVC.

## Resumo
Construir uma aplicação usando os filtros e o conceito de controlador, dividir a aplicação em camadas e aplicar padrões arquiteturais e boas práticas no mundo web. Assim, criar a base necessária para se dar bem nos frameworks e bibliotecas web de mais alto nível. Logo, vamos completar nossa aplicação, criar um CRUD completo, fazer um login, fazer uma autorização e fechar nossa aplicação para que ela não fique mais aberta. Também usaremos o web services para abordar esse assunto. Por fim, fazer o deploy da nossa aplicação, em outro servidor e ver como nossa aplicação se comporta em um servlet container como o Jetty.

## Conclusão
Este curso abordou os seguintes tópicos:

### Criando o Controlador
  * Reorganizar a nossa aplicação em 3 pacotes: ação, modelo e servlet;
  * Criar uma servlet que recebe todas as requisições da aplicação;
  * Centralizar o acesso em uma servlet, para que ela decida qual ação executar.
  * Usar um parâmetro da requisição que define o nome da ação;
  * Alterar todos os links e formulários para enviar sempre o parâmetro da requisição.

* O padrão MVC
  * MVC significa Model-View-Controller;
  * MVC divide a aplicação em 3 camadas lógicas;
  * Cada camada tem a sua responsabilidade;
  * O controlador central e as ações fazem parte da camada Controller, que define o fluxo da aplicação;
  * Os JSPs fazem parte da camada View, que define a interface;
  * As classes do modelo fazem parte da camada Model, que encapsula as regras de negócio;
  * MVC facilita a manutenção e evolução da aplicação;
  * Os JSPs devem ficar "escondidos" na pasta WEB-INF, pois dependem da ação.

* Formulário de login
  * A representar o usuário através de uma classe Usuario;
  * A criar um formulário de login;
  * A criar a ação para chamar o formulário;
  * A criar a ação verificar o login e a senha.
  
* HttpSession
  * Por padrão, o navegador não envia nenhuma identificação sobre o usuário;
  * Quando o Tomcat recebe uma nova requisição (sem identificação), gerará um ID;
  * O ID fica salvo no cookie de nome JSessionID;
  * O ID é um hash (número aleatório);
  * O cookie é anexado à resposta HTTP;
  * O navegador reenvia o cookie automaticamente nas próximas requisições;
  * O Tomcat gera, além do ID, um objeto chamado HttpSession;
  * A vida do objeto HttpSession fica atrelado ao ID;
  * Para ter acesso à HttpSession, basta chamar request.getSession();
  * Usamos a HttpSession para guardar dados sobre o usuário (login, permissões, carrinho de compra);
  * A HttpSession tem um ciclo de vida e será automaticamente invalidada.

* Aplicando filtros
  * Um Filter e Servlet são bem parecidos;
  * Comparado com Servlet, o Filter tem o poder de parar o fluxo;
  * Para escrever um filtro, devemos implementar a interface javax.servlet.Filter;
  * Para mapear o filtro, usamos a anotação @WebFilter ou o web.xml;
  * Vários filtros podem funcionar numa cadeia (um chama o próximo, mas todos são independentes);
  * Para definir a ordem de execução, devemos mapear os filtros no web.xml;
  * Um filtro recebe como parâmetro, do método doFilter, um ServletRequest e um ServletResponse;
  * Ambos, ServletRequest e ServletResponse, são interfaces mais genéricas do que HttpServletRequeest e HttpServletResponse;
  * Para chamar o próximo filtro na cadeia, usamos o objeto FilterChain.

* Introdução ao Web Services
  * Que um web service usa HTML, JSON ou XML como retorno;
  * Que um web service oferece alguma funcionalidade para seu cliente;
  * Que um web service é útil quando precisa oferecer uma funcionalidade para cliente diferentes;
  * Que para o web service não importa se o cliente foi escrito em Java, C# ou outra linguagem, pois usamos um protocolo e formatos independentes da plataforma;
  * Como gerar JSON no código Java através de GSON;
  * Como gerar XML no código Java através de XStream;
  * Como escrever um web service através de um HttpServlet;
  * Como criar um cliente HTTP a partir do código Java, usando a biblioteca Apache HttpClient;
  * Como gerar JSON ou XML a partir do cabeçalho Accept da requisição.

* Deploy no Jetty
  * A disponibilizar a nossa aplicação no servlet container Jetty;
  * Que Servlet é uma especificação;
  * Que a especificação Servlet faz parte do Java EE/Jarkata EE;
  * Que, ao usar Servlet, programamos independentemente do servidor/container;
  * A diferença entre servlet container e application server.


	
