package javaDenemesi.kosullar;

import java.util.Scanner;

public class ATMSimilasyonu {

	 public static void main(String[] args) {
	        
	       int bakiye = 1000;
	       //int yatırılanpara=0;
	       
	       boolean devamEdiyor = true;
	       Scanner scan= new Scanner(System.in);
	       
	       
	       while(devamEdiyor) {
	    	   System.out.println("\n----------- MENÜ -----------");
	    	   System.out.println("1. Bakiye Sorgula\n2. Para Yatır\n3. Para Çek\n4. Çıkış");
	    	   System.out.print("Seçiminiz: ");
	    	   
	   
	    	   
		       int girilentuslama=scan.nextInt();
		       
		       if(girilentuslama==1) {
		    	   System.out.println("Bakiyeniz:"+bakiye);
		       }
		       
		       
		       if(girilentuslama==2) {
		    	   System.out.println("Yatırmak istediğiniz miktarı giriniz: ");
		    	   
		    	   int yatirilanpara = scan.nextInt();
		    	   
		    	   if(yatirilanpara<0) {
			    	   System.out.println("Negatif sayı girdiniz işlemi tekrarlayınız!");
			    	   yatirilanpara = scan.nextInt();
			    	   
			       }else {
			    	   bakiye+=yatirilanpara;
			    	   System.out.println("Bakiyeniz "+bakiye+" Olmuştur");
			       }
		    	   
		       }
		       
		       
		       
		       if(girilentuslama==3) {
		    	   System.out.println("Çekmek istediğiniz miktarı giriniz: ");
		    	   
		    	   int cekilecekPara=scan.nextInt();
		    	   
		    	   if(cekilecekPara > bakiye) {
		    		   System.out.println("Yetersiz Bakiye! İşlem yapılamadı.");
		    		   
		    		  
		    	   }else {
		    		   bakiye-=cekilecekPara;
		    		   System.out.println("Para çekildi. Kalan bakiye: " + bakiye);
		    	   }
		       }
		       
		       
		       
		       if(girilentuslama==4) {
		    	   System.out.print("ÇIKIŞ YAPLIYOR...");
		    	   devamEdiyor = false;
		       }
	    	   
	    	   
	       }
	       System.out.println("Program sonlandı.");
	       
	    }
	
}
