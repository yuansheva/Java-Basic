package latihanSelection1;
import java.util.Scanner;

public class Nomor3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b, c;
		
		System.out.print("Input sisi pertama = ");
		a = s.nextInt();
		System.out.print("Input sisi kedua = ");
		b = s.nextInt();
		System.out.print("Input sisi ketiga = ");
		c = s.nextInt();
		
		if (a*a + b*b == c*c) {
			System.out.print("Segitiga siku-siku");
		}
		else {
			System.out.print("Bukan segitiga siku-siku");
		}
	}

}
