package latihanSelection1;
import java.util.Scanner;

public class Nomor6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		String hasil;
		
		System.out.print("Masukkan Umur anda = ");
		a = s.nextInt();
		
		hasil = a >= 17 ? "Boleh menonton" : "Tidak boleh menonton";
		System.out.print(hasil);
		
	}

}
