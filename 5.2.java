package test;

public class Test {
	public static void main(String[] args) {
		MyTest onetest = new MyTest();
		System.out.println(onetest.x);
		System.out.println(onetest.y);
	}
}

class MyTest
{
	MyTest()
	{
		y = "Initialize";
	}
	String x;
	String y;
}
