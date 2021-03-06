package bcc.springhibernate.model;
// Generated Jan 20, 2018 8:57:07 AM by Hibernate Tools 5.1.5.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Nhanvien generated by hbm2java
 */
@Entity
@Table(name = "nhanvien", catalog = "hotrobanhang", uniqueConstraints = @UniqueConstraint(columnNames = "manhanvien"))
public class Nhanvien implements java.io.Serializable {

	private Integer id;
	private Bophan bophan;
	private String manhanvien;
	private String tennhanvien;
	private String socmnd;
	private Date ngaycap;
	private String noicap;
	private String sodienthoai;
	private String diachi;
	private Date ngayvaolam;
	private Long luong;
	private Double chietkhau;
	private String trangthai;
	private Integer loainhanvien;
	private String thongtinkhac;
	private String ghichu;
	private Set<Hoadon> hoadonsForIdnhanvienlaphoadon = new HashSet<Hoadon>(0);
	private Set<Hoadon> hoadonsForIdnhanvienban = new HashSet<Hoadon>(0);
	private Set<Hoadon> hoadonsForIdnhanvienlaphoadon_1 = new HashSet<Hoadon>(0);
	private Set<Hoadon> hoadonsForIdnhanviengiaohang = new HashSet<Hoadon>(0);
	private Set<Hoadon> hoadonsForIdnhanviengiaohang_1 = new HashSet<Hoadon>(0);
	private Set<Hoadon> hoadonsForIdnhanvienchamsoc = new HashSet<Hoadon>(0);
	private Set<Hoadon> hoadonsForIdnhanvienchamsoc_1 = new HashSet<Hoadon>(0);
	private Set<Taikhoan> taikhoans = new HashSet<Taikhoan>(0);
	private Set<Nhanvienkpi> nhanvienkpis = new HashSet<Nhanvienkpi>(0);
	private Set<Hoadon> hoadonsForIdnhanvienban_1 = new HashSet<Hoadon>(0);
	private Set<Luong> luongs = new HashSet<Luong>(0);
	private Set<Nhanvienkpi> nhanvienkpis_1 = new HashSet<Nhanvienkpi>(0);
	private Set<Luong> luongs_1 = new HashSet<Luong>(0);
	private Set<Taikhoan> taikhoans_1 = new HashSet<Taikhoan>(0);

	public Nhanvien() {
	}

	public Nhanvien(Bophan bophan, String manhanvien) {
		this.bophan = bophan;
		this.manhanvien = manhanvien;
	}

	public Nhanvien(Bophan bophan, String manhanvien, String tennhanvien, String socmnd, Date ngaycap, String noicap,
			String sodienthoai, String diachi, Date ngayvaolam, Long luong, Double chietkhau, String trangthai,
			Integer loainhanvien, String thongtinkhac, String ghichu, Set<Hoadon> hoadonsForIdnhanvienlaphoadon,
			Set<Hoadon> hoadonsForIdnhanvienban, Set<Hoadon> hoadonsForIdnhanvienlaphoadon_1,
			Set<Hoadon> hoadonsForIdnhanviengiaohang, Set<Hoadon> hoadonsForIdnhanviengiaohang_1,
			Set<Hoadon> hoadonsForIdnhanvienchamsoc, Set<Hoadon> hoadonsForIdnhanvienchamsoc_1, Set<Taikhoan> taikhoans,
			Set<Nhanvienkpi> nhanvienkpis, Set<Hoadon> hoadonsForIdnhanvienban_1, Set<Luong> luongs,
			Set<Nhanvienkpi> nhanvienkpis_1, Set<Luong> luongs_1, Set<Taikhoan> taikhoans_1) {
		this.bophan = bophan;
		this.manhanvien = manhanvien;
		this.tennhanvien = tennhanvien;
		this.socmnd = socmnd;
		this.ngaycap = ngaycap;
		this.noicap = noicap;
		this.sodienthoai = sodienthoai;
		this.diachi = diachi;
		this.ngayvaolam = ngayvaolam;
		this.luong = luong;
		this.chietkhau = chietkhau;
		this.trangthai = trangthai;
		this.loainhanvien = loainhanvien;
		this.thongtinkhac = thongtinkhac;
		this.ghichu = ghichu;
		this.hoadonsForIdnhanvienlaphoadon = hoadonsForIdnhanvienlaphoadon;
		this.hoadonsForIdnhanvienban = hoadonsForIdnhanvienban;
		this.hoadonsForIdnhanvienlaphoadon_1 = hoadonsForIdnhanvienlaphoadon_1;
		this.hoadonsForIdnhanviengiaohang = hoadonsForIdnhanviengiaohang;
		this.hoadonsForIdnhanviengiaohang_1 = hoadonsForIdnhanviengiaohang_1;
		this.hoadonsForIdnhanvienchamsoc = hoadonsForIdnhanvienchamsoc;
		this.hoadonsForIdnhanvienchamsoc_1 = hoadonsForIdnhanvienchamsoc_1;
		this.taikhoans = taikhoans;
		this.nhanvienkpis = nhanvienkpis;
		this.hoadonsForIdnhanvienban_1 = hoadonsForIdnhanvienban_1;
		this.luongs = luongs;
		this.nhanvienkpis_1 = nhanvienkpis_1;
		this.luongs_1 = luongs_1;
		this.taikhoans_1 = taikhoans_1;
	}

