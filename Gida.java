package javaDenemesi.kosullar;

public class Gida extends Urun{

	
	private String sonKullanmaTarihi;
	
	public Gida(String ad, double fiyat, String sonKullanmaTarihi) {
		super(ad, fiyat);
		this.sonKullanmaTarihi= sonKullanmaTarihi;
	}

	
	public String getSonkullanmaTarihi() {
		return sonKullanmaTarihi;
	}
	
	
	public void setKullanmaTarihi(String sonKullanmaTarihi) {
		this.sonKullanmaTarihi= sonKullanmaTarihi;
	}
	
	public String toString() {
		return super.toString() + " [SKT: " + sonKullanmaTarihi + "]";
	}
	
}
