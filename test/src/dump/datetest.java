package dump;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class datetest {

	
	static public String addOneDay(String date) {
	    return LocalDate.parse(date).plusDays(1).toString();
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			//LocalDate l=LocalDate.now().plusDays(2);
		
			//System.out.println(l);
		
		String s="2020-08-13";
		String s1="2020-09-15";
		LocalDate date1 = LocalDate.parse(s);

		LocalDate date2 = LocalDate.parse(s1);

		System.out.println(date1.until(date2, ChronoUnit.DAYS));
		
		
		
//			int k=0;
//			while(k<5)
//			{
//				if(k==4)
//			System.out.println(addOneDay(l+""));
//				else
//					l=addOneDay(l+"");
			}//	System.out.println(LocalDate.plusDays(1).toString());
	}


