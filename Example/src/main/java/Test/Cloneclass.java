package Test;

public class Cloneclass implements Cloneable {

	String name;
	  int version;
	  public static void main(String[] args) {

	    
		  Cloneclass obj1 = new Cloneclass();	   
	    obj1.name = "Java";
	    obj1.version = 14;

	   
	    System.out.println(obj1.name);      
	    System.out.println(obj1.version);   

	    try {

	      // create clone of obj1
	    	Cloneclass obj2 = (Cloneclass)obj1.clone();

	     
	      System.out.println(obj2.name);     
	      System.out.println(obj2.version);   
	    }
	    catch (Exception e) {
	      System.out.println(e);
	    }

	  }

}
