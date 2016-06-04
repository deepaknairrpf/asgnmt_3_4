import java.util.Scanner;
public class Asgnmt_3_4 {

	/**
	 * @param args
	 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("Enter the operation you would like to perform\n '+' for add, '-' for subtract, '*' to multiply" +
				"and '/' to divide");
		char operator;
		int input1,input2;
		
		Scanner obj=new Scanner(System.in);
		operator=obj.next().charAt(0);
		System.out.println("Enter input1");
		input1=obj.nextInt();
		System.out.println("Enter input2");
		input2=obj.nextInt();
		BasicCalc Calculator = new BasicCalc(input1,input2);
		System.out.println("The result of your expression is");
		switch(operator)
		{
		case '+':
			System.out.println(Calculator.add());
			break;
		case '-' :
			System.out.println(Calculator.subtract());
		case '*' :
			System.out.println(Calculator.multiply());
			break;
		case '/' :
			Calculator.divide();
			break;
			default :
				System.out.println("Please recheck the inputs and/or the operator entered");
		
		}
		
	}
}
