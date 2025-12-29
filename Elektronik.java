package javaDenemesi.kosullar;

public class Elektronik extends Urun{
	
	
	private int garantiSuresi;

	public Elektronik(String ad, double fiyat, int garantiSuresi) {
		super(ad, fiyat);
		// TODO Auto-generated constructor stub
	}
	
	public int getGarantiSuresi() {
		return garantiSuresi;
	}
	
	public void setGarantiSuresi(int garantiSuresi) {
		this.garantiSuresi = garantiSuresi;
	}
	
	@Override
    public String toString() {
        return super.toString() + " [Garanti: " + garantiSuresi + " Ay]";
    }

}
