package bcc.springhibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bcc.springhibernate.model.Nhanvien;
import bcc.springhibernate.repository.NhanvienRepository;

@Service
public class NhanVienServiceImpl implements NhanVienService{
@Autowired
NhanvienRepository nhanvienRepository;

	@Override
	public Nhanvien findById(Integer id) {
		
		return nhanvienRepository.findById(id);
	}

	@Override
	public List<Nhanvien> findAll() {
		
		return nhanvienRepository.findAll();
	}

	@Override
	public List<Nhanvien> findByTrangthaiOrderByIdDesc(String trangthai) {
		
		return nhanvienRepository.findByTrangthaiOrderByIdDesc(trangthai);
	}

	@Override
	public void saveOrUpdate(Nhanvien nhanvien) {
		nhanvienRepository.save(nhanvien);
		
	}

	@Override
	public Nhanvien findByManhanvien(String manhanvien) {
		
		return nhanvienRepository.findByManhanvien(manhanvien);
	}

	@Override
	public List<Nhanvien> findByTrangthaiNotOrderByIdDesc(String trangthai) {
		
		return nhanvienRepository.findByTrangthaiNotOrderByIdDesc(trangthai);
	}

	@Override
	public void deleted(Nhanvien nhanvien) {
		nhanvienRepository.delete(nhanvien);
		
	}
}
