package javaDenemesi.kosullar;

public class Urun {

	String ad;
	
	double fiyat;
	
	
	
	// "new Urun()" dediğimizde burası çalışır ve bilgileri kaydeder.
	public Urun(String ad, double fiyat) {
		
		this.ad = ad;
		setFiyat(fiyat);
	}
	
	public String getAd() {
		return ad;
	}
	
	public double getFiyat() {
		return fiyat;
	}
	
	public void setFiyat(double yeniFiyat) {
		if(yeniFiyat<0) {
			System.out.println(" HATA: Fiyat negatif olamaz! 0 olarak ayarlandı.");
			
		}else {
			this.fiyat = yeniFiyat;
		}
		
	}
	
	@Override
	public String toString() {
		return ad + " (" + fiyat + " TL)";
	}
	
}
