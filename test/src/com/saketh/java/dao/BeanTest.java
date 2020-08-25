package com.saketh.java.dao;

public class BeanTest {
	
	public String k="";

	public  String getk() {
		System.out.println(k+"the inside k");
		return k;
	}

	public void setk(String k) {
		System.out.println(k+"bean k k k k");
		this.k = k;
	}

//	@Override
//	public String toString() {
//		return "BeanTest [k=" + k + "]";
//	}

}
