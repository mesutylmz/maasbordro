package com.eb.maasbordro.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eb.maasbordro.model.Mudurluk;
import com.eb.maasbordro.repository.MudurlukRepository;
import com.eb.maasbordro.service.api.MudurlukService;

@Service
public class MudurlukServiceImpl implements MudurlukService {

	@Autowired
	MudurlukRepository mudurlukRepo;
	
	@Override
	public List<Mudurluk> getAllMudurluk() {
		return mudurlukRepo.findAll();
	}

	@Override
	public Mudurluk findMudurluk(Integer id) {
		return mudurlukRepo.findById(id).get();
	}

	@Override
	public Mudurluk createMudurluk(Mudurluk mudurluk) {
		return mudurlukRepo.save(mudurluk);
	}

	@Override
	public Mudurluk updateMudurluk(Integer mudurlukId,Mudurluk mudurluk) {
		Mudurluk mudurlukToUpdate = mudurlukRepo.getOne(mudurlukId);
		mudurlukToUpdate.setMind(mudurluk.getMind());
		mudurlukToUpdate.setMudurlugu(mudurluk.getMudurlugu());
		return mudurlukRepo.save(mudurlukToUpdate);
	}

	@Override
	public boolean deleteMudurluk(Integer id) {
		try {
			Mudurluk mudurlukToDelete = mudurlukRepo.getOne(id);
			if(mudurlukToDelete!=null) {
				mudurlukRepo.delete(mudurlukToDelete);
				return true;
			}
			return false;
		}catch(Exception e) {
			return false;
		}
	}

}
