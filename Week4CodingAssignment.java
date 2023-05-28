package week4CodingAssignment;

import java.util.*;

public class Week4CodingAssignment {

	public static void main(String[] args) {
		
//		Coding Steps — Arrays and Methods
		
//		1) Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int[] ages = new int[9];
		ages[0] = 3;
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 28;
		ages[7] = 93;
		
//		2) Programmatically subtract the value of the first element in the array from the value in the last element of the array
//		(i.e. do not use ages[7] in your code). Print the result to the console.  
		//int age = ages[0] - ages[ages.length - 1];
		//System.out.println(age);
		
//		3) Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		ages[8] = 31;
		int age = ages[0] - ages[ages.length - 1];
		System.out.println(age);
		
//		4) Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		int averageAge = 0;
		for (int num : ages) {
			averageAge += num;
		}
		System.out.println(averageAge / ages.length - 1);
		
//		5) Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
//		6) Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		int averageNameLength = 0;
		for (String name : names) {
			averageNameLength += name.length();
		}
		System.out.println(averageNameLength / names.length);
		
//		7) Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		String named = "";
		for (String name : names) {
			named += name + " ";
		}
		System.out.println(named);
		
//		8) How do you access the last element of any array?
		System.out.println(names[names.length - 1]);
	
//		9) How do you access the first element of any array?
		System.out.println(names[0]);
		
//		10) Create a new array of int called nameLengths. Write a loop to iterate over the previously created names
//		array and add the length of each name to the nameLengths array.
		int[] nameLengths = new int[names.length];
		for (int i = 0; i < nameLengths.length; i++) {
			nameLengths[i] = names[i].length();
		}
		
		for (int length : nameLengths) {
			System.out.println(length);
		}
//		11) Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		int sumOf = 0;
		for (int name : nameLengths) {
			sumOf += name;
		}
		System.out.println(sumOf);
		
//		End of Main Method
		
		// 12)
		String result = wordsConcatenated("Hello", 3);
		System.out.println(result); 
		
		// 13)
		String result2 = fullName("Morgan", "Chin");
		System.out.println(result2);
		
		//14)
		boolean result3 = sumGreaterThan(ages);
		System.out.println(result3);
		
		//15)
		double[] doubles = {3.65, 2.34, 5.5, 9.12};
		double result4 = averageOfElements(doubles);
		System.out.println(result4);
		
		//16)
		double[] doubles2 = {5.54, 3.33, 2.22, 2.45};
		boolean whichIsGreater = firstGreaterThanSecond(doubles, doubles2);
		System.out.println(whichIsGreater);
		
		//17)
		boolean isHot = true;
		double money = 12.5;
		boolean result5 = willBuyDrink(isHot, money);
		System.out.println(result5);
		
		//18)
		int[] numbers = {12, 45, 23, 6, 38, 17};
        int max = findMaximumValue(numbers);
        System.out.println("The maximum value is: " + max); // Output: The maximum value is: 45
    }
	
//		12) Write a method that takes a String, word, and an int, n, as arguments and returns
//		the word concatenated to itself n number of times.
//		(i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
		public static String wordsConcatenated(String word, int number) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < number; i++) {
			sb.append(word);	
			}
			return sb.toString();
		}
		
//		13) Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first
//		and the last name as a String separated by a space).
		public static String fullName(String firstName, String lastName) {
			StringBuilder sb = new StringBuilder();
			sb.append(firstName);
			sb.append(" ");
			sb.append(lastName);
			
			return sb.toString();
		}
//		14) Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		public static boolean sumGreaterThan(int[] ints) {
			int sumOfAll = 0;
			for (int number : ints) {
				sumOfAll += number;
			}
			return sumOfAll > 100;
		}
		
//		15) Write a method that takes an array of double and returns the average of all the elements in the array.
		public static double averageOfElements(double[] array) {
			double average = 0;
			for (double number : array) {
				average += number;
			}
			return average / array.length;
		}
		
//		16) Write a method that takes two arrays of double and returns true if the average of the elements in the first array is
//		greater than the average of the elements in the second array.
		public static boolean firstGreaterThanSecond(double[] array1, double[] array2) {
			double average1 = 0;
			for (double number : array1) {
				average1 += number;
				average1 /= array1.length;
			}
			
			double average2 = 0;
			for (double number : array2) {
				average2 += number;
				average2 /= array2.length;
			}
			return average1 > average2;
			
		}
		
//		17) Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and
//		returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
			return isHotOutside && moneyInPocket > 10.50;
		}
		
//		18) Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		
		// This method finds the highest number in an array of integers based upon user input. It will return an error message if the integer array entered is "null" or 0. 
		// I assigned an int, "max", and utilized a for loop to iterate through the remaining elements. Then, "max" is reassigned to the greatest number and is then returned.
		
		public static int findMaximumValue(int[] numbers) {
	        if (numbers == null || numbers.length == 0) {
	            System.out.println("The array cannot be null or empty.");
	        }

	        int max = numbers[0];

	        for (int i = 1; i < numbers.length; i++) {
	            if (numbers[i] > max) {
	                max = numbers[i];
	            }
	        }

	        return max;
	    }


}
