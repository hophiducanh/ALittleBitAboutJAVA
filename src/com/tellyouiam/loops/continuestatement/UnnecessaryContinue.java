package com.tellyouiam.loops.continuestatement;

public class UnnecessaryContinue {
	public static void main(String[] args) {
		
		/**
		 * continue is kind of like goto. Are you familiar with break? It's easier to think about them in contrast:
		 * - break terminates the loop (jumps to the code below it).
		 * - continue terminates the rest of the processing of the code within the loop for the current iteration, but continues the loop
		 * https://stackoverflow.com/questions/389741/what-is-the-continue-keyword-and-how-does-it-work-in-java
		 * */
		
		int x = 0;
		while (x <= 21) {
			if (x < 21) {
				System.out.println("You cannot drink because you are only " + x + " years old.");
				x++;
				// continue using to terminate current iteration, but in this case continue keyword is
				// unnecessary because all statement was executed before reach continue statement.
				continue;  //continue is unnecessary if there are nothing to ignore. (it's terminate nothing.)
			} else {
				System.out.println("You may drink because you are " + x + " years old.");
				break;
			}
		}
		
		int y = 0;
		while (y <= 21) {
			if (y < 21) {
				System.out.println("You cannot drink because you are only " + y + " years old.");
				y++;
				continue; //continue statement needed because it used to terminate sout statement.
			}
			System.out.println("haha");
		}
	}
	
}
