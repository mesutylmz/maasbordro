package com.eb.maasbordro.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eb.maasbordro.model.Donemler;
import com.eb.maasbordro.repository.DonemlerRepository;
import com.eb.maasbordro.service.api.DonemlerService;

@Service
public class DonemlerServiceImpl implements DonemlerService{

	@Autowired
	DonemlerRepository donemlerRepo;
	
	@Override
	public List<Donemler> getAllDonemler() {
		return donemlerRepo.findAll();
	}

	@Override
	public Donemler findDonemler(Integer id) {
		return donemlerRepo.findById(id).get();
	}

	@Override
	public Donemler createDonemler(Donemler donemler) {
		return donemlerRepo.save(donemler);
	}

	@Override
	public Donemler updateDonemler(Integer donemlerId,Donemler donemler) {
		Donemler donemlerToUpdate = donemlerRepo.getOne(donemlerId);
		donemlerToUpdate.setDind(donemler.getDind());
		donemlerToUpdate.setDonem(donemler.getDonem());
		donemlerToUpdate.setKaydeden(donemler.getKaydeden());
		donemlerToUpdate.setKayitTarihi(donemler.getKayitTarihi());
		
		return donemlerRepo.save(donemlerToUpdate);
	}

	@Override
	public boolean deleteDonemler(Integer id) {
		try {
			Donemler donemlerToDelete = donemlerRepo.getOne(id);
			if(donemlerToDelete!=null) {
				donemlerRepo.delete(donemlerToDelete);
				return true;
			}
			return false;
		}catch(Exception e) {
			return false;
		}
		
	}

}
