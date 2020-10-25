package latihanSelection1;
import java.util.Scanner;

public class Nomor4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b, c, d;
		String hasil;
		
		System.out.print("Masukkan sisi pertama = ");
		a = s.nextInt();
		System.out.print("Masukkan sisi kedua = ");
		b = s.nextInt();
		System.out.print("Masukkan sisi ketiga = ");
		c = s.nextInt();
		
		hasil = a*a + b*b == c*c ? "Segitiga siku-siku" : "Bukan segitiga sikut siku";
		System.out.print(hasil);
	}

}
