package thuan.com.fa.demomvc.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

import thuan.com.fa.demomvc.annotation.HanKiemDinh;

@Entity
public class Xe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long maXe;

	@Column(name = "hangSanXuat", columnDefinition = "nvarchar(255)", nullable = false)
	private String hangSanXuat;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "loaiXe_id", referencedColumnName = "maLoaiXe")
	private LoaiXe loaiXe;

	@Column(name = "bienSo", columnDefinition = "nvarchar(255)", nullable = false)
	private String bienSo;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@HanKiemDinh(message = "PHai nhap han kiem dinh lon hon > 30 ngay so voi hien tai")
	private LocalDate hanKiemDInh;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "nhaXe_id", referencedColumnName = "maNhaXe")
	private NhaXe nhaXe;

	public Xe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Xe(String hangSanXuat, LoaiXe loaiXe, String bienSo, LocalDate hanKiemDInh, NhaXe nhaXe) {
		super();
		this.hangSanXuat = hangSanXuat;
		this.loaiXe = loaiXe;
		this.bienSo = bienSo;
		this.hanKiemDInh = hanKiemDInh;
		this.nhaXe = nhaXe;
	}

	public long getMaXe() {
		return maXe;
	}

	public void setMaXe(long maXe) {
		this.maXe = maXe;
	}

	public String getHangSanXuat() {
		return hangSanXuat;
	}

	public void setHangSanXuat(String hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}

	public LoaiXe getLoaiXe() {
		return loaiXe;
	}

	public void setLoaiXe(LoaiXe loaiXe) {
		this.loaiXe = loaiXe;
	}

	public String getBienSo() {
		return bienSo;
	}

	public void setBienSo(String bienSo) {
		this.bienSo = bienSo;
	}

	public LocalDate getHanKiemDInh() {
		return hanKiemDInh;
	}

	public void setHanKiemDInh(LocalDate hanKiemDInh) {
		this.hanKiemDInh = hanKiemDInh;
	}

	public NhaXe getNhaXe() {
		return nhaXe;
	}

	public void setNhaXe(NhaXe nhaXe) {
		this.nhaXe = nhaXe;
	}

}
