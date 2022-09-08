package com.eb.maasbordro.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.eb.maasbordro.model.Bordro;
import com.eb.maasbordro.service.impl.BordroServiceImpl;


@RestController
@RequestMapping("/bordro")
public class BordroController {
	
	@Autowired
	private BordroServiceImpl bordroService;
	
	@GetMapping("/allBordro")
	public ResponseEntity<List<Bordro>> getBordro(){
		
		List<Bordro> data = bordroService.getAllBordos();
		return ResponseEntity.ok(data);
		
	}
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Bordro>> getBordroByPindDing(@RequestParam String pind,@RequestParam String dind){
		List<Bordro> data = bordroService.getByPindAndDind(Integer.parseInt(pind), Integer.parseInt(dind));
		return ResponseEntity.ok(data);
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Bordro> getBordroById(@PathVariable(value = "id") Integer bordroId) {
		Bordro bordro = bordroService.findBordro(bordroId);
		return ResponseEntity.ok().body(bordro);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Bordro> updateBordro(@PathVariable(value = "id") Integer bordroId, @RequestBody Bordro bordro)  {

		final Bordro updatedBordro = bordroService.updateBordro(bordroId, bordro);
		return ResponseEntity.ok(updatedBordro);
	}
	
	@PostMapping("/create")
	public ResponseEntity<Bordro> createBordro( @RequestBody Bordro bordro) {
		final Bordro createdBordro=  bordroService.createBordro(bordro);
		return ResponseEntity.ok(createdBordro);
	}
	
	@DeleteMapping("/{id}")
	public Map<String, Boolean> deleteBordro(@PathVariable Integer id){
		boolean isDeleted = bordroService.deleteBordro(id);
		Map<String, Boolean> response = new HashMap<>();
		if(isDeleted) {
			response.put("deleted", Boolean.TRUE);
		}else {
			response.put("could not delete", Boolean.FALSE);
		}
		return response;
	}
	

}
