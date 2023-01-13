import java.util.Scanner;

public class PositiveNum {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int N = scan.nextInt();
	
	if(N>=0) {
		System.out.println("Positive Number");
	}else {
		System.out.println("Negative Number");
	}

	}

}
