import java.util.Scanner;

public class _02_Variant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�޷��ı�ı���
		//final int bill=100;
		 
		//�����۸����
		System.out.println("��������Ʒ�۸�");
		Scanner in =new Scanner(System.in);
		int price=0; 
		price=in.nextInt();
	
		
		System.out.println("�����븶���");
		 float amount=in.nextFloat();
		 float  change=amount-price;
		 
		 
		in.close();
		
		System.out.println("���㣺"+change);  
		
	}

}
