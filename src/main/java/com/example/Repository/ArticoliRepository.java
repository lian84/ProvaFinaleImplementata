package com.example.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Model.Articoli;

@Repository
public interface ArticoliRepository extends JpaRepository<Articoli, String> {

	List<Articoli> findByDescrizioneContaining(String keywords);
	
	
}
