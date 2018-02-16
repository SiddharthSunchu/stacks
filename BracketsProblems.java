package stacks;

import java.util.Scanner;
import java.util.Stack;

public class BracketsProblems {
	
	static boolean isBalance (String s) {
		
		Stack<Character> s1 = new Stack<Character>();
		boolean check = false;
		
		//Checking for empty condition
		if(s.isEmpty()) {
			return false;
		}
		//Traversing through String
		for(int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
				
				if(!check) {
					s1.push(s.charAt(i));
				}
				else {
					return false;
				}
				
			}
			else if (s.charAt(i) == '}') {
				if(!s1.isEmpty() && s1.peek() == '{') {
					s1.pop();
					check = true;
				}
				else {
					return false;
				}
			}
			else if(s.charAt(i) == ')') {
				if(!s1.isEmpty() && s1.peek() == '(') {
					s1.pop();
					check = true;
				}
				else {
					return false;
				}
			}
			else if (s.charAt(i) == ']')  {
				if(!s1.isEmpty() && s1.peek() == '[') {
					s1.pop();
					check = true;
				}
				else {
					return false;
				}
			}
		}
		if(s1.empty()) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the brackets to check");
		String s = input.nextLine();
		
		if(isBalance(s)) {
			System.out.println("Your string are balanced");
		}
		else {
			System.out.println("Your string are not balanced");
		}
	}

}
