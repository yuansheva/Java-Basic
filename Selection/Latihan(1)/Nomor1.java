package tugas2;
import java.util.Scanner;

public class Nomor1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan karakter huruf = ");
		char a = input.next().charAt(0);
		
		if ((a == 'a') || (a == 'i') || (a == 'u') || (a == 'e') || (a == 'o')) {
			System.out.print("Huruf Vokal");
			
		}
		else {
			System.out.print("Bukan Huruf Vokal");
		}
	}
}
