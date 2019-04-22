# Maven
Build do zero a Web

## Resumo
Utilizar o Maven para resolver diversos problemas do build e do gerenciamento de um projeto no dia a dia, controlando desde a fase de compilação e criação dos diretórios até a geração de um arquivo .jar, executar um servidor com um aplicativo Web e dependência de outras bibliotecas, como resolver questões de conflito entre bibliotecas, como realizar o download de uma dependência, com a certeza de que temos todas as dependências necessárias, utilizar dois projetos, sendo que o primeiro envolverá a criação de um arquivo .jar e todo o procedimento de empacotamento e o segundo projeto gerará um arquivo .war.

## Conclusão

* Comandos Maven
    * Criar um projeto:
      *``mvn archetype:generate -DartifactId=produtos -DgroupId=br.com.alura.maven -DinteractiveMode=false -DarchetypeArtifactId=maven-archetype-quickstart``

> **-DartifactId** Define o id nome do projeto
>
> **-DgroupId** Define o pacote
>
> **-DinteractiveMode** Desabilita o modo interativo na criação do projeto
>
> **-DarchetypeArtifactId** Define qual o projeto base para montar esse projeto

``mvn compile``

> Compila o projeto

``mvn teste``

> Roda as classes compiladas

``mvn clean``

> Limpa o projeto (diretório target)

``mvn surefire-report:report``

> Gera o relatório utilizando o plugin

``mvn package``

> Empacota o projeto
> ``java -cp produtos-1.0-SNAPSHOT.jar br.com.alura.maven.App``

``mvn versions:use-latest-versions``

> Atualiza as dependências para as últimas verões. Não é tão recomendado pela compatibilidade.

``mvn versions:display-dependency-updates``

> Dependências que possuem versões novas


## Ciclo do Build do Maven <https://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html>

- validate
- compile
- test
- package
- integration-test
- verify
- install
- deploy

Sempre faz as fases anteriores.

## Plugin PMD

Plugin que gera um relatório que analise o código para encontrar falhas, como variáveis não utilizadas. Seu relatório fica sobre a pasta target/site

``mvn pmd:pmd``

## Plugin JaCoCo

``mvn jacoco prepare-agent``

``mvn jacoco report``

## Jetty

``mvn jetty:run``

## Eclipse

No eclipse, é possível indicar os goals que deseja executar, é só ir em "Run As" > "Maven build...". Indique um nome para esse configuração e quais goals deseja executar.

- O projeto estava com erro no index.jsp. Esse ero era da falta da dependencia do HttpServlet no pom.xml. Ao adicionarmos a dependência que queremos, precisamos também atualizar o web.xml, pois ele descreve uma outra versão dessa Servlet.

- **Para usar um projeto como dependência de outro, precisamos primeiro fazer um mvn install no projeto dependência. E só então referenciar esse pacote no pom.xml**

- **Não devemos colocar a Servlet API na nossa lib, ou seja, como uma dependência normal, mas sim como uma dependência provided**, ou seja, ele irá pegar da raiz do nosso JVM. Com isso, é interessante dar um ``mvn clean`` antes do ``mvn package``

- O escopo **runtime** não é utilizado para compilação, somente para a execução do projeto
