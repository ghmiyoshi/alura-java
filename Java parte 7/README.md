# Java parte 7
Trabalhando com java.io

## Resumo
Leitura e escrita de arquivos binários e textuais. Como utilizar e como combinar as principais classes do pacote java.io. Problemas mais comuns que surgem ao trabalhar com a codificação de caracteres, por exemplo quando algum caractere especial não é interpretado corretamente. Estabelecer a entrada e saída de fluxos diferentes, do console, para a rede, para o arquivo, citando apenas alguns exemplos. Estudar o padrão Java de transformação de um objeto em um fluxo e vice-versa.

## Conclusão
Este curso abordou os seguintes tópicos:

* Leitura com java.io
  * Abertura de arquivos;
  * Leitura linha a linha do arquivo e detecção de seu fim;
  * Utilização de exceptions pelo Java IO caso a operação de leitura não saia como esperado;
  * Classes abstratas e concretas para leitura.
    
* Escrita com java.io
  * Escrever em arquivos;
  * Escrever usando outputs diferentes;
  * Ler e escrever dados abstraindo implementação;
  * Classes abstratas e concretas para escrita e leitura.
    
* FileWriter e PrintStream
  * Várias alternativas para estabelecer uma saída para um arquivo de texto, como:
    * A classe FileWriter;
    * A classe PrintStream;
    * A classe PrintWriter.
  * Alguns detalhes da classe System, como :
    * O atributo System.out é do tipo PrintStream;
    * O método System.lineSeparator() devolve os caracteres que representam uma nova linha;
    * O método System.currentTimeMillis() devolve os milissegundos que passaram desde 1 de janeiro de 1970.
  
* Usando java.util.Scanner
  * Leitura de arquivos com Scanner;
  * Uso de delimitador com Scanner;
  * Formatação de texto e também de números;
  * Definição de Localização para formatar o texto.

* Encoding e Charsets
  * A tabela genérica chamada Unicode contendo todos os caracteres do mundo em números denominados codepoints;
  * Aplicar diferentes Encodings para definir como os bytes são gravados nos arquivos;
  * Os encodings utilizados dependem muito de cada sistema operacional;
  * Verificar a implementação do Java para Unicodes e Encodings e conhecer várias classes e métodos;
  * A classe String possui um método chamado codePointAt() para revelar o codepoint de determinado caractere a partir de sua posição na string;
  * A classe que representa um encoding ou Character Set é Charset e o método estático para retornar uma referência com o charset default é defaultCharset();
  * A classe String também possui um método para transformar os caracteres em bytes, o getBytes(), que usado sem argumento de entrada utiliza o charset padrão. Existem duas sobrecargas para esse método, onde você pode informar o charset que deseja utilizar para a transformação;
  * A classe StandardCharsets, do pacote java.io, que possui constantes pra os principais charsets;
  * Simular o problema de encodings, gerando uma nova string a partir de um construtor que tinha como argumentos os bytes transformados no charset e o charset desejado para transformação. A solução foi garantir que o mesmo charset fosse aplicado, tanto na entrada quanto na saída;
  * As classes Scanner e InputStreamReader possuem sobrecargas de construtores que recebem como argumento qual charset será utilizado para fazer a transformação dos bytes em strings. De modo análogo para escrita, a classe PrintWriter também permite informar qual charset será utilizado para transformar a string nos bytes específicos.

* Serialização de objetos
  * A criação do fluxo binário a partir de um objeto é chamado de serialização;
  * A criação de um objeto a partir de um um fluxo binário é chamado de desserialização;
  * A classe deve implementar a interface java.io.Serializable;
  * A serialização/desserialização funciona em cascata e também com herança;
  * Existe a palavra-chave transient para indicar que o atributo não deve ser serializado;
  * É boa prática colocar o atributo estático serialVersionUID para versionar a classe;
  * A versão sempre fica guardada no fluxo binário;
  * Se não colocarmos explicitamente o serialVersionUID, a versão será gerada dinamicamente;
  * É raro usar a serialização na "unha", mas é um conhecimento importante, pois será utilizado por outras bibliotecas.
