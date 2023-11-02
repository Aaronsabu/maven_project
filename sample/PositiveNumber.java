package sample;

public class PositiveNumber {
	public void print(int a)
	{
		if(a<0)
		{
			System.out.println("number is negative");
		}
		else
		{
			System.out.println("number is positive");
		}
	}

	public static void main(String[] args) {
		PositiveNumber obj = new PositiveNumber();
		obj.print(5);

	}

}
