package latihanSelection1;
import java.util.Scanner;

public class Nomor2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		String hasil;
		
		System.out.print("Masukkan Input = ");
		a = s.nextInt();
		
		hasil = (a < 0) ? "Negatif" : "Positif";
		System.out.print(hasil);
	}

}
