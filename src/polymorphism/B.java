package polymorphism;

public class B extends A {

public void test() {
		
		System.out.println("child method");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a=new B();
		a.test();
		
		
	}

}
