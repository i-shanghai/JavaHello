import java.util.Scanner;

public class _04_������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//���ʹ̶�
		double rate=3.3/100;
		
		Scanner in =new Scanner(System.in); 
		System.out.println("�����뱾��");
		double benjin=in.nextDouble(); 
		System.out.println("������������"); 
		int years=in.nextInt(); 
		in.close();
		
		//��ʼ�� 
		double amount=benjin;
		
		for(int i=1;i<=years;i++) {
			 amount=amount*(1+rate);
		}
		  
		System.out.println(amount);
		
		
	}

}
