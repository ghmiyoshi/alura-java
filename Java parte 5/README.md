# Java parte 5
Pacotes e java.lang

## Resumo


## Conclusão
Este curso abordou os seguintes tópicos:

* Organizando as classes com pacotes
  * packages servem para organizar o nosso código;
  * packages fazem parte do FQN (Full Qualified Name) da classe;
  * O nome completo da classe (FQN) é composto de: PACKAGE.NOME_SIMPLES_CLASSE;
  * A definição do package deve ser a primeira declaraçào no código fonte para facilitar o uso de classes de outros packages podemos importá-los os imports ficam logo após da declaração do package;
  * A nomenclatura padrão é usar o nome do domínio na web ao contrário junto com o nome do projeto, por exemplo:
    * br.com.caelum.geradornotas;
    * br.com.alura.gnarus;
    * br.gov.rj.notas;
    * de.adidas.lager.
    
* Todos os modificadores de acesso
  * Existem 3 palavras chaves relacionado com a visibilidade: private, protected, public;
  * Existem 4 níveis de visibilidade (de menor para maior):
    * private (visível apenas na classe);
    * <<package private>> (visível na classe e em qualquer outro membro do mesmo pacote, podendo ser chamado de default);
    * protected (visível na classe e em qualquer outro membro do mesmo pacote E para qualquer filho);
    * public (visível em qualquer pacote).
  * Os modificadores podem ser usados na definição da classe, atributo, construtor e método.
    
* Distribuição do seu código
  * Quais comentários e tags (anotações) a usar para definir o javadoc;
  * Gerar o javadoc no Eclipse;
  * javadoc é uma documentação para desenvolvedores;
  * Classes Java padrão também usam javadoc;
  * Criar nossa própria biblioteca através do JAR (Java ARchive);
  * Importar a biblioteca em um novo projeto;
  * Criar um JAR executável.
  
* O pacote java.lang
  * O package java.lang é o único pacote que não precisa ser importado, nele tem classes fundamentais que qualquer aplicação precisa, como a classe String e System;
  * Objetos da classe String são imutáveis e usamos uma sintaxe literal para criar (object literal);
  * Qualquer método de alteração da classe String devolve uma nova String que representa a alteração;
  * A classe String é uma CharSequence;
  * Se precisamos concatenar muitos String devemos usar a classe StringBuilder;
  * Métodos da classe String como trim, charAt, contains, isEmpty, length, indexOf, replace.

* A classe Object
  * System.out.println()
    * System - classe, java.lang, acesso público (public);
    * out - atributo, público, referência, static;
    * println() - método, público, não static, sobrecarga, não joga exceções do tipo checked.
  * Todas	as	classes,	sem	exceção,	herdam	de	Object. Ele é a forma mais genérica de referenciar um objeto;
  * Não é preciso herdar Object explicitamente, o compilador automaticamente insere a declaração;
  * A classe Object nos fornece uma implementação do método toString(), no entanto esse método retorna	o	nome	da	classe	@ um	número	de identidade;
  * Para modificar o	comportamento	do método toString(),	podemos	sobrescrevê-lo	na	classe	filha;

