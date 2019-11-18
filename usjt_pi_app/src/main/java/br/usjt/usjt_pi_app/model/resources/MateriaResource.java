package br.usjt.usjt_pi_app.model.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.usjt.usjt_pi_app.model.beans.Materia;
import br.usjt.usjt_pi_app.model.repository.MateriaRepository;

@RestController
@RequestMapping("/materia")
public class MateriaResource {
	@Autowired
	private MateriaRepository materiaRepo;
	
	@GetMapping("/lista")
	public List <Materia> listarMaterias(){
		return materiaRepo.findAll();
	}

}
