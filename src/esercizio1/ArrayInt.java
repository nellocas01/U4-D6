package esercizio1;

import java.util.Random;
import java.util.logging.Logger;

import org.slf4j.LoggerFactory;

public class ArrayInt {

	//private static Logger logger = (Logger) LoggerFactory.getLogger(ArrayInt.class);
	
	public static void main(String[] args) {
		Random random = new Random();
		
		int number = random.nextInt(11);
		if (number != 0) {
			System.out.println(number);
		}else {
			try {
				 number = 0;
				
			} catch(e){
				System.out.println(e.getMessage());
			}
		}
		
	}

}
