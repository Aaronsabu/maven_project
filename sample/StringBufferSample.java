package sample;

public class StringBufferSample {

	public static void main(String[] args) {
		StringBuffer obj = new StringBuffer("Hello");
		System.out.println(obj);
		obj.append("everyone");
        System.out.println(obj);
        obj.insert(0, "A");
        System.out.println(obj);
        obj.replace(10, 13, "all");
        System.out.println(obj);
        obj.delete(10, 13);
        System.out.println(obj);
        obj.reverse();
        System.out.println(obj);
	}

}
