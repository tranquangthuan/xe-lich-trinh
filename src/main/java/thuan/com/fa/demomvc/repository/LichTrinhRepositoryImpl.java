package thuan.com.fa.demomvc.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import thuan.com.fa.demomvc.entity.LichTrinh;

@Repository
public class LichTrinhRepositoryImpl {

	@Autowired
	private SessionFactory sessionFactory;

	public List<LichTrinh> findAll() {
		Session session = sessionFactory.getCurrentSession();
		List<LichTrinh> LichTrinhs = session.createQuery("SELECT p FROM LichTrinh p", LichTrinh.class).getResultList();
		return LichTrinhs;
	}

	public void saveOrUpdate(LichTrinh LichTrinh) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(LichTrinh);
	}

	public LichTrinh findById(long id) {
		Session session = sessionFactory.getCurrentSession();
		return session.find(LichTrinh.class, id);
	}

	public List<LichTrinh> search(String searchKey) {
		Session session = sessionFactory.getCurrentSession();
		Query<LichTrinh> createQuery = session.createQuery(
				"SELECT lt FROM LichTrinh lt  where lt.xe.nhaXe.tenNhanXe like :searchKey", LichTrinh.class);
		createQuery.setParameter("searchKey", "%" + searchKey + "%");
		List<LichTrinh> lichTrinhs = createQuery.getResultList();
		return lichTrinhs;
	}

}
