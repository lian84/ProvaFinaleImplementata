package com.example.Service;
import java.util.List;

import com.example.Model.Articoli;
public interface ArticoliService {
	//operazioni crud al database
	List<Articoli>getAllArt();
	void saveArt(Articoli articolo);
	Articoli getArtById(String id);
	void deleteArtById(String id);
	Articoli cercaId(String id);
}
