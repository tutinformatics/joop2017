package exception;

import java.io.FileNotFoundException;

public class MyException extends RuntimeException{

	public MyException(FileNotFoundException e) {
		super(e);
	}

}
