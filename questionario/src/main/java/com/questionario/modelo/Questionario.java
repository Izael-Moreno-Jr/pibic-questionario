package com.questionario.modelo;

import java.util.ArrayList;
import java.util.List;

public class Questionario {
	
	private List<Pergunta> perguntas;
	private int perguntaAtual;
	
	public Questionario() {
		perguntas = new ArrayList<>();
		perguntaAtual = 0;
	}
	
	//adiciona perguntas dentro do ArrayList
	public void adicionarPergunta(String enunciado, String alternativas) {
		perguntas.add(new Pergunta(enunciado, alternativas));
	}
	
	public void responderPergunts(String resposta) {
		if(perguntaAtual < perguntas.size()) {
			perguntas.get(perguntaAtual).setResposta(resposta);
			perguntaAtual++;
		}
	}
	
	public String getProximaPergunta() {
		String pergunta = "";
		
		if(perguntaAtual < perguntas.size()) {
			pergunta = perguntas.get(perguntaAtual).toString();	
		} else {
			pergunta = "FIM";
		}
		
		return pergunta;
	}
	
	//lista as perguntas dentro do questionario
	public String listarQuestionario() {
		String saida = ""; //declaraÃ§Ã£o da acumuladora de Strings
		
		int i = 1;
		for (Pergunta p : perguntas) {
			saida += (i++); 
			saida += " pergunta: " + p.toString() + "\n";
		}
			return saida;
		}
	public String listarQuestionarioRespo() {
		String saida = ""; //declaraÃ§Ã£o da acumuladora de Strings
		int i = 1;
		for (Pergunta p : perguntas) {
			saida += (i++); 
			saida += " pergunta: " + p.toString() + "\n" + "Resposta: " + p.getResposta() + "\n";
		}
		return saida;
	}	
}
