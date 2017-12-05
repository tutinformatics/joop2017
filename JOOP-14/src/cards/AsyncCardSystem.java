package cards;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class AsyncCardSystem {
	Response getCardDetails() throws InterruptedException, ExecutionException {
		Response r = new Response();
		
		/*
		 * This example makes use of CompletableFuture by defining further action
		 * 
		 * */
		
		// Promise, ListenableFuture
		CompletableFuture
			// job that is done asynchronously
			.supplyAsync(Details::new)
			// when this job is finised, do this action with a result
			.thenAccept(d -> System.out.println(d));
		
		
		/*
		 * This example acts just like regular Future
		 * 
		 * */
		CompletableFuture<Details> cf = CompletableFuture
			.supplyAsync(Details::new); // start async work

		System.out.println("---block---");
		// cg.get() blocks just like Future, no real use of CompletableFuture here
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
