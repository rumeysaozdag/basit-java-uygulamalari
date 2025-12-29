package javaDenemesi.kosullar;

import java.util.ArrayList;
import java.util.Scanner;

public class MarketApp {

	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		
		
		boolean devamEdiyor = true;
		
		System.out.println("===  Profesyonel Market Sistemi ===");
		MarketManager yonetici = new MarketManager();
		while(devamEdiyor) {
			System.out.println("\n1. Listele | 2. Ekle | 3. Çıkar | 4. Fiyat Güncelle | 5. Çıkar ");
			System.out.print("Seçiminiz: ");
			int secim = scan.nextInt();
			scan.nextLine(); //Enter hatasını temizliyor
			
			if(secim==1) {
				ArrayList<Urun> gelenListe= yonetici.listeyiGetir();
				
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
				System.out.println("--- Ürün Türü Seçin ---");
                System.out.println("1. Gıda (SKT var)");
                System.out.println("2. Elektronik (Garanti var)");
                System.out.println("3. Standart Ürün");
                System.out.print("Seçiminiz: ");
                int tur = scan.nextInt();
                scan.nextLine(); 

                
                System.out.print("Ürün Adı: ");
                String ad = scan.nextLine();
                
                System.out.print("Fiyatı: ");
                double fiyat = scan.nextDouble();
                scan.nextLine(); 

                if (tur == 1) {
                   
                    System.out.print("Son Kullanma Tarihi (Örn: 2025): ");
                    String skt = scan.nextLine();
                    
                    
                    Gida yeniGida = new Gida(ad, fiyat, skt);
                    
                   
                    yonetici.urunEkle(yeniGida); 
                    System.out.println(" Gıda reyonuna eklendi: " + ad);
                    
                } else if (tur == 2) {
                    
                    System.out.print("Garanti Süresi (Ay): ");
                    int garanti = scan.nextInt();
                    scan.nextLine();
                    
                    Elektronik yeniElektronik = new Elektronik(ad, fiyat, garanti);
                    
                    yonetici.urunEkle(yeniElektronik);
                    System.out.println(" Elektronik reyonuna eklendi: " + ad);
                    
                } else {
                    
                    Urun yeniUrun = new Urun(ad, fiyat);
                    yonetici.urunEkle(yeniUrun);
                    System.out.println(" Standart rafa eklendi: " + ad);
                }
			}
			
			else if (secim==3) {
				
				System.out.println("--- Silinecek Ürünü Seçin ---");
				

				ArrayList<Urun> liste = yonetici.listeyiGetir();
				for(int i=0; i<liste.size(); i++) {
                    System.out.println(i + ". " + liste.get(i));
                }
				
				System.out.print("Sıra Numarası: ");
				int silinecekIndex = scan.nextInt();
				scan.nextLine();
				
				String sonuc = yonetici.urunSil(silinecekIndex);
				
				if (sonuc != null) {
                    System.out.println(sonuc + " çöpe atıldı.");
                } else {
                    System.out.println(" Geçersiz numara!");
                }
            }
				
			
			
			else if (secim==4) {
				
				System.out.println("--- Fiyat Güncelleme ---");
				ArrayList<Urun> liste = yonetici.listeyiGetir();
                for(int i=0; i<liste.size(); i++) {
                    System.out.println(i + ". " + liste.get(i));
                }
                
                System.out.print("Hangi ürünün fiyatı değişecek (Sıra No): ");
                int guncellenecekIndex = scan.nextInt();
                
                System.out.print("Yeni Fiyat: ");
                double yeniFiyat = scan.nextDouble();
                scan.nextLine();
                
                
                boolean sonuc = yonetici.fiyatGuncelle(guncellenecekIndex, yeniFiyat);
                
                if(sonuc) {
                	System.out.println(" Fiyat başarıyla güncellendi!");
                }else {
                	System.out.println(" Hata: Yanlış ürün numarası seçtiniz.");
                }
				
				
			}
			else if(secim==5) {
				devamEdiyor = false;
				System.out.println("Güle güle...");
			}
			
		}
		
	}
}
