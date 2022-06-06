package demo1;

import org.testng.annotations.Test;

public class Groups {
	@Test(groups="smokeTestcases")
	public void method1() {
		System.out.println("i am method1");
	}
	@Test(groups="regressionTestcases")
	public void method2() {
		System.out.println("i am method2");
	}
	@Test
	public void method3() {
		System.out.println("i am method3");
	}
}
