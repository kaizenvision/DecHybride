package com.hybrid;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.listner.MyTestLister;

@Listeners(MyTestLister.class)
public class AttributesDemo {
	
	@Test(groups = {"regression"})
	public void test1() {
		System.out.println("i am in test1");
	}
	
	@Test()
	public void test2() {
		System.out.println("i am in test2");
		
	}
	
	@Test()
	public void test3() {
		System.out.println("i am in test3");
		Assert.fail();
	}


}
