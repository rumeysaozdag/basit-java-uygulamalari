//Sayıların tek mi çift mi olduğunu bulan program.
package javaDenemesi.kosullar;

import java.util.Scanner;

public class TekmiCiftmi {

	
	  public static void main(String[] args) {
	        
	       Scanner scan = new Scanner(System.in);
	       
	       int tekSayac=0;
	       int ciftsayac=0;
	       int ciftToplam=0;
	       
	       
	       System.out.print("Program Başlıyor... Lütfen 10 adet sayı giriniz.");
	      
	       for(int i=0;i<10;i++) {
	    	   
	    	   System.out.println((i+1)+". Sayıyı giriniz");
	    	   int girilensayi=scan.nextInt();
	    	   
	    	   if(girilensayi%2==0) {
	    		   System.out.println(girilensayi+" sayısı Çifttir");
	    		   
	    		   ciftsayac+=1;
	    		   ciftToplam += girilensayi;
	    	   }
	    	   else {
	    		   System.out.println(girilensayi+" sayısı Tektir");
	    		   tekSayac+=1;
	    	   }
	    	   
	    	  
	       }
	       
	      
	       System.out.println("----------------SONUÇLAR----------------");
	        System.out.println("Toplam Girilen Tek Sayı Adedi: " + tekSayac);
	        System.out.println("Toplam Girilen Çift Sayı Adedi: " + ciftsayac);
	        System.out.println("Girilen Çift Sayıların Toplam Değeri: " + ciftToplam);
	       
	        
	       
	    }
	
}
