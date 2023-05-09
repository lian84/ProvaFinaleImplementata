package com.example.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Model.Articoli;
import com.example.Repository.ArticoliRepository;
@Service
public class ArticoliServiceImp implements ArticoliService {
	
	@Autowired
	private ArticoliRepository articoliRepository;

	@Override

	public List<Articoli> getAllArt() {
		
		return articoliRepository.findAll();
	}

	@Override
	public void saveArt(Articoli articolo) {
		 this.articoliRepository.save(articolo);

	}

	@Override

	public Articoli getArtById(String id) {
		
		Optional<Articoli>optional=articoliRepository.findById(id);
		Articoli pers=null;
		if (optional.isPresent()) {
			pers=optional.get();
		}else {
			throw new RuntimeException("L'articolo con id "+id+" non è stata trovato");
		}
		return pers;
	}

	@Override
	public void deleteArtById(String id) {
		this.articoliRepository.deleteById(id);

	}

	@Override
	public Articoli cercaId(String id) {
		this.articoliRepository.findById(id);
		return null;
	}
	
	

}
