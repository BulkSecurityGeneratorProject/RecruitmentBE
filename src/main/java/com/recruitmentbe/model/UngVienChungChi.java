package com.recruitmentbe.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ungvien_ngoaingu")
@IdClass(IdUngVienChungChi.class)
public class UngVienChungChi {
	@Id
    @ManyToOne
    @JoinColumn(name = "ungvienId")
    private Candidate ungVien;

    @Id
    @ManyToOne
    @JoinColumn(name = "chungChiId")
    private Certificate chungChi;

    @Column(name = "diemSo")
    private String diemSo;

	public Candidate getUngVien() {
		return ungVien;
	}

	public void setUngVien(Candidate ungVien) {
		this.ungVien = ungVien;
	}

	public Certificate getChungChi() {
		return chungChi;
	}

	public void setChungChi(Certificate chungChi) {
		this.chungChi = chungChi;
	}

	public String getDiemSo() {
		return diemSo;
	}

	public void setDiemSo(String diemSo) {
		this.diemSo = diemSo;
	}
    
    

}
