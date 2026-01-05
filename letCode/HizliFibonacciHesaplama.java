package javaDenemesi.kosullar.letCode;

public class HizliFibonacciHesaplama {

	public static long fibonacci(int n) {
		if(n < 0) {
			return -1;
		}
		
		long[] hafiza = new long[n + 1];
		return fibonacciHesapla(n, hafiza);
	}
	
	private static long fibonacciHesapla(int n, long[] hafiza) {
		
		if (n == 0) return 0;
        if (n == 1) return 1;
        
       
        if (hafiza[n] != 0) {
            return hafiza[n];
        }
        
     
        hafiza[n] = fibonacciHesapla(n - 1, hafiza) + fibonacciHesapla(n - 2, hafiza);
     
        
        return hafiza[n];
	}

	public static void main(String[] args) {
        System.out.println("Sonuç: " + fibonacci(49)); 
       
    }
}