
public class _05_����ת�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // long > int > short > byte
		//double > float > long
		 
		// ��ͬ���͵����ݼ��㣬Java�ῴ�Զ�ת��Ϊ�����Ǹ�����
		
		
		//long -> float , ����float �� long ��
		System.out.println(12L+12.0F);
		
		//int ת short
		short s=2;
		short s2=(short)(s+2); //2 Ĭ���� ����
		System.out.println(s2);
		
		//float ������������ f ,����ᱻĬ��Ϊ double
		float f=1.0f;
		float f2=7.0f;
		float fResult=f*f2;
		System.out.println(fResult);
		
		
		
		//5Ӣ��7Ӣ��
		 double  rate=0.3048; 
		int foot=5; 
		int inch=7; 
		
		//ǿ������ת����ֱ��ɾ��С��λ
		// e.���������� ��CM
		int tall=(int)((foot+inch/12.0)*rate*100); 
		System.out.println("������ǣ�"+tall +" CM");
		
		 //�޷�ת������ΪĬ�ϵ� double
		//int i=30/3.0;
		int num=(int)(30/3.1);
		System.out.println("������"+num );
		
		double dd=3.0;
		int k=(int)-dd;
		System.out.println("��������"+k );
		
		//Math.round �������� �����long ����
		long  pi=Math.round(3.1415926);
		System.out.println("Math.Round �Ľ����long ���ͣ�"+Math.round(3.1415926) );
		
		//�������
		System.out.println("-1000 ����byte�ķ�Χ ��"+(byte)(Math.round(-1000)) );
		System.out.println("1024 ����byte�ķ�Χ ��"+(byte)(Math.round(1024)) );
		
		//��Ŀ�����
		// ++ -- �����ӱ����Ǳ���
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
