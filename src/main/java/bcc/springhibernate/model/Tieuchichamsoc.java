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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Tieuchichamsoc generated by hbm2java
 */
@Entity
@Table(name = "tieuchichamsoc", catalog = "hotrobanhang")
public class Tieuchichamsoc implements java.io.Serializable {

	private Integer id;
	private String tentieuchi;
	private String mota;
	private String kieutieuchi;
	private String trangthai;
	private String khac;
	private Set<Chitietchamsoc> chitietchamsocs = new HashSet<Chitietchamsoc>(0);
	private Set<Chitietchamsoc> chitietchamsocs_1 = new HashSet<Chitietchamsoc>(0);

	public Tieuchichamsoc() {
	}

	public Tieuchichamsoc(String tentieuchi, String mota, String kieutieuchi, String trangthai, String khac,
			Set<Chitietchamsoc> chitietchamsocs, Set<Chitietchamsoc> chitietchamsocs_1) {
		this.tentieuchi = tentieuchi;
		this.mota = mota;
		this.kieutieuchi = kieutieuchi;
		this.trangthai = trangthai;
		this.khac = khac;
		this.chitietchamsocs = chitietchamsocs;
		this.chitietchamsocs_1 = chitietchamsocs_1;
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

	@Column(name = "tentieuchi", length = 45)
	public String getTentieuchi() {
		return this.tentieuchi;
	}

	public void setTentieuchi(String tentieuchi) {
		this.tentieuchi = tentieuchi;
	}

	@Column(name = "mota")
	public String getMota() {
		return this.mota;
	}

	public void setMota(String mota) {
		this.mota = mota;
	}

	@Column(name = "kieutieuchi", length = 45)
	public String getKieutieuchi() {
		return this.kieutieuchi;
	}

	public void setKieutieuchi(String kieutieuchi) {
		this.kieutieuchi = kieutieuchi;
	}

	@Column(name = "trangthai", length = 45)
	public String getTrangthai() {
		return this.trangthai;
	}

	public void setTrangthai(String trangthai) {
		this.trangthai = trangthai;
	}

	@Column(name = "khac", length = 45)
	public String getKhac() {
		return this.khac;
	}

	public void setKhac(String khac) {
		this.khac = khac;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tieuchichamsoc")
	public Set<Chitietchamsoc> getChitietchamsocs() {
		return this.chitietchamsocs;
	}

	public void setChitietchamsocs(Set<Chitietchamsoc> chitietchamsocs) {
		this.chitietchamsocs = chitietchamsocs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tieuchichamsoc")
	public Set<Chitietchamsoc> getChitietchamsocs_1() {
		return this.chitietchamsocs_1;
	}

	public void setChitietchamsocs_1(Set<Chitietchamsoc> chitietchamsocs_1) {
		this.chitietchamsocs_1 = chitietchamsocs_1;
	}

}
