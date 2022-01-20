package Test;

import java.util.ArrayList;
import java.util.Collections;

public class comparator {

	   public static void main(String[] args)
	   {
	       ArrayList< Student> ts = new ArrayList< Student>();
	       ts.add(new Student(45, "Rahul"));
	       ts.add(new Student(11, "Adam"));
	       ts.add(new Student(19, "Alex"));
	       ts.add(new Student(15, "Abi"));
	       Collections.sort(ts,new MyComparator()); 
	       System.out.println(ts);
	   }
	
}
