package latihanSelection1;
import java.util.Scanner;

public class Nomor1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		
		System.out.print("Masukkan Input = ");
		a = s.nextInt();
		
		if(a<0) {
			System.out.print("Negatif");
		}
		else if(a>0) {
			System.out.print("Positif");
		}
	}

}
