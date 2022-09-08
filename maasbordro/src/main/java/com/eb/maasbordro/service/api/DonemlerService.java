package com.eb.maasbordro.service.api;

import java.util.List;

import com.eb.maasbordro.model.Donemler;

public interface DonemlerService {
	List<Donemler> 	getAllDonemler();
	Donemler findDonemler(Integer id);
	Donemler createDonemler(Donemler donemler);
	Donemler updateDonemler(Integer donemlerId,Donemler donemler);
	boolean deleteDonemler(Integer id);
}
