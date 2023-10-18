package thuan.com.fa.demomvc.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import thuan.com.fa.demomvc.entity.TuyenXe;

@Repository
public class TuyenXeRepositoryImpl {

	@Autowired
	private SessionFactory sessionFactory;

	public List<TuyenXe> findAll() {
		Session session = sessionFactory.getCurrentSession();
		List<TuyenXe> tuyenXes = session.createQuery("SELECT p FROM TuyenXe p", TuyenXe.class).getResultList();
		return tuyenXes;
	}
}
