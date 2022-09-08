package com.eb.maasbordro.service.api;

import java.util.List;

import com.eb.maasbordro.model.Personel;;

public interface PersonelService {
	List<Personel> 	getAllPersonel();
	
	Personel findPersonel(Integer id);
	Personel createPersonel(Personel personel);
	Personel updatePersonel(Integer personelId,Personel personel);
	boolean deletePersonel(Integer id);
	boolean checkLogin(String tcNo,String sifre);
}
