package br.usjt.usjt_pi_app.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.usjt_pi_app.model.beans.Aluno;

public interface AlunoRepository extends JpaRepository <Aluno, Long> {
	public Aluno findOneByEmailAndSenha(String email, String senha);
}
