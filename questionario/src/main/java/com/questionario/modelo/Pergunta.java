package com.questionario.modelo;

public class Pergunta {
	private String enunciado;
	
	private String alternativas;
	
	private String resposta;
	

	public Pergunta(String enunciado, String alternativas) {
		this.enunciado = enunciado;
		this.alternativas = alternativas;
		this.resposta = "";
	}
	
	public Pergunta(String enunciado) {
		this(enunciado,"");
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public String getAlternativas() {
		return alternativas;
	}

	public void setAlternativas(String alternativas) {
		this.alternativas = alternativas;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}
	
	public String toString() {
		return "" + enunciado + "\n" + alternativas; 
	}
	
}
