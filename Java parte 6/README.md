# Java parte 6
Conhecendo o java.util.

## Resumo
A transformação do tipo primitivo para o objeto referência acontece automaticamente, e é chamada de autoboxing. O caminho inverso é chamado de unboxing.

As classes que existem para cada tipo primitivo se chamam wrappers. Isso porque elas "embrulham" o tipo primitivo do objeto, que internamente guarda o valor primitivo. Elas existem para que haja compatibilidade com as coleções, nos permitindo, por exemplo, guardar números dentro de uma lista.

## Conclusão
Este curso abordou os seguintes tópicos:

* Conhecendo Arrays
  * Um array é uma estrutura de dados e serve para guardar elementos (valores primitivos ou referências);
  * Arrays usam colchetes ([]) sintaticamente;
  * Arrays têm um tamanho fixo!;
  * Um array também é um objeto!;
  * Arrays são zero-based (o primeiro elemento se encontra na posição 0);
  * Um array é sempre inicializado com os valores padrões;
  * Ao acessar uma posição inválida recebemos a exceção ArrayIndexOutOfBoundException;
  * Arrays possuem um atributo length para saber o tamanho.
  
* Guardando qualquer referência
  * Uma array do tipo Object pode guardar qualquer tipo de referência;
  * Quando convertemos uma referência genérica para uma referência mais específica é preciso usar um type cast;
  * O cast só compila quando é possível, mesmo assim pode falhar na hora de rodar;
  * Quando o type cast falha podemos receber uma ClassCastException;
  * Para receber valores ao chamar o programa Java na linha de comando podemos usar o array String[] no método main.
  
* ArrayList e Generics
  * A classe java.util.ArrayList encapsula o uso do array e oferece vários métodos de mais alto nível;
  * Uma lista guarda referencias;
  * Como usar métodos size, get, remove;
  * Como usar o foreach para iterar a ArrayList;
  * Os generics parametrizam classes;
  * No caso da ArrayList podemos definir o tipo dos elementos através de generics <> .
  
* Equals e mais listas
  * Implementar o método equals para definir a igualdade
  * O método equals é utilizado pelas listas
  * Existe mais uma lista, a java.util.LinkedList
  * A diferença entre ArrayList e LinkedList: 
     * LinkedList:
        * É uma lista duplamente "linkada";
        * Inserção e remoção performática em qualquer posição, também no início;
        * Acesso mais demorado pelo índice, é preciso pesquisar os elementos.
     * ArrayList:
       * Representa um array com redimensionamento dinâmico;
       * Acesso fácil e performático pelo índice;
       * Os Elementos precisam ser copiados quando não há mais capacidade.
  * A interface java.util.List que define os métodos da lista.
  
* Vector e a interface Collection
  * O java.util.Vector é uma ArrayList threadsafe;
  * A interface java.util.Collection é a interface de todas as coleções;
  * As listas são sequências que aceitam elementos duplicados;
  * Os conjuntos (java.util.Set) também são coleções, mas não aceitam duplicados e nem são listas.
  
* As classes wrappers
  * Para cada primitivo existe uma classe chamada Wrapper;
  * Para guardar um primitivo numa coleção é preciso criar um objeto que embrulha o valor;
  * A criação do objeto Wrapper é chamada de autoboxing;
  * A retirada do valor primitivo do objeto Wrapper é chamada de unboxing;
  * Autoboxing e unboxing acontecem automaticamente;
  * As classes wrapper possuem vários métodos auxiliares, por exemplo para o parsing;
  * Todas as classes wrappers que representam um valor numérico possuem a classe java.lang.Number como mãe.
  
* Ordenação de listas
  * Para ordenar uma lista é preciso definir um critério de ordenação;
  * Há duas formas de definir um critério de ordenação:
    * Pela interface Comparator;
    * Pela interface Comparable (ordem natural).
  * O algoritmo de ordenação já foi implementado na lista no método sort na classe Collections pelo método sort;
  * A classe Collections é uma fachada com vários métodos auxiliares para trabalhar com as coleções, principalmente listas.


  
