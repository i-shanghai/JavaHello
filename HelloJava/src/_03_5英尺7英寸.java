import java.util.Scanner;

public class _03_5Ӣ��7Ӣ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//float : ������7λ��Ч����
		//double :˫����15λ��Ч����
		
		 //12343L ������
		// ����С����Ϊ��������Ĭ��Ϊ double ����
		// 12.0F   Float����
		// ��ѧ�������� double bigNum =  -1.23E23+16
		
		//����������������
		System.out.printf("%.1f",1.2-1.1);
		
		//5Ӣ��7Ӣ��
		 double  rate=0.3048;
		
		System.out.println("\n���������(Ӣ�� Ӣ��)��");
		
		Scanner in =new Scanner(System.in);
		int foot=0; 
		int inch=0; 
		foot=in.nextInt(); 
		inch=in.nextInt();
		
		double tall=(foot+inch/12.0)*rate; //��������ȷ��С���� . ����С����Ϊ��������Ĭ��Ϊ double ����
		
		System.out.println("������ǣ�"+tall +" CM");
		
		in.close();
	}

}
