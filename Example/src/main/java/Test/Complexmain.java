package Test;

public class Complexmain {
	
	 public static void main(String[] args) {
	        Complex c1 = new Complex(10, 15);
	         
	        // Following involves a copy constructor call
	        Complex c2 = new Complex(c1);  
	 
	        // Note that following doesn't involve a copy constructor call as
	        // non-primitive variables are just references.
	        Complex c3 = c2;  
	 
	        System.out.println(c2); // toString() of c2 is called here
	    }
	}
