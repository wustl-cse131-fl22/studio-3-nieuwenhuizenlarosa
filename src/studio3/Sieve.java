package studio3;
import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What number do you want to go up to?");
		double answer = in.nextDouble();
		int n = (int)answer;
		int[] x = new int[n];
		int count = 0;

		for(int i = 3; i<n; i++) {
			for(int j=2; j<i; j++) {
				if(i%j!=0 ){
					x[count] = i;
					count++;
					break;
				}
			}
		}
		System.out.println("1");
		System.out.println("2");
		for(int a = 0; a<=count; a++) {
			
			System.out.println(x[a]);
		}
	}

}
