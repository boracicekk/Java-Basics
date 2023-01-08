import java.util.Scanner;

public class Parametrelifonk {
	public static void isimyazdirma(String isim) {
		System.out.println("İsminiz:"+isim);
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("İsminizi giriniz:");
		String a = scan.nextLine();
		isimyazdirma(a);
	}

}
