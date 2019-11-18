package br.usjt.usjt_pi_app.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.usjt_pi_app.model.beans.Professor;

public interface ProfessorRepository extends JpaRepository <Professor, Long> {

}
