import java.util.Scanner;

public class Faktoriyel {
	public static void Faktoriyel() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int a = scan.nextInt();
		int fak = 1;
		while (a>0) {
			fak *= a;
			a--;
		}
		System.out.println("Girdiğiniz sayinin faktoriyel değeri:" +fak);
	}

	public static void main(String[] args) {
		System.out.println("Girdiginiz sayinin faktoriyelini hesaplayacağım.");
		Faktoriyel();
		

	}

}
