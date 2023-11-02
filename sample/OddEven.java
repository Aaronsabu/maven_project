package sample;

public class OddEven {
	public void print(int a)
	{
		if(a%2==0)
		{
			System.out.println("number is even");
		}
		else
		{
			System.out.println("Number is odd");
		}
	}

	public static void main(String[] args) {
		OddEven obj = new OddEven();
        obj.print(2);				

	}

}
