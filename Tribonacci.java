package Projektilm;
import java.util.Scanner;

public class Tribonacci {
	public int tribonacci(int n) {
		int[] t = {0, 0, 1};
		
		if (n<3) {return t[n]; }
		for (int i =3; i<=n; i++) {
			int sum = t[0] + t[1] + t[2];       
			t[0] = t[1];
			t[1] = t[2];
			t[2] = sum; }
		
			return t[2];
		
	}

	public static void main(String[] args) {
		Tribonacci mytri = new Tribonacci();
		Scanner mySca = new Scanner(System.in);
		System.out.println("Shkruaj nje numer: ");
		int n = mySca.nextInt();
		
		System.out.println(mytri.tribonacci(n));
		
	
		mySca.close();

	}
   
}
