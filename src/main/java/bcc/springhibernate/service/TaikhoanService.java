package bcc.springhibernate.service;

import java.util.List;

import bcc.springhibernate.model.Nhanvien;
import bcc.springhibernate.model.Taikhoan;

public interface TaikhoanService {
	List<Taikhoan> findAll();
	void saveOrUpdate(Taikhoan tk);
	void deleted(Taikhoan tk);
	
	Taikhoan findById(Integer id);
	Taikhoan findByUsername(String username);
	  Taikhoan findByEmail(String email);
	List<Taikhoan> findByTrangthaiOrderByIdDesc(String trangthai);
	
}
