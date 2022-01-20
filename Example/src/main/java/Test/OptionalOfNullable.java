package Test;

import java.util.Optional;

class Contact
{
    String name;
    String phone;
    public Contact(String name, String phone)
    {
        this.name = name;
        this.phone =  phone;
    }
}
public class OptionalOfNullable {

	public static void main(String args[])
    {
        Optional<Contact> vishnu = Optional.of(new Contact("Vishnu","9876543210"));
        Contact vishnu1 = new Contact("Vishnu","9876543210");
        Contact anju = null;
        
        
        System.out.println("Value of Contact: Vishnu = " + Optional.ofNullable(vishnu.get()));
        System.out.println("Value of Contact: Vishnu1 = " + Optional.ofNullable(vishnu1));
        System.out.println("Value of Contact: Anju = " + Optional.ofNullable(anju));
        
    }
	
}
