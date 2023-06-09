package testPrep2022;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomNumberProject {

	public static void main(String args[]){
		// create an empty array
		int[] numArray = new int[500];
		
		// create a random generator
		Random randomGenerator = new Random();

		// generate first random number
		// place it in position 1
		// generate the next number
		// place it in position 2
		// repeat generating and placing all 500 numbers
		for (int i = 0; i < 500; i++) {
			int randomNumber = randomGenerator.nextInt();
			numArray[i] = randomNumber;
		}

		// sort the numbers from least to greatest
		Arrays.sort(numArray);

		// ask user to pick the nth smallest value they would like to know
		System.out.println("Pick the nth smallest value you would like to know from the random list of 500 numbers");
		
		// accept the input n
		Scanner ui = new Scanner(System.in);
		int userNumber = ui.nextInt();
		
		// find the index value of n
		int indexValue = userNumber - 1;
		
		// print the number stored at that index value
		System.out.println("the value at position " + userNumber + " is " + numArray[indexValue] );
		
		ui.close();
		


	}
}