	public Nhanvien(Bophan bophan, String manhanvien, String tennhanvien, String socmnd, Date ngaycap, String noicap,
			String sodienthoai, String diachi, Date ngayvaolam, Long luong, Double chietkhau, String trangthai,
			Integer loainhanvien, String thongtinkhac, String ghichu) {
		super();
		this.bophan = bophan;
		this.manhanvien = manhanvien;
		this.tennhanvien = tennhanvien;
		this.socmnd = socmnd;
		this.ngaycap = ngaycap;
		this.noicap = noicap;
		this.sodienthoai = sodienthoai;
		this.diachi = diachi;
		this.ngayvaolam = ngayvaolam;
		this.luong = luong;
		this.chietkhau = chietkhau;
		this.trangthai = trangthai;
		this.loainhanvien = loainhanvien;
		this.thongtinkhac = thongtinkhac;
		this.ghichu = ghichu;
	}
	
	public Nhanvien(Integer id,Bophan bophan, String manhanvien, String tennhanvien, String socmnd, Date ngaycap, String noicap,
			String sodienthoai, String diachi, Date ngayvaolam, Long luong, Double chietkhau, String trangthai,
			Integer loainhanvien, String thongtinkhac, String ghichu) {
		super();
		this.id = id;
		this.bophan = bophan;
		this.manhanvien = manhanvien;
		this.tennhanvien = tennhanvien;
		this.socmnd = socmnd;
		this.ngaycap = ngaycap;
		this.noicap = noicap;
		this.sodienthoai = sodienthoai;
		this.diachi = diachi;
		this.ngayvaolam = ngayvaolam;
		this.luong = luong;
		this.chietkhau = chietkhau;
		this.trangthai = trangthai;
		this.loainhanvien = loainhanvien;
		this.thongtinkhac = thongtinkhac;
		this.ghichu = ghichu;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "bophan_id", nullable = false)
	public Bophan getBophan() {
		return this.bophan;
	}

	public void setBophan(Bophan bophan) {
		this.bophan = bophan;
	}

	@Column(name = "manhanvien", unique = true, nullable = false, length = 45)
	public String getManhanvien() {
		return this.manhanvien;
	}

	public void setManhanvien(String manhanvien) {
		this.manhanvien = manhanvien;
	}

	@Column(name = "tennhanvien")
	public String getTennhanvien() {
		return this.tennhanvien;
	}

	public void setTennhanvien(String tennhanvien) {
		this.tennhanvien = tennhanvien;
	}

	@Column(name = "socmnd", length = 15)
	public String getSocmnd() {
		return this.socmnd;
	}

