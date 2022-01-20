package Test;

import java.util.Optional;

public class OptionalOrElseGet {

	public static void main(String args[])
    {
        String name = null;
        String nam = "anju";
    String displayname = Optional.ofNullable(name).orElseGet(() -> "Default Name");
    String display = Optional.ofNullable(nam).orElseGet(() -> "Default Name");
    System.out.println("Name : "+displayname);
    System.out.println("Nam : "+display);
   
    }
}
