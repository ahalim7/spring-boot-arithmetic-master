package halim.arithmetic.operations;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class ArithmeticOperator {

	@RequestMapping("/sum")
	String sum(int firstNumber, int secondNumber) {
		return "Summation Result equals = " + (firstNumber + secondNumber);
	}
	
	@RequestMapping("/sub")
	String sub(int firstNumber, int secondNumber) {
		return "Subtraction Result equals = " + (firstNumber - secondNumber);
	}
	
	@RequestMapping("/multiply")
	String multiply(int firstNumber, int secondNumber) {
		return "Multiplication Result equals = " + (firstNumber * secondNumber);
	}
	
	@RequestMapping("/divide")
	String divide(float firstNumber, float secondNumber) {
		if(secondNumber!=0) {
			return "Division Result equals = " + (firstNumber / secondNumber);
		}
		return "You Cannot Divide Over Zero";
	}
}
