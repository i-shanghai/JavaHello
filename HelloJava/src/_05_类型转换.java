
public class _05_类型转换 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // long > int > short > byte
		//double > float > long
		 
		// 不同类型的数据计算，Java会看自动转换为最宽的那个类型
		
		
		//long -> float , 所以float 比 long 宽
		System.out.println(12L+12.0F);
		
		//int 转 short
		short s=2;
		short s2=(short)(s+2); //2 默认是 整形
		System.out.println(s2);
		
		//float 定义后面必须是 f ,否则会被默认为 double
		float f=1.0f;
		float f2=7.0f;
		float fResult=f*f2;
		System.out.println(fResult);
		
		
		
		//5英尺7英寸
		 double  rate=0.3048; 
		int foot=5; 
		int inch=7; 
		
		//强制类型转换，直接删除小数位
		// e.输出整数身高 ：CM
		int tall=(int)((foot+inch/12.0)*rate*100); 
		System.out.println("请身高是："+tall +" CM");
		
		 //无法转换，因为默认地 double
		//int i=30/3.0;
		int num=(int)(30/3.1);
		System.out.println("整数："+num );
		
		double dd=3.0;
		int k=(int)-dd;
		System.out.println("负整数："+k );
		
		//Math.round 四舍五入 结果是long 类型
		long  pi=Math.round(3.1415926);
		System.out.println("Math.Round 的结果是long 类型："+Math.round(3.1415926) );
		
		//数据溢出
		System.out.println("-1000 超出byte的范围 ："+(byte)(Math.round(-1000)) );
		System.out.println("1024 超出byte的范围 ："+(byte)(Math.round(1024)) );
		
		//单目运算符
		// ++ -- 的算子必须是变量
		int a =5;
		int b=0;
		
		// b = a++ ;   
		// System.out.println("b = a++ ; b="+b );
		
		b = ++a ;   
		System.out.println("b = ++a ; b="+b );
		
		
		//int x=10;
		//int y=x+x++;
		//System.out.println("y=x+x++;y="+y);
		
		int x=10;
		int y=x+++x;
		System.out.println("y=x+++x;y="+y);
		
		 
	}

}
