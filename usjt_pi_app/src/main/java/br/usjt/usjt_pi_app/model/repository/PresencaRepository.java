package br.usjt.usjt_pi_app.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.usjt_pi_app.model.beans.Presenca;

public interface PresencaRepository extends JpaRepository <Presenca, Long> {

}
