# Java parte 3
Entendendo herança e interface.

## Resumo
Base de conceitos importantíssimos no mundo Java, começando com herança, passando pela reescrita, redefinição de métodos, utilização do super, para subirmos na hierarquia, que a herança não existe para construtores, mas é possível chamar um construtor da classe mãe, modificador de visibilidade protected que é aberto para as classes filhas mas fechado para as demais, classes e métodos abstratos, polimorfismo, onde temos um objeto que nunca muda de tipo, mas que pode ser enxergado a partir de vários pontos de referência, interfaces, para termos uma alternativa ao polimorfismo, e a composição, que é uma alternativa à reutilização de código.

## Conclusão
Este curso abordou os seguintes tópicos:

* Introdução a herança
  * Quais problemas a herança pode resolver;
  * Como usar herança no Java através de palavra chave extends;
  * Ao herdar, a classe filha ganha todas as características (atributos) e todas as funcionalidades (métodos) da classe mãe;
  * Conhecemos o primeiro benefício da herança: Reutilização do código.

* Super e reescrita de métodos
  * Que classe mãe é chamada de super ou base class;
  * Que a classe filha também é chamada de sub class;
  * Como aumentar a visibilidade de um membro (atributo, método) através do protected;
  * Como acessar ou chamar um membro (atributo, método) através do super;
  * Como redefinir um método através da sobrescrita.
  
* Entendendo Polimorfismo
  * Objetos não mudam de tipo;
  * A referência pode mudar, e aí entra o polimorfismo;
  * O polimorfismo permite usar referências mais genéricas para a comunicação com um objeto;
  * O uso de referências mais genéricas permite desacoplar sistemas.

* Herança e o uso de construtores
  * Conceitos de herança, construtores e polimorfismo;
  * A utilização da anotação @Override;
  * Construtores não são herdados;
  * Um construtor da classe mãe pode ser chamado através do super().

* Classes e métodos abstratos
  * O que são classes abstratas;
  * Para que servem classes abstratas;
  * O que são métodos abstratos;
  * Para que servem métodos abstratos.
  
* Interfaces
  * Não existe herança múltipla em Java;
  * Conceitos de interface;
  * Diferenças entre classes abstratas e interfaces;
  * interfaces são uma alternativa a herança referente ao polimorfismo.
  
* Praticando herança e interface
  * Mais a fundo sobre o uso de interfaces;
  * Trabalhamos mais a fundo com herança;
  * Vimos outras aplicações de heranças e interfaces.
