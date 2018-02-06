package bcc.springhibernate.model;
// Generated Jan 20, 2018 8:57:07 AM by Hibernate Tools 5.1.5.Final

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
import javax.persistence.UniqueConstraint;

/**
 * Hanghoa generated by hbm2java
 */
@Entity
@Table(name = "hanghoa", catalog = "hotrobanhang", uniqueConstraints = @UniqueConstraint(columnNames = "mahang"))
public class Hanghoa implements java.io.Serializable {

	private Integer id;
	private Nhomhang nhomhang;
	private String mahang;
	private String tenhang;
	private String donvitinh;
	private String mota;
	private Long gianhap;
	private Long giaban;
	private Long giakhuyenmai;
	private String trangthai;
	private String ghichu;
	private Set<Chitiethoadon> chitiethoadons = new HashSet<Chitiethoadon>(0);
	private Set<Chitiethoadon> chitiethoadons_1 = new HashSet<Chitiethoadon>(0);

	public Hanghoa() {
	}

	public Hanghoa(Nhomhang nhomhang, String mahang, String tenhang) {
		this.nhomhang = nhomhang;
		this.mahang = mahang;
		this.tenhang = tenhang;
	}

	public Hanghoa(Nhomhang nhomhang, String mahang, String tenhang, String donvitinh, String mota, Long gianhap,
			Long giaban, Long giakhuyenmai, String trangthai, String ghichu, Set<Chitiethoadon> chitiethoadons,
			Set<Chitiethoadon> chitiethoadons_1) {
		this.nhomhang = nhomhang;
		this.mahang = mahang;
		this.tenhang = tenhang;
		this.donvitinh = donvitinh;
		this.mota = mota;
		this.gianhap = gianhap;
		this.giaban = giaban;
		this.giakhuyenmai = giakhuyenmai;
		this.trangthai = trangthai;
		this.ghichu = ghichu;
		this.chitiethoadons = chitiethoadons;
		this.chitiethoadons_1 = chitiethoadons_1;
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
	@JoinColumn(name = "nhomhang", nullable = false)
	public Nhomhang getNhomhang() {
		return this.nhomhang;
	}

	public void setNhomhang(Nhomhang nhomhang) {
		this.nhomhang = nhomhang;
	}

	@Column(name = "mahang", unique = true, nullable = false, length = 45)
	public String getMahang() {
		return this.mahang;
	}

	public void setMahang(String mahang) {
		this.mahang = mahang;
	}

	@Column(name = "tenhang", nullable = false)
	public String getTenhang() {
		return this.tenhang;
	}

	public void setTenhang(String tenhang) {
		this.tenhang = tenhang;
	}

	@Column(name = "donvitinh", length = 45)
	public String getDonvitinh() {
		return this.donvitinh;
	}

	public void setDonvitinh(String donvitinh) {
		this.donvitinh = donvitinh;
	}

	@Column(name = "mota")
	public String getMota() {
		return this.mota;
	}

	public void setMota(String mota) {
		this.mota = mota;
	}

	@Column(name = "gianhap", precision = 10, scale = 0)
	public Long getGianhap() {
		return this.gianhap;
	}

	public void setGianhap(Long gianhap) {
		this.gianhap = gianhap;
	}

	@Column(name = "giaban", precision = 10, scale = 0)
	public Long getGiaban() {
		return this.giaban;
	}

	public void setGiaban(Long giaban) {
		this.giaban = giaban;
	}

	@Column(name = "giakhuyenmai", precision = 10, scale = 0)
	public Long getGiakhuyenmai() {
		return this.giakhuyenmai;
	}

	public void setGiakhuyenmai(Long giakhuyenmai) {
		this.giakhuyenmai = giakhuyenmai;
	}

	@Column(name = "trangthai", length = 45)
	public String getTrangthai() {
		return this.trangthai;
	}

	public void setTrangthai(String trangthai) {
		this.trangthai = trangthai;
	}

	@Column(name = "ghichu", length = 45)
	public String getGhichu() {
		return this.ghichu;
	}

	public void setGhichu(String ghichu) {
		this.ghichu = ghichu;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "hanghoa")
	public Set<Chitiethoadon> getChitiethoadons() {
		return this.chitiethoadons;
	}

	public void setChitiethoadons(Set<Chitiethoadon> chitiethoadons) {
		this.chitiethoadons = chitiethoadons;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "hanghoa")
	public Set<Chitiethoadon> getChitiethoadons_1() {
		return this.chitiethoadons_1;
	}

	public void setChitiethoadons_1(Set<Chitiethoadon> chitiethoadons_1) {
		this.chitiethoadons_1 = chitiethoadons_1;
	}

}