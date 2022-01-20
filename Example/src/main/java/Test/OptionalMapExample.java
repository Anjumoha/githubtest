package Test;

import java.util.Optional;

public class OptionalMapExample {

	 public static void main(String[] args) {

	        Optional<String> name = Optional.of("anju");
	        Optional<String> emptyName = Optional.empty();

	        System.out.println("Non-Empty Name:: " + name.map(String::toUpperCase));
	        System.out.println("Empty Name    :: " + emptyName.map(String::toUpperCase));

	        Optional<Optional<String>> nonEmptyOprionalName = Optional.of(Optional.of("hello world"));
	        
	        System.out.println("Optional value   :: " + nonEmptyOprionalName);
	        System.out.println("Optional.map     :: " + nonEmptyOprionalName.map(gender -> gender.map(String::toUpperCase)));
	        System.out.println("Optional.flatMap :: " + nonEmptyOprionalName.flatMap(gender -> gender.map(String::toUpperCase)));
	        
	    }
}
