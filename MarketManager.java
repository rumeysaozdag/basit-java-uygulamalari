package javaDenemesi.kosullar;

import java.util.ArrayList;

public class MarketManager {

	private ArrayList<Urun> urunler = new ArrayList<>();
	
	public void urunEkle(String ad, double fiyat) {
		Urun yeniUrun = new Urun(ad, fiyat);
		urunler.add(yeniUrun);
	}
	
	public ArrayList<Urun> listeyiGetir(){
		return urunler;
	}
	
	public String urunSil(int index) {
		if(index >= 0 && index<urunler.size() ) {
			
			Urun silinenUrun = urunler.get(index);
			urunler.remove(index);
			return silinenUrun.toString();
			
		}else {
			return null;
		}
	}
	public boolean fiyatGuncelle(int index, double yeniFiyat) {
        if (index >= 0 && index < urunler.size()) {
            Urun urun = urunler.get(index);
            
            
            urun.setFiyat(yeniFiyat); 
            
            return true; 
        }
        return false; 
    }
	
}
