package javaDenemesi.kosullar;

import java.util.ArrayList;
import java.util.Scanner;

public class MarketApp {

	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		MarketManager yonetici = new MarketManager();
		
		boolean devamEdiyor = true;
		
		System.out.println("===  Profesyonel Market Sistemi ===");
		while(devamEdiyor) {
			System.out.println("\n1. Listele | 2. Ekle | 3. Çıkar | 4. Çıkış");
			System.out.print("Seçiminiz: ");
			int secim = scan.nextInt();
			scan.nextLine(); //Enter hatasını temizliyor
			
			if(secim==1) {
				ArrayList<String> gelenListe= yonetici.listeyiGetir();
				
				if(gelenListe.isEmpty()) {
					System.out.println(" Liste şu an boş.");
				}else {
					System.out.println("--- Güncel Liste ---");
					for (int i = 0; i < gelenListe.size(); i++) {
						System.out.println(i + ". " + gelenListe.get(i));
					}
				}
			}
			
			else if(secim==2) {
				System.out.print("Ürün adı: ");
				String urun = scan.nextLine();
				
				yonetici.urunEkle(urun);
				System.out.println( urun + " başarıyla eklendi.");
			}
			
			else if (secim==3) {
				
				System.out.println("Mevcut Liste: " + yonetici.listeyiGetir());
				
				System.out.print("Silinecek sıra numarası (index): ");
				int silinecekIndex = scan.nextInt();
				
				String sonuc = yonetici.urunSil(silinecekIndex);
				
				if(sonuc != null) {
					System.out.println(sonuc + " listeden atıldı.");
				}else {
					System.out.println(" Hata: Geçersiz numara!");
				}
			}
			
			else if (secim==4) {
				devamEdiyor = false;
				System.out.println("Güle güle...");
			}
			
		}
		
	}
}
