package br.usjt.usjt_pi_app.model.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.usjt.usjt_pi_app.model.beans.Presenca;

public interface PresencaRepository extends JpaRepository <Presenca, Long> {
	public Presenca findOneByAlunoAndMateriaAndData(int aluno, int materia, Date data);
	
	@Query("SELECT p FROM Presenca p WHERE p.materia.idMateria = ?1")
	public List <Presenca> findAllByMateria(int materia);
	
	@Query("SELECT p FROM Presenca p WHERE p.data = ?1 AND p.aluno.idAluno = ?2 AND p.materia.idMateria = ?3")
	public Presenca findByDataAndIdAlunoAndIdMateria(Date data, int idAluno, int idMateria);
}
