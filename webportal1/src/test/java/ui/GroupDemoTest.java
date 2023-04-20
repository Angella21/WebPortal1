package ui;

import org.junit.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

@Test(groups="user-registration")
public class GroupDemoTest {

	@BeforeClass
	public void beforeClass(){
		System.out.println("Run this before anything!");
	}
	
	@AfterClass
	public void afterClass(){
		System.out.println("Run this after anything!");
	}
	
	@BeforeGroups(value="regression")
	public void beforeGroup(){
		System.out.println("Run this before the group!");
	}
	@AfterGroups(value="regression")
	public void afterGroup(){
		System.out.println("Run this after the group!");
	}
	@Test(priority=1, description = "This is logout test!",groups="regression")
	public void test1() {
		System.out.println("test1!");
	}
	@Test(enabled=false,priority=2,description = "This is login test!",groups="bvt")
	public void test2() {
		// TODO Auto-generated method stub
     System.out.println("test2!");
	}
	@Test(groups="regression")
	public void test3() {
		// TODO Auto-generated method stub
     System.out.println("test3!");
	Assert.assertTrue(true);
	}

}
