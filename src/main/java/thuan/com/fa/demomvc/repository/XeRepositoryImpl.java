package thuan.com.fa.demomvc.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import thuan.com.fa.demomvc.entity.Xe;
import thuan.com.fa.demomvc.model.TienMoiXe;

@Repository
public class XeRepositoryImpl {

	@Autowired
	private SessionFactory sessionFactory;

	public List<Xe> findAll() {
		Session session = sessionFactory.getCurrentSession();
		List<Xe> xes = session.createQuery("SELECT p FROM Xe p", Xe.class).getResultList();
		return xes;
	}

	public void saveOrUpdate(Xe Xe) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(Xe);
	}

	public Xe findById(long id) {
		Session session = sessionFactory.getCurrentSession();
		return session.find(Xe.class, id);
	}

	public List<TienMoiXe> tien() {
		Session session = sessionFactory.getCurrentSession();
		List<TienMoiXe> xes = session
				.createQuery(
						"SELECT new thuan.com.fa.demomvc.model.TienMoiXe(xe.maXe, sum(tx.donGia * lt.soLuongHanhKhach))"
								+ " FROM Xe xe left join LichTrinh lt on xe = lt.xe "
								+ " left join TuyenXe tx on lt.tuyenXe = tx "
								+ " group by xe.maXe",
						TienMoiXe.class)
				.getResultList();
		for (TienMoiXe tienMoiXe : xes) {
			System.out.println(tienMoiXe);
		}
		return xes;
	}

}
