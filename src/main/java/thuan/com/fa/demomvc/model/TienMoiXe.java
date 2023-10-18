package thuan.com.fa.demomvc.model;

public class TienMoiXe {

	private long maXe;
	private Long tongTien = 0l;

	public TienMoiXe() {
		super();
	}

	public TienMoiXe(long maXe, Long tongTien) {
		super();
		this.maXe = maXe;
		if (tongTien == null) {
			tongTien = 0l;
		}
		this.tongTien = tongTien;
	}

	public long getMaXe() {
		return maXe;
	}

	public void setMaXe(long maXe) {
		this.maXe = maXe;
	}

	public Long getTongTien() {
		return tongTien;
	}

	public void setTongTien(Long tongTien) {
		if (tongTien == null) {
			tongTien = 0l;
		}
		this.tongTien = tongTien;
	}

	@Override
	public String toString() {
		return "TienMoiXe [maXe=" + maXe + ", tongTien=" + tongTien + "]";
	}

}
