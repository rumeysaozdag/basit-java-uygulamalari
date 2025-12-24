package javaDenemesi.kosullar;

import java.util.ArrayList;

public class MarketManager {

	private ArrayList<String> urunler = new ArrayList<>();
	
	public void urunEkle(String urun) {
		urunler.add(urun);
	}
	
	public ArrayList<String> listeyiGetir(){
		return urunler;
	}
	
	public String urunSil(int index) {
		if(index >= 0 && index<urunler.size() ) {
			
			String silinen = urunler.get(index);
			urunler.remove(index);
			return silinen;
			
		}else {
			return null;
		}
	}
	
}
