# 3ads2017-portas-logicas

Veja a implementação sendo realizada com explicações em https://youtu.be/-q_FbckPBjc

# Texto da atividade

Portas lógicas

Segunda a Wikipedia: 
"" 
Portas lógicas ou circuitos lógicos, são dispositivos que operam um ou mais sinais lógicos de entrada para produzir uma e somente uma saída, dependente da função implementada no circuito. São geralmente usadas em circuitos eletrônicos, por causa das situações que os sinais deste tipo de circuito podem apresentar: presença de sinal, ou "1"; e ausência de sinal, ou "0". As situações "Verdade" e "Falso" são estudadas na Lógica Matemática ou Lógica de Boole; origem do nome destas portas. O comportamento das portas lógicas é conhecido pela tabela verdade que apresenta os estados lógicos das entradas e das saídas.
""

Resumidamente e programaticamente falando Portas lógicas são estruturadas que fazem uma avaliação entre alguns valores booleanos e resultam apenas 1 valor booleano.
Entender de portas lógicas é quase tão simples quanto escrever um 'if' em java, porém para fazer um 'if' usando portas lógicas você provalvemente precisará usar mais de uma porta.

Mas por ora o problema é beeeeem mais simples.

Para essa atividade é necessário criar uma classe para cada porta lógica encontrada https://pt.wikipedia.org/wiki/Porta_l%C3%B3gica#Tipos
Para cada classe é necessário criar além da classe um teste que valide que a porta funcione corretamente de acordo com a tabela verdade de cada porta.

Exemplo:

public class PortaANDTest {

	@Test
	public void validate() {
		PortaAND porta = new PortaAND();
		
		assertThat(porta.saida()).isFalse();
		
		porta.ligarEntradaB();
		assertThat(porta.saida()).isFalse();

		porta.ligarEntradaA();
		porta.desligarEntradaB();
		assertThat(porta.saida()).isFalse();

		porta.ligarEntradaA();
		porta.ligarEntradaB();
		assertThat(porta.saida()).isTrue();
	}

}

Na porta AND a saída só será verdadeira quando ouver true nas duas entradas.

Ao todo são esperados 26 testes para essa resolução porque a porta NOT só tem uma entrada e uma saída.

**Dica grátis #1**: Não precisa seguir a interface de ligarEntradaX(), pode ser uma interface mais genérica tipo ligarEntrada(0) ou ligarEntrada('A').
**Dica grátis #2**: Não é necessário limitar uma porta a ter apenas 2 entradas, exceto para porta NOT que deve ter sempre apenas 1 entrada. Porém se fizer algo tipo
new PortaAND(3); //sendo 3 a quantidade de entradas

é necessário fazer pelo menos dois testes sendo cada um com uma quantidade de entradas diferente e retratando toda tabela verdade para esse caso.
**Dica grátis #3**: Se quiser usar letras pode ser usado um java.util.Map para controlar as entradas ;)

Divirtam-se!

