
import java.util.Scanner;
/**
计算10!的阶乘
*/
public class Test{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int jc = 1;
		for(int i = 1;i<=10;i++){
			jc *= i;	
		}
		
		System.out.println("10的阶乘为："+jc);
		
	}
}