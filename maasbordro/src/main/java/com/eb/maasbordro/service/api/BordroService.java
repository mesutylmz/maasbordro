package com.eb.maasbordro.service.api;

import java.util.List;

import com.eb.maasbordro.model.Bordro;
import com.eb.maasbordro.model.Personel;

public interface BordroService {
	List<Bordro> 	getAllBordos();
	Bordro	findBordro	(Integer id);
	List<Bordro> getByPindAndDind(Integer pind,Integer dind);
	Bordro 	createBordro(Bordro role);
	Bordro	updateBordro(Integer bordroId,Bordro role);
	boolean	deleteBordro(Integer id);
}
