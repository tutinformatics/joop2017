package optional;

public class OptionalDemo {
	public static void main(String[] args) {
		// teoreetiline näide, kus product võib olla
		// välisteenuse kasutamise tõttu NULL
		// NB! Kood ei kompileeru, näide!
		Product product;
		product = service.getProduct();
		
		product.getName();
		
	}
}
