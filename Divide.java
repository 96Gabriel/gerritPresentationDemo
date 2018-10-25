package pack;
import java.util.Scanner;

public class Divide {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the numerator: ");
		int a = sc.nextInt();
		
		int b = 0;
		
		//do{
			System.out.print("Enter the denominator: ");
			b = sc.nextInt();
		//}while(b == 0);
		
		System.out.print("The result of the division between " + a + " and " + b + " is: " + (float)a/b);
		sc.close();
	}

}
