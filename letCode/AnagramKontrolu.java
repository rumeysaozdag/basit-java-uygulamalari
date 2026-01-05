package javaDenemesi.kosullar.letCode;

import java.util.concurrent.ForkJoinPool;

import javaDenemesi.kosullar.ifElsekosulları;

public class AnagramKontrolu {

	
	public static boolean kontrolEt(String s1, String s2) {
		
		if (s1.length() != s2.length()) {
            return false;
        }

		int[] charCounts = new int[26];
		
		for(int i=0; i<s1.length();i++) {
			
			charCounts[s1.charAt(i)-'a']++;
			charCounts[s2.charAt(i)-'a']--;
			
		}
		
		for(int count: charCounts) {
			if(count != 0) {
				return false;
			}
		}
		return true;
		
	}
	
	public static void main(String[] args) {
        boolean sonuc = kontrolEt("kedi", "deki");
        System.out.println("Anagram mı? : " + sonuc); // true basmalı
        
        boolean sonuc2 = kontrolEt("elma", "armut");
        System.out.println("Anagram mı? : " + sonuc2); // false basmalı
    }
	
	
}
