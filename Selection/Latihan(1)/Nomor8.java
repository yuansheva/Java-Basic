package latihanSelection1;
import java.util.Scanner;

public class Nomor8 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a,b,c,D;
		
		System.out.print("Masukkan a = ");
		a = s.nextInt();
		System.out.print("Masukkan b = ");
		b = s.nextInt();
		System.out.print("Masukkan c = ");
		c = s.nextInt();
		
		System.out.println(a + "X^2 + " + b + "X + " + c);
		
		D = b*b - 4*a *c;
		
		if (D > 0) {
			System.out.print("Dua Akar Berbeda");
		}
		else if(D == 0) {
			System.out.print("Satu Akar Berbeda");
		}
		else {
			System.out.print("Tidak memilki akar");
		}
	}

}
