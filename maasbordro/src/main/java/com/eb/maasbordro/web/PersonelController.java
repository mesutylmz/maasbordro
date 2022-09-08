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
import org.springframework.web.bind.annotation.RestController;

import com.eb.maasbordro.model.Personel;
import com.eb.maasbordro.repository.PersonelRepository;
import com.eb.maasbordro.service.impl.PersonelServiceImpl;


@RestController
@RequestMapping("/personel")
public class PersonelController {
	
	@Autowired
	private PersonelServiceImpl personelService;
	
	
	@GetMapping("/allPersonel")
	public ResponseEntity<List<Personel>> getPersonels(){
		
		List<Personel> data = personelService.getAllPersonel();
		return ResponseEntity.ok(data);
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Personel> getPersonelById(@PathVariable(value = "id") Integer personelId) {
		Personel personel = personelService.findPersonel(personelId);
		return ResponseEntity.ok().body(personel);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Personel> updatePersonel(@PathVariable(value = "id") Integer personelId, @RequestBody Personel personel)  {

		final Personel updatedPersonel = personelService.updatePersonel(personelId,personel);
		return ResponseEntity.ok(updatedPersonel);
	}
	
	@PostMapping("/create")
	public ResponseEntity<Personel> createEmployee( @RequestBody Personel personel) {
		final Personel createdPersonel=  personelService.createPersonel(personel);
		return ResponseEntity.ok(createdPersonel);
	}
	
	
	@DeleteMapping("/{id}")
	public Map<String, Boolean> deletePersonel(@PathVariable Integer id){
		boolean isDeleted = personelService.deletePersonel(id);
		Map<String, Boolean> response = new HashMap<>();
		if(isDeleted) {
			response.put("deleted", Boolean.TRUE);
		}
		else {
			response.put("could not delete", Boolean.FALSE);
		}
		return response;
	}
	
	
	
	
	
	
	
	

}
