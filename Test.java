
import java.util.Scanner;
/**
����10!�Ľ׳�
*/
public class Test{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int jc = 1;
		for(int i = 1;i<=10;i++){
			jc *= i;	
		}
		
		System.out.println("10�Ľ׳�Ϊ��"+jc);
		
	}
}