import java.util.Scanner;

class Factorial {
	public static void main(String[] args) {
		int num;
		System.out.println("\nEnter any number");
		Scanner scanner=new Scanner(System.in);
		num=scanner.nextInt();
		System.out.println("\nFactorial: "+fact(num));
	}

	public static int fact(int n) {
		if(n==1) 
			return 1;
		return n*fact(n-1);
	}
}