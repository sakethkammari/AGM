package junit;

import org.apache.catalina.Engine;
import org.junit.Before;
import org.junit.Test;
import org.powermock.api.mockito.PowerMockito;
import static org.mockito.Mockito.when;
import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

public class concat1 {
	
	 
//	@Before
//	public void setUp()
//	{
//		junit=new JunitTestDemo();
//	}
//	

	@Test
	public void test() {
		//fail("Not yet implemented");
		
		JunitTestDemo	 junit=PowerMockito.mock(JunitTestDemo.class);
		
	 assertEquals("ba" , when(junit.concat1("a", "b")).thenReturn("ba") );
	 
		//PowerMockito.when(junit.concat1("aa", "bb")).thenReturn();
		//JunitTestDemo jt=new JunitTestDemo(junit); 
		
		
		
//		JunitTestDemo junit=new JunitTestDemo();
//		String  res=junit.concat1( "hello" , "world" );
//		assertEquals("worldhello",res);
	}

}
