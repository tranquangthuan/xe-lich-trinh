package thuan.com.fa.demomvc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LoaiXe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long maLoaiXe;

	@Column(name = "moTa", columnDefinition = "nvarchar(255)", nullable = false)
	private String moTa;

	private int soLuongChoNgoi;

//	@OneToMany(mappedBy = "category", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//	private List<Product> products;

	public LoaiXe() {
		super();
	}

	public LoaiXe(String moTa, int soLuongChoNgoi) {
		super();
		this.moTa = moTa;
		this.soLuongChoNgoi = soLuongChoNgoi;
	}

	public long getMaLoaiXe() {
		return maLoaiXe;
	}

	public void setMaLoaiXe(long maLoaiXe) {
		this.maLoaiXe = maLoaiXe;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	public int getSoLuongChoNgoi() {
		return soLuongChoNgoi;
	}

	public void setSoLuongChoNgoi(int soLuongChoNgoi) {
		this.soLuongChoNgoi = soLuongChoNgoi;
	}

}
