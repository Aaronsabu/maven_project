package sample;

public class ConstructorSample {

	public ConstructorSample()
	{
		System.out.println("Default constructor");
		System.out.println("hello");
	}
	public ConstructorSample(int a, int b)
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorSample obj = new ConstructorSample();
		ConstructorSample obj1 = new ConstructorSample(6,4);
	}

}
