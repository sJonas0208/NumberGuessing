package com.jonasSora;
import java.util.*;

class guessNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int A = random.nextInt(0, 1000);
		System.out.println("Guess the number between 1 to 1000.");
		System.out.println("Give you 6 tries.");
		for (int i=0; i<7; i++) {
			System.out.println("Answer the Number:");
			int ans = sc.nextInt();
			if (A == ans) {
				System.out.println("Correct!! You won.");
				break;
			} else if (A < ans) {
				System.out.println();
				System.out.println("The number is less than " + ans);
			}
			else {
				System.out.println();
				System.out.println("The number is greater than " + ans);
			}
		}
		System.out.println("You lose");
		System.out.println("The answer is " + A);
	}
}
