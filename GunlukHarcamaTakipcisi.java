package javaDenemesi.kosullar;

import java.util.Scanner;

public class GunlukHarcamaTakipcisi {

	
	 
	
    public static void main(String[] args) {
    	Scanner scan= new Scanner(System.in);
    	
    	int enYuksekMiktar=0;
    	
    	int enDusukMiktar=Integer.MAX_VALUE;
    	
    	int harcananToplamMiktar=0;
    	
    
    	System.out.print("Kaç günlük harcama gireceksiniz? ");
    	int gunSayisi =scan.nextInt() ;
    	while(gunSayisi<=0  ) {
    		System.out.println("Hatalı giriş yaptınız litfen gün sayısını tekrar giriniz! ");
    		gunSayisi=scan.nextInt() ;
    	}
    	
    	int[] harcamalar= new int[gunSayisi];
    	
    	for(int i=0; i<gunSayisi;i++) {
    		System.out.println("Lütfen "  + (i + 1) +  " . Günün harcama miktarınız");
    		
    		int girilendeger= scan.nextInt() ;
    		
    		while(girilendeger<0) {
    			System.out.println("Hatalı giriş yaptınız harcama tutarı negatif olamaz! Tekrar giriniz.");
    			girilendeger=scan.nextInt(); 
    		}
    		harcamalar[i]=girilendeger;
    		
    		
    		if(harcamalar[i]>= enYuksekMiktar) {
    			enYuksekMiktar=harcamalar[i];
    		}
    		if(harcamalar[i]<enDusukMiktar) {
    			enDusukMiktar=harcamalar[i];
    		}
    		harcananToplamMiktar+= harcamalar[i];
    		
    		
    		
    	}
    	double gunlukOrtalama=(double) harcananToplamMiktar/gunSayisi;
    	System.out.println("-------------------------------------");
    	 System.out.println("Günlük ortalama harcama miktarınız:"+gunlukOrtalama);
	        
	        System.out.println("En çok harcanan miktar :"+enYuksekMiktar);
	        System.out.println("En az harcanan miktar: " + enDusukMiktar);
	        
	        System.out.println("-------------------------------------");
       
	        System.out.println("ORTALAMANIN ÜZERİNDEKİ GÜNLER:");
	        for(int i=0;i<gunSayisi;i++) {
	        	if(harcamalar[i]>gunlukOrtalama) {
	        		System.out.println((i+1)+ ". Gün: " +harcamalar[i] + " TL(ORTALAMAYI AŞTINIZ!)");
	        	}
	        }
    }
}


