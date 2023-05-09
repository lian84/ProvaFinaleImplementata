package com.example.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
@Table(name="articolo")
public class Articoli {
	
	@Id
	@Column(name="CODART")
	private String id;
	@Column(name="DESCRIZIONE")
	private String descrizione;
	@Column(name="UM")
	private String um;
	@Column(name="CODSTAT")
	private String codstat;
	@Column(name="PZCART")
	private Integer pzCart;
	@Column(name="PESONETTO")
	private Integer psNetto;
	@Column(name="IDIVA")
	private Integer idIVA;
	@Column(name="IDSTATOART")
	private String idStatoArt;
	@Column(name="DATACREAZIONE")
	@Temporal(TemporalType.DATE)
	private Date dataCreazione;
	@Column(name="IDFAMASS")
	private Integer idFamAss;
	
	@OneToOne
    @JoinColumn(name = "IDFAMASS", referencedColumnName = "ID", insertable = false, updatable = false)
    private FamAssortimento famAssortimento;

	
	public Articoli() {
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


	public String getUm() {
		return um;
	}


	public void setUm(String um) {
		this.um = um;
	}


	public String getCodstat() {
		return codstat;
	}


	public void setCodstat(String codstat) {
		this.codstat = codstat;
	}


	public Integer getPzCart() {
		return pzCart;
	}


	public void setPzCart(Integer pzCart) {
		this.pzCart = pzCart;
	}


	public Integer getPsNetto() {
		return psNetto;
	}


	public void setPsNetto(Integer psNetto) {
		this.psNetto = psNetto;
	}


	public Integer getIdIVA() {
		return idIVA;
	}


	public void setIdIVA(Integer idIVA) {
		this.idIVA = idIVA;
	}


	public String getIdStatoArt() {
		return idStatoArt;
	}


	public void setIdStatoArt(String idStatoArt) {
		this.idStatoArt = idStatoArt;
	}


	public Date getDataCreazione() {
		return dataCreazione;
	}


	public void setDataCreazione(Date dataCreazione) {
		this.dataCreazione = dataCreazione;
	}


	public Integer getIdFamAss() {
		return idFamAss;
	}


	public void setIdFamAss(Integer idFamAss) {
		this.idFamAss = idFamAss;
	}

}