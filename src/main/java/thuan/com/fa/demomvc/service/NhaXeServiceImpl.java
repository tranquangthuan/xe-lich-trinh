package thuan.com.fa.demomvc.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import thuan.com.fa.demomvc.entity.NhaXe;
import thuan.com.fa.demomvc.repository.NhaXeRepositoryImpl;

@Service
public class NhaXeServiceImpl {

	@Autowired
	private NhaXeRepositoryImpl repositoryImpl;

	@Transactional
	public List<NhaXe> findAll() {
		return repositoryImpl.findAll();
	}

}
