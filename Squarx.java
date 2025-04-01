package Projektilm;
import java.util.Scanner;


public class Squarx {
    public int mySqrt(int x) {
        if (x < 2) return x; // Handle edge cases for 0 and 1

        int left = 0, right = x, result = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
             int square = (int) Math.pow(mid,2);
             
             
          
            if (square == x) {
                return mid; // Exact square root
            } else if (square < x) {
                left = mid + 1;
                result = mid; // Store closest lower bound
            } else {
                right = mid - 1;
            }
        }
		return result;
        }

        public static void main(String[] args) {
        Squarx sol = new Squarx();
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Shkruaj nje numer: ");
	    int m = myScanner.nextInt();
		
        System.out.println(sol.mySqrt(m)); // Example: Output 3 (sqrt(8) ≈ 2.828, round to 3)
         myScanner.close();
    }
}

