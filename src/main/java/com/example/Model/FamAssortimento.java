package com.example.Model;

import javax.persistence.*;

@Entity
@Table(name = "famassort")
public class FamAssortimento {

    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "DESCRIZIONE")
    private String descrizione;


	public FamAssortimento() {
		super();
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getDescrizione() {
		return descrizione;
	}


	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
}
