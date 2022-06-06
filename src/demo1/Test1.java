package demo1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	@Test
	public void test1method2() {
		System.out.println("test1method2");
	}
	@BeforeSuite
	public void test1method1() {
		System.out.println("test1method1BeforeSuite");
	}
	@AfterSuite
	public void test1method3() {
		System.out.println("test1method3AfterSuite");
	}
	@BeforeTest
	public void test1method4() {
		System.out.println("test1method4BeforeTest");
	}
	@AfterTest
	public void test1method5() {
		System.out.println("test1method5AfterTest");
	}
	@BeforeClass
	public void test1method6() {
		System.out.println("test1method6BeforeClass");
	}
	@AfterClass
	public void test1method7() {
		System.out.println("test1method7AfterClass");
	}
	@BeforeMethod
	public void test1method8() {
		System.out.println("test1method8BeforeMethod");
	}
	@AfterMethod
	public void test1method9() {
		System.out.println("test1method9AfterMethod");
	}

}