	public void setSocmnd(String socmnd) {
		this.socmnd = socmnd;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ngaycap", length = 19)
	public Date getNgaycap() {
		return this.ngaycap;
	}

	public void setNgaycap(Date ngaycap) {
		this.ngaycap = ngaycap;
	}

	@Column(name = "noicap", length = 45)
	public String getNoicap() {
		return this.noicap;
	}

	public void setNoicap(String noicap) {
		this.noicap = noicap;
	}

	@Column(name = "sodienthoai", length = 45)
	public String getSodienthoai() {
		return this.sodienthoai;
	}

	public void setSodienthoai(String sodienthoai) {
		this.sodienthoai = sodienthoai;
	}

	@Column(name = "diachi", length = 155)
	public String getDiachi() {
		return this.diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ngayvaolam", length = 19)
	public Date getNgayvaolam() {
		return this.ngayvaolam;
	}

	public void setNgayvaolam(Date ngayvaolam) {
		this.ngayvaolam = ngayvaolam;
	}

	@Column(name = "luong", precision = 10, scale = 0)
	public Long getLuong() {
		return this.luong;
	}

	public void setLuong(Long luong) {
		this.luong = luong;
	}

	@Column(name = "chietkhau", precision = 22, scale = 0)
	public Double getChietkhau() {
		return this.chietkhau;
	}

	public void setChietkhau(Double chietkhau) {
		this.chietkhau = chietkhau;
	}

	@Column(name = "trangthai", length = 45)
	public String getTrangthai() {
		return this.trangthai;
	}

	public void setTrangthai(String trangthai) {
		this.trangthai = trangthai;
	}

	@Column(name = "loainhanvien")
	public Integer getLoainhanvien() {
		return this.loainhanvien;
	}

	public void setLoainhanvien(Integer loainhanvien) {
		this.loainhanvien = loainhanvien;
	}

	@Column(name = "thongtinkhac")
	public String getThongtinkhac() {
		return this.thongtinkhac;
	}

	public void setThongtinkhac(String thongtinkhac) {
		this.thongtinkhac = thongtinkhac;
	}

	@Column(name = "ghichu")
	public String getGhichu() {
		return this.ghichu;
	}

	public void setGhichu(String ghichu) {
		this.ghichu = ghichu;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "nhanvienByIdnhanvienlaphoadon")
	public Set<Hoadon> getHoadonsForIdnhanvienlaphoadon() {
		return this.hoadonsForIdnhanvienlaphoadon;
	}

	public void setHoadonsForIdnhanvienlaphoadon(Set<Hoadon> hoadonsForIdnhanvienlaphoadon) {
		this.hoadonsForIdnhanvienlaphoadon = hoadonsForIdnhanvienlaphoadon;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "nhanvienByIdnhanvienban")
	public Set<Hoadon> getHoadonsForIdnhanvienban() {
		return this.hoadonsForIdnhanvienban;
	}

	public void setHoadonsForIdnhanvienban(Set<Hoadon> hoadonsForIdnhanvienban) {
		this.hoadonsForIdnhanvienban = hoadonsForIdnhanvienban;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "nhanvienByIdnhanvienlaphoadon")
	public Set<Hoadon> getHoadonsForIdnhanvienlaphoadon_1() {
		return this.hoadonsForIdnhanvienlaphoadon_1;
	}

	public void setHoadonsForIdnhanvienlaphoadon_1(Set<Hoadon> hoadonsForIdnhanvienlaphoadon_1) {
		this.hoadonsForIdnhanvienlaphoadon_1 = hoadonsForIdnhanvienlaphoadon_1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "nhanvienByIdnhanviengiaohang")
	public Set<Hoadon> getHoadonsForIdnhanviengiaohang() {
		return this.hoadonsForIdnhanviengiaohang;
	}

	public void setHoadonsForIdnhanviengiaohang(Set<Hoadon> hoadonsForIdnhanviengiaohang) {
		this.hoadonsForIdnhanviengiaohang = hoadonsForIdnhanviengiaohang;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "nhanvienByIdnhanviengiaohang")
	public Set<Hoadon> getHoadonsForIdnhanviengiaohang_1() {
		return this.hoadonsForIdnhanviengiaohang_1;
	}

	public void setHoadonsForIdnhanviengiaohang_1(Set<Hoadon> hoadonsForIdnhanviengiaohang_1) {
		this.hoadonsForIdnhanviengiaohang_1 = hoadonsForIdnhanviengiaohang_1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "nhanvienByIdnhanvienchamsoc")
	public Set<Hoadon> getHoadonsForIdnhanvienchamsoc() {
		return this.hoadonsForIdnhanvienchamsoc;
	}

	public void setHoadonsForIdnhanvienchamsoc(Set<Hoadon> hoadonsForIdnhanvienchamsoc) {
		this.hoadonsForIdnhanvienchamsoc = hoadonsForIdnhanvienchamsoc;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "nhanvienByIdnhanvienchamsoc")
	public Set<Hoadon> getHoadonsForIdnhanvienchamsoc_1() {
		return this.hoadonsForIdnhanvienchamsoc_1;
	}

	public void setHoadonsForIdnhanvienchamsoc_1(Set<Hoadon> hoadonsForIdnhanvienchamsoc_1) {
		this.hoadonsForIdnhanvienchamsoc_1 = hoadonsForIdnhanvienchamsoc_1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "nhanvien")
	public Set<Taikhoan> getTaikhoans() {
		return this.taikhoans;
	}

	public void setTaikhoans(Set<Taikhoan> taikhoans) {
		this.taikhoans = taikhoans;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "nhanvien")
	public Set<Nhanvienkpi> getNhanvienkpis() {
		return this.nhanvienkpis;
	}

	public void setNhanvienkpis(Set<Nhanvienkpi> nhanvienkpis) {
		this.nhanvienkpis = nhanvienkpis;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "nhanvienByIdnhanvienban")
	public Set<Hoadon> getHoadonsForIdnhanvienban_1() {
		return this.hoadonsForIdnhanvienban_1;
	}

	public void setHoadonsForIdnhanvienban_1(Set<Hoadon> hoadonsForIdnhanvienban_1) {
		this.hoadonsForIdnhanvienban_1 = hoadonsForIdnhanvienban_1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "nhanvien")
	public Set<Luong> getLuongs() {
		return this.luongs;
	}

	public void setLuongs(Set<Luong> luongs) {
		this.luongs = luongs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "nhanvien")
	public Set<Nhanvienkpi> getNhanvienkpis_1() {
		return this.nhanvienkpis_1;
	}

	public void setNhanvienkpis_1(Set<Nhanvienkpi> nhanvienkpis_1) {
		this.nhanvienkpis_1 = nhanvienkpis_1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "nhanvien")
	public Set<Luong> getLuongs_1() {
		return this.luongs_1;
	}

	public void setLuongs_1(Set<Luong> luongs_1) {
		this.luongs_1 = luongs_1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "nhanvien")
	public Set<Taikhoan> getTaikhoans_1() {
		return this.taikhoans_1;
	}

	public void setTaikhoans_1(Set<Taikhoan> taikhoans_1) {
		this.taikhoans_1 = taikhoans_1;
	}

}
