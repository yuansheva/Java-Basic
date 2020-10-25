package latihanSelection1;
import java.util.Scanner;

public class Nomor7 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		
		System.out.print("Masukkan umur anda = ");
		a = s.nextInt();
		
		if (a>= 0 && a<10) {
			System.out.print("Anak-Anak");
		}
		else if(a>=10 && a<50) {
			System.out.print("Dewasa");
		}
		else if(a >=50) {
			System.out.print("Lansia");
		}
	}

}
