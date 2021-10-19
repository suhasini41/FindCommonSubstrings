package package1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CommonSubstringsTest {

	private String findCommonSubstrings(String s1, String s2) {
		String flag = "NO";
		String comp = s2;
		if(s1.length()<s2.length())
		{
			
			comp = s1;
		}
		for(int i=0;i<comp.length();i++)
		{
			if(s1.contains(String.valueOf(comp.charAt(i)))&&s2.contains(String.valueOf(comp.charAt(i))))
			{
				flag = "YES";
				break;
			}
		}
		return flag;
	}
	@Test
	public void testCase1()
	{
		Assert.assertEquals(findCommonSubstrings("hello", "world"), "YES");
	}
	
	@Test
	public void testCase2()
	{
		Assert.assertEquals(findCommonSubstrings("hi", "world"), "NO");
	}

}
