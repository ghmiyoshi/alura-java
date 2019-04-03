# Java parte 6
Conhecendo o java.util.

## Resumo
Introdução a arrays, a primeira estrutura de dados. Aprender a armazenar diversos valores de uma só vez, o que é um array de primitivos, inicializar o array indicando a posição desejada (sempre inicia do 0), acessar determinada posição e descobrir quantos elementos é capaz de armazenar. Assim como existem primitivos, podem existir arrays de referências. Ao criar o objeto, o que é armazenado é a indicação à ele, e não ele em si. De resto, o funcionamento é igual ao tipo de array visto anteriormente. Um ponto negativo das arrays é seu número fixo de elementos, uma vez criada, ela terá aquele tamanho, sem possibilidade de alteração ou flexibilização. Além disso, apesar de ser possível saber esta capacidade de armazenamento, não há um método que permita descobrir o número de elementos armazenados. Por este motivo, foi criado um tipo de armazenador de objetos de referência, que é o ArrayList. Trata-se de uma classe que, internamente, utiliza um array. Sua sintaxe é, portanto, a mesma de uma classe qualquer. Além disso, é possível criar parâmetros nela, para indicar que só será possível armazenar um tipo de referência, por exemplo, do tipo Conta (generics). Ela possui diversos métodos específicos que facilitam o trabalho com estrutura de dados, é o caso do size(), que nos permite descobrir o número de referências armazenadas. Outros tipos de estruturas de dados, como o LinkedList e o Vector. O LinkedList é uma lista duplamente encadeada, enquanto o Vector é similar ao ArrayList, mas é capaz de trabalhar com diversos threads. Todas listas, implementam a interface List, são sequências e armazenam os elementos com base em um índice, isso não impede de adicionar duplicados, ou seja, que itens sejam repetidos. A ideia de armazenar dados é presente no mundo Java também na Collection, uma interface ainda mais genérica que List, e nos conjuntos Set e HashSet, que por sua vez não aceitam itens duplicados. Como não é possível guardar valores primitivos em um array, existe para cada um deles uma classe wrapper correspondente. A transformação do tipo primitivo para o objeto referência acontece automaticamente, e é chamada de autoboxing. O caminho inverso é chamado de unboxing, e é feita automaticamente pelo Java. Elas "embrulham" o tipo primitivo do objeto, que internamente guarda o valor primitivo, e existem para que haja compatibilidade com as coleções, permitindo por exemplo, guardar números dentro de uma lista. Formas de ordenar nossos métodos, temos o sort(), bem como a classe Collections, que possui uma série de métodos auxiliares estáticos. O sort() recebe um critério de comparação, que é definido por meio de uma interface com um único método. Estas classes sem atributos, que possuem uma única funcionalidade, foram trabalhadas para tratar das classes anônimas e lambdas. É menos custoso criar uma classe, a partir da interface, e já criar o objeto, de forma direta, em unidade, utilizando os lambdas, que facilitam ainda mais o trabalho com funções.

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


  
