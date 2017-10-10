package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionExample {
	void dangerousGame() {
		// this is the upper level in the program where exceptions are handled
		try {
			setLevelOfDanger(2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	// throws is optional for unchecked exceptions
	void setLevelOfDanger(int level) throws IllegalArgumentException{
		if (level < 3) {
			throw new IllegalArgumentException("Not dangerous enough!");
		}
	}
	
	void openFile() {
		try (FileInputStream io = new FileInputStream("file")){
			// work with file
		} catch (FileNotFoundException e) { // catch specific exceptions first
			System.err.println(e.getMessage());
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		// never catch Exception in low level unless you know what you are doing
		/*catch (Exception e) {
				
		}*/
	}
	
	public static void main(String[] args) {
		new ExceptionExample().dangerousGame();
	}
}

	