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

import com.eb.maasbordro.model.Mudurluk;
import com.eb.maasbordro.model.Personel;
import com.eb.maasbordro.repository.MudurlukRepository;
import com.eb.maasbordro.service.impl.MudurlukServiceImpl;


@RestController
@RequestMapping("/mudurluk")
public class MudurlukController {
	
	@Autowired
	private MudurlukServiceImpl mudurlukService;
	
	@GetMapping("/allMudurluk")
	public ResponseEntity<List<Mudurluk>> getMudurluk(){
		
		List<Mudurluk> data = mudurlukService.getAllMudurluk();
		return ResponseEntity.ok(data);
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Mudurluk> getMudurlukById(@PathVariable(value = "id") Integer mudurlukId) {
		Mudurluk mudurluk = mudurlukService.findMudurluk(mudurlukId);
		return ResponseEntity.ok().body(mudurluk);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Mudurluk> updateMudurluk(@PathVariable(value = "id") Integer mudurlukId, @RequestBody Mudurluk mudurluk)  {

		final Mudurluk updatedMudurluk = mudurlukService.updateMudurluk(mudurlukId,mudurluk);
		return ResponseEntity.ok(updatedMudurluk);
	}
	
	@PostMapping("/create")
	public ResponseEntity<Mudurluk> createMudurluk( @RequestBody Mudurluk mudurluk) {
		final Mudurluk createdMudurluk=  mudurlukService.createMudurluk(mudurluk);
		return ResponseEntity.ok(createdMudurluk);
	}
	
	@DeleteMapping("/{id}")
	public Map<String, Boolean> deleteMudurluk(@PathVariable Integer id){
		boolean isDeleted = mudurlukService.deleteMudurluk(id);
		Map<String, Boolean> response = new HashMap<>();
		if(isDeleted) {
			response.put("deleted", Boolean.TRUE);
		}else {
			response.put("could not delete", Boolean.FALSE);
		}
		return response;
	}
}
