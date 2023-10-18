package thuan.com.fa.demomvc.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import thuan.com.fa.demomvc.entity.LichTrinh;
import thuan.com.fa.demomvc.repository.LichTrinhRepositoryImpl;

@Service
public class LichTrinhServiceImpl {

	@Autowired
	private LichTrinhRepositoryImpl repositoryImpl;

	@Transactional
	public List<LichTrinh> findAll() {
		return repositoryImpl.findAll();
	}

	@Transactional
	public void saveOrUpdate(LichTrinh LichTrinh) {
		repositoryImpl.saveOrUpdate(LichTrinh);
	}

	@Transactional
	public LichTrinh findById(long id) {
		return repositoryImpl.findById(id);
	}

	@Transactional
	public List<LichTrinh> search(String searchKey) {
		return repositoryImpl.search(searchKey);
	}

}
