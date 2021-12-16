import java.util.Calendar;
import java.util.Date;

public class DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		String s = d.toString();
		System.out.println(s);
		System.out.println(d);
		
//		Calendar c = Calendar.getInstance();
//		c.add(0, 0);
//		System.out.println(c);
		
		Calendar c = Calendar.getInstance();
		c.set(2010, 11, 14);
		Date d2 = c.getTime();
		System.out.println(c);
		System.out.println(d2);
		
		
		
		
		

	}

}
