package thuan.com.fa.demomvc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NhaXe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long maNhaXe;

	@Column(name = "tenNhanXe", columnDefinition = "nvarchar(255)", nullable = false)
	private String tenNhanXe;

	private int namThanhLap;

//	@OneToMany(mappedBy = "category", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//	private List<Product> products;

	public NhaXe() {
		super();
	}

	public NhaXe(String tenNhanXe, int namThanhLap) {
		super();
		this.tenNhanXe = tenNhanXe;
		this.namThanhLap = namThanhLap;
	}

	public long getMaNhaXe() {
		return maNhaXe;
	}

	public void setMaNhaXe(long maNhaXe) {
		this.maNhaXe = maNhaXe;
	}

	public String getTenNhanXe() {
		return tenNhanXe;
	}

	public void setTenNhanXe(String tenNhanXe) {
		this.tenNhanXe = tenNhanXe;
	}

	public int getNamThanhLap() {
		return namThanhLap;
	}

	public void setNamThanhLap(int namThanhLap) {
		this.namThanhLap = namThanhLap;
	}

}
