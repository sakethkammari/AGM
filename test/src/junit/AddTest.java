package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddTest {

	@Test
	public void AddTest() {
		//fail("Not yet implemented");
	
		JunitTestDemo junit=new JunitTestDemo();
		int res=junit.add(100, 200);
		assertEquals(300,res);
	
	}

}
