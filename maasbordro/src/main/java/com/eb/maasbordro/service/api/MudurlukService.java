package com.eb.maasbordro.service.api;

import java.util.List;

import com.eb.maasbordro.model.Mudurluk;;

public interface MudurlukService {
	
	List<Mudurluk> 	getAllMudurluk();
	Mudurluk findMudurluk(Integer id);
	Mudurluk createMudurluk(Mudurluk mudurluk);
	Mudurluk updateMudurluk(Integer mudurlukId,Mudurluk mudurluk);
	boolean deleteMudurluk(Integer id);

}
