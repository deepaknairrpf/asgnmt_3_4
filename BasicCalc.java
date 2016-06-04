
public class BasicCalc {

	private int input1,input2;
	BasicCalc(){this(0,0);}
	BasicCalc(int input1,int input2)
	{
		
		this.input1=input1;
		this.input2=input2;
	}
	public int add()
	{
		return input1+input2;
	}
	public int subtract()
	{
		return input1-input2;
	}
	public int multiply()
	{
		return input1*input2;
	}
	public void divide()
	{
		if(input2!=0)
		{
		 System.out.println((float)input1/input2); 
			
		}
		else
			System.out.println("Division by 0 is undefined");	
	}

}
