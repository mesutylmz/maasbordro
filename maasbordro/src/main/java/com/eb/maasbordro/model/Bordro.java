package com.eb.maasbordro.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;

import org.hibernate.annotations.Type;

import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name = "TBL_BORDRO")
@NoArgsConstructor
public class Bordro {
   
	@Id
    @Column(name="IND",nullable=false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ind;
    
    @Column(name="PIND")
    private Integer pind;
    
    @Column(name="DIND")
    private Integer dind;
    
    @Column(name="MIND")
    private Integer mind;
    
    @Column(name="GUN")
    private Integer gun;
    
    @Column(name="NORMAL_KAZANC", precision=18, scale=2)
    @Type(type = "big_decimal")
    private BigDecimal normalKazanc;
 
    @Column(name="DIGER_KAZANC", precision=18, scale=2)
    @Type(type = "big_decimal")
    private BigDecimal digerKazanc;
    
    @Column(name="TOPLAM_KAZANC", precision=18, scale=2)
    @Type(type = "big_decimal")
    private BigDecimal toplamKazanc;
    
    @Column(name="SSK_MATRAHI", precision=18, scale=2)
    @Type(type = "big_decimal")
    private BigDecimal sskMatrahi;
    
    @Column(name="SSK_PRIMI", precision=18, scale=2)
    @Type(type = "big_decimal")
    private BigDecimal sskPrimi;
    
    @Column(name="ISSIZLIK_PRIMI", precision=18, scale=2)
    @Type(type = "big_decimal")
    private BigDecimal issizlikPrimi;
    
    @Column(name="GVM_AYLIK", precision=18, scale=2)
    @Type(type = "big_decimal")
    private BigDecimal gvmAylik;
    
    @Column(name="GVM_TOPLAM", precision=18, scale=2)
    @Type(type = "big_decimal")
    private BigDecimal gvmToplam;
    
    @Column(name="GELIR_VERGISI", precision=18, scale=2)
    @Type(type = "big_decimal")
    private BigDecimal gelirVergisi;
    
    @Column(name="AGI", precision=18, scale=2)
    @Type(type = "big_decimal")
    private BigDecimal agi;
    
    @Column(name="KALAN_GELIR_VERGISI", precision=18, scale=2)
    @Type(type = "big_decimal")
    private BigDecimal kalanGelirVergisi;
    
    @Column(name="DAMGA_VERGISI", precision=18, scale=2)
    @Type(type = "big_decimal")
    private BigDecimal damgaVergisi;
    
    @Column(name="OZEL_KESINTI", precision=18, scale=2)
    @Type(type = "big_decimal")
    private BigDecimal ozelKesinti;
    
    @Column(name="AGI_HARIC_UCRET", precision=18, scale=2)
    @Type(type = "big_decimal")
    private BigDecimal agiHaricUcret;
    
    @Column(name="NET_ISTIHKAK", precision=18, scale=2)
    @Type(type = "big_decimal")
    private BigDecimal netIstihkak;
    
    @Column(name="NORMAL_UCRET", precision=18, scale=2)
    @Type(type = "big_decimal")
    private BigDecimal normalUcret;
    
    @Column(name="GUN_UCRET", precision=18, scale=2)
    @Type(type = "big_decimal")
    private BigDecimal gunUcret;
    
    @Column(name="FAZLA_MESAI_UCRET", precision=18, scale=2)
    @Type(type = "big_decimal")
    private BigDecimal fazlaMesaiUcret;
    
    @Column(name="FAZLA_MESAI_SAAT",columnDefinition = "nvarchar(50)")
    private String fazlaMesaiSaat;
    
    @Column(name="TATIL_MESAI_UCRET", precision=18, scale=2)
    @Type(type = "big_decimal")
    private BigDecimal tatilMesaiUcret;
    
    @Column(name="TATIL_MESAI_GUN",columnDefinition = "nvarchar(50)")
    private String tatilMesaiGun;
    
    @Column(name="YEMEK_UCRETI", precision=18, scale=2)
    @Type(type = "big_decimal")
    private BigDecimal yemekUcreti;
    
    @Column(name="YEMEK_GUNU",columnDefinition = "nvarchar(50)")
    private String yemekGunu;
    
    @Column(name="COCUK_UCRETI", precision=18, scale=2)
    @Type(type = "big_decimal")
    private BigDecimal cocukUcreti;
    
    @Column(name="PRIM", precision=18, scale=2)
    @Type(type = "big_decimal")
    private BigDecimal prim;
    
    @Column(name="YAKACAK_UCRETI", precision=18, scale=2)
    @Type(type = "big_decimal")
    private BigDecimal yakacakUcreti;
    
    @Column(name="HAFTASONU_MESAI_UCRETI", precision=18, scale=2)
    @Type(type = "big_decimal")
    private BigDecimal haftasonuMesaiUcreti;
    
    @Column(name="HAFTASONU_MESAI_GUNU",columnDefinition = "nvarchar(50)")
    private String haftasonuMesaiGunu;
    
    @Column(name="SENDIKA_KESINTISI", precision=18, scale=2)
    @Type(type = "big_decimal")
    private BigDecimal sendikaKesintisi;
    
    @Column(name="AILE", precision=18, scale=2)
    @Type(type = "big_decimal")
    private BigDecimal aile;
    
    @Column(name="OTO_KAT_BE", precision=18, scale=2)
    @Type(type = "big_decimal")
    private BigDecimal otoKatBe;
    
    @Column(name="AVANS", precision=18, scale=2)
    @Type(type = "big_decimal")
    private BigDecimal avans;
    
    @Column(name="ICRA_KESINTISI", precision=18, scale=2)
    @Type(type = "big_decimal")
    private BigDecimal icraKesintisi;
    
    @Column(name="RAPOR_UCRETI", precision=18, scale=2)
    @Type(type = "big_decimal")
    private BigDecimal raporUcreti;
    
    @Column(name="RAPOR_GUN",columnDefinition = "nvarchar(50)")
    private String raporGun;
    
    @Column(name="NAFAGA_UCRETI", precision=18, scale=2)
    @Type(type = "big_decimal")
    private BigDecimal nafagaUcreti;
    
    @Column(name="KAYIT_TARIHI")
    private Date kayitTarihi;
    
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

	public Integer getDind() {
		return dind;
	}

	public void setDind(Integer dind) {
		this.dind = dind;
	}

	public Integer getMind() {
		return mind;
	}

	public void setMind(Integer mind) {
		this.mind = mind;
	}

	public Integer getGun() {
		return gun;
	}

	public void setGun(Integer gun) {
		this.gun = gun;
	}

	public BigDecimal getNormalKazanc() {
		return normalKazanc;
	}

	public void setNormalKazanc(BigDecimal normalKazanc) {
		this.normalKazanc = normalKazanc;
	}

	public BigDecimal getDigerKazanc() {
		return digerKazanc;
	}

	public void setDigerKazanc(BigDecimal digerKazanc) {
		this.digerKazanc = digerKazanc;
	}

	public BigDecimal getToplamKazanc() {
		return toplamKazanc;
	}

	public void setToplamKazanc(BigDecimal toplamKazanc) {
		this.toplamKazanc = toplamKazanc;
	}

	public BigDecimal getSskMatrahi() {
		return sskMatrahi;
	}

	public void setSskMatrahi(BigDecimal sskMatrahi) {
		this.sskMatrahi = sskMatrahi;
	}

	public BigDecimal getSskPrimi() {
		return sskPrimi;
	}

	public void setSskPrimi(BigDecimal sskPrimi) {
		this.sskPrimi = sskPrimi;
	}

	public BigDecimal getIssizlikPrimi() {
		return issizlikPrimi;
	}

	public void setIssizlikPrimi(BigDecimal issizlikPrimi) {
		this.issizlikPrimi = issizlikPrimi;
	}

	public BigDecimal getGvmAylik() {
		return gvmAylik;
	}

	public void setGvmAylik(BigDecimal gvmAylik) {
		this.gvmAylik = gvmAylik;
	}

	public BigDecimal getGvmToplam() {
		return gvmToplam;
	}

	public void setGvmToplam(BigDecimal gvmToplam) {
		this.gvmToplam = gvmToplam;
	}

	public BigDecimal getGelirVergisi() {
		return gelirVergisi;
	}

	public void setGelirVergisi(BigDecimal gelirVergisi) {
		this.gelirVergisi = gelirVergisi;
	}

	public BigDecimal getAgi() {
		return agi;
	}

	public void setAgi(BigDecimal agi) {
		this.agi = agi;
	}

	public BigDecimal getKalanGelirVergisi() {
		return kalanGelirVergisi;
	}

	public void setKalanGelirVergisi(BigDecimal kalanGelirVergisi) {
		this.kalanGelirVergisi = kalanGelirVergisi;
	}

	public BigDecimal getDamgaVergisi() {
		return damgaVergisi;
	}

	public void setDamgaVergisi(BigDecimal damgaVergisi) {
		this.damgaVergisi = damgaVergisi;
	}

	public BigDecimal getOzelKesinti() {
		return ozelKesinti;
	}

	public void setOzelKesinti(BigDecimal ozelKesinti) {
		this.ozelKesinti = ozelKesinti;
	}

	public BigDecimal getAgiHaricUcret() {
		return agiHaricUcret;
	}

	public void setAgiHaricUcret(BigDecimal agiHaricUcret) {
		this.agiHaricUcret = agiHaricUcret;
	}

	public BigDecimal getNetIstihkak() {
		return netIstihkak;
	}

	public void setNetIstihkak(BigDecimal netIstihkak) {
		this.netIstihkak = netIstihkak;
	}

	public BigDecimal getNormalUcret() {
		return normalUcret;
	}

	public void setNormalUcret(BigDecimal normalUcret) {
		this.normalUcret = normalUcret;
	}

	public BigDecimal getGunUcret() {
		return gunUcret;
	}

	public void setGunUcret(BigDecimal gunUcret) {
		this.gunUcret = gunUcret;
	}

	public BigDecimal getFazlaMesaiUcret() {
		return fazlaMesaiUcret;
	}

	public void setFazlaMesaiUcret(BigDecimal fazlaMesaiUcret) {
		this.fazlaMesaiUcret = fazlaMesaiUcret;
	}

	public String getFazlaMesaiSaat() {
		return fazlaMesaiSaat;
	}

	public void setFazlaMesaiSaat(String fazlaMesaiSaat) {
		this.fazlaMesaiSaat = fazlaMesaiSaat;
	}

	public BigDecimal getTatilMesaiUcret() {
		return tatilMesaiUcret;
	}

	public void setTatilMesaiUcret(BigDecimal tatilMesaiUcret) {
		this.tatilMesaiUcret = tatilMesaiUcret;
	}

	public String getTatilMesaiGun() {
		return tatilMesaiGun;
	}

	public void setTatilMesaiGun(String tatilMesaiGun) {
		this.tatilMesaiGun = tatilMesaiGun;
	}

	public BigDecimal getYemekUcreti() {
		return yemekUcreti;
	}

	public void setYemekUcreti(BigDecimal yemekUcreti) {
		this.yemekUcreti = yemekUcreti;
	}

	public String getYemekGunu() {
		return yemekGunu;
	}

	public void setYemekGunu(String yemekGunu) {
		this.yemekGunu = yemekGunu;
	}

	public BigDecimal getCocukUcreti() {
		return cocukUcreti;
	}

	public void setCocukUcreti(BigDecimal cocukUcreti) {
		this.cocukUcreti = cocukUcreti;
	}

	public BigDecimal getPrim() {
		return prim;
	}

	public void setPrim(BigDecimal prim) {
		this.prim = prim;
	}

	public BigDecimal getYakacakUcreti() {
		return yakacakUcreti;
	}

	public void setYakacakUcreti(BigDecimal yakacakUcreti) {
		this.yakacakUcreti = yakacakUcreti;
	}

	public BigDecimal getHaftasonuMesaiUcreti() {
		return haftasonuMesaiUcreti;
	}

	public void setHaftasonuMesaiUcreti(BigDecimal haftasonuMesaiUcreti) {
		this.haftasonuMesaiUcreti = haftasonuMesaiUcreti;
	}

	public String getHaftasonuMesaiGunu() {
		return haftasonuMesaiGunu;
	}

	public void setHaftasonuMesaiGunu(String haftasonuMesaiGunu) {
		this.haftasonuMesaiGunu = haftasonuMesaiGunu;
	}

	public BigDecimal getSendikaKesintisi() {
		return sendikaKesintisi;
	}

	public void setSendikaKesintisi(BigDecimal sendikaKesintisi) {
		this.sendikaKesintisi = sendikaKesintisi;
	}

	public BigDecimal getAile() {
		return aile;
	}

	public void setAile(BigDecimal aile) {
		this.aile = aile;
	}

	public BigDecimal getOtoKatBe() {
		return otoKatBe;
	}

	public void setOtoKatBe(BigDecimal otoKatBe) {
		this.otoKatBe = otoKatBe;
	}

	public BigDecimal getAvans() {
		return avans;
	}

	public void setAvans(BigDecimal avans) {
		this.avans = avans;
	}

	public BigDecimal getIcraKesintisi() {
		return icraKesintisi;
	}

	public void setIcraKesintisi(BigDecimal icraKesintisi) {
		this.icraKesintisi = icraKesintisi;
	}

	public BigDecimal getRaporUcreti() {
		return raporUcreti;
	}

	public void setRaporUcreti(BigDecimal raporUcreti) {
		this.raporUcreti = raporUcreti;
	}

	public String getRaporGun() {
		return raporGun;
	}

	public void setRaporGun(String raporGun) {
		this.raporGun = raporGun;
	}

	public BigDecimal getNafagaUcreti() {
		return nafagaUcreti;
	}

	public void setNafagaUcreti(BigDecimal nafagaUcreti) {
		this.nafagaUcreti = nafagaUcreti;
	}

	public Date getKayitTarihi() {
		return kayitTarihi;
	}

	public void setKayitTarihi(Date kayitTarihi) {
		this.kayitTarihi = kayitTarihi;
	}

	public String getKaydeden() {
		return kaydeden;
	}

	public void setKaydeden(String kaydeden) {
		this.kaydeden = kaydeden;
	}

	
	
    

}