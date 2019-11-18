package br.usjt.usjt_pi_app.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.usjt_pi_app.model.beans.Turma;

public interface TurmaRepository extends JpaRepository <Turma, Long> {

}
