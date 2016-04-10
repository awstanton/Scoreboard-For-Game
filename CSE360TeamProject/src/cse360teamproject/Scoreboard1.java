package cse360teamproject;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.lang.NullPointerException;
import java.lang.IndexOutOfBoundsException;
/* 
* methods:
 * it calls constructor for Game
 * it calls constructor for display
 * it retrieves data from a file if there is any.
 * If there is not data in the file, then the user must create a new game.
 * */
/* Possibilities for username file:
 * read from it and store in array of dynamic size (can I do this?)
 * if the file has the number of usernames at the top, this might help
 * I do not think I need to store in array, just an integer.
 * loop the number of times equal to the number of usernames
 * for each username, compare to the one input by the user
 * if it is the same, read the stats for that user from the stats file
 * */
public class Scoreboard1{
	/*
	 * called when the user inputs a username and clicks submit
	 * checks if username is in database and if not, gives message to 
	 * display to show message
	 * if username is in database, it starts up the player and loads the data
	 */
	//void check() { // opens file and reads from it
		
	//}
	/**
	 * Here it is going to read and write to a text file
	 * @param args
	 */
	public static void main(String args[]) throws IOException, NullPointerException, IndexOutOfBoundsException {
		BufferedReader input = null;
		PrintWriter output = null;
		
		try {
			input = new BufferedReader(new FileReader("data.txt"));
			output = new PrintWriter(new FileWriter("data2.txt"));
			String newString;
			int index = 0;
			String[] newArray = new String[10];
			while((newString = input.readLine()) != null) {
				newArray[index] = newString;
				System.out.println(newString);
				index++;
			}
			for(int arrayIndex = 0; arrayIndex < 10; arrayIndex++) {
				output.write(newArray[arrayIndex]);
			}
		}
		finally {
			if (input != null) {
				input.close();
				input = null;
			}
			if (output != null) {
				output.close();
				output = null;
			}
		}
		/*
		 * if(input != null) {
			input.close();
		}
		if(output != null) {
			output.close();
		}
		 */
		
	}
}
