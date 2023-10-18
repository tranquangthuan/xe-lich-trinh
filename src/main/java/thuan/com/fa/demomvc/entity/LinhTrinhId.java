package thuan.com.fa.demomvc.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Embeddable
public class LinhTrinhId implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@NotNull(message = "maXe khong duoc null")
	private long maXe;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@NotNull(message = "ngayXuatBen khong duoc null")
	private LocalDate ngayXuatBen;

	@DateTimeFormat(pattern = "HH:mm")
	@NotNull(message = "gioXuatBen khong duoc null")
	private LocalTime gioXuatBen;

	public LinhTrinhId() {
		super();
	}

	public LinhTrinhId(int maXe, LocalDate ngayXuatBen, LocalTime gioXuatBen) {
		super();
		this.maXe = maXe;
		this.ngayXuatBen = ngayXuatBen;
		this.gioXuatBen = gioXuatBen;
	}

	public long getMaXe() {
		return maXe;
	}

	public void setMaXe(long maXe) {
		this.maXe = maXe;
	}

	public LocalDate getNgayXuatBen() {
		return ngayXuatBen;
	}

	public void setNgayXuatBen(LocalDate ngayXuatBen) {
		this.ngayXuatBen = ngayXuatBen;
	}

	public LocalTime getGioXuatBen() {
		return gioXuatBen;
	}

	public void setGioXuatBen(LocalTime gioXuatBen) {
		this.gioXuatBen = gioXuatBen;
	}

	@Override
	public int hashCode() {
		return Objects.hash(gioXuatBen, maXe, ngayXuatBen);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LinhTrinhId other = (LinhTrinhId) obj;
		return Objects.equals(gioXuatBen, other.gioXuatBen) && maXe == other.maXe
				&& Objects.equals(ngayXuatBen, other.ngayXuatBen);
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
