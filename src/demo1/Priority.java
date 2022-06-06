package demo1;

import org.testng.annotations.Test;

public class Priority {
	@Test(priority=1)
	public void bmethod1() {
		System.out.println("i am bmethod1");
	}
	@Test
	public void method2() {
		System.out.println("i am method2");
	}
	@Test(priority=1)
	public void amethod3() {
		System.out.println("i am amethod3");
}
	@Test
	public void method4() {
		System.out.println("i am method4");
	}
}
