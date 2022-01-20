package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DemoApp {

	  public static void main(String args[]) {

	        List<String> animals = new ArrayList<>();
	        animals.add("elephant");
	        animals.add("snake");
	        animals.add("lion");
	        animals.add("mangoose");
	        animals.add("cat");
	        animals.add("tiger");
	        animals.add("ant");

	        Collections.sort(animals, new Comparator<String>() {
	            public int compare(String s1, String s2) {
	                return -s1.compareTo(s2);
	            }
	        });
	        displayList(animals);
	    }

	    public static void displayList(List<String> anim) {
	        for (String animal : anim) {
	            System.out.print(animal + " "); 
	        }
	        System.out.println();
	    }
}
