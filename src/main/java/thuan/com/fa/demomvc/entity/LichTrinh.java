package thuan.com.fa.demomvc.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.validation.Valid;

@Entity
public class LichTrinh {

	@EmbeddedId
	@Valid
	private LinhTrinhId id;

	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("maXe")
	@JoinColumn(name = "maXe", referencedColumnName = "maXe")
	private Xe xe;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "maTuyen", referencedColumnName = "maTuyenXe")
	private TuyenXe tuyenXe;

	private String tenTaiXe;

	private int soLuongHanhKhach;

	public LichTrinh() {
		super();
	}

	public LichTrinh(Xe xe, TuyenXe tuyenXe, String tenTaiXe, int soLuongHanhKhach) {
		super();
		this.xe = xe;
		this.tuyenXe = tuyenXe;
		this.tenTaiXe = tenTaiXe;
		this.soLuongHanhKhach = soLuongHanhKhach;
	}

	public LichTrinh(TuyenXe tuyenXe, String tenTaiXe, int soLuongHanhKhach) {
		super();
		this.tuyenXe = tuyenXe;
		this.tenTaiXe = tenTaiXe;
		this.soLuongHanhKhach = soLuongHanhKhach;
	}

	public LinhTrinhId getId() {
		return id;
	}

	public void setId(LinhTrinhId id) {
		this.id = id;
	}

	public TuyenXe getTuyenXe() {
		return tuyenXe;
	}

	public void setTuyenXe(TuyenXe tuyenXe) {
		this.tuyenXe = tuyenXe;
	}

	public String getTenTaiXe() {
		return tenTaiXe;
	}

	public void setTenTaiXe(String tenTaiXe) {
		this.tenTaiXe = tenTaiXe;
	}

	public int getSoLuongHanhKhach() {
		return soLuongHanhKhach;
	}

	public void setSoLuongHanhKhach(int soLuongHanhKhach) {
		this.soLuongHanhKhach = soLuongHanhKhach;
	}

	public Xe getXe() {
		return xe;
	}

	public void setXe(Xe xe) {
		this.xe = xe;
	}

}
