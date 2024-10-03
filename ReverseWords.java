import java.util.*;

public class ReverseWords {

	public static void main(String... args) {

		Scanner input = new Scanner(System.in);
	
		System.out.print("Enter the number of words you want to input? : ");
		int userNumber = input.nextInt();

		String[] sentence = new String[userNumber];
		
			System.out.print("Enter your sentence : ");
			String userSentence;
			sentence[userSentence] = input.nextLine();

		for (int count = 0; count < sentence.length; count++)
			System.out.print(" "+sentence[count]);

		}
	public static String sentence (String name) {
	
	return name;
	}	
}