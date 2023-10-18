package thuan.com.fa.demomvc.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import thuan.com.fa.demomvc.entity.Xe;
import thuan.com.fa.demomvc.model.TienMoiXe;
import thuan.com.fa.demomvc.repository.XeRepositoryImpl;

@Service
public class XeServiceImpl {

	@Autowired
	private XeRepositoryImpl repositoryImpl;

	@Transactional
	public List<Xe> findAll() {
		return repositoryImpl.findAll();
	}

	@Transactional
	public void saveOrUpdate(Xe Xe) {
		repositoryImpl.saveOrUpdate(Xe);
	}

	@Transactional
	public Xe findById(long id) {
		return repositoryImpl.findById(id);
	}

	@Transactional
	public List<TienMoiXe> tien() {
		return repositoryImpl.tien();
	}

}
