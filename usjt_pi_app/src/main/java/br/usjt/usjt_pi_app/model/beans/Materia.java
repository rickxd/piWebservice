package br.usjt.usjt_pi_app.model.beans;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "tb_materia")
public class Materia {
	
	@Id
	@GeneratedValue
	private int idMateria;
	private String nome;
	
	@JsonBackReference("tb_materia")
	@OneToMany(mappedBy = "materia")
	private List<Presenca> presencas;
	
	@JsonBackReference("tb_materia")
	@ManyToMany
	@JoinTable (name = "tb_materia_professor", 
				joinColumns = @JoinColumn (name = "id_materia"), 
				inverseJoinColumns = @JoinColumn(name = "id_materia_professor"))
	private List<Professor> professores;
	
	@JsonManagedReference("tb_materia")
	@OneToMany(mappedBy = "materia")
	private List<Horario> horarios;
	
	@JsonManagedReference("tb_materia")
	@ManyToMany
	@JoinTable (name = "tb_materia_turma", 
				joinColumns = @JoinColumn (name = "id_materia"), 
				inverseJoinColumns = @JoinColumn(name = "id_materia_turma"))
	private List<Turma> turmas;
	
	public Materia() {
		
	}

	public int getIdMateria() {
		return idMateria;
	}

	public void setIdMateria(int idMateria) {
		this.idMateria = idMateria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Professor> getProfessores() {
		return professores;
	}

	public void setProfessores(ArrayList<Professor> professores) {
		this.professores = professores;
	}

	public List<Horario> getHorarios() {
		return horarios;
	}

	public void setHorarios(ArrayList<Horario> horarios) {
		this.horarios = horarios;
	}

	public List<Turma> getTurmas() {
		return turmas;
	}

	public void setTurmas(ArrayList<Turma> turmas) {
		this.turmas = turmas;
	}

	public List<Presenca> getPresencas() {
		return presencas;
	}

	public void setPresencas(ArrayList<Presenca> presencas) {
		this.presencas = presencas;
	}
	
	
}
