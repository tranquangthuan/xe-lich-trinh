package thuan.com.fa.demomvc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TuyenXe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long maTuyenXe;

	@Column(name = "tenTuyen", columnDefinition = "nvarchar(255)", nullable = false)
	private String tenTuyen;

	private int donGia;

	public TuyenXe() {
		super();
	}

	public TuyenXe(String tenTuyen, int donGia) {
		super();
		this.tenTuyen = tenTuyen;
		this.donGia = donGia;
	}

	public long getMaTuyenXe() {
		return maTuyenXe;
	}

	public void setMaTuyenXe(long maTuyenXe) {
		this.maTuyenXe = maTuyenXe;
	}

	public String getTenTuyen() {
		return tenTuyen;
	}

	public void setTenTuyen(String tenTuyen) {
		this.tenTuyen = tenTuyen;
	}

	public int getDonGia() {
		return donGia;
	}

	public void setDonGia(int donGia) {
		this.donGia = donGia;
	}

}
