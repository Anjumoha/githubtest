package Test;

interface add{
	
	// An abstract function
	void addabstract(int s);		
}



public class Addition {

	public static void main(String str[]){
		
		add a1=new add(){
		public void addabstract(int s) {
				System.out.println(2*s);	
			}			
		};	
		
		a1.addabstract(3);
		
		
		add a=(x)->System.out.println(2*x);
		a.addabstract(3);
	}
	
}
