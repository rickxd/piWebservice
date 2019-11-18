package br.usjt.usjt_pi_app.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.usjt_pi_app.model.beans.Horario;

public interface HorarioRepository extends JpaRepository <Horario, Long> {

}
