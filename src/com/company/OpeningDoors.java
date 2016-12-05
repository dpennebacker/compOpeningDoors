package com.company;

import java.util.Scanner;
import java.util.ArrayList;

public class OpeningDoors {

	private static ArrayList<Integer> chooseSwitches(int numSwitches, int numDoors, ArrayList<Integer> switchOpens[], ArrayList<Integer> needOpen) {
		/* ------------------- INSERT CODE HERE ---------------------
		 *
		 * Your code should return the list of switches to toggle so that exactly the required set of 
		 * doors (specified in needOpen) are open, and no other doors are open.
		 *
		 * */

		/* -------------------- END OF INSERTION --------------------*/
		return null;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numCases = sc.nextInt();

		for(int i = 0; i < numCases; i++)
		{
			int numSwitches = sc.nextInt();
			int numDoors = sc.nextInt();

			ArrayList<Integer> switchOpens[] = (ArrayList<Integer>[]) new ArrayList[numSwitches];

			for(int j = 0; j < numSwitches; j++) {
				int n = sc.nextInt();
				switchOpens[j] = new ArrayList<Integer>();
				for(int k = 0; k < n; k++) 
					switchOpens[j].add(new Integer(sc.nextInt()));
			}

			ArrayList<Integer> needOpen = new ArrayList<Integer>();
			int n = sc.nextInt();
			for(int k = 0; k < n; k++) 
				needOpen.add(new Integer(sc.nextInt()));

			ArrayList<Integer> ans = chooseSwitches(numSwitches, numDoors, switchOpens, needOpen);

			if(ans == null) {
				System.out.println("No combination of the switches can result in the desired configuration.");
			} else {
				System.out.println("Toggle switches " + ans);
			}
		}
		sc.close();
	}
}
