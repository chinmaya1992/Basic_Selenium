package TestNg;

import org.testng.annotations.Test;

public class Priority_Invocation {
	
	//1.TestNg main method
	@Test(priority=-1)
	public void demo() {
		System.out.println("Hi demo");
	}
	
	//2.TestNg main method
		@Test(invocationCount=2,enabled=false)
		public void demo1() {
			System.out.println("Hi demo1");
		}
		
	//3.TestNg main method
		@Test(priority=-5,invocationCount=2)
		public void demo2() {
			System.out.println("Hi demo2");
		}

}
