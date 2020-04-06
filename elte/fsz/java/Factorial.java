package elte.fsz.java;
// Write a function (factorial) that accept an integer parameter called n, and returns its factorial non-recursively. Factorial.java

public class Factorial{

	public static int factorial(int n){
		int result = 1;

		for (int i = 1; i <=n; i++) {
			result = result * i;
		}

		return result;
	}

}