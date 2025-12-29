package javaDenemesi.kosullar;

public class Urun {

	String ad;
	
	double fiyat;
	
	// "new Urun()" dediğimizde burası çalışır ve bilgileri kaydeder.
	public Urun(String ad, double fiyat) {
		
		this.ad = ad;
		this.fiyat = fiyat;
		
	}
	
	@Override
	public String toString() {
		return ad + " (" + fiyat + " TL)";
	}
	
}
