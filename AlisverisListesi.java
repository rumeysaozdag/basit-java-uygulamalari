package javaDenemesi.kosullar;
import java.util.ArrayList;
import java.util.Scanner;
public class AlisverisListesi {

	
	static ArrayList<String> alisverisListesi= new ArrayList<>();
	static Scanner scan= new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		
		boolean devamEdiyor = true;
		while(devamEdiyor) {
			menuGoster();
			
			System.out.print("Seçiminiz: ");
			int secim=scan.nextInt();
			scan.nextLine(); //Buffer Temizliği
			
			if(secim==1) {
				listeyiGoster();
			}
			else if (secim==2) {
				urunEkle();
			}
			else if (secim == 3) {
                urunCikar();     // Sadece çağırıyoruz!
            } 
            else if (secim == 4) {
                System.out.println("Çıkış yapılıyor...");
                devamEdiyor = false;
            } else {
                System.out.println("Geçersiz seçim!");
            }
			
			
			
		}
		System.out.println("Program Sonlandı.");
		
		
		
	}
	
	public static void menuGoster() {
		System.out.println("\n----------- MENÜ -----------");
		System.out.println("1. Listele\n2. Ekle\n3. Çıkar\n4. Çıkış");
			
		
	}
	
	public static void listeyiGoster() {
		if (alisverisListesi.isEmpty()) {
            System.out.println("Listeniz şu an boş.");
        } else {
            System.out.println("--- Alışveriş Listeniz ---");
            for (int i = 0; i < alisverisListesi.size(); i++) {
                System.out.println(i + ". " + alisverisListesi.get(i));
            }
        }
	}
	
	public static void urunEkle() {
		System.out.print("Ne eklemek istiyorsun? ");
		String urunAdi = scan.nextLine();
		alisverisListesi.add(urunAdi);
		System.out.println("✅ " + urunAdi + " eklendi!");
	}
	
	public static void urunCikar() {
		listeyiGoster();
		
		if(!alisverisListesi.isEmpty()) {
			System.out.print("Silinecek numara (index): ");
			int silinecekIndex= scan.nextInt();
			
			if(silinecekIndex >= 0 && silinecekIndex < alisverisListesi.size()) {
				
				String silinen = alisverisListesi.get(silinecekIndex);
				alisverisListesi.remove(silinecekIndex);
				System.out.println("❌ " + silinen + " silindi.");
			}else {
				System.out.println("Hatalı numara girdiniz!");
			}
			
		}
	}
	
	
}
