package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class concatTest {

	@Test
	public void concattest() {
		//fail("Not yet implemented");
		JunitTestDemo junit=new JunitTestDemo();
		String  res=junit.concat( "hello" , "world" );
		assertEquals("helloworld",res);
	
	}

}
