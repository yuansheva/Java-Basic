package latihanSelection1;
import java.util.Scanner;

public class Nomor5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		
		System.out.print("Masukkan Umur anda = ");
		a = s.nextInt();
		
		if (a >= 17) {
			System.out.print("Boleh menonton");
		}
		else {
			System.out.print("Tidak boleh menontoh=n");
		}
	}

}
