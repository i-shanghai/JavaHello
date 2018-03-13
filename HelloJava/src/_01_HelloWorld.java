import java.util.Scanner;

public class _01_HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Java"); 
		System.out.println("Hello Java"+1+2); 
		System.out.println(2+1+"Hello Java"); 
		
		Scanner in =new Scanner(System.in);
		
		System.out.println("Answer:"+in.nextLine());
		
		in.close();
	}

}
