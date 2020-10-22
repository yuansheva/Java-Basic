package selection;
import java.util.Scanner;

public class Github_slc {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		
		System.out.println("Masukkan nilai a = ");
		a = s.nextInt();
		
		if (a % 2 == 0) {
			System.out.println("Genap");
		}
		else {
			System.out.println("Ganjil");
		}
	}

}
