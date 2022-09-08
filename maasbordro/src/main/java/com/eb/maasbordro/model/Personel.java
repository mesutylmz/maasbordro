package com.eb.maasbordro.model;

import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name = "TBL_PERSONEL")
@NoArgsConstructor
public class Personel {
	@Id
    @Column(name="IND",nullable=false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ind;
    
    @Column(name="PIND")
    private Integer pind;
    
    @Column(name="MIND")
    private Integer mind;
    
    @Column(name="TC_NO",columnDefinition = "nvarchar(11)")
    private String tcNo;
    
	@Column(name="AD_SOYAD",columnDefinition = "nvarchar(50)")
    private String adSoyad;
    
    @Column(name="ISE_GIRIS_TARIHI",columnDefinition = "nvarchar(50)")
    private String iseGirisTarihi;
    
    @Column(name="SGK",columnDefinition = "nvarchar(50)")
    private String sgk;
    
    @Column(name="SIFRE",columnDefinition = "nvarchar(20)")
    private String sifre;
    
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

	public Integer getPind() {
		return pind;
	}

	public void setPind(Integer pind) {
		this.pind = pind;
	}

	public Integer getMind() {
		return mind;
	}

	public void setMind(Integer mind) {
		this.mind = mind;
	}

	public String getTcNo() {
		return tcNo;
	}

	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}

	public String getAdSoyad() {
		return adSoyad;
	}

	public void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad;
	}

	public String getIseGirisTarihi() {
		return iseGirisTarihi;
	}

	public void setIseGirisTarihi(String iseGirisTarihi) {
		this.iseGirisTarihi = iseGirisTarihi;
	}

	public String getSgk() {
		return sgk;
	}

	public void setSgk(String sgk) {
		this.sgk = sgk;
	}

	public String getSifre() {
		return sifre;
	}

	public void setSifre(String sifre) {
		this.sifre = sifre;
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