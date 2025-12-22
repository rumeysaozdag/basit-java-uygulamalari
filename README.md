# 🚀 Basit Java Uygulamaları

Bu repository, Java öğrenme sürecimde yazdığım temel algoritma ve mantık uygulamalarını içerir. Özellikle **Döngüler (Loops)** ve **Koşul Yapıları (Conditional Statements)** konularını pekiştirmek için hazırlanmıştır.

## 📂 İçerikteki Projeler

1.  **🏧 ATM Simülasyonu:** `while` döngüsü ve `switch-case` (veya if-else) yapısı kullanılarak hazırlanan, bakiye sorgulama, para çekme/yatırma işlemleri yapan uygulama.
2.  **📊 Günlük Harcama Takipçisi:** Kullanıcıdan gün sayısı alarak, diziler (arrays) yardımıyla harcamaları tutan ve ortalama hesaplayan program.
3.  **🔢 Tek mi Çift mi Analizörü:** Girilen sayıların modunu (`%`) alarak tek veya çift olduğunu belirleyen algoritma.
4.  **🎓 Not Hesaplama Sistemi:** Öğrenci notlarını alıp geçme/kalma durumunu analiz eden sistem.

---

## 📚 Teknik Notlar: Java Döngüler ve Koşullar

Bu projeleri geliştirirken kullandığım temel yapılar hakkında notlar:

### 1. Koşul Yapıları (Decision Making)
Programın belirli durumlara göre farklı kararlar vermesini sağlar.

* **If - Else:** Bir koşulun `true` (doğru) veya `false` (yanlış) olmasına göre çalışır.
    ```java
    if (bakiye < tutar) {
        System.out.println("Yetersiz Bakiye!");
    } else {
        bakiye -= tutar;
    }
    ```
* **Switch - Case:** Bir değişkenin değerine göre birçok farklı yoldan birini seçmek için kullanılır (Örn: Menü seçimleri). `if-else` bloklarının daha okunabilir halidir.

### 2. Döngüler (Loops)
Bir işlemin birden fazla kez tekrarlanmasını sağlar.

* **For Döngüsü:** Tekrar sayısı önceden belliyse kullanılır.
    * *Örnek:* "10 tane sayı giriniz" veya "Sınıftaki 20 öğrencinin notunu hesapla".
    ```java
    for (int i = 0; i < 10; i++) {
        // 10 kere döner
    }
    ```

* **While Döngüsü:** Tekrar sayısı belli değilse, bir koşula bağlıysa kullanılır.
    * *Örnek:* "Kullanıcı 'Çıkış' diyene kadar programı açık tut" (ATM Örneği).
    ```java
    while (devamEdiyor) {
        // Kullanıcı çıkış yapana kadar sonsuz döner
    }
    ```

### 3. Veri Alma (Scanner)
Kullanıcıdan veri almak için `java.util.Scanner` sınıfı kullanılır.
* `scan.nextInt()` -> Tam sayı alır.
* `scan.nextDouble()` -> Virgüllü sayı alır.
* `scan.nextLine()` -> Metin alır.

---
💻 *Java öğrenmeye devam ediyorum, yeni projeler eklenecektir...*