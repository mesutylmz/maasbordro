package com.eb.maasbordro.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eb.maasbordro.model.Personel;
import com.eb.maasbordro.repository.PersonelRepository;
import com.eb.maasbordro.service.api.PersonelService;

@Service
public class PersonelServiceImpl implements PersonelService {

	@Autowired
	PersonelRepository personelRepo;
	
	@Override
	public List<Personel> getAllPersonel() {
		return personelRepo.findAll();
	}

	@Override
	public Personel findPersonel(Integer id) {
		return personelRepo.findById(id).get();
	}

	@Override
	public Personel createPersonel(Personel personel) {
		return personelRepo.save(personel);
		
	}

	@Override
	public Personel updatePersonel(Integer personelId,Personel personel) {
		Personel personelToUpdate = personelRepo.getOne(personelId);
		
		personelToUpdate.setAdSoyad(personel.getAdSoyad());
		personelToUpdate.setIseGirisTarihi(personel.getIseGirisTarihi());
		personelToUpdate.setKaydeden(personel.getKaydeden());
		personelToUpdate.setKayitTarihi(personel.getKayitTarihi());
		personelToUpdate.setMind(personel.getMind());
		personelToUpdate.setPind(personel.getPind());
		personelToUpdate.setSgk(personel.getSgk());
		personelToUpdate.setSifre(personel.getSifre());
		personelToUpdate.setTcNo(personel.getTcNo());

		
		return personelRepo.save(personelToUpdate);
		
	}

	@Override
	public boolean deletePersonel(Integer id) {
		try {
			Personel personelToDelete = personelRepo.getOne(id);
			if(personelToDelete!=null) {
				personelRepo.delete(personelToDelete);
				return true;
			}
			return false;
		}catch(Exception e) {
			return false;
		}
		
	}

	@Override
	public boolean checkLogin(String tcNo, String sifre) {
		List<Personel> personels = personelRepo.findBytcNoAndSifre(tcNo, sifre);
		if(personels != null && personels.size() > 0 ) {
			return true;
		}
		return false;
	}
	
	

}
