package loan;

import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LoanSystem extends RecursiveTask<Integer>{

	private List<Loan> loans;

	public LoanSystem(List<Loan> loans) {
		this.loans = loans;
	}

	@Override
	protected Integer compute() {
		System.out.println("Size: " + loans.size());
		if (loans.size() <= 2) {
			int sum = loans.stream()
				.mapToInt(Loan::getInterest)
				.sum();
			System.out.println(sum);
			return sum;
		} else {
			LoanSystem l1 = new LoanSystem(loans.subList(0, loans.size()/2));
			l1.fork();
			LoanSystem l2 = new LoanSystem(loans.subList(loans.size()/2, loans.size()));
			//l2.fork(); // no need to fork second half
			int sum = l2.compute() + l1.join();
			System.out.println(Thread.currentThread().getName()
					+ " " + sum);
			return sum;
		}
	}

	public static void main(String[] args) {
	
		/* old way:
		 * List<Loan> loans = new ArrayList<>();
		
		
		for (int i = 0; i < 1000; i++) {
			loans.add(new Loan(100 + i));
		}
		
		*fancier way to generate items:
		*/
		List<Loan> loans = IntStream.iterate(100, c -> c+1)
				.limit(100)
				.mapToObj(Loan::new)
				.collect(Collectors.toList());
		
		ForkJoinPool fjp = new ForkJoinPool(7);
		int result = fjp.invoke(new LoanSystem(loans));
		System.out.println(result);
		System.out.println("Steal: " + fjp.getStealCount());
		
		Integer intrestSum = loans.parallelStream()
			.mapToInt(Loan::getInterest)
			.sum();
	}
}
 