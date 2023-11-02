package sample;

public class Student {
	
	String a;
	int b;
	public Student(String a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	public void display()
	{
       System.out.println(a);
       System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj = new Student("Aaron", 2);
		Student obj1 = new Student("Karan", 3);
        obj.display();
        obj1.display();

	}

}
