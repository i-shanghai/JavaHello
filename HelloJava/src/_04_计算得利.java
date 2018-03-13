import java.util.Scanner;

public class _04_计算得利 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//利率固定
		double rate=3.3/100;
		
		Scanner in =new Scanner(System.in); 
		System.out.println("请输入本金：");
		double benjin=in.nextDouble(); 
		System.out.println("请输入年数："); 
		int years=in.nextInt(); 
		in.close();
		
		//初始化 
		double amount=benjin;
		
		for(int i=1;i<=years;i++) {
			 amount=amount*(1+rate);
		}
		  
		System.out.println(amount);
		
		
	}

}
