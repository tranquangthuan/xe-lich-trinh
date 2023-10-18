package thuan.com.fa.demomvc.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import thuan.com.fa.demomvc.entity.NhaXe;

@Repository
public class NhaXeRepositoryImpl {

	@Autowired
	private SessionFactory sessionFactory;

	public List<NhaXe> findAll() {
		Session session = sessionFactory.getCurrentSession();
		List<NhaXe> nhaXes = session.createQuery("SELECT p FROM NhaXe p", NhaXe.class).getResultList();
		return nhaXes;
	}
}
