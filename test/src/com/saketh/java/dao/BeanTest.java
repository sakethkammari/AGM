package com.saketh.java.dao;

public class BeanTest {
	
	static String fres="";

	public static String getFres() {
		return fres;
	}

	public void setFres(String fres) {
		this.fres = fres;
	}

	@Override
	public String toString() {
		return "BeanTest [fres=" + fres + "]";
	}

}
