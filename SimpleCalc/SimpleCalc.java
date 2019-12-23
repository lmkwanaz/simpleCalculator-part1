
import java.util.*;

public class SimpleCalc{

	public SimpleCalc(){
		System.out.println("  *********************");
		System.out.println(" *                    *");
		System.out.println(" *	Hey welcome       *");
		System.out.println(" *	     to           *");
		System.out.println(" *	SimpleCalculator. *");
		System.out.println(" *			  *");
		System.out.println(" *********************");

	}

	public static void main(String[] args){
	
		SimpleCalc simple = new SimpleCalc();

		double firstNum;
		double secondNum; 
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter the first number");
		firstNum = scan.nextDouble();
		System.out.println("please enter the second number");
		secondNum = scan.nextDouble();

		double sum = firstNum + secondNum;
		System.out.println("THE SUM IS : "+sum);
	}


}
