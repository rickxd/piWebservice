package br.usjt.usjt_pi_app.model.resources;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.usjt.usjt_pi_app.model.beans.Presenca;
import br.usjt.usjt_pi_app.model.repository.PresencaRepository;

@RestController
@RequestMapping("/presenca")
public class PresencaResource {
	@Autowired
	private PresencaRepository presencaRepo;
	
	@GetMapping("/{id}")
	public List <Presenca> listarPorId(@PathVariable int id){
		return presencaRepo.findAllByMateria(id);
	}
	
	@PostMapping("/inserir")
	@ResponseStatus (HttpStatus.CREATED)
	public void salvar (@RequestBody List <Presenca> presencas) {
		for(Presenca p : presencas) {
			presencaRepo.save(p);
		}
	}
	
	@PostMapping("/atualizar/{data}/{idAluno}/{idMateria}")
	public void atualizar(@PathVariable String data, @PathVariable int idAluno, @PathVariable int idMateria) {
		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Presenca presenca;
		try {
			presenca = presencaRepo.findByDataAndIdAlunoAndIdMateria(formatter.parse(data), idAluno, idMateria);
			presenca.setPresente(1);
			presencaRepo.save(presenca);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
