# Maven
Build do zero a Web.

## Resumo
Utilizar o Maven para resolver diversos problemas do build e do gerenciamento de um projeto no dia a dia, controlando desde a fase de compilação e criação dos diretórios até a geração de um arquivo .jar, executar um servidor com um aplicativo Web e dependência de outras bibliotecas, como resolver questões de conflito entre bibliotecas, como realizar o download de uma dependência, com a certeza de que temos todas as dependências necessárias, utilizar dois projetos, sendo que o primeiro envolverá a criação de um arquivo .jar e todo o procedimento de empacotamento e o segundo projeto gerará um arquivo .war.

## Comandos Maven
* Cria o projeto:
``mvn archetype:generate -DartifactId=produtos -DgroupId=br.com.alura.maven -DinteractiveMode=false -DarchetypeArtifactId=maven-archetype-quickstart``

> **-DartifactId** Define o id nome do projeto
>
> **-DgroupId** Define o pacote
>
> **-DinteractiveMode** Desabilita o modo interativo na criação do projeto
>
> **-DarchetypeArtifactId** Define qual o projeto base para montar esse projeto

* Compila o projeto:
``mvn compile``

* Testa o projeto e gera um arquivo TXT e uma versão XML dos testes:
``mvn test``

* Limpa o projeto (remove o diretório target):
``mvn clean``

* Gera um relatório html dos testes usando o plugin:
``mvn surefire-report:report``

* Empacota o projeto (.jar):
``mvn package``
> ``java -cp produtos-1.0-SNAPSHOT.jar br.com.alura.maven.App``

* Atualiza as dependências para as últimas versões. Não é tão recomendado pela compatibilidade:
``mvn versions:use-latest-versions``

* Dependências que possuem versões novas:
``mvn versions:display-dependency-updates``


## Ciclo do Build do Maven 
<https://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html> 

* Verificamos se projeto possui todas as informações necessárias.
``validate``

* Compilar os conteúdos.
``compile``

* Realizar testes diferentes no projeto.
``test`` 
 
* Geração de um pacote do projeto:
``package``
  
* Realizar testes de integração:
``integration-test``

* Checagem do pacote gerado:
``verify``

* Realizar a instalação do pacote no repositório local:
``install``

* Realizar a implantação no ambiente adequado: 
``deploy``

## Plugin PMD
* Plugin que gera um relatório que analisa o código para encontrar falhas, como variáveis não utilizadas. Seu relatório fica sobre a pasta target/site:
``mvn pmd:pmd``

## Plugin JaCoCo
``mvn jacoco prepare-agent``
``mvn jacoco report``

## Jetty
- Iniciar o servidor:
``mvn jetty:run``

## Eclipse
- No eclipse, é possível indicar os goals que deseja executar, é só ir em "Run As" > "Maven build...". Indique um nome para essa configuração e quais goals deseja executar;

- O projeto estava com erro no index.jsp. Esse ero era da falta da dependência do HttpServlet no pom.xml. Ao adicionarmos a dependência que queremos, precisamos também atualizar o web.xml, pois ele descreve uma outra versão dessa Servlet;

- Tomar cuidado ao incluir dependências de projetos que estejam no Project Explorer, o eclipse irá adicionar como dependência o projeto e não o JAR. A vantagem é que as mudanças são refletidas na hora, porem classes de testes ficarão dispóniveis para serem utilizadas; 

- Para usar um projeto como dependência de outro, precisamos primeiro fazer um mvn install no projeto dependência para colocar no repositório local e só então referenciar esse pacote no pom.xml.

## Escopos
- O escopo **compile** indica que a dependência estará disponível em todos os classpaths: de compilação de teste e execução. Esse é o escopo padrão utilizado quando não declaramos um escopo na dependência;

- O escopo **provided** indica que precisamos da dependência para compilar e testar, mas não se faz necessário incluir a dependência no artefato final, pois o JDK ou o container irão disponibilizar a dependência. Um exemplo disso é a nossa API de Servlet, declarada como dependência na lojaweb. O container (Jetty) irá disponibilizar a implementação dessa API, portanto não é necessário que a biblioteca esteja disponível junto com o .war da projeto;

- O escopo de **runtime** indica que a dependência não é necessária para compilar. A dependência estará disponível no classpath de runtime, o que significa que será utilizada na execução do projeto e também estará disponível no classpath de testes.
