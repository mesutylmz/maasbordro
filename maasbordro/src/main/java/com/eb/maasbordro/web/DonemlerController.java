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

import com.eb.maasbordro.model.Donemler;
import com.eb.maasbordro.model.Mudurluk;
import com.eb.maasbordro.model.Personel;
import com.eb.maasbordro.repository.DonemlerRepository;
import com.eb.maasbordro.repository.PersonelRepository;
import com.eb.maasbordro.service.impl.DonemlerServiceImpl;


@RestController
@RequestMapping("/donemler")
public class DonemlerController {
	
	@Autowired
	private DonemlerServiceImpl donemlerService;
	
	@GetMapping("/allDonemler")
	public ResponseEntity<List<Donemler>> getDonemler(){
		
		List<Donemler> data = donemlerService.getAllDonemler();
		return ResponseEntity.ok(data);
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Donemler> getDonemlerById(@PathVariable(value = "id") Integer donemlerId) {
		Donemler donemler = donemlerService.findDonemler(donemlerId);
		return ResponseEntity.ok().body(donemler);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Donemler> updateDonemler(@PathVariable(value = "id") Integer donemlerId, @RequestBody Donemler donemler)  {

		final Donemler updatedDonemler = donemlerService.updateDonemler(donemlerId, donemler);
		return ResponseEntity.ok(updatedDonemler);
	}
	
	@PostMapping("/create")
	public ResponseEntity<Donemler> createDonemler( @RequestBody Donemler donemler) {
		final Donemler createdDonemler=  donemlerService.createDonemler(donemler);
		return ResponseEntity.ok(createdDonemler);
	}
	
	@DeleteMapping("/{id}")
	public Map<String, Boolean> deleteDonemler(@PathVariable Integer id){
		boolean isDeleted = donemlerService.deleteDonemler(id);
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
