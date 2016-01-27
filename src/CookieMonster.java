/**
 * 
 */

/**
 * @author Sky Johnson
 *Chapter 20 Question 12 Solution
 */
/* Example String

 *  
 1  3  0  5 -1  7 -1 -1  0  4  2  1 
-1  3  2  1 -1  4 -1  5  3 -1  1  0
 5  4  8 -1  3  2  2 -1  4 -1  0  0
 2  1  0  4  1 -1  8  0  2 -1  2  5
 1  4  0  1 -1  0  3  2  2  4  1  4
 0  1  4  1  1  6  1  4  5  2  1  0
 3  2  5  2  0  7 -1  2  1  0 -1  3
 0 -1  4 -1 -1  3  5  1  4  2  1  2
 5  4  8 -1  3  2  2 -1  4 -1  0  0
 2  1  0  4  1 -1  8  0  2 -1  2  5
 1  3  0  5 -1  7 -1 -1  0  4  2  1 
 0  0  3  1  5  2  1  5  4  1  3  3
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
public class CookieMonster {
	/**
	 * @param args
	 */
	public int x;
	public int y;
	public int[][] FIELD = null;
	public CookieMonster(){
		File selectedFile = new File("cookies.txt");
		FIELD = new int[12][12];
		Scanner input;
		try {
			input = new Scanner(selectedFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			input = null;
		}
		int outer = 0;
		int inner = 0;
		while(input.hasNext()){
			FIELD[outer][inner] = input.nextInt();
			inner++;
			if(inner >= 12){
				inner = 0;
				outer++;
			}
		}
		for(int i = 0; i < FIELD.length; i++){
			for(int k = 0; k < FIELD[0].length; k++){
				System.out.print(FIELD[i][k]+" ");
			}
			System.out.println("");
		}
		
	}
	public void start(){
		System.out.println(maxCookiesInPath(0,0));
	}
	public int maxCookiesInPath(int x, int y){
		Stack<Integer> thiscookies = new Stack<Integer>();
		int thisbox = FIELD[x][y];
		if(FIELD[x][y] == -1){
			return 0;
		}
		thiscookies.push(thisbox);
		int xer = 
		int fin = 0;
		for(int i = 0; i < thiscookies.size(); i++){
			fin = thiscookies.pop();
		}
		return fin;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CookieMonster k = new CookieMonster();
		k.start();
	}

}
