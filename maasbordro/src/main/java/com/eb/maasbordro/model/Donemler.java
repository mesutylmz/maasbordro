package com.eb.maasbordro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TBL_DONEMLER")
@NoArgsConstructor
public class Donemler {
 
	@Id
    @Column(name="IND",nullable=false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ind;
    
    @Column(name="DIND")
    private Integer dind;
    
    @Column(name="DONEM",columnDefinition = "nvarchar(50)")
    private String donem;
    
    @Column(name="KAYIT_TARIHI",columnDefinition = "nvarchar(50)")
    private String kayitTarihi;
    
    @Column(name="KAYDEDEN",columnDefinition = "nvarchar(50)")
    private String kaydeden;

	public Integer getInd() {
		return ind;
	}

	public void setInd(Integer ind) {
		this.ind = ind;
	}

	public Integer getDind() {
		return dind;
	}

	public void setDind(Integer dind) {
		this.dind = dind;
	}

	public String getDonem() {
		return donem;
	}

	public void setDonem(String donem) {
		this.donem = donem;
	}

	public String getKayitTarihi() {
		return kayitTarihi;
	}

	public void setKayitTarihi(String kayitTarihi) {
		this.kayitTarihi = kayitTarihi;
	}

	public String getKaydeden() {
		return kaydeden;
	}

	public void setKaydeden(String kaydeden) {
		this.kaydeden = kaydeden;
	}

	
}