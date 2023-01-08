import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class account {
	public static void faktoriyel(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Sayi giriniz:");
		int x = scan.nextInt();
		int sonuc = 1;
		while(x>0) {
			sonuc*=x;
			x--;
		}
		System.out.println("Girdiğiniz sayinin faktöriyeli= " + sonuc);
	}

	public static void main(String[] args) {
		//input alma:
		
		/*Scanner scan = new Scanner(System.in);
		System.out.println("Bir değer giriniz:");
		int a = scan.nextInt();
		System.out.println("Girdiğiniz a değişkenin değeri : " + a);*/
		
		/*System.out.println("Bir yazı giriniz:");
		String a = scan.nextLine();
		System.out.println("Girdiğiniz yazı : " + a);
		*/
		
		// Aritmetik operatörler:
		
		/*int x = 10;
		int y = 15;
		System.out.println("x ve y değerinin toplamı: " + (x+y)); */
		
		/*int x = 10;
		int y = 4;
		System.out.println("x'in y'ye bölümünden kalan: "+ ((double)x/y)); */

		// Arttırma ve azaltma operatörleri:
		
		/*int a = 10;
		a++;
		System.out.println("A'nın değeri: " + a);
		
		int b = 10;
		b--;
		System.out.println("B'nın değeri: " + b);
		
		int c = 10;
		c-=1;
		System.out.println("C'nın değeri: " + c);
		
		int d = 10;
		System.out.println("D'nın değeri: " + d--);
		System.out.println("D'nın değeri: " + d);
		
		int e = 10;
		System.out.println("E'nın değeri: " + --e);
		System.out.println("E'nın değeri: " + e); */
		
		//Koşul Durumları ve Daha Fazlası:
		
		/* a == b --> eşit mi (eşitse true değilse false)
		   a!=b --> eşit değil mi (eşit değilse true eşitse false)
		   a>b --> a b den büyük mü(büyükse true değilse false)
		   a<b --> a b den küçük mü(küçükse true değilse false)
		   a<=b ----> a b ye eşit veya b den küçük mü(öyleyse true değilse false)
		   a >= b ----> a b ye eşit veya b den büyük mü (öyleyse true değilse false)
		   
		   if(koşul) {
		   		if bloğu 
		   		Burada koşul sağlanınca işlemler yapılıyor...
		   	}
		   	*/
		
		/*Scanner scan = new Scanner(System.in);
		System.out.println("Notunuzu girin: ");
		int Note = scan.nextInt();
		if (Note>90) 
			System.out.println("Tebrikler dersten geçtiniz! --> AA");
		else if (Note>=85) 
			System.out.println("Dersten Geçtiniz! ---> BA");
		else if (Note >= 70)
			System.out.println("Dersten geçtiniz! BB");
		else
			System.out.println("Dersten kaldınız!");
		*/
		
		//Mantıksal Operatörler ve Koşullu Durum Örneği(if- else if- else)
		
		/*
		! (Not)
		Kullanımı !(3 > 4)
		Anlamı:
		true bir değeri false, false değeri true
	
		&& (And)
		Kullanımı: (3 > 4) && ("yazılım" == "yazılım")
		Anlamı:
		true,true ----> true
		true,false ----> false
		false,true ---> false
		false,false ----> false
		
		|| (Or)
		Kullanımı : (3 > 4) || ("yazılım" == "yazılım")
		true,true = true
		true,false = true
		false,true = true
		false,false = false
		*/
		
		 // Kullanıcı adı girişi örneği:(JAVA'da STRİNG DEĞERLER == ile KONTROL EDİLMEZ .equals FONKSİYONU KULLANILIR!
		/*
		 Scanner scan = new Scanner(System.in);
		 String ad = "Bora";
		 String sifre = "2022";
		 System.out.println("Kullanııcı adı ve şifre giriniz:");
		 String kullaniciadi= scan.nextLine();
		 String kullanicisifre = scan.nextLine();
		 if (ad.equals(kullaniciadi) && sifre.equals(kullanicisifre)) {
			 System.out.println("Giriş doğru...");
		 }
		else if(!(kullaniciadi.equals(ad)) && kullanicisifre.equals(sifre)) {
			 System.out.println("Kullanici adınız yanlış...");
			 }
		else if(kullaniciadi.equals(ad) && !(kullanicisifre.equals(sifre))) {
			 System.out.println("Şifreniz yanlış...");
			 }
		else {
			System.out.println("Kullanıcı adı ve şifre geçersiz...");	
			 }
		 */
		//Fonksiyonlar
		
		faktoriyel();
		 
		 
	}
}
