package practice_1;

import java.util.Scanner ;

public class PalindromeCheck {
	public static void main(String args[]) {
		
		Scanner inputString = new Scanner(System.in);
		
		String word ;
		
		System.out.print("Enter a word: ") ;
		word = inputString.nextLine() ;
		
		String word1 = word.replaceAll(" ", "").toLowerCase() ;
		
		boolean check = true ;
		int left = 0 ;
		int right = word1.length() - 1 ;
		
		while(left < right) {
			if(word1.charAt(left) != word1.charAt(right)) {
				check = false ;
				break ;
			}
			left++ ;
			right-- ;
		}
		
		if (check) {
			System.out.print(word + " is palindrome");
		}
		else {
			System.out.print(word + " is not pamindrome") ;
		}
		
		
		
	}
}
