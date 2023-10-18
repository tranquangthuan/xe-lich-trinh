package thuan.com.fa.demomvc.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import thuan.com.fa.demomvc.entity.LoaiXe;

@Repository
public class LoaiXeRepositoryImpl {

	@Autowired
	private SessionFactory sessionFactory;

	public List<LoaiXe> findAll() {
		Session session = sessionFactory.getCurrentSession();
		List<LoaiXe> loaiXes = session.createQuery("SELECT p FROM LoaiXe p", LoaiXe.class).getResultList();
		return loaiXes;
	}
}
