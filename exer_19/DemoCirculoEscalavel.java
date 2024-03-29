package com.everton.exer_19;
/**
 * A classe DemoCirculoEscalavel demonstra o uso dos m�todos da classe
 * CirculoEscalavel e sua rela��o com as interfaces ObjetoGeometrico e Escalavel.
 */
public class DemoCirculoEscalavel {
	/**
	 * O m�todo main permite a execu��o desta classe. Este m�todo cont�m declara��es de
	 * uma inst�ncia da classe CirculoEscalavel e usa seus m�todos.
	 * @param argumentos os argumentos que podem ser passados para o m�todo via linha
	 * de comando, mas que neste caso ser�o ignorados.
	 * @throws Exception 
	 */
	public static void main(String[] argumentos) throws Exception {
		// Declaramos e alocamos uma inst�ncia da classe CirculoEscalavel
		CirculoEscalavel ce = new CirculoEscalavel(new Ponto(10,10),30);
		// Imprimimos a posi��o original do c�rculo escal�vel
		System.out.println(ce); // chamada impl�cita ao m�todo toString
		// Modificamos a escala do c�rculo
		ce.amplia(3);
		// Imprimimos novamente os dados do c�rculo
		System.out.println(ce);
		// Modificamos a posi��o do c�rculo (espelhando)
		ce.espelha();
		// Imprimimos novamente os dados do c�rculo
		System.out.println(ce);
		// � uma inst�ncia da classe CirculoEscalavel ?
		System.out.println(ce instanceof CirculoEscalavel); // true
		// � uma inst�ncia da interface ObjetoGeometrico ?
		System.out.println(ce instanceof ObjetoGeometrico); // true
		// � uma inst�ncia da interface Escalavel ?
		System.out.println(ce instanceof Escalavel); // true
	}
}
