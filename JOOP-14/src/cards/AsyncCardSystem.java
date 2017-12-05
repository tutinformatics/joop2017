package cards;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class AsyncCardSystem {
	Response getCardDetails() throws InterruptedException, ExecutionException {
		Response r = new Response();
		
		// Promise, ListenableFuture
		CompletableFuture
			.supplyAsync(Details::new)
			.thenAccept(d -> System.out.println(d));
		
		CompletableFuture<Details> cf = CompletableFuture
			.supplyAsync(Details::new);

		System.out.println("---block---");
		r.setCardDetails(cf.get());
		
		CompletableFuture
			.supplyAsync(Details::new)
			.thenAccept(System.out::println);
		
		return r;
	}
	public static void main(String[] args) {
		try {
			new AsyncCardSystem().getCardDetails();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ExecutionException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("---done---");
		try {
			Thread.sleep(1200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
