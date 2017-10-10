package exception;

import java.io.FileNotFoundException;

public class ExStrategy {
	void a() {
		try {
			b();
		} catch (MyException e) {
			Throwable real = e.getCause();
			System.out.println(e.getMessage());
		}
		
	}
	
	void b() {
		c();
	}
	
	void c() {
		try {
			throw new FileNotFoundException("No such file!");	
		} catch (FileNotFoundException e) {
			throw new MyException(e);
		}
	}
	
	public static void main(String[] args) {
		new ExStrategy().a();
	}
}
