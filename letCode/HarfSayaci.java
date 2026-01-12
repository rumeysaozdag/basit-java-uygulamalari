package javaDenemesi.kosullar.letCode;

import java.util.HashMap;
import java.util.Map;

public class HarfSayaci {

	
	public static void main(String[] args) {
		
		
		 String kelime="havelsan";
		 
		 Map<Character, Integer> harfHaritasi = new HashMap<>();
		 
		 for(char siradakiHarf : kelime.toCharArray()) {
			 
			 
			 if (harfHaritasi.containsKey(siradakiHarf)) {
				 
				 int eskiSayi = harfHaritasi.get(siradakiHarf);
				 
				 harfHaritasi.put(siradakiHarf, eskiSayi+1);
			 }else {
				 harfHaritasi.put(siradakiHarf, 1);
			 }
			 System.out.println("Harf Analizi: " + harfHaritasi);

		 }
	}
	
}
