package Test;

public class Vehicle {
	
	  public void fly(String name)
	    {
	        System.out.println(name+" can FLY");
	    }
	         
	}
	class Airplane extends Vehicle
	{

	  public Airplane(){  
	        super.fly("Airplane"); //To change body of generated methods, choose Tools | Templates.
	    }
	  
	}

	class Car extends Vehicle
	{

	  public Car(){  
	        super.fly("Car"); //To change body of generated methods, choose Tools | Templates.
	    }
	  
	}
	