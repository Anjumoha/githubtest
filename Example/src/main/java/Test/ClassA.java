package Test;

interface lambda1
{
    int operation(int a, int b);
}


interface lambda2
{
    void sayMessage(String message);
}




public class ClassA {

	private int operate(int a, int b, lambda1 obj)
    {
        return obj.operation(a, b);
    }
	
	
	  public static void main(String args[]) {
	
		  lambda1 add = ( x, y) -> x + y;
		  
		  lambda1 multiply = (x,y) -> x * y; 
		  
		 
		  
		  ClassA c = new ClassA();
		  

	        System.out.println("Addition is " + c.operate(6, 3, add));
	  
	        System.out.println("Multiplication is " + c.operate(6, 3, multiply));	  	       
	        lambda2 obj2 = message ->System.out.println("Hello " + message);
	        obj2.sayMessage("welcome");
		  
	  }
}
