package exception;

import java.io.FileNotFoundException;

public class ExStrategyPropagateCatchAndRethrow {
	void a() {
		try {
			b();
		} catch (FileNotFoundException e) { // 3. upper level catches propagated exception
			// 4. it rethrows it as exception handling strategy (good for API-s for example)
			throw new MyException(e);
		}
	}
	
	void b() throws FileNotFoundException {
		// 2. intermediate level does not handle it, exception propagates
		c();
	}
	
	void c() throws FileNotFoundException {
		// 1. exception at low level
		throw new FileNotFoundException("No such file!");	
	}
	
	public static void main(String[] args) {
		new ExStrategyPropagateCatchAndRethrow().a();
	}
}
