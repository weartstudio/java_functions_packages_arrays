## Functions, Packages, Arrays

Place all your solutions into the `elte.fsz.java` package.

1. Write a function (`factorial`) that accepts an integer parameter called `n`, and returns its
*factorial* non-recursively. `Factorial.java`

1. Write a function (`factorial`) that accepts an integer parameter called `n`, and returns its
*factorial* recursively. `FactorialRecursive.java`

1. Write a function (`fibonacci`) that accepts an integer parameter called `n`, and returns its
*Fibonacci* value non-recursively. `Fibonacci.java`

1. Write a function (`fibonacci`) that accepts an integer parameter called `n`, and returns its
*Fibonacci* value calculated recursively. `FibonacciRec.java`

1. Write a function (`collatz`) that accepts an integer parameter called `n`, and prints out
the Collatz-series of `n` until the element in the series is `1`. `Collatz.java`

1. Write a function (`max`) that returns the greater parameter. Its parameters are two
integers called `n` and `m`. `Max.java`

1. Write a function (`findMax`) that returns the greatest element of its array parameter.
All the elements in the array are integers. `FindMax.java`

1. Write a function (`sort`) that sorts an array of integers which is passed as parameter.
`ArraySort.java`

1. Write a function (`merge`) that merges two arrays of integers which are passed as parameters.
`ArrayMerge.java`

1. Write a function (`isPalindrom`) that decides whether the parameter is a palindrome or not. `Palindrom.java`
    * The parameter is a `String`
    * The parameter is a `char` array.

1. Write a function that concatenates two `String` parameters. The function first parameter is a delimiter which type is `String`,
than it is followed by two others which the function concatenates next one another. `Concat.java`
	* Use `+` to concatenate (`simpleConcat`)
    * Use `StringBuilder` to concatenate (`stringBuilderConcat`)
    * Use *varargs* as function parameter (`varargsConcat`)

1. Write a function (`scalar`) that returns the scalar multiplication of two arrays that it gets as parameters. `ScalarMultiplication.java`

1. Write a function (`cipher`) that gets a `char[]` as parameter, and it applies `^` against all elements with `'a'`. `XorCipher.java`
	* Write a function (`decipher`) that decodes the result of the abovementioned function (*Hint: Apply the same operator with the same operand on it.*)

1. Write a function (`longestMonotonic`) that returns the longest monotonic part of an array. `LongestMonotonic.java`

1. Write a function that prints out the sum of all row, column and main diagonal. `MatrixSum.java`
	* Example of the sums beneath:

    ```txt
    0  1  2 |3      0  1 -2 |-1 
    1  2  3 |6      1 -2  3 | 2
    2  3  4 |9      2 -3 -4 |-5
    --------/       --------/
    3  6  9  6      3 -4 -3  -6
    ```  

1. Write a function that can validate a password. The password has to match against the following conditions: `Validator.java` 
    - at least 8 character long
    - has to contain only alphanumeric characters
    - has to contain at least one capital letter, one non-capital letter and one numeric value 


1. Write a function (euclideanGCD) that implements the euclidean greatest common divisor. The pseudo-code of the algorithm is as follows: `Euclidean.java` 
    * Implement the recursive approach (`euclideanGCDRecursive`) as well.  

	```
	def gcd(a, b):
		if a = 0:
			return b  
		while b != 0:  
			if a &gt; b  
				a := a - b  
			else:
				b := b - a  
		return a  
	```  



1. Write a function (`sqroots`) that returns the squar roots of quadratic equation. The specification of the function should be: `QuadraticEquation.java` 
	```java
	private static double[] sqroots(final double a, final double b, final double c) {
		// ...
	}
	```  
	The return value would be:
	   - empty array (not `null`!), if `a == 0` or the discriminant is negative,
	   - one length array, if there is only one solution of it (`D == 0`),
	   - two length array, if there are two solutions of it!
	Pass the values as command line arguments and use `Double.parseDouble()` to convert `String` to `Double`.

1. Write a function (`capitalize`) that accepts a `String` parameter from the command line argument and replace its first character to that capital counterpart. `Capitalize.java`

1. Write a function (`change`) that accepts a `String` parameter and change its characters according to as follows: `CharacterChanger.java`
	- Leaves all numeric characters as it is 
    - Changes all characters to lower case
    - Changes all other characters to `_`


1. Write a function (`startsWith`) that accepts two `String` parameters and checks whether the first one starts with the second one. `StringStartsWith.java`
	* Case-sensitive
	* Ignore case 
