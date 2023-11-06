package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import validation.UserValidation;

public class Testcases{
		@Test
		public void case1() {
			UserValidation c1=new UserValidation();
			Assert.assertEquals(true, c1.check("rakesh","rakesh"));
		}
		@Test
		public void case2()
		{
			UserValidation c2 = new UserValidation();
			Assert.assertEquals(false, c2.check("madhan","madhan"));
		}
		@Test
		public void case3()
		{
			UserValidation c3=new UserValidation();
			Assert.assertEquals(false, c3.check("raki", "rakesh"));
		}
}
