import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A {
	private String bClass;
	private String bMethod1;
	private String bMethod2;

	@BeforeTest
	public void befortest() {
	    bClass = "Beforetest behaviour";
	}
	
	@BeforeClass
	public void beforeClass() {
	    bClass = "BeforeClass was executed once for this class";
	}

	@BeforeMethod
	public void beforeMetodTest1() {
	    bMethod1 = "It's before method for test1";
	}

	@Test
	public void test1() {
	    System.out.println(bClass);
	    System.out.println(bMethod1);
	}

	@BeforeMethod
	public void beforeMethodTest2() {
	    bMethod2 = "It's before method for test2";
	}

	@Test
	public void test2() {
	    System.out.println("bClass");
	    System.out.println("bMethod2");
	}
	@Test
	public void test3() {
	    System.out.println("test4");
	   
	}
	@Test
	public void test4() {
	    System.out.println("test8");
	   
	}
	}

