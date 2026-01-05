package javaDenemesi.kosullar;

import java.util.HashMap;
import java.util.Map;

public class OkulSistemi {

	
	public static void main(String[] args) {
		
		Map<Integer, String> hesapla = new HashMap<>();
		
		
		hesapla.put(101, "Ali Yılmaz");
		hesapla.put(250, "Ayşe Demir");
		hesapla.put(1453, "Mehmet Fatih");
		
		String bulunanOgrenci = hesapla.get(1453);
		
		System.out.println("Aranan Öğrenci: " + bulunanOgrenci);
		
		System.out.println("Silinmeden Önce: " + hesapla);
		hesapla.remove(101);
		System.out.println("Silindikten Sonra: " + hesapla);
		
	}
	
}
