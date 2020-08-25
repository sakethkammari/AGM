package logindaoJUNIT;

import static org.junit.Assert.*;

import org.junit.Test;

import com.saketh.java.dao.LoginDao;

public class usercheck {

	@Test
	public void userchecktest() throws Exception {
		//fail("Not yet implemented");
		LoginDao dao=new LoginDao();
		boolean res=dao.check("karthik", "karthi@123");
		assertEquals(true,res);
	}

}
