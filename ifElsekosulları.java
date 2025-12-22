//İF/else Koşulları çalışması
package javaDenemesi.kosullar;
import java.util.Scanner;
public class ifElsekosulları {

	
	    public static void main(String[] args) {
	        
	        // 1. Scanner aracımızı hazırlıyoruz (Bunu zaten biliyorsun)
	        Scanner scan = new Scanner(System.in);

	        int toplam=0; 
	        int enYuksek=0 ;
	        int enDusuk = Integer.MAX_VALUE;
	        
	        System.out.println("Lütfen sınav sayısı giriniz: ");
	        int sinavSayisi=scan.nextInt() ;
	        while(sinavSayisi<=0 ) {
		    	   System.out.println("Hatalı giriş yaptınız, tekrar girin");
		    	   sinavSayisi = scan.nextInt();
		        }
	        int[] notlar= new int[sinavSayisi];
	        for(int i=0; i<sinavSayisi;i++) {
	        	
	        	 // 2. Kullanıcıya mesaj gönderiyoruz
		        System.out.println("Lütfen "  + (i + 1) +  " sınav notunuzu giriniz:");
		        
		       
		        
		     
		       int notDegeri=scan.nextInt() ;
		       while(notDegeri<0 || notDegeri>100) {
		    	   System.out.println("Hatalı giriş yaptınız, tekrar girin");
		    	   notDegeri = scan.nextInt();
		        }
		       
		       notlar[i]=notDegeri; 
		       if(notlar[i]>=enYuksek) {
		    	   
		    	   enYuksek= notlar[i];
		       }
		       if(notlar[i]<enDusuk) {
		    	   enDusuk=notlar[i];
		       }
		       toplam += notlar[i];
		       
		       
	        }
	        
	        double ortalama = (double) toplam/sinavSayisi; 
	        System.out.println("-------------------------------------");
	        
	        System.out.println("Ortalamanız:"+ortalama);
	        
	        System.out.println("En yüksek notunuz :"+enYuksek);
	        System.out.println("En düşük notunuz: " + enDusuk);
	        System.out.println("-------------------------------------");
	        
	        for(int i=0;i<sinavSayisi;i++) {
	        	if(notlar[i]>=50) {
	        		System.out.println((i+1) + ". Sınav: " + notlar[i] + " -> GEÇTİ");
	        	}else {
	        		System.out.println((i+1) + ". Sınav: " + notlar[i] + " -> KALDI");
	        	}
	        }
	        
	       
	    }
	}
	

