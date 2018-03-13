import java.util.Scanner;

public class _02_Variant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//无法改变的变量
		//final int bill=100;
		 
		//收银价格计算
		System.out.println("请输入商品价格：");
		Scanner in =new Scanner(System.in);
		int price=0; 
		price=in.nextInt();
	
		
		System.out.println("请输入付款金额：");
		 float amount=in.nextFloat();
		 float  change=amount-price;
		 
		 
		in.close();
		
		System.out.println("找零："+change);  
		
	}

}
