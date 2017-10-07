package shadow;

public class Shadow {
	
	private String name = "Mary";
	private int age;
	
	void castShadow() {
		System.out.println("Shadow is falling..");
	}
	
	void castTwice() {
		System.out.println("Casting shadow on " + this.name);
		castShadow();
		castShadow();
	}
	
	@Override
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (other instanceof Shadow) {
			Shadow s = (Shadow) other;
			return age == s.age 
					&& name.equals(s.name);
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		int hash = 1;
		// age
		hash = 31 * hash + age;
		// name
		hash = 31 * hash + name.hashCode();
		
		return hash;
	}
	
/*	@Override
	public boolean equals(Päkapikk other) {
		throw new IWantToCompareDifferentObjectsMaybeException();
	}*/
}
