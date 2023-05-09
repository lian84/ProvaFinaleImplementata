package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Model.Articoli;
import com.example.Model.Movimenti;

import java.util.List;

@Repository
public interface MovimentiRepository extends JpaRepository<Movimenti, String> {

    List<Movimenti> findByArticolo(Articoli articolo);

    
}