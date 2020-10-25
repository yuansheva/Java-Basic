package latihanSelection1;
import java.util.Scanner;

public class Nomor10 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		
		System.out.print("Masukkan Nilai = ");
		a = s.nextInt();
		
		if (a>86) {
			System.out.print("A");
		}
		else if (a > 71 && a <= 86) {
			System.out.print("B");
		}
		else if (a > 56 && a <=71) {
			System.out.print("C");
		}
		else if(a > 41 && a <= 56) {
			System.out.print("D");
		}
		else if(a <= 41) {
			System.out.print("E");
		}
		
	}

}
