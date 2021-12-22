package br.com.alura.escola.dominio.aluno;

import java.time.LocalDateTime;

import br.com.alura.escola.dominio.Evento;

public class AlunoMatriculado implements Evento {
	
	private final CPF cpfDoAluno;
	private final LocalDateTime momento;

	public AlunoMatriculado(CPF cpfDoAluno) {
		super();
		this.cpfDoAluno = cpfDoAluno;
		this.momento = LocalDateTime.now();
	}

	@Override
	public LocalDateTime momento() {
		// TODO Auto-generated method stub
		return this.momento;
	}

	public CPF getCpfDoAluno() {
		return cpfDoAluno;
	}
}
