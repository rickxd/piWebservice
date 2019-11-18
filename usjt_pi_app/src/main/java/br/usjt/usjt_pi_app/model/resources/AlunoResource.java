package br.usjt.usjt_pi_app.model.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.usjt.usjt_pi_app.model.beans.Aluno;
import br.usjt.usjt_pi_app.model.repository.AlunoRepository;

@RestController
@RequestMapping("/aluno")
public class AlunoResource {
	@Autowired
	private AlunoRepository alunoRepo;
	
	@GetMapping("/lista")
	public List <Aluno> listarAlunos(){
		return alunoRepo.findAll();
	}
	
	@GetMapping("/login/{email}/{senha}")
	public Aluno fazerLogin(@PathVariable String email, @PathVariable String senha){
		return alunoRepo.findOneByEmailAndSenha(email, senha);
	}

}
