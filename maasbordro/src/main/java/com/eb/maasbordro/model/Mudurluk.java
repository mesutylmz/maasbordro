package com.eb.maasbordro.model;

import javax.persistence.*;

import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name = "TBL_MUDURLUK")
@NoArgsConstructor
public class Mudurluk {
	@Id
    @Column(name="IND",nullable=false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ind;
    
    @Column(name="MIND")
    private Integer mind;
    
    @Column(name="MUDURLUGU",columnDefinition = "nvarchar(150)")
    private String mudurlugu;

	public Integer getInd() {
		return ind;
	}

	public void setInd(Integer ind) {
		this.ind = ind;
	}

	public Integer getMind() {
		return mind;
	}

	public void setMind(Integer mind) {
		this.mind = mind;
	}

	public String getMudurlugu() {
		return mudurlugu;
	}

	public void setMudurlugu(String mudurlugu) {
		this.mudurlugu = mudurlugu;
	}
    
    
   
}