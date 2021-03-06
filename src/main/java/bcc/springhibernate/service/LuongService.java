package bcc.springhibernate.service;

import java.util.List;

import bcc.springhibernate.model.Luong;
import bcc.springhibernate.model.Nhanvien;
import bcc.springhibernate.model.Nhomkhachhang;

public interface LuongService {
	void saveOrUpdate(Luong luong);
	void deleted(Luong luong);
	List<Luong> findAll();
	List<Luong> findByTrangthaiOrderByIdDesc(String trangthai);
	List<Luong> findByTrangthaiNotOrderByIdDesc(String trangthai);
	List<Luong> findByNhanvien(Nhanvien nhanvien);
	Luong findById(Integer id);
	Luong findOneByNhanvienAndThangAndNam(Nhanvien nhanvien, String thang,String nam);
}
