package thuan.com.fa.demomvc.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import thuan.com.fa.demomvc.entity.LoaiXe;
import thuan.com.fa.demomvc.repository.LoaiXeRepositoryImpl;

@Service
public class LoaiXeServiceImpl {

	@Autowired
	private LoaiXeRepositoryImpl repositoryImpl;

	@Transactional
	public List<LoaiXe> findAll() {
		return repositoryImpl.findAll();
	}

}
