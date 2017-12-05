package salary;

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class Salary {
	
	private int amount;
	
	private Consumer<Salary> action = s -> System.out.println(s.getSalaryAmount() - 50);

	public Salary() {
		work();
		work();
		work();
		this.amount = 200;
	}

	private void work() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
	}
	
	public int getSalaryAmount() {
		return amount;
	}
	public static void main(String[] args) {
		new Salary().spendMyCash(s -> System.out.println(s.getSalaryAmount() - 50));
	}

	private void spendMyCash(Consumer<Salary> action) {
		CompletableFuture<Salary> salary = CompletableFuture
			.supplyAsync(Salary::new);
		
			salary.thenAccept(action);
			
		System.out.println("Enjoy life...");
	}
	
	
	
}
