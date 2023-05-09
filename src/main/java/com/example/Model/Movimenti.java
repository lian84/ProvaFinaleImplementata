package com.example.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="movimento")
public class Movimenti {
	
	@Id
	@Column(name="CODART")
	private String id;
	@Column(name="DESART")
	private String descrizione;
	@Column(name="PRZACQ")
	private Integer prezzoAcquisto;
	@Column(name="ACQUISTATO")
	private Integer acquistato;
	@Column(name="RESO")
	private Integer reso;
	@Column(name="VENDUTO")
	private Integer venduto;
	@Column(name="USCITE")
	private Integer uscite;
	@Column(name="SCADUTI")
	private Integer scaduti;
	
	@ManyToOne
    @JoinColumn(name = "CODART", referencedColumnName = "CODART", insertable = false, updatable = false)
    private Articoli articolo;

	public Movimenti() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Integer getPrezzoAcquisto() {
		return prezzoAcquisto;
	}

	public void setPrezzoAcquisto(Integer prezzoAcquisto) {
		this.prezzoAcquisto = prezzoAcquisto;
	}

	public Integer getAcquistato() {
		return acquistato;
	}

	public void setAcquistato(Integer acquistato) {
		this.acquistato = acquistato;
	}

	public Integer getReso() {
		return reso;
	}

	public void setReso(Integer reso) {
		this.reso = reso;
	}

	public Integer getVenduto() {
		return venduto;
	}

	public void setVenduto(Integer venduto) {
		this.venduto = venduto;
	}

	public Integer getUscite() {
		return uscite;
	}

	public void setUscite(Integer uscite) {
		this.uscite = uscite;
	}

	public Integer getScaduti() {
		return scaduti;
	}

	public void setScaduti(Integer scaduti) {
		this.scaduti = scaduti;
	}

	public Articoli getArticolo() {
		return articolo;
	}

	public void setArticolo(Articoli articolo) {
		this.articolo = articolo;
	}
	

}