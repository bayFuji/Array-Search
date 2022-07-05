import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class ArraySearch {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Do you want to enter an array or directly search on a present array? Press; ");
		System.out.println("1 for enter array,");
		System.out.println("2 for present array:");
		
		int choose = input.nextInt();
		if (choose !=1 && choose!=2) {				//This "if" is created to eliminate keying other than 1 and 2.
			System.out.println("You press a wrong key. Restart the program to try again.");
			System.exit(0);
		}
		System.out.println("Enter the length of your array: ");				//Here, we are determining the length of array.
		int arrayLength = input.nextInt();
		String array[] = new String[arrayLength];
		
		switch (choose) {				//This "switch-case" is written to determine whether the user wants to create their array automatically or manually.
		
		case 1:
			
			for (int i=0; i<arrayLength; i++) {
				System.out.println("Enter your "+(i+1)+". value:");
				String values = input.next();
				array[i] = values;
			}
		
			System.out.println("Your array has been succesfuly completed;");
			System.out.println(Arrays.toString(array));
		break;
		
		case 2:
			Random r = new Random();	
			
			for (int i=0; i<arrayLength; i++) {
				int a=r.nextInt(100);
				array[i] = String.valueOf(a); 
			}
			
			System.out.println("Computer has created a random number array for you;");
			System.out.println(Arrays.toString(array));
		break;

		}
		
		int num=0;
		boolean provide = false;
		
		String searchingValue;
		
		do {				//This "do-while" loop was written to search the array.
			System.out.println("\rWrite the value that you want to search in array. If you don't have any, write 'end':");
			searchingValue = input.next();
			
			for (int i=0; i<arrayLength; i++) {
				if (searchingValue.equals(array[i]))
					num++;
			}
			
			if (num>0)
				System.out.println("Your array 'including' this value!");
			else if (num==0 && !searchingValue.equals("end"))
				System.out.println("Your array is 'not including' this value!");
			
			num = 0;
	
			
		
		} while (!searchingValue.equals("end"));
		
		System.out.println("!! You ended searching !!");
		System.exit(0);
	}

}
