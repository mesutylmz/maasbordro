package com.eb.maasbordro.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eb.maasbordro.model.Bordro;
import com.eb.maasbordro.model.Personel;
import com.eb.maasbordro.repository.BordroRepository;
import com.eb.maasbordro.service.api.BordroService;

@Service
public class BordroServiceImpl implements BordroService{

	@Autowired
	BordroRepository bordroRepo;
	
	@Override
	public List<Bordro> getAllBordos() {
		return bordroRepo.findAll();
	}

	@Override
	public Bordro findBordro(Integer id) {
		return bordroRepo.findById(id).get();
	}

	@Override
	public Bordro createBordro(Bordro bordro) {
		return bordroRepo.save(bordro);
		
	}

	@Override
	public Bordro updateBordro(Integer bordroId,Bordro bordro) {
		Bordro bordroToUpdate = bordroRepo.getOne(bordroId);
		bordroToUpdate.setInd(bordroId);
		bordroToUpdate.setAgi(bordro.getAgi());
		bordroToUpdate.setAgiHaricUcret(bordro.getAgiHaricUcret());
		bordroToUpdate.setAile(bordro.getAile());
		bordroToUpdate.setAvans(bordro.getAvans());
		bordroToUpdate.setCocukUcreti(bordro.getCocukUcreti());
		bordroToUpdate.setDamgaVergisi(bordro.getDamgaVergisi());
		bordroToUpdate.setDigerKazanc(bordro.getDigerKazanc());
		bordroToUpdate.setDind(bordro.getDind());
		bordroToUpdate.setFazlaMesaiSaat(bordro.getFazlaMesaiSaat());
		bordroToUpdate.setFazlaMesaiUcret(bordro.getFazlaMesaiUcret());
		bordroToUpdate.setGelirVergisi(bordro.getGelirVergisi());
		bordroToUpdate.setGun(bordro.getGun());
		bordroToUpdate.setGunUcret(bordro.getGunUcret());
		bordroToUpdate.setGvmAylik(bordro.getGvmAylik());
		bordroToUpdate.setGvmToplam(bordro.getGvmToplam());
		bordroToUpdate.setHaftasonuMesaiGunu(bordro.getHaftasonuMesaiGunu());
		bordroToUpdate.setHaftasonuMesaiUcreti(bordro.getHaftasonuMesaiUcreti());
		bordroToUpdate.setIcraKesintisi(bordro.getIcraKesintisi());
		bordroToUpdate.setIssizlikPrimi(bordro.getIssizlikPrimi());
		bordroToUpdate.setKalanGelirVergisi(bordro.getKalanGelirVergisi());
		bordroToUpdate.setKaydeden(bordro.getKaydeden());
		bordroToUpdate.setKayitTarihi(bordro.getKayitTarihi());
		bordroToUpdate.setMind(bordro.getMind());
		bordroToUpdate.setNafagaUcreti(bordro.getNafagaUcreti());
		bordroToUpdate.setNetIstihkak(bordro.getNetIstihkak());
		bordroToUpdate.setNormalKazanc(bordro.getNormalKazanc());
		bordroToUpdate.setNormalUcret(bordro.getNormalUcret());
		bordroToUpdate.setOtoKatBe(bordro.getOtoKatBe());
		bordroToUpdate.setOzelKesinti(bordro.getOzelKesinti());
		bordroToUpdate.setPind(bordro.getPind());
		bordroToUpdate.setPrim(bordro.getPrim());
		bordroToUpdate.setRaporGun(bordro.getRaporGun());
		bordroToUpdate.setRaporUcreti(bordro.getRaporUcreti());
		bordroToUpdate.setSendikaKesintisi(bordro.getSendikaKesintisi());
		bordroToUpdate.setSskMatrahi(bordro.getSskMatrahi());
		bordroToUpdate.setSskPrimi(bordro.getSskPrimi());
		bordroToUpdate.setTatilMesaiGun(bordro.getTatilMesaiGun());
		bordroToUpdate.setTatilMesaiUcret(bordro.getTatilMesaiUcret());
		bordroToUpdate.setToplamKazanc(bordro.getToplamKazanc());
		bordroToUpdate.setYakacakUcreti(bordro.getYakacakUcreti());
		bordroToUpdate.setYemekGunu(bordro.getYemekGunu());
		bordroToUpdate.setYemekUcreti(bordro.getYemekUcreti());
			
		return bordroRepo.save(bordroToUpdate);
		
	}

	@Override
	public boolean deleteBordro(Integer id) {
		try {
			Bordro bordroToDelete = bordroRepo.findById(id).get();
			if(bordroToDelete!=null) {
				bordroRepo.delete(bordroToDelete);
				return true;
			}
			return false;
		}
		catch(Exception e) {
			return false;
		}
	}

	@Override
	public List<Bordro> getByPindAndDind(Integer pind,Integer dind) {
		return bordroRepo.findByPindAndDind(pind, dind);
	}

}
