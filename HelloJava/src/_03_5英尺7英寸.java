import java.util.Scanner;

public class _03_5英尺7英寸 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//float : 单精度7位有效数字
		//double :双精度15位有效数字
		
		 //12343L 长整形
		// 带有小数点为浮点数，默认为 double 类型
		// 12.0F   Float类型
		// 科学计数法： double bigNum =  -1.23E23+16
		
		//浮点数有数度问题
		System.out.printf("%.1f",1.2-1.1);
		
		//5英尺7英寸
		 double  rate=0.3048;
		
		System.out.println("\n请输入身高(英尺 英寸)：");
		
		Scanner in =new Scanner(System.in);
		int foot=0; 
		int inch=0; 
		foot=in.nextInt(); 
		inch=in.nextInt();
		
		double tall=(foot+inch/12.0)*rate; //除数，精确到小数点 . 带有小数点为浮点数，默认为 double 类型
		
		System.out.println("请身高是："+tall +" CM");
		
		in.close();
	}

}
