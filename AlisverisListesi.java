package javaDenemesi.kosullar;
import java.util.ArrayList;
import java.util.Scanner;
public class AlisverisListesi {

	
	public static void main(String[] args) {
       
		Scanner scan = new Scanner(System.in);
		
		ArrayList<String> alisverisListesi = new ArrayList<>();
		boolean devamEdiyor= true;
	       
		while(devamEdiyor) {
			
			System.out.println("\n----------- MENÜ -----------");
	    	System.out.println("1. Listele\n2. Ekle\n3. Çıkar\n4. Çıkış");
	    	System.out.print("Seçiminiz: ");
	    	
	    	int secim=scan.nextInt();
	    	scan.nextLine();
	    	
	    	if(secim==1) {
	    		if(alisverisListesi.isEmpty()) {
	    			System.out.println("Listeniz şu an boş. Önce ürün ekleyiniz.");
	    		}else{
		    		System.out.println("--- Alışveriş Listeniz ---");
		    		for(int i=0;i<alisverisListesi.size();i++) {
		    			System.out.println(i + ". " + alisverisListesi.get(i));
		    		}
		    	}
	    		
	    		
	    	}
	    	
	    	if(secim==2) {
	    		
	    		System.out.print("Ne eklemek istiyorsun?");
	    		
	    		String urunAdi = scan.nextLine();
	    		alisverisListesi.add(urunAdi);
	    	    System.out.println("Eklendi!");
	    	}
	    	
	    	if(secim==3) {
	    		System.out.println("Listenizdeki Ürünler: "+ alisverisListesi);
	    		System.out.print("Kaç numaralı indexteki ürünü sileceksiniz ?");
	    		int silinecekIndex=scan.nextInt();
	    		if (silinecekIndex >= 0 && silinecekIndex < alisverisListesi.size()) {
	    			alisverisListesi.remove(silinecekIndex);
	    		}
	    	}
	    	
	    	if(secim==4) {
	    		System.out.print("Programdan Çıkış Yapılıyor...");
	    		devamEdiyor=false;
	    				
	    	}
	    	
	    	
		}
		 System.out.println("Program sonlandı.");
	    }
}
