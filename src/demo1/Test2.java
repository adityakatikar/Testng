package demo1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void test2method1() {
		System.out.println("test2method1");
	}
	@Test
	public void test2method2() {
		System.out.println("test2method2");
	}
	@BeforeTest
	public void test2method3() {
		System.out.println("test2method3BeforeTest");
	}
	@AfterTest
	public void test2method4() {
		System.out.println("test2method4AfterTest");
	}
	@BeforeMethod
	public void test2method5() {
		System.out.println("test2method5BeforeMethod");
	}
	@AfterMethod
	public void test2method6() {
		System.out.println("test2method6AfterMethod");


}
}
