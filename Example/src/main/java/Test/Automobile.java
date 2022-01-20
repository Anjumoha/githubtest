package Test;

public class Automobile {

	public void move(String name){
		System.out.println(name +" moves on land");
	}
}
 class FlyingAutomobile extends Automobile{
	 
	 @Override 
	   public void move(String name)
	   {
	       System.out.println(name+" Fly in the Sky");
	   } 
	}
 class WaterAutomobile extends Automobile 
 {
    @Override 
    public void move(String name)
    {
        System.out.println(name+" moves on water");
    } 
 }
 
 class Bus extends Automobile
 {
     public Bus()
     {
         super.move("Bus");
     }
 }
 
 class ship extends WaterAutomobile{
	 public ship(){
		 super.move("Ship");
	 }
 }
 class Airoplane extends FlyingAutomobile{
	 public Airoplane(){
		 
		 super.move("Airoplane");
	 }
 }
 
 
 