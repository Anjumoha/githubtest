package Test;

import java.util.List;

class Boat {

	  List<String> cargoes;

	  public void addCargo(String c){
	    cargoes.add(c);
	  }

	  public void removeCargo(String c){
	    cargoes.remove(c);
	  }
	}

	 class Airprt {

	  List<String> aircrafts;

	  public void land(String a) {
	    aircrafts.add(a);
	  }

	  public void depart(String a) {
	    aircrafts.remove(a);
	  }
	}

public class WillNotWork {

}
