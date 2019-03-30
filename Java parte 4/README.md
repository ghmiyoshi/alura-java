# Java parte 4
Entendendo exceções.

## Resumo
As exceções reúnem muitas áreas de Java, como o conhecimento sobre as classes, herança, polimorfismo, reutilização de código, etc. Há uma sintaxe especial focada somente nas exceções, composta por:
  * try;
  * catch;
  * finally;
  * throws;
  * throw.

Todas essas palavras-chave são relacionadas com as exceções que existem para mudar o fluxo da aplicação. 

Como funciona a pilha de execução Stack, como funciona a organização da execução de um método ou de vários métodos no mundo Java e, quando uma exceção acontece, como ela manipula aquela pilha de execução.

Existe uma hierarquia que separa erros da máquina virtual e exceções para o desenvolvedor. Dentro das exceções para o desenvolvedor, existem duas categorias:
  * Checked é o tipo em que o compilador verifica;
  * Unchecked é o tipo em que o compilador não verifica.
  
Na hora da execução, acaba sendo tudo igual: uma "bomba" que cai na pilha e muda o fluxo.

Como criar as nossas próprias exceções, criar uma classe e encaixá-la na hierarquia usando a palavra-chave throw junto com o throws, deixando claro ao compilador se tal método é perigoso ou não e todo o tratamento com try, catch e finally e uma nova cláusula para abrir um recurso junto com o try e simplificar o nosso código.

## Conclusão
Este curso abordou os seguintes tópicos:

* Pilha de execução
  * O que é, para que serve e como funciona a pilha de execução;
  * O que é depuração (debug) e para que serve;
  * Como utilizar o Eclipse e sua perspectiva de debug;
  * Como alternar entre perspectivas do Eclipse.
  
* Tratamento de Exceções
  * O que são exceções, para que servem e porquê utilizá-las;
  * Como analisar o rastro de exceções, ou stacktrace;
  * Tratar exceções com os blocos try-catch;
  * Manipular uma exceção lançada dentro do bloco catch;
  * Tratar múltiplas exceções com mais de um bloco catch ou usando Multi-Catch utilizando o pipe (|).
  
* Lançando exceções
  * Como lançar exceções;
  * Como atribuir uma mensagem à exceção. 
  
* Checked e Unchecked
  * Existe uma hierarquia grande de classes que representam exceções;
  * ArithmeticException é filha de RuntimeException, que herda de Exception, que por sua vez é filha da classe mais ancestral das exceções, Throwable;
  * Throwable é a classe que precisa ser extendida para que seja possível jogar um objeto na pilha (através da palavra reservada throw);
  * Na classe Throwable temos praticamente todo o código relacionada às exceções, inclusive getMessage() e printStackTrace(). Todo o resto da hierarquia apenas possui algumas sobrecargas de construtores para comunicar mensagens específicas;
  * A hierarquia iniciada com a classe Throwable é dividida em exceções e erros:
    * Exceções são usadas em códigos de aplicação;
    * Erros são usados exclusivamente pela máquina virtual.
  * Classes que herdam de Error são usadas para comunicar erros na máquina virtual. Desenvolvedores de aplicação não devem criar erros que herdam de Error;
  * StackOverflowError é um erro da máquina virtual para informar que a pilha de execução não tem mais memória;
  * Exceções são separadas em duas grandes categorias: 
    * Checked - Aquelas que são obrigatoriamente verificadas pelo compilador e são criadas através do pertencimento a uma hieraquia que não passe por RuntimeException;
    * Unchecked - Não são verificadas pelo compilador e são criadas como descendentes de RuntimeException.

* Aplicando exceções
  * Como criar um bloco catch genérico usando a classe Exception;
  * Como criar uma exceção nova SaldoInsuficienteException;
  * Como transformar a exceção em checked ou unchecked.
  
* Finally e try with resources
  * Existe um bloco finally, útil para o fechamento de recursos (como conexão);
  * Quando há um bloco finally o bloco catch é opcional;
  * O bloco finally é sempre executado, sem ou com exceção;
  * Como usar o try-with-resources.
  

