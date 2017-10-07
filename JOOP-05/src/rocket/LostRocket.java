package rocket;

import java.util.HashMap;
import java.util.Map;

public class LostRocket {
	
	public static void main(String[] args) {
		// create map to store rockets by ID
		Map<RocketIdentifier, LostRocket> rockets = new HashMap<>();
		// create new rocket
		LostRocket rocket = new LostRocket();
		// create new rocket ID
		RocketIdentifier id = rocket.new RocketIdentifier("Milky Way", 23094030L);
		
		// add to map
		rockets.put(id, rocket);
		
		// another service queries for this object
		// lets just pretend id2 comes from some other request
		
		RocketIdentifier id2 = rocket.new RocketIdentifier("Milky Way", 23094030L);
		
		// test if same as id
		if (id.equals(id2)) {
			System.out.println("ID is the same, rocket should be found!");
		}
		
		if (rockets.containsKey(id2)) {
			System.out.println("Rocket found!");
		} else {
			System.out.println("Rocket lost in space!!");
			System.out.println("How about implementing hashCode()?");
		}
	}
	
	// lets use private class to see how this could be utilised
	// in our class we do not normally use private class
	// there will be no private classes in Kontrolltöö 1!
	private class RocketIdentifier {
		private String galaxy;
		private long spaceId;
		
		private RocketIdentifier(String galaxy, long spaceId) {
			this.galaxy = galaxy;
			this.spaceId = spaceId;
		}
		
		@Override // NB! equals-hashCode symmetry is violated!
		public boolean equals(Object other) {
			if (this == other) {
				return true;
			}
			if (other instanceof RocketIdentifier) {
				RocketIdentifier id = (RocketIdentifier) other;
				if (galaxy.equals(id.galaxy)) {
					if (spaceId == id.spaceId) {
						return true;
					}
				}
			}
			return false;
		}
	}
	
}
