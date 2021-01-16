import java.util.Scanner;

public class Swap_without_temp {

	public static void main(String[] args) {
		int a,b;
		System.out.println("Enter the values of a and b");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After Swapping a="+a+" and b="+b);
	}
	}


