package thuan.com.fa.demomvc.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import thuan.com.fa.demomvc.entity.TuyenXe;
import thuan.com.fa.demomvc.repository.TuyenXeRepositoryImpl;

@Service
public class TuyenXeServiceImpl {

	@Autowired
	private TuyenXeRepositoryImpl repositoryImpl;

	@Transactional
	public List<TuyenXe> findAll() {
		return repositoryImpl.findAll();
	}

}
