import java.util.*;

public class ArraySort {

	public static void main(String[] args) {

	int[] number = {2, 1, 4, 3, 5, 9};
	int[] output = numbers(number);
		
		for(int count = 0; count < output.length; count++)
			System.out.print(output[count]+" "); 
	}
	
	public static int [] numbers (int[] number){

		int firstIndex = 0;
		int secondIndex = 0;
		int thirdIndex = 0;
		int fourthIndex = 0;
		int fifthIndex = 0;
		int sixthIndex = 0;

		for (int count = 0; count < number.length; count++) {
		
			firstIndex = number[0] * number[0];
			secondIndex = number[1] * number[1];
			thirdIndex = number[2] * number[2];
			fourthIndex = number[3] * number[3];
			fifthIndex = number[4] * number[4];
			sixthIndex = number[5] * number[5];

		}
		
	
		int [] total = {firstIndex , secondIndex , thirdIndex, fourthIndex, fifthIndex, sixthIndex};

		int firstNumber = total[0];
		int sixthNumber = total[0];
	
		for (int count = 0; count < total.length; count++) {
			if (firstNumber > total[count]) firstNumber = total[count];
			if (sixthNumber < total[count]) sixthNumber = total[count];

		}



		int secondNumber = 0;
		int thirdNumber = 0; 
		int fourthNumber = 0; 
		int fifthNumber = 0; 

		int [] remainingOne = {secondNumber , thirdNumber, fourthNumber, fifthNumber};
	
		for (int count = 0; count < remainingOne.length; count++) {

			secondNumber = number[1] * number[1];
			thirdNumber = number[2] * number[2];
			fourthNumber = number[3] * number[3];
			fifthNumber = number[4] * number[4];

		}
		
		for (int count = 0; count < remainingOne.length; count++) {
			if (secondNumber > remainingOne[count]) secondNumber = remainingOne[count];
			if (fifthNumber < remainingOne[count]) fifthNumber = remainingOne[count];

		}

		int [] remaining = { thirdNumber, fourthNumber, };



		for (int count = 0; count < remaining.length; count++) {

			thirdNumber = number[2] * number[2];
			fourthNumber = number[3] * number[3];
		}
	
		for (int count = 0; count < remaining.length; count++) {
			if (thirdNumber > remaining[count]) thirdNumber = remaining[count];
			if (fourthNumber < remaining[count]) fourthNumber = remaining[count];

		}


		
			
		int [] newTotal = {firstNumber, secondNumber, thirdNumber, fifthNumber, fourthNumber, sixthNumber};

		return newTotal;

	}
}