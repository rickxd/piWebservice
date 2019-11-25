package br.usjt.usjt_pi_app.model.beans;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


@JsonIdentityInfo(
		  generator = ObjectIdGenerators.PropertyGenerator.class, 
		  property = "idPresenca")
@Entity
@Table(name = "tb_presenca")
public class Presenca {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idPresenca;
	private int presente;
	private Date data;
	
	//@JsonBackReference("tb_presenca")
	@ManyToOne
	private Aluno aluno;
	
	@JsonManagedReference("tb_presenca")
	@ManyToOne
	private Materia materia;
	
	public Presenca() {
		
	}

	public int getIdPresenca() {
		return idPresenca;
	}

	public void setIdPresenca(int idPresenca) {
		this.idPresenca = idPresenca;
	}

	public int getPresente() {
		return presente;
	}

	public void setPresente(int presente) {
		this.presente = presente;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
}
