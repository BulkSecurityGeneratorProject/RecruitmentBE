package com.recruitmentbe.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "nganh")
public class Major {
	@Id
	@Column(name="nganhId")
	private long nganhId;
	
	@Column(name="tenNganh")
	private String tenNganh;
	
	@OneToMany(mappedBy = "nganh", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Skill> kiNang = new ArrayList<>();
	
	@OneToMany(mappedBy = "nganh", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Position> chucVu = new ArrayList<>();
	
	@OneToMany(mappedBy = "nganh", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Job> tinTuyenDung = new ArrayList<>();

	// nghia add
	@OneToMany(mappedBy = "nganh", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Company> congTy = new ArrayList<>();


	@OneToMany(mappedBy = "nganh", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Candidate> ungvien = new ArrayList<>();

	public long getNganhId() {
		return nganhId;
	}

	public void setNganhId(long nganhId) {
		this.nganhId = nganhId;
	}

	public String getTenNganh() {
		return tenNganh;
	}

	public void setTenNganh(String tenNganh) {
		this.tenNganh = tenNganh;
	}

	public List<Skill> getKiNang() {
		return kiNang;
	}

	public void setKiNang(List<Skill> kiNang) {
		this.kiNang = kiNang;
	}

	public List<Position> getChucVu() {
		return chucVu;
	}

	public void setChucVu(List<Position> chucVu) {
		this.chucVu = chucVu;
	}

	public List<Job> getTinTuyenDung() {
		return tinTuyenDung;
	}

	public void setTinTuyenDung(List<Job> tinTuyenDung) {
		this.tinTuyenDung = tinTuyenDung;
	}

	public List<Candidate> getUngvien() {
		return ungvien;
	}

	public void setUngvien(List<Candidate> ungvien) {
		this.ungvien = ungvien;
	}

	public List<Company> getCongTy() {
		return congTy;
	}

	public void setCongTy(List<Company> congTy) {
		this.congTy = congTy;
	}
	
}
