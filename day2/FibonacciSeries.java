package week.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range=8;
		int a=0,b=1;
		System.out.println("Fibonacci series up to"+range+":");
		System.out.println(a+"");
			while(b<=range) {
				System.out.println(b+"");
				int next=a+b;
				a=b;
				b=next;
			}

	}

}
