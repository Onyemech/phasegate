import java.util.*;

public class ArraySot {

	public static void main(String[] args) {

	int[] number = {2, 1, 4, 3, 5, 9};
	int[] output = numbers(number);
		
		for(int count = 0; count < output.length; count++)
			System.out.print(output[count]+" "); 
	}
	
	public static int [] numbers (int[] number){

		int [] total ;
		for(int count = 0; count < number.length; count++)
		total = numbers[count] * number[count];
			
		return total;
	}
	
}