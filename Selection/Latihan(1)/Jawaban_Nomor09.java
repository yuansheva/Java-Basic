package latihanSelection1;
import java.util.Scanner;

public class Nomor9 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a,b,c,d, totalHasil;
		int hasil1,hasil2,hasil3,hasil4;
		
		System.out.println("===== DAFTAR MENU =====");
		System.out.println("1. Milo (Rp. 7.500)");
		System.out.println("2. Kopi (Rp. 4.000)");
		System.out.println("3. Teh Botol (Rp. 3.500)");
		System.out.println("4. Jus Mangga (Rp. 5.000)");
		System.out.println("===== DAFTAR MENU =====");
		
		System.out.print("\nMau Berapa Milo ? = ");
		a = s.nextInt();
		hasil1 = a*7500;
		System.out.print("Mau Berapa Kopi ? = ");
		b = s.nextInt();
		hasil2 = b*4000;
		System.out.print("Mau Berapa Teh Botol ? = ");
		c = s.nextInt();
		hasil3 = c*3500;
		System.out.print("Mau Berapa Jus Mangga ? = ");
		d = s.nextInt();
		hasil4 = d*5000;
		
		totalHasil = hasil1 + hasil2 + hasil3 + hasil4;
		
		if (totalHasil > 100000) {
			System.out.print("\nTotal yang harus dibayar adalah = " + (totalHasil - totalHasil * 0.15));
		}
		else if(totalHasil > 50000 && totalHasil <= 100000) {
			System.out.print("\nTotal yang harus dibayar adalah = " + (totalHasil - totalHasil * 0.07));
		}
		else if(totalHasil <=50000) {
			System.out.print("\nTotal yang harus dibayar adalah = " + totalHasil);
		}
	}

}
